import React from 'react';
import {TextInput, Button} from 'react-native-paper';
import {View, Text} from 'react-native';

export default function LoginApp({navigation}) {
  const [userName, setUserName] = React.useState('');

  return (
    <View>
      <View style={{margin: 20}}>
        <TextInput
          label="User Name"
          mode="outlined"
          value={userName}
          onChangeText={text => {
            setUserName(text);
          }}
        />
        <Button
          mode="contained"
          style={{marginTop: 10}}
          onPress={() => {
            navigation.navigate('Mess');
          }}>
          Login
        </Button>
      </View>
    </View>
  );
}
