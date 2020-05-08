import React, { Component } from "react";
import Avatar from "./Avatar";
import Title from "./Title";
import Content from "./Content";

export default class Post extends Component {
  render() {
    return (
      <div>
        <Avatar imgUrl={this.props.imgsrc} />
        <Title testTT={this.props.title} />
        <Content testCT={this.props.content} />
      </div>
    );
  }
}
