import React, { useState } from 'react';
import ListForm from './p2';

function App() {
  const [list, setList] = useState([]);

  const handleNewItem = (newItem) => {
    setList([...list, newItem]);
  };

  return (
    <div>
      <h1>My List:</h1>
      <ul>
        {list.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
      <ListForm onNewItem={handleNewItem} />
    </div>
  );
}

export default App;