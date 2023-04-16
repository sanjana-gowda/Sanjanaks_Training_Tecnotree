import React, { useState } from 'react';

const ModalDialog = () => {
  const [showModal, setShowModal] = useState(false);

  const handleOpenModal = () => {
    setShowModal(true);
  };

  const handleCloseModal = () => {
    setShowModal(false);
  };

  return (
    <div>
      <header>
   <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet"></link>
</header>
<button class="custom-btn btn-12" onClick={handleOpenModal}><span>Click!</span><span>Open Modal</span></button>
      {showModal &&
        <div className="modal">
          <div className="modal-content">
            <h2>Modal Title</h2>
            <p>This is the message inside the modal.</p>
            <button class="custom-btn btn-10" onClick={handleCloseModal}>Close</button>
            
          </div>
        </div>
      }
    </div>
  );
};

export default ModalDialog;
