import React, {Component} from 'react';
import {
  Text,
  View,
  StyleSheet,
  TextInput,
  TouchableOpacity,
} from 'react-native';

import axios from 'axios';

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    flex: 1,
    backgroundColor: 'blue',
    alignItems: 'center',
    justifyContent: 'center',
  },
  form: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  contentInput: {
    width: 370,
    height: 60,
    borderColor: 'gray',
    borderWidth: 2,
    borderRadius: 7,
    marginVertical: 10,
    paddingHorizontal: 20,
    fontSize: 18,
  },
  footer: {
    flex: 0.5,
    // backgroundColor: 'green',
    justifyContent: 'center',
    alignItems: 'center',
  },
  ButtonLogin: {
    width: 370,
    height: 65,
    backgroundColor: '#ebeef5',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 2,
  },
});

export default class LoginApp extends Component {
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
      <View style={styles.container}>
        <View style={styles.header}>
          <Text style={{fontSize: 30, color: '#FFF', fontWeight: '700'}}>
            Hello
          </Text>
          <Text style={{color: '#FFF'}}>Sign in to your account</Text>
        </View>
        <View style={styles.form}>
          <TextInput
            style={styles.contentInput}
            placeholderTextColor="#a3a7b0"
            placeholder="Username"
          />
          <TextInput
            style={styles.contentInput}
            placeholderTextColor="#a3a7b0"
            placeholder="Password"
          />
          <Text>Forgot your password?</Text>
        </View>
        <View style={styles.footer}>
          <TouchableOpacity style={styles.ButtonLogin} onPress={this.login}>
            <Text>SIGN IN</Text>
          </TouchableOpacity>
          <Text>Don't have an account? Create</Text>
        </View>
      </View>
    );
  }
}
