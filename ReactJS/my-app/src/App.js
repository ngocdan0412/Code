import React, { Component } from 'react';
// Add Product Componevt
import Product from './component/Product';
import Clock from './component/Clock';
import RunNumber from './component/RunNumber';
import TimeClock from './component/TimeClock';
import Check from './component/Check';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Card } from 'react-bootstrap';
// import logo from './logo.svg';
import './App.css';
import './component/style.css';

const data = [
    {
        id: 1,
        name: "BMW"
            },
    {
        id: 2,
        name: "Ferari"
            },
    {
        id: 3,
        name: "Poscher"
            },
    {
        id: 4,
        name: "Bugati"
            }
        ]

class App extends Component {
    render() {
        const rows = [];
        for(let i = 0; i < data.length; i++){
            rows.push(<Product key={ data[i].id } idSP={ data[i].id } nameSP={ data[i].name } />);
        }
        return (
            <div>
                <h1>App1</h1>
                { rows }
            </div>  
        );
    }
}

class App2 extends Component {
    render() {
            return (
            <div>
                <h1>App2</h1>
                { data.map((value, index, data) =><Product key={ value.id } idSP={ value.id } nameSP={ value.name } />) }
                <Clock />
            </div>
        )
    }
}

class App3 extends Component {
    testEvent(){
        console.log('clocked.!!');
    }
    render() {
        return (
            <div>
                <RunNumber />
            <button onClick={ this.testEvent }>Click Here.!!</button>
            </div>
        );
    }
}

class App4 extends Component {
    render() {
        return (
            <div>
                <TimeClock />
                <button href="#" className="btn btn-warning">Link</button>
                <Card style={{ width: '18rem' }}>
				  	<Card.Img variant="top" src="holder.js/100px180" />
				  	<Card.Body>
				    	<Card.Title>Card Title</Card.Title>
				    	<Card.Text>
				      		Some quick example text to build on the card title and make up the bulk of
				      		the card's content.
				    	</Card.Text>
				    	<Button variant="primary">Go somewhere</Button>
				  	</Card.Body>
				</Card>
            </div>
        );
    }
}

class App5 extends React.Component {
    constructor() {
        super();
        this.state = {
            newItem: '',
            data2 : [
                {name: 'item 1', status: true },
                {name: 'item 2', status: false },
                {name: 'item 3', status: true }
            ],
        }
    }
    checkItemApp(item) {
        return(event) => {
            const complete = item.status;
            const { data2 } = this.state;
            const index = data2.indexOf(item);
            this.setState({
                data2 : [
                    ...data2.slice(0, index),
                    {
                        ...item,
                        complete : !complete
                    },
                    ...data2.slice(index + 1)
                ]
            });
        } 
    }
    render() {
        const { data2 } = this.state;
        return (
            <div >
                <div className="content">
                    {/*<input type="text" placeholder="add item"/><button>Add</button>*/}
                    { data2.map((item, index) =>
                        <Check key={ index } item={ item } onClick={ this.checkItemApp(item) }/>) }
                </div>
            </div>
        );
    }
}

//export default App;
//export default App2;
//export default App3;
// export default App4;
export default App5;
