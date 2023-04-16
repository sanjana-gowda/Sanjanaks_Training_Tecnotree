import React from 'react';

function List(props) {
  const { items } = props;

  return (
    <ul>
      <h3>List</h3>
      {items.map((item, index) => (
        <li key={index}>{item}</li>
      ))}
    </ul>
  );
}

export default List;