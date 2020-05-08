import React, { Component } from 'react';

class RunNumber extends Component{
    constructor(props) {
        super(props);
        this.state = { number: 0 };
    }
    componentDidMount() {
        this.timeID = setInterval(
            () => this.run(), 10
        );
    }
    run() {
        this.setState({
            number: this.state.number + 1
        });
    }
    render() {
        if (this.state.number === 200) {
            clearInterval(this.timeID);
        }
        return (
            <div>
                <h1>Run number: { this.state.number }</h1>
            </div>
        );
    }
}

export default RunNumber;