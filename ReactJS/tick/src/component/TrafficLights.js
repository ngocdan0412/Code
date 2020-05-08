import React,{ Component } from 'react';
import red from '../img/red.png';
import yellow from '../img/yellow.png';
import green from '../img/green.png';
const show = {
	opacity: '1'
}
const hide = {
	opacity: '.2'
}
class TrafficLights extends Component {
	constructor() {
		super();
		this.state = {
			greenLight: 1, yellowLight: 0, redLight: 0
		}
	}
	componentDidMount() {
    this.timeID = setInterval(
      () => this.runTime(), 1000
    );
  }
  runTime() {
  	if(this.state.greenLight == 1){
  		this.setState({
  			greenLight: 0, yellowLight: 1
  		});
  	}else if(this.state.yellowLight == 1){
  		this.setState({
  			yellowLight: 0, redLight: 1
  		});
  	}else{
  		this.setState({
  			redLight: 0, greenLight: 1
  		});
  	}
  }
	render() {
		const { greenLight, yellowLight, redLight } = this.state;
		return(
				<div class="App">
					<h1>Traffic Lights</h1>
					<img src={ green } width={100} style={ greenLight == 1? show :  hide } /><br/>
					<img src={ yellow } width={100} style={ yellowLight == 1? show :  hide } /><br/>
					<img src={ red } width={100} style={ redLight == 1? show :  hide } />
				</div>
			);
	}
}

export default TrafficLights;