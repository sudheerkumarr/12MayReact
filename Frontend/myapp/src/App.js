import logo from "./logo.svg";
import "./App.css";
import Home from "./components/home";
import Nav from "./components/nav";
import AddEmployee from "./components/addemployee";
import Employees from "./components/employees";
import Login from "./components/login";

function App() {
  return (
    <div className="App">
      <Nav />
      <Home />
      <Employees />
      <AddEmployee />
      <Login />
    </div>
  );
}

export default App;
