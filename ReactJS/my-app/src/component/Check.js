import React, { Component } from 'react';
import classNames from 'classnames';
import tick from '../img/success.svg';
import tickActive from '../img/success-active.svg';

class Check extends Component {
	render() {
		const { item, onClick } = this.props;
		let url = tickActive;
		if(item.status) {

		}else {
			url = tick;
		}
		return (
			<div className={ classNames('TodoItem',{ 'TodoItem-complete' : !item.status }) }>
				<img onClick={ onClick } src={ url } width = { 30 }/>
				<span>{ this.props.item.name }</span>
      </div>
		);
	}
}

export default Check;