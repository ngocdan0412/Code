import React, {Component} from 'react';
import {Text, View} from 'react-native';

import Header from './Header';

export default class App extends Component {
  render() {
    return (
      <View>
        <Header text="12" />
        <Text> textInComponent </Text>
      </View>
    );
  }
}
