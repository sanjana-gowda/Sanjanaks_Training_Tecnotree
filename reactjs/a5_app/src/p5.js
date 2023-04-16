import React, { useState, useEffect } from 'react';

const Slideshow = ({ images, interval }) => {
  const [currentImage, setCurrentImage] = useState(0);

  useEffect(() => {
    const timer = setTimeout(() => {
      if (currentImage === images.length - 1) {
        setCurrentImage(0);
      } else {
        setCurrentImage(currentImage + 1);
      }
    }, interval);

    return () => clearTimeout(timer);
  }, [currentImage, images, interval]);

  return (
    <img src={images[currentImage]} alt="slideshow" />
  );
}

export default Slideshow;
