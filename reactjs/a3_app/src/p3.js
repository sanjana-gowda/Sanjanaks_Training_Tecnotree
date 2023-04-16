import React, { useState, useEffect } from 'react';

function CountdownTimer({ initialSeconds }) {
  const [seconds, setSeconds] = useState(initialSeconds);
  const [timerActive, setTimerActive] = useState(false);

  useEffect(() => {
    let intervalId;

    if (timerActive && seconds > 0) {
      intervalId = setInterval(() => {
        setSeconds(prevSeconds => prevSeconds - 1);
      }, 1000);
    }

    if (seconds === 0) {
      clearInterval(intervalId);
      setTimerActive(false);
    }

    return () => {
      clearInterval(intervalId);
    };
  }, [timerActive, seconds]);

  function handleStartClick() {
    setTimerActive(true);
  }

  function handleStopClick() {
    setTimerActive(false);
  }

  function formatTime(seconds) {
    const minutes = Math.floor(seconds / 60);
    const remainingSeconds = seconds % 60;
    return `${minutes.toString().padStart(2, '0')}:${remainingSeconds.toString().padStart(2, '0')}`;
  }

  return (
    <div class="ct">
      <h1>Countdown Timer</h1>
      <p>{formatTime(seconds)}</p>
      {!timerActive && seconds !== 0 && (
        <button onClick={handleStartClick}>Start Timer</button>
      )}
      {timerActive && (
        <button onClick={handleStopClick}>Stop Timer</button>
      )}
      {!timerActive && seconds === 0 && <p>Time is up!</p>}
    </div>
  );
}

export default CountdownTimer;
