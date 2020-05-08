import React,{ Component } from 'react';
import classNames from 'classnames';
import red from '../img/red.png';
import './TrafficLights-new.css';
import yellow from '../img/yellow.png';
import green from '../img/green.png';

class TrafficLights extends Component {
	constructor() {
		super();
		this.state = {
			color: 'green'
		}
	}
	componentDidMount() {
    this.timeID = setInterval(
      () => this.getColor(this.state.color), 1000
    );
  }
  getColor(param) {
	  switch(param) {
	    case 'red':
	      return this.setState({
	      	color: 'green'
	      });
	    case 'green':
	      return this.setState({
	      	color: 'yellow'
	      });
	    case 'yellow':
	      return this.setState({
	      	color: 'red'
	      });
	    default:
	      return '';
	  }
	}
	render() {
		const { color } = this.state;
		return(
				<div className="App">
					<h1>Traffic Lights</h1>
					<img src={ green } className={ classNames('hide', {'show' : color === 'green'})} /><br/>
					<img src={ yellow } className={ classNames('hide', {'show' : color === 'yellow'})} /><br/>
					<img src={ red } className={ classNames('hide', {'show' : color === 'red'})} />
				</div>
			);
	}
}

export default TrafficLights;