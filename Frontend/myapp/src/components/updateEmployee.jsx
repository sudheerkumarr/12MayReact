import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import axios from "axios";

const UpdateEmployee = () => {
  const params = useParams();
  console.log(params);

  // define state
  const [emp, setEmp] = useState({
    empId: "",
    empName: "",
    salary: "",
    dob: "",
    email: "",
  });

  //useEffect(callback function,[condition] )
  // get existing emp details using id and update emp state obj
  useEffect(() => {
    axios
      .get(`http://localhost:8080/employee/dto/${params.id}`)
      .then((res) => setEmp(res.data))
      .catch((err) => console.log(err));
  }, []);

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
    axios
      .put(`http://localhost:8080/employee/${params.id}`, emp)
      .then((res) => {
        console.log(res);
        alert("Added new employee " + res.data.empName + " successfully!");
      })
      .catch((error) => console.log(error));
  };
  return (
    <div>
      <div className="w-50 mx-auto mt-3">
        <p className="display-6">Update Employee</p>
        <form className="border p-3" onSubmit={handleSubmit}>
          <div className="mb-3">
            <label htmlFor="empName" className="form-label float-start">
              Employee Id
            </label>
            <input
              type="text"
              className="form-control"
              id="empId"
              value={emp.empId}
              name="empId"
              onChange={handleChange}
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

          <div className="d-grid gap-2">
            <button type="submit" className="btn btn-primary">
              Update
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default UpdateEmployee;
