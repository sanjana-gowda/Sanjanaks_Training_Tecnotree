import React from 'react';

const TributePage = () => {
  return (
    <div className="container">
      <header className="header">
        <h1>Kalpana Chawla</h1>
        <p>March 17, 1962 – February 1, 2003</p>
      </header>
      <main className="main">
        <img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/Kalpana_Chawla%2C_NASA_photo_portrait_in_orange_suit.jpg" alt="Kalpana Chawla" className="image" />
        <div className="bio">
          <p>Kalpana Chawla was an Indian-American astronaut and the first woman of Indian origin to go to space.</p>
          <p>She was born in Karnal, India in 1962 and received her bachelor's degree in aeronautical engineering from Punjab Engineering College in 1982.</p>
          <p>Chawla moved to the United States in 1983 to pursue a Master of Science degree in aerospace engineering at the University of Texas at Arlington, and later earned a PhD in aerospace engineering from the University of Colorado Boulder in 1988.</p>
          <p>In 1997, she was selected by NASA as an astronaut and went on her first space mission in 1997 as part of the crew of the space shuttle Columbia. She returned to space on Columbia in 2003, but tragically died in the shuttle's explosion during re-entry.</p>
        </div>
      </main>
    </div>
  );
};

export default TributePage;

// CSS
