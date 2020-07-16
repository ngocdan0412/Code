import React, {Component} from 'react';
import {Text, View, FlatList} from 'react-native';

import axios from 'axios';

export default class GETUser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: false,
      user: [],
    };
  }
  componentDidMount() {
    this.setState({loading: true});
    axios
      .get('https://training.softech.cloud/api/users')
      .then(Response => {
        this.setState({loading: false, user: Response.data});
      })
      .catch(error => {
        alert('Lỗi');
      });
  }
  renderItem = ({item}) => {
    return (
      <View>
        <Text>{item.fullname}</Text>
        {/* <Text>{item.password}</Text> */}
        <Text>{item.email}</Text>
      </View>
    );
  };
  render() {
    return (
      <View>
        <FlatList
          data={this.state.user}
          renderItem={this.renderItem}
          keyExtractor={item => item._id}
        />
      </View>
    );
  }
}
