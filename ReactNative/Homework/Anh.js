import React, {Component} from 'react';
import {Text, View, Image} from 'react-native';

// const h1 = require('./assets/images/h1.jpg');
import h1 from './assets/images/h1.jpg';

export default class Anh extends Component {
  render() {
    return (
      <View style={{flex: 1}}>
        <Image source={h1} style={{width: '100%', height: 600}} />
      </View>
    );
  }
}
