import React,{ Component } from 'react';
import './component/Checked.css';
import TodoItem from './component/TodoItem';
import TrafficLights from './component/TrafficLights.js';
import TrafficLights2 from './component/TrafficLights-new.js';
import './App.css';

class App extends Component{
  constructor(){
    super();
    this.state = {
      newItem : '',
      todoItems : [
        {title : 'item 1', isComplete : true},
        {title : 'item 2', isComplete : false},
        {title : 'item 3', isComplete : true}
      ]
    }
    this.onKeyUp = this.onKeyUp.bind(this);
    this.onChange = this.onChange.bind(this);
  }
  onItemClick(item){
    return (event) => {
      const isComplete = item.isComplete;
      const { todoItems } = this.state;
      const index = todoItems.indexOf(item);
      this.setState({
        todoItems : [
          ...todoItems.slice(0, index),
          {
            ...item,
            isComplete : !isComplete
          },
          ...todoItems.slice(index + 1)
        ]
      });
    }
  }

  onKeyUp(event) {
    if(event.keyCode === 13) {
      let textAdd = event.target.value;
      textAdd = textAdd.trim();
      if(!textAdd) {
        this.setState({
          newItem: ''
        });
        return;
      }
      this.setState({
        newItem: '',
        todoItems: [
          { title: textAdd, isComplete: true },
          ...this.state.todoItems
        ]
      });
    }
  }

  onChange(event) {
    this.setState({
      newItem: event.target.value
    });
  }

  render(){
    const { todoItems, newItem } = this.state;
    return (
      <div>
        <div className="content">
          <input type="text" placeholder="add item" onChange={ this.onChange } onKeyUp={ this.onKeyUp } value={ newItem } />
          {
            todoItems.map((item, index) => 
            <TodoItem key={index} item={item} onClick={this.onItemClick(item)} /> )
          }
        </div>
      </div>
    );
  }
}

class App2 extends Component {
  render() {
    return(
        <div>
          {/*<TrafficLights />*/}
          <TrafficLights2 />
        </div>
      );
  }
}

// export default App;
export default App2;

