//code for the counter component

import React, { useState, useEffect } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    document.title = `Count: ${count}`;
  }, [count]);

  return (
    <div class="c1">
        <h1>Count: {count}</h1>
      
<div class="color">
<button class="b1" onClick={() => setCount(count + 1)}>Increment</button>
<button class="b2" onClick={() => setCount(count - 1)}>Decrement</button>
<br></br>
</div>
      
    </div>
  );
}

export default Counter;
