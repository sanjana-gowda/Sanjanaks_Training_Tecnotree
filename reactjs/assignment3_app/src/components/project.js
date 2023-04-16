import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Home from './components/Home';
import Destinations from './components/Destinations';
import Booking from './components/Booking';
import Header from './components/Header';
import Footer from './components/Footer';
import './styles/styles.css';

function App() {
  return (
    <Router>
      <div className="app">
        <Header />
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/destinations" component={Destinations} />
          <Route path="/booking" component={Booking} />
        </Switch>
        <Footer />
      </div>
    </Router>
  );
}

export default App;
