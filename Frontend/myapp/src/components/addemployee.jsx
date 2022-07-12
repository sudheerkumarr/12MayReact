// Functional component
import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const AddEmployee = () => {
  // value, name, handleOnChange(), handleSubmit()
  // react hook methods - useState() - define state of component
  // useEffect() - called at the time of page loading and when there is change in state

  // Define state using useState
  let navigate = useNavigate();

  const [emp, setEmp] = useState({
    empName: "",
    dob: "",
    salary: "",
    email: "",
    password: "",
  });

  const handleChange = (event) => {
    console.log(event.target.name); // returns field name
    console.log(event.target.value); // retruns filed value

    // copy emp details to newEmp obj
    const newEmp = { ...emp };

    //newEmp.empId =10;
    //newEmp["empId"] = 10;
    //update newEmp object
    newEmp[event.target.name] = event.target.value;

    // update emp obj with newEmp obj details
    setEmp(newEmp);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    //axios.post(url, emp);
    const newEmp = {
      empName: emp.empName,
      dob: emp.dob,
      salary: emp.salary,
      login: {
        email: emp.email,
        password: emp.password,
      },
    };
    axios
      .post("http://localhost:8080/employee", newEmp)
      .then((res) => {
        console.log(res);
        alert("Added new employee " + res.data.empName + " successfully!");
        navigate("/employees");
      })
      .catch((error) => console.log(error));
  };
  console.log(emp);
  return (
    <div className="w-50 mx-auto mt-3">
      <p className="display-6">Add New Employee</p>
      <form className="border p-3" onSubmit={handleSubmit}>
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
