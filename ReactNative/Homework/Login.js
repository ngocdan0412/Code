import React, {Component} from 'react';
import {
  Text,
  View,
  TextInput,
  StyleSheet,
  TouchableOpacity,
} from 'react-native';

import axios from 'axios';

const styles = StyleSheet.create({
  input: {
    borderColor: 'black',
    borderWidth: 2,
    margin: 5,
  },
  button: {
    backgroundColor: 'red',
    height: 50,
    justifyContent: 'center',
    alignItems: 'center',
    margin: 5,
  },
});

export default class Login extends Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: false,
      email: '',
      password: '',
    };
  }

  login = () => {
    axios
      .post('https://training.softech.cloud/api/users/login', {
        email: this.state.email,
        password: this.state.password,
      })
      .then(Response => {
        if (Response.data.length > 0) {
          alert('Đăng nhập thành công');
        } else {
          alert('Đăng nhập không thành công');
        }
      })
      .catch(error => {});
  };

  render() {
    return (
      <View>
        <TextInput
          style={styles.input}
          onChangeText={Text => {
            this.setState({email: Text});
          }}
        />
        <TextInput
          style={styles.input}
          onChangeText={Text => {
            this.setState({password: Text});
          }}
        />
        <TouchableOpacity style={styles.button} onPress={this.login}>
          <Text>LOGIN</Text>
        </TouchableOpacity>
      </View>
    );
  }
}
