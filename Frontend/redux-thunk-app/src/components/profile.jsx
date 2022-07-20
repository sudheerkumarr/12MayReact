import axios from "axios";
import React, { useState, useEffect } from "react";
import { useSelector } from "react-redux";
import { Link } from "react-router-dom";

const Profile = () => {
  const login = useSelector((state) => state.login.login);
  console.log(login);
  const [emp, setEmp] = useState({});

  useEffect(() => {
    axios
      .get(`http://localhost:8080/employee/email/${login.email}`)
      .then((res) => setEmp(res.data))
      .catch((err) => console.log(err));
  }, []);
  console.log(emp);

  return (
    <div>
      <div className="container mt-5">
        <div className="card w-50 mx-auto">
          <div className="d-flex justify-content-between card-header">
            <h5>Personal Details</h5>
            <h5>
              <i className="bi bi-pencil-square"></i>
            </h5>
          </div>

          <div className="card-body">
            <table>
              <tbody>
                <tr>
                  <td>
                    <b>Name: </b>
                  </td>
                  <td className="ps-3">{emp.empName}</td>
                </tr>
                <tr>
                  <td>
                    <b>DOB: </b>
                  </td>
                  <td className="ps-3">{emp.dob}</td>
                </tr>
                <tr>
                  <td>
                    <b>Salary: </b>
                  </td>
                  <td>{emp.salary}</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
        <div className="card w-50 mx-auto mt-3">
          <div className="d-flex justify-content-between card-header">
            <h5>Address</h5>
            <h5>
              <Link to="#">
                <i className="bi bi-pencil-square"></i>
              </Link>
              <i className="bi bi-trash3 ms-2" type="button"></i>
            </h5>
          </div>

          <div className="card-body">
            <table>
              <tbody>
                <tr>
                  <td>
                    <b>City: </b>
                  </td>
                  <td className="ps-3"></td>
                </tr>
                <tr>
                  <td>
                    <b>State:</b>
                  </td>
                  <td className="ps-3">{emp.dob}</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Profile;
