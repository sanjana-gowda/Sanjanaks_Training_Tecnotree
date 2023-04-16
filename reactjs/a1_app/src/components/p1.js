import React, { useState } from 'react';

function ListItem({ item }) {
  return <li style={{listStyle:"inside"}}>{item}</li>;
}

function List({ items }) {
  return (
    <ul>
      {items.map((item, index) => (
        <ListItem key={index} item={item} />
      ))}
    </ul>
  );
}

function Form({ addItem }) {
  const [inputValue, setInputValue] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    addItem(inputValue);
    setInputValue('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        New item:
        <input type="text" value={inputValue} onChange={(e) => setInputValue(e.target.value)} />
      </label><br></br>
      <button type="submit" class="custom-btn btn-7"><span>Add item</span></button>
    </form>
  );
}

function App() {
  const [items, setItems] = useState([]);

  const addItem = (newItem) => {
    setItems([...items, newItem]);
  };

  return (
    <div>
      <List items={items} />
      <Form addItem={addItem} />
    </div>
  );
}

export default App;
