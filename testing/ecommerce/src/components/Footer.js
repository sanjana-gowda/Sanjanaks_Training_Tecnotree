import React, { Component } from 'react';
import {Link} from 'react-router-dom';

class Footer extends Component {
    render() {
        return (
            <div className="container-fluid text-center pb-5">
                <hr className="my-5" />
                <small className="text-muted">all rights reserved. <a target="_blank" className="link-warning mx-1" href="#">Sanjana K S</a>
                      <a className="link-primary mx-1" href="https://reactjs.org/" target="_blank"></a>
                </small>
            </div>
        );
    }
}

export default Footer;