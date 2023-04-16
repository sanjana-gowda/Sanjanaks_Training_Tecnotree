import React, { useState } from 'react';

const Form = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [message, setMessage] = useState('');

  const handleSubmit = event => {
    event.preventDefault();
    console.log('Name:', name);
    console.log('Email:', email);
    console.log('Message:', message);
  };

  return (
    <form class='p1' onSubmit={handleSubmit}>
        <h2>Welcome To Form</h2>
      <label> Name:</label>
        <input
          type="text"
          value={name}
          onChange={event => setName(event.target.value)}
        />
      <br></br>
      <label>
        Email:</label>
        <input
          type="email"
          value={email}
          onChange={event => setEmail(event.target.value)}
        />
      <br></br>
      <label>
        Message:</label>
        <textarea
          value={message}
          onChange={event => setMessage(event.target.value)}
        />
      <br></br>
      <button type="submit">Submit</button>
    </form>
  );
};

export default Form;
