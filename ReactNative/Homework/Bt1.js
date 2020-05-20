import React, {Component} from 'react';
import {Text, View, StyleSheet} from 'react-native';

import FA5Icon from 'react-native-vector-icons/FontAwesome5';

const styles = StyleSheet.create({
  container: {
    // flex: 1,
    height: 660,
    backgroundColor: '#343b45',
  },
  textColor1: {
    color: '#fff',
    fontSize: 18,
  },
  textColor2: {
    color: '#a3a7b0',
    fontSize: 17,
  },
  // header
  header: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    // backgroundColor: 'black',
  },
  logo: {
    height: 200,
    width: 200,
    justifyContent: 'center',
    alignItems: 'center',
  },
  iconLogo: {
    backgroundColor: '#ffb842',
    height: 100,
    width: 100,
    transform: [{rotate: '45deg'}],
    borderRadius: 10,
    justifyContent: 'center',
    alignItems: 'center',
  },
  nameLogo: {
    marginTop: 15,
    justifyContent: 'center',
    alignItems: 'center',
  },
  // form
  form: {
    flex: 1,
    backgroundColor: '#343b45',
  },
  input: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },
  iconInput: {
    width: 60,
    height: 60,
    backgroundColor: '#2e3339',
    justifyContent: 'center',
    alignItems: 'center',
    borderTopLeftRadius: 5,
    borderBottomLeftRadius: 5,
  },
  contentInput: {
    width: 250,
    height: 60,
    backgroundColor: '#3e4750',
    justifyContent: 'center',
    borderTopRightRadius: 5,
    borderBottomRightRadius: 5,
  },
  login: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },
  textLogin: {
    width: 185,
    height: 60,
    justifyContent: 'center',
    alignItems: 'center',
  },
  buttonLogin: {
    width: 125,
    height: 60,
    backgroundColor: '#ffb842',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 5,
  },
  // footer
  footer: {
    height: 100,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },
  textFooter: {
    width: 250,
    height: 60,
    backgroundColor: '#3e4750',
    justifyContent: 'center',
    alignItems: 'center',
    borderTopLeftRadius: 5,
    borderBottomLeftRadius: 5,
  },
  buttonFooter: {
    width: 60,
    height: 60,
    backgroundColor: '#ffb842',
    justifyContent: 'center',
    alignItems: 'center',
    borderTopRightRadius: 5,
    borderBottomRightRadius: 5,
  },
});

export default class Bt1 extends Component {
  render() {
    return (
      <View style={styles.container}>
        <View style={styles.header}>
          <View style={styles.logo}>
            <View style={styles.iconLogo}>
              <FA5Icon
                name="pen-nib"
                size={60}
                style={{transform: [{rotate: '90deg'}], color: 'Black'}}
              />
            </View>
            <View style={styles.nameLogo}>
              <Text
                style={{
                  color: '#fff',
                  fontSize: 30,
                  fontWeight: '700',
                }}>
                Welcome
              </Text>
              <Text style={{color: '#fff'}}>your homescreen app</Text>
            </View>
          </View>
        </View>
        <View style={styles.form}>
          <View style={styles.input}>
            <View style={styles.iconInput}>
              <FA5Icon name="user-alt" size={20} style={styles.textColor1} />
            </View>
            <View style={styles.contentInput}>
              <Text style={styles.textColor2}> Username</Text>
            </View>
          </View>
          <View style={styles.input}>
            <View style={styles.iconInput}>
              <FA5Icon name="lock" size={20} style={styles.textColor1} />
            </View>
            <View style={styles.contentInput}>
              <Text style={styles.textColor2}> Password</Text>
            </View>
          </View>
          <View style={styles.login}>
            <View style={styles.textLogin}>
              <Text style={styles.textColor2}>Forgot Password?</Text>
            </View>
            <View style={styles.buttonLogin}>
              <Text style={styles.textColor1}>LOGIN</Text>
            </View>
          </View>
        </View>
        <View style={styles.footer}>
          <View style={styles.textFooter}>
            <Text style={styles.textColor1}>REGISTER</Text>
          </View>
          <View style={styles.buttonFooter}>
            <FA5Icon name="arrow-right" size={20} style={styles.textColor1} />
          </View>
        </View>
      </View>
    );
  }
}
