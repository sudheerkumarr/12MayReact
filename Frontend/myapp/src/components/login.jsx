import React, { Component } from "react";

class Login extends Component {
  state = {};
  render() {
    return (
      <div>
        <form className="w-25 mx-auto border border-secondary rounded mt-4 p-2 shadow-lg p-3 mb-5 bg-body rounded">
          <p className="text-center fs-4 bg-secondary text-white">Login Form</p>
          <div className="mb-3">
            <label for="exampleInputEmail1" className="form-label">
              Email address
            </label>
            <input
              type="email"
              className="form-control"
              id="exampleInputEmail1"
              aria-describedby="emailHelp"
            />
          </div>
          <div className="mb-3">
            <label for="exampleInputPassword1" className="form-label">
              Password
            </label>
            <input
              type="password"
              className="form-control"
              id="exampleInputPassword1"
            />
          </div>
          <select className="form-select" aria-label="Default select example">
            <option selected>Role</option>
            <option value="1">Employee</option>
            <option value="2">Admin</option>
            <option value="3">Customer</option>
          </select>
          <div className="d-grid gap-2 mt-3">
            <button type="submit" className="btn btn-secondary">
              Submit
            </button>
          </div>
        </form>
      </div>
    );
  }
}

export default Login;
