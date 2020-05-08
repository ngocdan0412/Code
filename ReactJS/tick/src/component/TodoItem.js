import React,{Component} from 'react';
import classNames from 'classnames';
import checkCompleteImg from '../img/success-active.svg';
import checkImg from '../img/success.svg';

class TodoItem extends Component{
	render(){
		const { item, onClick } = this.props;
		let url = checkCompleteImg;
		if(item.isComplete){

		}
		else{
			url = checkImg;
		}
		return(
			<div className={ classNames('TodoItem', {'TodoItem-complete' : !item.isComplete})}>
				<img onClick={ onClick } src={ url } width={30}/>
				<span>{ this.props.item.title }</span>
			</div>
		);
	}
}

export default TodoItem;