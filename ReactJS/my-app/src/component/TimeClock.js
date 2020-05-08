import React, { Component } from 'react';

const showBT = {
  display: 'block'
};
const hideBT = {
  display : 'none'
};

class TimeClock extends Component {
  constructor(props) {
    super(props);
    this.state = { hours: 0, minute: 0, seconds: 0, pause: 0 };
    this.startPause = this.startPause.bind(this);
    this.continueRun = this.continueRun.bind(this);
    this.endRun = this.endRun.bind(this);
  }

  componentDidMount() {
    this.timeID = setInterval(
      () => this.runTime(), 10
    );
  }

  runTime() {
    if (this.state.pause === 1) {
      if (this.state.seconds <= 59) {
        this.setState({
          seconds: this.state.seconds + 1
        });
      } else if(this.state.minute <= 59) {
        this.setState({
          seconds: 0,
          minute: this.state.minute + 1
        });
      } else {
        this.setState({
          minute: 0,
          hours: this.state.hours + 1
        });
      }
    }
  }
  startPause() {
    if (this.state.pause === 0) {
      this.setState({
        pause: 1
      });
    } else {
      this.setState({
        pause: 3
      });
    }
  }
  continueRun() {
    this.setState({
      pause: 1
    }); 
  }
  endRun() {
    this.setState({
      seconds: 0,
      minute: 0,
      hours: 0,
      pause: 0
    });
  }
  render() {
    const { hours, minute, seconds, pause } = this.state;
    return(
      <div>
        <h1>{ hours }:{ minute }:{ seconds }</h1>
        <button style={ pause === 3? hideBT : showBT } onClick={ this.startPause }>{ pause === 0? "START" : "PAUSE" }</button>
        <div style={ pause === 3? showBT : hideBT }>
          <button onClick={ this.continueRun }>CONTINUE</button>
          <button onClick={ this.endRun }>END</button>
        </div>
      </div>
    );
  }
}

export default TimeClock;