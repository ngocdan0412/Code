import React, {Component} from 'react';
import {Text, View} from 'react-native';

const styles = StyleSheet.create({
  header: {flex: 1, backgrourdColor: 'red'},
});

export default class Bt1 extends Component {
  render() {
    return (
      <View style={styles.header}>
        <View />
        <View />
        <View />
      </View>
    );
  }
}
