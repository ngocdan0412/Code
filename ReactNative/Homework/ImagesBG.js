import React, {Component} from 'react';
import {Text, View, ImagesBackground} from 'react-native';

import h1 from './assets/images/h1.jpg';

export default class ImagesBG extends Component {
  render() {
    return (
      <View style={{flex: 1}}>
        <ImagesBackground blurRadius={0} source={h1} style={{flex: 1}} />
      </View>
    );
  }
}
