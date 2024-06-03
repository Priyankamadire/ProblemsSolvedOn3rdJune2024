//Increment Decrement Counters in React
import React, { useState } from "react";

const SampleCounter = () => {
  const [count, setCount] = useState(0);
  const handleIncrement = () => {
    setCount(count + 1);
  };
  const handleDecrement = () => {
    setCount(count - 1);
  };

  return (
    <div>
      <h1>{count}</h1>
      <button className="btn btn-success" onClick={handleIncrement}>
        Increase
      </button>
      <button className="btn btn-primary" onClick={handleDecrement}>
        Decrease
      </button>
    </div>
  );
};

export default SampleCounter;
