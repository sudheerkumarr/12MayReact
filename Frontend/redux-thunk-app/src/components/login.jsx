import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useDispatch, useSelector } from "react-redux";
import { loginAction } from "../actions/loginactions";

const Login = () => {
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const [emp, setEmp] = useState({
    email: "",
    password: "",
    role: "",
  });

  //const empl = useSelector((state) => state.login.employee);

  const handleChange = (event) => {
    const newEmp = { ...emp };
    newEmp[event.target.name] = event.target.value;
    setEmp(newEmp);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    dispatch(loginAction(emp));
    alert("Employee  logged in successfully!");
    navigate("/products");
  };
  console.log(emp);
  return (
    <div>
      <form
        onSubmit={handleSubmit}
        className="w-25 mx-auto border border-secondary rounded mt-4 p-2 shadow-lg p-3 mb-5 bg-body rounded"
      >
        <p className="text-center fs-4 bg-secondary text-white">Login Form</p>
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
  );
};

export default Login;
