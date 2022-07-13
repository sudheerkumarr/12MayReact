import React, { useState } from "react";

const Counter = () => {
  let [count, setCount] = useState(0);
  const increment = () => {
    setCount((count += 1));
  };
  const decrement = () => {
    setCount((count -= 1));
  };
  return (
    <div>
      <h1>Counter Page</h1>
      <div className="d-flex justify-content-center">
        <i
          className="bi bi-file-minus me-2"
          type="button"
          onClick={decrement}
        ></i>
        <p>{count}</p>
        <i
          className="bi bi-file-plus ms-2"
          type="button"
          onClick={increment}
        ></i>
      </div>
    </div>
  );
};

export default Counter;
