import React, { useState } from 'react';

function Modal(props) {
  const [showModal, setShowModal] = useState(false);

  function handleClick() {
    setShowModal(true);
  }

  function handleClose() {
    setShowModal(false);
  }

  return (
    <>
      <button onClick={handleClick}>Open Modal</button>
      {showModal && (
        <div className="modal">
          <div className="modal-content">
            <p>{props.message}hello</p>
            <button onClick={handleClose}>Close</button>
          </div>
        </div>
      )}
    </>
  );
}

export default Modal;
