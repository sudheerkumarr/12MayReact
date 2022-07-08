// Functional component
import React from "react";

const AddEmployee = () => {
  return (
    <div>
      <form>
        <input type="number" placeholder="enter emp id" />
        <input type="text" placeholder="enter emp name" />
        <input type="text" placeholder="enter dept name" />
        <input type="submit" value="Add" />
      </form>
    </div>
  );
};

export default AddEmployee;
