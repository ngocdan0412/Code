import React, {Component} from 'react';
import {Text, View} from 'react-native';

import FA5Icon from 'react-native-vector-icons/FontAwesome5';

export default class Layout extends Component {
  render() {
    return (
      <View style={{height: 500, backgroundColor: 'red'}}>
        <View
          style={{
            flex: 1,
            backgroundColor: 'red',
            justifyContent: 'center',
            alignItems: 'center',
          }}>
          <View style={{height: 50, width: 50, backgroundColor: 'black'}} />
          <View style={{height: 50, width: 50, backgroundColor: 'gray'}} />
          <View style={{height: 50, width: 50, backgroundColor: 'white'}} />
        </View>
        <View style={{flex: 1, backgroundColor: 'yellow'}}>
          <FA5Icon name="pen-nib" size={50} />
        </View>
        <View style={{height: 100, backgroundColor: 'blue'}} />
      </View>
    );
  }
}
