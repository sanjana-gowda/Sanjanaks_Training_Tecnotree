import React from 'react';
import Slideshow from './p5';

const App = () => {
  const images = [
    'https://i.pinimg.com/originals/b9/a7/d1/b9a7d15aaae18649ccfc03af49c54cd7.jpg',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQupHCzEB2JR-I-VQGUv_2ARzxj1o4U-g6VIjBXhj8IhpPIl_ArTj7aACV0AEFQU7gbh702i5_crcA&usqp=CAU&ec=48600113',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxpw5k_2qjQ8FIBtupQT3aHs3H7PEXesywQO8xJzfxMI11rl6yHraypNB5x_dBECnpVNG835VRmr0&usqp=CAU&ec=48600113',
  ];

  return (
    <div>
      <h1>My Slideshow</h1>
      <Slideshow images={images} interval={3000} />
    </div>
  );
}

export default App;