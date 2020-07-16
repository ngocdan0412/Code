/**
 * @format
 */

import {AppRegistry} from 'react-native';
import App from './App';
import {name as appName} from './app.json';

import TabNavigation from './TabNavigation';
import StackNavigator from './StackNavigator';
import LoginApp from './AppNavigator/LoginApp';
import FireStoreExample from './FireStoreExample';
import ChatExample from './ChatExample';
import MainApp from './AppChat/MainApp';
import LoginApp2 from './AppChat/LoginApp';
import OneSignal from './OneSignal';
import CounterApp from './Session13';

AppRegistry.registerComponent(appName, () => CounterApp);
