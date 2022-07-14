import "./App.css";
import Product from "./components/products";
import { Routes, Route, Navigate } from "react-router-dom";
import Home from "./components/home";
import Nav from "./components/nav";
import AddEmployee from "./components/addEmployee";
import Employees from "./components/employees";
import Login from "./components/login";
import NotFound from "./components/notfound";
import Register from "./components/register";
import Cart from "./components/cart";
import UpdateEmployee from "./components/updateEmployee";
import ProductDetails from "./components/productDetails";

function App() {
  return (
    <div className="App">
      <Nav />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/home" element={<Navigate to="/" replace />} />
        <Route path="/employees" element={<Employees />} />
        <Route path="/employee/add" element={<AddEmployee />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/cart" element={<Cart />} />
        <Route path="/employee/update/:id" element={<UpdateEmployee />} />
        <Route path="/products" element={<Product />} />
        <Route path="/products/get/:id" element={<ProductDetails />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </div>
  );
}

export default App;
