import React, { Component } from "react";
import axios from "axios";

import EmployeeTable from "./employeeTable";

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
        <EmployeeTable
          employees={this.state.employees}
          handleDelete={this.handleDelete}
        />
      </div>
    );
  }
}

export default Employees;
