import React, {Component} from 'react';
import {
  Text,
  View,
  TextInput,
  TouchableOpacity,
  StyleSheet,
} from 'react-native';
import Axios from 'axios';

const stytes = StyleSheet.create({
  input: {
    borderColor: 'black',
    borderWidth: 2,
    margin: 5,
  },
  button: {
    height: 50,
    backgroundColor: 'red',
    justifyContent: 'center',
    alignItems: 'center',
    margin: 5,
  },
});

export default class SignUp extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullname: '',
      email: '',
      password: '',
    };
  }

  signUp = () => {
    Axios.post('https://training.softech.cloud/api/users/register', {
      fullname: this.state.fullname,
      email: this.state.email,
      password: this.state.password,
    });
  };

  render() {
    return (
      <View>
        <TextInput
          style={stytes.input}
          onChangeText={Text => {
            this.setState({fullname: Text});
          }}
        />
        <TextInput
          style={stytes.input}
          onChangeText={Text => {
            this.setState({email: Text});
          }}
        />
        <TextInput
          style={stytes.input}
          onChangeText={Text => {
            this.setState({password: Text});
          }}
        />
        <TouchableOpacity style={stytes.button}>
          <Text>SIGN UP</Text>
        </TouchableOpacity>
      </View>
    );
  }
}
