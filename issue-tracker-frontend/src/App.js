import logo from './logo.svg';
import React from 'react';
import Issue from "./components/Issue";
import './App.css';
import NavBar from "./components/Navbar/NavBar";


/*function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}*/
function App() {
  return (
    <div className="App">
        <NavBar />
        <Issue />
    </div>
  );
}

export default App;
