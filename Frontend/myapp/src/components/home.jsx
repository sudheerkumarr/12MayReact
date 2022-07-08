// Class component
import React, { Component } from "react";

class Home extends Component {
  state = {
    count: 0,
    employees: [
      {
        empId: 1001,
        empName: "Ram",
        dept: "IT",
      },
      {
        empId: 1002,
        empName: "Sam",
        dept: "Admin",
      },
      {
        empId: 1003,
        empName: "Ravi",
        dept: "IT",
      },
      {
        empId: 1004,
        empName: "Kumar",
        dept: "HR",
      },
      {
        empId: 1005,
        empName: "Krish",
        dept: "HR",
      },
    ],
  };
  render() {
    return (
      <div>
        <h1>Home Page</h1>
        <h5>count: {this.state.count}</h5>
        <table class="table w-50 mx-auto">
          <thead>
            <tr>
              <td>Emp Id</td>
              <td>Emp Name</td>
              <td>Department</td>
            </tr>
          </thead>
          <tbody>
            {this.state.employees.map((emp) => (
              <tr>
                <td>{emp.empId}</td>
                <td>{emp.empName}</td>
                <td>{emp.dept}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default Home;
