import React from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Non-Profit Organization</h1>
        <nav>
          <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Donate</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
        </nav>
      </header>
      <main>
        <section className="hero">
          <h2>Make a difference</h2>
          <p>Join us in making a positive impact on the world.</p>
          <button>Donate Now</button>
        </section>
        <section className="about">
          <h2>About Us</h2>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam eget eleifend mi. Proin eget orci et augue auctor volutpat at non augue. Sed ac bibendum lorem. Praesent sit amet sodales purus. Sed iaculis est eget magna pulvinar, at semper quam iaculis.</p>
        </section>
        <section className="causes">
          <h2>Causes We Support</h2>
          <ul>
            <li><a href="#">Education</a></li>
            <li><a href="#">Poverty</a></li>
            <li><a href="#">Healthcare</a></li>
            <li><a href="#">Environment</a></li>
          </ul>
        </section>
        <section className="donate">
          <h2>Donate Now</h2>
          <p>Your donation can make a difference in the world. Every dollar counts!</p>
          <form>
            <label for="amount">Donation Amount:</label>
            <input type="number" id="amount" name="amount" min="1" max="1000" step="1" required />
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required />
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required />
            <button type="submit">Donate Now</button>
          </form>
        </section>
      </main>
      <footer>
        <p>Non-Profit Organization &copy; 2023</p>
      </footer>
    </div>
  );


}

export default App;
