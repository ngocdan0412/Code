import React from 'react';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import { faBell } from '@fortawesome/free-solid-svg-icons';
import { faTachometerAlt } from '@fortawesome/free-solid-svg-icons';
import { faCoffee } from '@fortawesome/free-solid-svg-icons';
import { faMugHot } from '@fortawesome/free-solid-svg-icons';
import { faCouch } from '@fortawesome/free-solid-svg-icons';
import { faUsers } from '@fortawesome/free-solid-svg-icons';
import { faIdCard } from '@fortawesome/free-solid-svg-icons';
import { faCog } from '@fortawesome/free-solid-svg-icons';
import Menu from './Components/Menu';
import Dashboard from './Components/Dashboard';

function App() {
  return (
    <Router>
      <div>
        <div className="header">
          <div className="hd-left">
            <a href=""><h4>EBOOK</h4></a>
            <input type="text" placeholder="Search for..." />
            <button><FontAwesomeIcon icon={faSearch} /></button>
          </div>
          <div className="hd-right">
            <FontAwesomeIcon icon={faBell} />
          </div>
        </div>
        <div className="menu">
          <nav>
            <ul>
              <li>
                <Link to="/">
                  <FontAwesomeIcon icon={faTachometerAlt} />
                  Overview
                </Link>
              </li>
              <hr/>
              <li>
                <Link to="/value1">
                  <FontAwesomeIcon icon={faCoffee} />
                  Resources
                </Link>
              </li>
              <li>
                <Link to="/value2">
                  <FontAwesomeIcon icon={faMugHot} />
                  Products
                </Link>
              </li>
              <hr/>
              <li>
                <Link to="/value3">
                  <FontAwesomeIcon icon={faCouch} />
                  Resources
                </Link>
              </li>
              <hr/>
              <li>
                <Link to="/value4">
                  <FontAwesomeIcon icon={faUsers} />
                  Resources
                </Link>
              </li>
              <li>
                <Link to="/value5">
                  <FontAwesomeIcon icon={faIdCard} />
                  Products
                </Link>
              </li>
              <hr/>
              <li>
                <Link to="/value6">
                  <FontAwesomeIcon icon={faCog} />
                  Setting
                </Link>
              </li>
            </ul>
          </nav>
          <Switch>
            <Route path="/" component={ Dashboard } />
          </Switch>
        </div>
      </div>
    </Router>
  );
}

export default App;
