import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Row } from 'react-bootstrap';
import Product from './Product';
import data from './data.json';

class Home extends Component {
	render() {
		return(
			<Row>
				{data.map((value, index) => <Product key="index" id={value.id} name={value.name} price={value.price} img1={ value.img1 } console.log(value.img1); />)}
			</Row>
		);
	}
}

export default Home;