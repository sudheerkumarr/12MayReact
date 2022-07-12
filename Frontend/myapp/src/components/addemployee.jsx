// Functional component
import React from "react";
import { useState, useEffect } from "react";

const AddEmployee = () => {
  // value, name, handleOnChange(), handleSubmit()
  // react hook methods - useState() - define state of component
  // useEffect() - called at the time of page loading and when there is change in state

  // Define state using useState
  // const [empName, setEmpName] = useState("");
  // const [salary, setSalary] = useState(0);
  // const [dob, setDob] = useState("");
  // const [email, setEmail] = useState("");
  // const [password, setPassword] = useState("");
  const [emp, setEmp] = useState({
    empName: "",
    dob: "",
    salary: "",
    email: "",
    password: "",
  });

  const handleChange = (event) => {
    //console.log(event);
    console.log(event.target.name); // field name
    console.log(event.target.value); // filed value
    // if (event.target.name == "empName") {
    //   setEmpName(event.target.value);
    // } else if ((event.target.name = "salary")) {
    //   setSalary(event.target.value);
    // } else if ((event.target.name = "email")) {
    //   setEmail(event.target.value);
    // } else if ((event.target.name = "dob")) {
    //   setDob(event.target.value);
    // } else {
    //   setPassword(event.target.value);
    // }
    const newEmp = {};
    newEmp[event.target.name] = event.target.value;
    setEmp(()=>...emp, newEmp);
  };

  console.log(emp);
  return (
    <div className="w-50 mx-auto mt-3">
      <p className="display-6">Add New Employee</p>
      <form className="border p-3">
        <div className="mb-3">
          <label htmlFor="empName" className="form-label float-start">
            Employee Name
          </label>
          <input
            type="text"
            className="form-control"
            id="empName"
            value={emp.empName}
            name="empName"
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <label htmlFor="salary" className="form-label float-start">
            Salary
          </label>
          <input
            type="number"
            className="form-control"
            id="salary"
            value={emp.salary}
            name="salary"
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <label htmlFor="dob" className="form-label float-start">
            Date Of Birth
          </label>
          <input
            type="date"
            className="form-control"
            id="dob"
            name="dob"
            value={emp.dob}
            onChange={handleChange}
          />
        </div>

        <div className="mb-3">
          <label htmlFor="email" className="form-label float-start">
            Email address
          </label>
          <input
            type="email"
            className="form-control"
            id="email"
            aria-describedby="emailHelp"
            value={emp.email}
            name="email"
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label float-start">
            Password
          </label>
          <input
            type="password"
            className="form-control"
            id="password"
            value={emp.password}
            name="password"
            onChange={handleChange}
          />
        </div>
        <div className="d-grid gap-2">
          <button type="submit" className="btn btn-primary">
            Add
          </button>
        </div>
      </form>
    </div>
  );
};

export default AddEmployee;
