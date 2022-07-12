import axios from "axios";
import React, { Component } from "react";

class UpdateEmployee extends Component {
  state = {
    employee: {
      empId: "",
      empName: "",
      dob: "",
      salary: "",
      email: "",
      password: "",
    },
  };

  componentDidMount() {
    //axios.get('url')
    axios
      .get("http://localhost:8080/employee/83")
      .then((res) => {
        console.log(res.data);
        const newEmp = {
          empId: res.data.empId,
          empName: res.data.empName,
          dob: res.data.dob,
          salary: res.data.salary,
          email: res.data.login.email,
          password: res.data.login.password,
        };
        this.setState({ employee: newEmp });
      })
      .catch((err) => console.log(err));
  }
  handleChange = (event) => {
    const newEmp = { ...this.state.employee };
    newEmp[event.target.name] = event.target.value;
    this.setState({ employee: newEmp });
  };
  handleSubmit = (event) => {
    event.preventDefault();
    //axios.put(url, obj)
    const newEmp = {
      empId: this.state.employee.empId,
      empName: this.state.employee.empName,
      dob: this.state.employee.dob,
      salary: this.state.employee.salary,
      login: {
        email: this.state.employee.email,
        password: this.state.employee.password,
      },
    };
    axios
      .put("http://localhost:8080/employee/83", newEmp)
      .then((res) => {
        console.log(res.date);
        alert(
          "Updated employee " + this.state.employee.empName + "successfully!"
        );
      })
      .catch((err) => console.log(err));
  };
  render() {
    console.log(this.state.employee);
    return (
      <div className="w-50 mx-auto mt-3">
        <p className="display-6">Update Employee</p>
        <form className="border p-3" onSubmit={this.handleSubmit}>
          <div className="mb-3">
            <label htmlFor="empName" className="form-label float-start">
              Employee Id
            </label>
            <input
              type="text"
              className="form-control"
              id="empId"
              value={this.state.employee.empId}
              name="empId"
              onChange={this.handleChange}
              disabled
            />
          </div>
          <div className="mb-3">
            <label htmlFor="empName" className="form-label float-start">
              Employee Name
            </label>
            <input
              type="text"
              className="form-control"
              id="empName"
              value={this.state.employee.empName}
              name="empName"
              onChange={this.handleChange}
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
              value={this.state.employee.salary}
              name="salary"
              onChange={this.handleChange}
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
              value={this.state.employee.dob}
              onChange={this.handleChange}
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
              value={this.state.employee.email}
              name="email"
              onChange={this.handleChange}
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
              value={this.state.employee.password}
              name="password"
              onChange={this.handleChange}
            />
          </div>
          <div className="d-grid gap-2">
            <button type="submit" className="btn btn-primary">
              Update
            </button>
          </div>
        </form>
      </div>
    );
  }
}

export default UpdateEmployee;
