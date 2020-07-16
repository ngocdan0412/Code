import React from 'react';
import {View, Text} from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createStackNavigator} from '@react-navigation/stack';

import LoginApp from './LoginApp';
import MessApp from './MessApp';

const Stack = createStackNavigator();

export default function MainApp() {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Mess">
        <Stack.Screen
          name="Login"
          component={LoginApp}
          options={{headerShown: false}}
        />
        <Stack.Screen
          name="Mess"
          component={MessApp}
          options={{headerShown: false}}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
}
