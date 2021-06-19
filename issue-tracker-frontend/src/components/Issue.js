import React from "react";
import axios from "axios";
// import '../task.min.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Form, Container, Row, Col} from 'react-bootstrap';

class Issue extends React.Component {
  constructor(props) {
    super(props);
    this.state = { issues: [] };
    this.issueName = React.createRef();
  }

  componentDidMount() {
    this.getData();
  };

  getData = () => {

    //UNCOMMENT the appropriate url for the backend framework

    // Java Spring Boot uses port 8080
    let url = "http://localhost:8080/issues";

    axios.get(url).then(response => this.setState({ issues: response.data }));
  }

  addIssue = () => {
    //uncomment and update url to appropriate url for backend connection
    let url = "http://localhost:8080/issues";
    axios.post(url, { name: this.issueName.current.value }).then(response => {
      // refresh the data
      this.getData();
      // empty the input
      this.issueName.current.value = "";
    });
  };

  //create update and delete functions to complete CRUD




  render() {
    return (
      <div>
        <header className="App-header">
            <Container>
            <Form>
                <Form.Group>
                    <Form.Label>Issue Title</Form.Label>
                    <Form.Control type="text" placeholder="Title for this issue" width='1000' />
                    <Form.Label>Description</Form.Label>
                    <Form.Control as="textarea" rows={5}/>
                    <Button variant="primary">Add</Button>
                </Form.Group>
            </Form> 
            </Container>
            <h3>List of Issues</h3>
            <input ref={this.issueName} />
            <button type="button" className="btn btn-primary" onClick={this.addIssue}>add</button>
            <ul>
            {this.state.issues.map(p => (
                <li key={p.issueid}>
                {p.name} : { p.complete ? "complete" : "not complete" } <button type="button" className="btn btn-success">Complete</button><button type="button" className="btn btn-danger">Delete</button>
                </li>
            ))}
            </ul>
            
        </header>
      </div>
    );
  }
}

export default Issue;
