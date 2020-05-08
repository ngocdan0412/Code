import React, { Component } from 'react';

class Product extends Component{
    render(){
        const { idSP, nameSP } = this.props;
        return(
            <div>
                <h2>ID sản phẩm: { idSP }</h2>
                <h2>Tên: { nameSP }</h2>
            </div>
        );
    }
}

export default Product;
