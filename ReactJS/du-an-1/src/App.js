import React from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Nav, Row } from 'react-bootstrap';
import data from './Components/data.json';
import Product from './Components/Product';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
// import Home from './Components/Home';
import About from './Components/About';
import ProductDetail from './Components/ProductDetail';

function Home()
{
  return(
      <Row>
        {data.map((value, index) => <Product key="index" id={value.id} name={value.name} price={value.price} />)}
      </Row>
    );
}

function App() {
  return (
    <Router>
      <div className="App">
        <Nav defaultActiveKey="/home" as="ul">
          <Nav.Item as="li">
            <Link to="/">Home</Link>
          </Nav.Item>
          <Nav.Item as="li">
            <Link to="/about">About</Link>
          </Nav.Item>
        </Nav>
        <Switch>
          <Route path="/about" component={ About } />
          <Route path="/product/:id/:slug.html" component={ ProductDetail } />
          <Route path="/" component={ Home } />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
