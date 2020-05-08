import React, { Component } from "react";
import Header from "./Header";
import Avatar from "./Avatar";
import Title from "./Title";
import Content from "./Content";
import Post from "./Post";

import SlideShow from "./SlideShow";

export default class App extends Component {
  render() {
    return (
      <div>
        <Header />

        {/* <Avatar imgUrl="/img/avt-siin.jpg" />
        <Title testTT="Name: Siin" />
        <Content testCT="so yeu li lich" />

        <hr />

        <Post
          imgsrc="/img/avt-nu.png"
          title="Name: Nu"
          content="so yeu li lich"
        /> */}

        <hr />

        <SlideShow />
      </div>
    );
  }
}
