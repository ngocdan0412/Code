import React, {Component} from 'react';
import {Text, View} from 'react-native';

import PropTypes from 'prop-types';

class Header extends Component {
  render() {
    return (
      <View>
        <Text> {this.props.text} </Text>
      </View>
    );
  }
}

Header.propTypes = {
  text: PropTypes.string,
};

export default Header;
