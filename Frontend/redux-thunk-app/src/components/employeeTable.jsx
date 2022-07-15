import React from "react";
import { Link } from "react-router-dom";
import { useSelector } from "react-redux";

const EmployeeTable = (props) => {
  const login = useSelector((state) => state.login.login);
  return (
    <div>
      {login.loggedIn && login.role == "admin" && (
        <Link to="/employee/add" className="btn btn-primary float-end mb-2">
          Add New
        </Link>
      )}
      <table className="table">
        <thead>
          <tr>
            <th>Emp Id</th>
            <th>Emp Name</th>
            <th>Date Of Birth</th>
            <th>Email</th>
            {login.loggedIn && login.role == "admin" && <th>Actions</th>}
          </tr>
        </thead>
        <tbody>
          {props.employees.map((emp) => (
            <tr key={emp.empId}>
              <td>{emp.empId}</td>
              <td>{emp.empName}</td>
              <td>{emp.dob}</td>
              <td>{emp.login.email}</td>
              {login.loggedIn && login.role == "admin" && (
                <td>
                  <Link to={`/employee/update/${emp.empId}`}>
                    <i className="bi bi-arrow-repeat me-3"></i>
                  </Link>
                  <i
                    className="bi bi-trash-fill"
                    type="button"
                    onClick={() => props.handleDelete(emp.empId)}
                  ></i>
                </td>
              )}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default EmployeeTable;
