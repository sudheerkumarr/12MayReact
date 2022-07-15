import axios from "axios";

// Register
export const registerAction = (employee) => async (dispatch) => {
  const result = await axios.post(
    "http://localhost:8080/employee/register",
    employee
  );
  console.log(result);
  console.log(result.data);
  dispatch({
    type: "REGISTER",
    payload: result.data,
  });
};

// login action
export const loginAction = (login) => async (dispatch) => {
  const result = await axios.post("http://localhost:8080/login/dto", login);
  console.log(result);
  console.log(result.data);
  dispatch({
    type: "LOGIN",
    payload: result.data,
  });
};

// logout action
export const logoutAction = (email) => async (dispatch) => {
  const result = await axios.patch(`http://localhost:8080/logout/${email}`);
  console.log(result);
  console.log(result.data);
  dispatch({
    type: "LOGOUT",
    payload: result.data,
  });
};
