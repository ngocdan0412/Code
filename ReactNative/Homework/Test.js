// import React, {Component} from 'react';
// import {Text, View} from 'react-native';

// export default class Test extends Component {
//   render() {
//     return (
//       <View>
//         <Text> textInComponent </Text>
//       </View>
//     );
//   }
// }

import React, {Component} from 'react';
import {
  Text,
  View,
  StyleSheet,
  TextInput,
  TouchableOpacity,
} from 'react-native';
import FIcon from 'react-native-vector-icons/Fontisto';
import MCIcon from 'react-native-vector-icons/MaterialCommunityIcons';
import ADIcon from 'react-native-vector-icons/AntDesign';
import axios from 'axios';

const styles = StyleSheet.create({
  constainer: {
    flex: 1,
    backgroundColor: '#343C44',
  },
  logoContainer: {
    flex: 3,
    backgroundColor: '#343C44',
    justifyContent: 'center',
    alignItems: 'center',
  },
  logo: {
    backgroundColor: '#FBB843',
    padding: 24,
    borderRadius: 99,
  },
  welcome: {
    alignItems: 'center',
  },
  welcomeText: {
    color: 'white',
    fontSize: 35,
    fontWeight: '700',
  },
  sloganText: {
    color: 'white',
    fontSize: 18,
  },

  loginContainer: {
    flex: 3,
    backgroundColor: '#343C44',
    paddingHorizontal: 48,
  },

  inputContainer: {
    flexDirection: 'row',
    height: 56,
    // backgroundColor: 'yellow',
  },
  inputIconContainer: {
    width: 56,
    height: 56,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#2E3338',
    borderTopLeftRadius: 6,
    borderBottomLeftRadius: 6,
  },
  inputTextContainer: {
    flex: 1,
    height: 56,
    backgroundColor: '#3E4750',
    justifyContent: 'center',
    paddingLeft: 12,
    borderTopRightRadius: 6,
    borderBottomRightRadius: 6,
  },
  dangky: {
    height: 60,
    flexDirection: 'row',
    backgroundColor: '#343b45',
    paddingHorizontal: 56,
  },
  dangky1: {
    flex: 1,
    backgroundColor: '#3E4750',
    justifyContent: 'center',
    alignItems: 'center',
    borderBottomLeftRadius: 8,
    borderTopLeftRadius: 8,
  },
  dangky2: {
    width: 60,
    backgroundColor: '#ffb843',
    justifyContent: 'center',
    alignItems: 'center',
    borderBottomRightRadius: 8,
    borderTopRightRadius: 8,
  },
  dangnhap: {
    height: 60,
    flexDirection: 'row-reverse',
    justifyContent: 'flex-start',
  },
  dangnhap1: {
    width: 120,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 8,
    backgroundColor: '#ffb843',
  },
  dangnhap2: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    borderBottomLeftRadius: 8,
    borderTopLeftRadius: 8,
  },
  button: {
    height: 48,
    justifyContent: 'center',
    alignItems: 'center',
  },
  cacsanphamthamkhao: {
    height: 60,
    justifyContent: 'center',
    alignItems: 'center',
    marginHorizontal: 56,
  },
  sanphamthamkhao: {
    backgroundColor: '#bc8585',
    height: 30,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 8,
    marginHorizontal: 56,
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
    console.log('LOGIN');
    axios
      .post('https://training.softech.cloud/api/users/login', {
        email: this.state.email,
        password: this.state.password,
      })
      .then(response => {
        console.log(response);
        console.log(response.data);
        if (response.data.length > 0) {
          () => {
            this.props.navigation.navigate('ProductsScreen');
          };
        } else {
          alert('dang nhap khong thanh cong');
        }
      })
      .catch(error => {
        console.log(error);
      });
  };

  render() {
    return (
      <View style={styles.constainer}>
        <View style={styles.logoContainer}>
          <View style={styles.logo}>
            <FIcon name="codepen" size={80} style={{color: '#343C44'}} />
          </View>
          <View style={styles.welcome}>
            <Text style={styles.welcomeText}>Welcome</Text>
            <Text style={styles.sloganText}>Change your lives</Text>
          </View>
        </View>
        <View style={styles.loginContainer}>
          {/* ---------------------------------------------------- */}
          {/* USERNAME */}
          <View style={styles.inputContainer}>
            <View style={styles.inputIconContainer}>
              <MCIcon name="email" size={32} style={{color: 'white'}} />
            </View>

            <TextInput
              style={styles.inputTextContainer}
              AutoCorrect={false}
              placeholder="Nhập email"
              placeholderTextColor="white"
              onChangeText={text => {
                this.setState({email: text});
              }}
            />
          </View>
          <View style={{height: 16}} />
          {/* ---------------------------------------------------- */}
          {/* PASSWORD */}
          <View style={styles.inputContainer}>
            <View style={styles.inputIconContainer}>
              <ADIcon name="lock1" size={32} style={{color: 'white'}} />
            </View>
            <TextInput
              style={styles.inputTextContainer}
              secureTextEntry
              AutoCorrect={false}
              placeholder="Nhập Mật Khẩu"
              placeholderTextColor="white"
              onChangeText={text => {
                this.setState({password: text});
              }}
            />
          </View>
          <View style={{height: 16}} />
          <View style={styles.dangnhap}>
            <View style={styles.dangnhap1}>
              <TouchableOpacity style={styles.button} onPress={this.login}>
                <Text style={{color: 'white', fontSize: 24}}>Login</Text>
              </TouchableOpacity>
            </View>

            <View style={styles.dangnhap2}>
              <Text style={{color: 'white', fontSize: 18}}>
                Forgot Password?
              </Text>
            </View>
          </View>
        </View>

        <View style={styles.cacsanphamthamkhoa}>
          <TouchableOpacity
            style={styles.sanphamthamkhao}
            onPress={() => {
              this.props.navigation.navigate('ProductsScreen');
            }}>
            <Text style={{color: 'white', fontSize: 18}}>
              Các sản phẩm tham khảo
            </Text>
          </TouchableOpacity>
        </View>

        <View style={{height: 30}} />

        <View style={styles.dangky}>
          <TouchableOpacity
            style={styles.dangky1}
            onPress={() => {
              this.props.navigation.navigate('RegisterScreen');
            }}>
            <Text style={{color: 'white', fontSize: 18}}>Đăng Ký</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.dangky2}
            onPress={() => {
              this.props.navigation.navigate('RegisterScreen');
            }}>
            <ADIcon name="doubleright" size={38} style={{color: 'white'}} />
          </TouchableOpacity>
        </View>

        <View style={{height: 16}} />
      </View>
    );
  }
}
