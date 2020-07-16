import React, {Component} from 'react';
import {Text, View, StyleSheet, Image, Dimensions} from 'react-native';

import SLIcon from 'react-native-vector-icons/SimpleLineIcons';
import FIcon from 'react-native-vector-icons/Feather';
import ADIcon from 'react-native-vector-icons/AntDesign';
import FDIcon from 'react-native-vector-icons/Foundation';

import logoISR from './assets/images/logoISR.png';
import face1 from './assets/images/face1.jpeg';
import face2 from './assets/images/face2.jpeg';
import face3 from './assets/images/face3.jpg';
import face4 from './assets/images/face4.jpg';
import face5 from './assets/images/face5.jpeg';
import post from './assets/images/h1.jpg';

const H = Dimensions.get('screen').height; //ảnh full theo chiều dọc
const W = Dimensions.get('screen').width; //ảnh full theo chiều ngang

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'pink',
  },
  headerCTN: {
    height: 50,
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    borderBottomWidth: 1,
    borderColor: '#000',
  },
  storys: {
    height: 120,
    flexDirection: 'row',
    borderBottomWidth: 0.5,
    borderColor: '#000',
  },
  avt: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  avtBD: {
    width: 80,
    height: 80,
    borderRadius: 40,
    borderWidth: 3,
    borderColor: '#ff5252',
    alignItems: 'center',
  },
  avtSTR: {
    width: '100%',
    height: '100%',
    borderRadius: 50,
    borderWidth: 3,
    borderColor: '#fff',
  },
  titlePost: {
    height: 50,
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginHorizontal: 10,
  },
  contentPost: {
    height: 340,
  },
  button: {
    height: 50,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    marginHorizontal: 10,
  },
  icon: {
    marginHorizontal: 5,
  },
  menu: {
    height: 50,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-around',
    borderTopWidth: 1,
    borderColor: '#000',
  },
});

export default class Bt2 extends Component {
  render() {
    return (
      <View style={styles.container}>
        <View style={styles.headerCTN}>
          <SLIcon name="camera" size={30} style={{paddingLeft: 10}} />
          <Image
            source={logoISR}
            style={{
              width: '30%',
              height: '70%',
              resizeMode: 'cover',
              justifyContent: 'center',
            }}
          />
          <FIcon name="send" size={30} style={{paddingRight: 10}} />
        </View>
        <View style={styles.storys}>
          <View style={styles.avt}>
            <View style={styles.avtBD}>
              <Image source={face1} style={styles.avtSTR} />
              <Text>Guillermo</Text>
            </View>
          </View>
          <View style={styles.avt}>
            <View style={styles.avtBD}>
              <Image source={face2} style={styles.avtSTR} />
              <Text>Maldonado</Text>
            </View>
          </View>
          <View style={styles.avt}>
            <View style={styles.avtBD}>
              <Image source={face3} style={styles.avtSTR} />
              <Text>Sebastian</Text>
            </View>
          </View>
          <View style={styles.avt}>
            <View style={styles.avtBD}>
              <Image source={face4} style={styles.avtSTR} />
              <Text>Elizabeth</Text>
            </View>
          </View>
        </View>
        <View style={styles.titlePost}>
          <View
            style={{
              flexDirection: 'row',
              alignItems: 'center',
            }}>
            <Image
              source={face5}
              style={{
                width: 40,
                height: 40,
                borderRadius: 20,
                marginRight: 10,
              }}
            />
            <Text>Steven Van Wel</Text>
          </View>
          <FIcon name="more-vertical" size={20} />
        </View>
        <View style={styles.contentPost}>
          <Image source={post} style={{width: W, height: '100%'}} />
        </View>
        <View style={styles.button}>
          <View
            style={{
              flexDirection: 'row',
              alignItems: 'center',
            }}>
            <FIcon name="heart" size={30} style={styles.icon} />
            <FIcon name="message-circle" size={30} style={styles.icon} />
            <FIcon name="send" size={30} style={styles.icon} />
          </View>
          <FIcon name="bookmark" size={30} />
        </View>
        <View style={styles.menu}>
          <FDIcon name="home" size={35} />
          <ADIcon name="search1" size={30} />
          <ADIcon name="plussquareo" size={30} />
          <ADIcon name="hearto" size={30} />
          <ADIcon name="instagram" size={30} />
        </View>
      </View>
    );
  }
}
