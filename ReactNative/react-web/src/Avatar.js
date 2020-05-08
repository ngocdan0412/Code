import React, { Component } from "react";

export default class Avatar extends Component {
  render() {
    return (
      <div>
        <img src={this.props.imgUrl} style={{ width: 200 }} />
      </div>
    );
  }
}
