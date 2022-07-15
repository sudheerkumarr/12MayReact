import React, { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { registerAction } from "../actions/loginactions";
import { useNavigate } from "react-router-dom";

const Register = () => {
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const [emp, setEmp] = useState({
    empName: "",
    email: "",
    password: "",
    role: "",
  });

  const empl = useSelector((state) => state.login.employee);

  const handleChange = (event) => {
    const newEmp = { ...emp };
    newEmp[event.target.name] = event.target.value;
    setEmp(newEmp);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    dispatch(registerAction(emp));
    alert("Employee  added successfully!");
    navigate("/login");
  };
  console.log(emp);
  return (
    <div>
      <h1>Register Page</h1>
      <div>
        <form
          onSubmit={handleSubmit}
          className="w-50 mx-auto border border-secondary rounded mt-4 p-2 shadow-lg p-3 mb-5 bg-body rounded"
        >
          <p className="text-center fs-4 bg-secondary text-white">
            Register Form
          </p>
          <div className="mb-3">
            <label htmlFor="empName" className="form-label">
              Employee Name
            </label>
            <input
              type="text"
              className="form-control"
              id="empName"
              name="empName"
              value={emp.empName}
              onChange={handleChange}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="email" className="form-label">
              Email address
            </label>
            <input
              type="email"
              className="form-control"
              id="email"
              aria-describedby="emailHelp"
              name="email"
              value={emp.email}
              onChange={handleChange}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="password" className="form-label">
              Password
            </label>
            <input
              type="password"
              className="form-control"
              id="password"
              name="password"
              value={emp.password}
              onChange={handleChange}
            />
          </div>
          <label htmlFor="role" className="form-label">
            Role
          </label>
          <select
            className="form-select"
            aria-label="Default select example"
            id="role"
            name="role"
            value={emp.role}
            onChange={handleChange}
          >
            <option selected>Role</option>
            <option value="employee">Employee</option>
            <option value="admin">Admin</option>
            <option value="customer">Customer</option>
          </select>
          <div className="d-grid gap-2 mt-3">
            <button type="submit" className="btn btn-secondary">
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default Register;
