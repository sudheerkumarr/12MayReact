import React, { Component } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

class Employees extends Component {
  state = {
    employees: [],
  };
  // life cycle methods

  // Get All employees
  componentDidMount() {
    // send get request
    axios
      .get("http://localhost:8080/employees")
      .then((response) => {
        console.log(response);
        this.setState({ employees: response.data });
      })
      .catch((error) => console.log(error));
  }

  // Delete Employee
  handleDelete = (empId) => {
    // http://localhost:8080/employee/{id}
    axios
      .delete(`http://localhost:8080/employee/${empId}`)
      .then((res) => {
        console.log(res);
        // return all employees except emp which is selected for delete
        const emps = this.state.employees.filter((emp) => emp.empId != empId);

        // update state object with employees
        this.setState({ employees: emps });
        alert("Employee with empId " + empId + " deleted successfully!");
      })
      .catch((err) => console.log(err));
  };

  render() {
    return (
      <div className="w-50 mx-auto">
        <h4 className="mt-3">Employee Details</h4>
        <Link to="/employee/add" className="btn btn-primary float-end mb-2">
          Add New
        </Link>
        <table className="table">
          <thead>
            <tr>
              <th>Emp Id</th>
              <th>Emp Name</th>
              <th>Date Of Birth</th>
              <th>Email</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {this.state.employees.map((emp) => (
              <tr key={emp.empId}>
                <td>{emp.empId}</td>
                <td>{emp.empName}</td>
                <td>{emp.dob}</td>
                <td>{emp.login.email}</td>
                <td>
                  <Link to={`/employee/update/${emp.empId}`}>
                    <i className="bi bi-arrow-repeat me-3"></i>
                  </Link>
                  <i
                    className="bi bi-trash-fill"
                    type="button"
                    onClick={() => this.handleDelete(emp.empId)}
                  ></i>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default Employees;
