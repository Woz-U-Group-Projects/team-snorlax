import React, {Component } from "react";
import {MenuItems} from "./MenuItems";
import teamLogo from "../../Images/snakeLogo.png";
import './NavBar.css';

class Navbar extends Component {
    state = { clicked: false}
    
    render() {
        return(
            <nav className='NavBarItems'>
                <h1 className="navbar-title" color="green">Team Mamba's Issue Tracker</h1>
                <div className="menu-icon" onClick={this.handleClick}>
                    <i className={this.state.clicked ? 'fas fa-times' : 'fas fa-bars'}></i>
                </div>
                <ul>
                    {MenuItems.map((item, index) => {
                        return (
                            <li> key={index}
                                <a className={item.cName} href={item.url}>
                                    {item.title}
                                </a>
                            </li>
                        )
                    })}
                </ul>
            </nav>
        )
    }
}

export default Navbar;