import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Card } from 'react-bootstrap';import {
  Link
} from "react-router-dom";
import img2 from '../img/sp1.jpg';

class Product extends Component {
	render() {
		const { id, name, price, img1 } = this.props;
		return(
			<div>
				<Card style={{ width: '18rem' }}>
				<Card.Img variant="top" src={ img1 } />
				  <Card.Body>
				    <Card.Title>{ name }</Card.Title>
				    <Card.Subtitle className="mb-2 text-muted">{ price }</Card.Subtitle>
				    <Link to={"/product/"+ id +"/"+ name +".html"}>Read more...</Link>
				  </Card.Body>
				</Card>
			</div>
		);
	}
}

export default Product;