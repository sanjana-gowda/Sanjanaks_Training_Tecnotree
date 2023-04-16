import React, { useState, useEffect } from 'react';

const CountdownTimer = ({ initialSeconds }) => {
  const [secondsLeft, setSecondsLeft] = useState(initialSeconds);

  useEffect(() => {
    if (secondsLeft > 0) {
      const timerId = setInterval(() => {
        setSecondsLeft((secondsLeft) => secondsLeft - 1);
      }, 1000);

      return () => clearInterval(timerId);
    }
  }, [secondsLeft]);

  return (
    <div>
      <h2>Countdown Timer: {secondsLeft}</h2>
      {secondsLeft === 0 && <p>Time is up!</p>}
    </div>
  );
};

export default CountdownTimer;
