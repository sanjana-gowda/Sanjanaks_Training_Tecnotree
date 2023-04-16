// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;
//import React from 'react';
// import ListComponents from './components/p1';
// import project from './components/probs';

// const App = () => {
//   const items = ['apple', 'mango', 'orange'];
//   return ( 
//     <div>
//  <ListComponents items={items} />
//   <Project ietms={items}/>
//     </div>
 
//   );
// };

// export default App;


// import './App.css';
// import React from 'react';
// import List from './components/p1';
// import ListComponent from './components/p2';

// function App() {
//   const items = ['apple', 'orange', 'Mango', 'covo'];

//   return <List items={items} />;

  

//   return <ListComponent/>;
// };



// export default App;

 import CountdownTimer from './components/p3';
// //import FetchData from './components/p4';

const App = () => {
  return <CountdownTimer initialSeconds={10} />;
//   //return <FetchData />;
   
};
// import React, { useState } from 'react';
// import ListForm from './components/p2';

// function App() {
//   const [list, setList] = useState([]);

//   const handleNewItem = (newItem) => {
//     setList([...list, newItem]);
//   };

//   return (
//     <div>
//       <h1>My List:</h1>
//       <ul>
//         {list.map((item, index) => (
//           <li key={index}>{item}</li>
//         ))}
//       </ul>
//       <ListForm onNewItem={handleNewItem} />
//     </div>
//   );
// }

 export default App;


