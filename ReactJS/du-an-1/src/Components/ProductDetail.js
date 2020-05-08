import React, { Component } from 'react';
import data from './data.json';

class ProductDetail extends Component {
	render() {
		const idSP = this.props.match.params.id;
		return(
			<div>
				<h1>ProductDetail</h1>
				{data.map((val, key) => 
					{
						if(val.id == idSP) {
							return(
								<div>
									<h2>Sản phẩm: {val.name}</h2>
									<span>Giá: {val.price}</span>
								</div>
							);
						}
					}
				)}
			</div>
		);
	}
}

export default ProductDetail;