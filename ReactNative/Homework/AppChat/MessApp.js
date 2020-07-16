import React from 'react';
import firestore from '@react-native-firebase/firestore';
import {
  TextInput,
  Button,
  Appbar,
  DefaultTheme,
  Provider as PaperProvider,
  IconButton,
  Colors,
} from 'react-native-paper';
import {View, Text, FlatList, SafeAreaView, Platform} from 'react-native';
import Icon from 'react-native-vector-icons/MaterialCommunityIcons';

const theme = {
  ...DefaultTheme,
  roundness: 8,
  colors: {
    ...DefaultTheme.colors,
    // primary: '#e84393',
    // accent: '#f1c40f',
  },
};

export default function MessApp() {
  const [message, setMessage] = React.useState('');
  const [messages, setMessages] = React.useState([]);

  const send = () => {
    firestore()
      .collection('Messages')
      .add({
        username: Platform.OS,
        message: message,
        createdTime: firestore.Timestamp.now(),
      })
      .then(() => {
        console.log('Message sent!');
      });
  };

  const onResult = querySnapshot => {
    const data = [];

    // lặp qua từng document
    querySnapshot.forEach(documentSnapshot => {
      const m = documentSnapshot.data();
      m.id = documentSnapshot.id;
      data.push(m);
    });
    // set state

    setMessages(data);
  };

  const onError = error => {
    console.error(error);
  };

  React.useEffect(() => {
    // componentDidMount
    const subscriber = firestore()
      .collection('Messages')
      // Sắp xếp asc / desc
      .orderBy('createdTime', 'asc')
      .onSnapshot(onResult, onError);
    return () => subscriber();
  }, []);

  const renderItem = ({item}) => {
    return (
      <View
        style={{
          flexDirection: 'row',
          alignItems: 'center',
        }}>
        <View
          style={{
            margin: 4,
            flexDirection: 'row',
            flex: 1,
            alignItems: 'center',
            justifyContent:
              item.username === Platform.OS ? 'flex-end' : 'flex-start',
          }}>
          {item.username !== Platform.OS && <Icon name="account" size={24} />}
          <View
            style={{
              padding: 8,
              backgroundColor:
                item.username === Platform.OS ? '#0984e3' : '#636e72',
              borderTopLeftRadius: item.username === Platform.OS ? 8 : 0,
              borderBottomLeftRadius: item.username === Platform.OS ? 8 : 0,
              borderBottomRightRadius: item.username === Platform.OS ? 8 : 0,
              borderTopRightRadius: item.username !== Platform.OS ? 8 : 0,
              borderBottomRightRadius: item.username !== Platform.OS ? 8 : 0,
              borderBottomLeftRadius: item.username !== Platform.OS ? 8 : 0,
            }}>
            <Text style={{color: 'white'}}>{item.message}</Text>
          </View>

          {item.username === Platform.OS && <Icon name="account" size={24} />}
        </View>
      </View>
    );
  };

  return (
    <PaperProvider theme={theme}>
      <SafeAreaView style={{flex: 1}}>
        <Appbar.Header>
          <Appbar.BackAction onPress={() => {}} />
          <Appbar.Content title="Chat" subtitle="Online" />
          <Appbar.Action icon="magnify" onPress={() => {}} />
          <Appbar.Action icon="dots-vertical" onPress={() => {}} />
        </Appbar.Header>

        <FlatList
          data={messages}
          keyExtractor={(item, index) => 'message-' + index}
          renderItem={renderItem}
          ItemSeparatorComponent={() => {
            return <View style={{height: 4}} />;
          }}
        />

        <View style={{flexDirection: 'row', width: '100%', margin: 10}}>
          <TextInput
            style={{flex: 1, height: 54}}
            // mode="Outlined"
            underlineColor="transparent"
            value={message}
            onChangeText={text => {
              setMessage(text);
            }}
          />

          {/* <Button
            icon="send"
            mode="contained"
            onPress={send}
            style={{
              height: 54,
              // alignItems: 'center',
              justifyContent: 'center',
            }}
          /> */}
          <IconButton
            icon="send"
            color={Colors.red500}
            size={30}
            // onPress={send}
            style={
              {
                // height: 54,
                // backgroundColor: 'blue',
                // alignItems: 'center',
                // justifyContent: 'center',
              }
            }
          />
        </View>
      </SafeAreaView>
    </PaperProvider>
  );
}
