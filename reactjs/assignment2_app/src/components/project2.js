import React, { useState } from 'react';

function Form() {
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    email: '',
  });

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(formData);
  };

  const handleChange = (event) => {
    setFormData({
      ...formData,
      [event.target.name]: event.target.value,
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>        First Name:
        <input class='p1'
          type="text"
          name="firstName"
          value={formData.firstName}
          onChange={handleChange}
        />
      </label><br></br>
      <label>
        Last Name:
        <input class='p2'
          type="text"
          name="lastName"
          value={formData.lastName}
          onChange={handleChange}
        />
      </label><br></br>
      <label>
        Email:
        <input class='p3'
          type="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
        />
      </label><br></br>
      <button class='b1' type="submit">Submit</button>
    </form>
  );
}

export default Form;
