import React, { Component } from 'react';

class Clock extends Component {
    constructor(props) {
        super(props);
        this.state = { date: new Date() };
    }
    componentDidMount() {
        this.timeID = setInterval(
            () => this.tick(),1000
        );
    }
    tick() {
        this.setState({
            date: new Date()
        })
    }
    render() {
        return(
            <div className= "clock">
                <h3>Time: { this.state.date.toLocaleTimeString()}</h3>
                <h3>Date: { this.state.date.toLocaleDateString()}</h3>
            </div>
        );
    }
}

export default Clock;