import React, { Component } from "react";

export default class SlideShow extends Component {
  constructor(props) {
    super(props);
    this.state = { number: 1 };
  }
  // Chỉ chạy 1 lần và chạy đầu tiên khi load trang
  componentWillMount() {
    // set thời gian
    setInterval(() => {
      if (this.state.number >= 5) {
        this.setState({ number: 1 });
      } else {
        const newNB = this.state.number + 1;
        this.setState({ number: newNB });
      }
    }, 1000);
  }

  render() {
    return (
      <div>
        <img src={"img/" + this.state.number + ".jpg"} style={{ width: 300 }} />
        <p>
          <button
            disabled={this.state.number === 1 ? "disab" : ""}
            onClick={() => {
              const newNB = this.state.number - 1;
              this.setState({ number: newNB });
            }}
          >
            Back
          </button>
          <span>{this.state.number + "/5"}</span>
          <button
            disabled={this.state.number === 5 ? "disab" : ""}
            onClick={() => {
              const newNB = this.state.number + 1;
              this.setState({ number: newNB });
            }}
          >
            Next
          </button>
        </p>
        <p>
          <img
            onClick={() => {
              const newNB = 1;
              this.setState({ number: newNB });
            }}
            src="img/1.jpg"
            style={{
              width: 40,
              margin: 5,
              opacity: this.state.number === 1 ? 1 : 0.5,
              transition: 0,
            }}
          />
          <img
            onClick={() => {
              const newNB = 2;
              this.setState({ number: newNB });
            }}
            src="img/2.jpg"
            style={{
              width: 40,
              margin: 5,
              opacity: this.state.number === 2 ? 1 : 0.5,
            }}
          />
          <img
            onClick={() => {
              const newNB = 3;
              this.setState({ number: newNB });
            }}
            src="img/3.jpg"
            style={{
              width: 40,
              margin: 5,
              opacity: this.state.number === 3 ? 1 : 0.5,
            }}
          />
          <img
            onClick={() => {
              const newNB = 4;
              this.setState({ number: newNB });
            }}
            src="img/4.jpg"
            style={{
              width: 40,
              margin: 5,
              opacity: this.state.number === 4 ? 1 : 0.5,
            }}
          />
          <img
            onClick={() => {
              const newNB = 5;
              this.setState({ number: newNB });
            }}
            src="img/5.jpg"
            style={{
              width: 40,
              margin: 5,
              opacity: this.state.number === 5 ? 1 : 0.5,
            }}
          />
        </p>
      </div>
    );
  }
}
