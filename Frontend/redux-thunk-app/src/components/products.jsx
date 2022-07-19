import React, { useEffect, useState } from "react";
import { useSelector, useDispatch } from "react-redux";
import { getAllProductsAction } from "../actions/productactions";
import { Link } from "react-router-dom";

const Product = () => {
  const dispatch = useDispatch();

  const [categories, setCategories] = useState([
    "all",
    "men's clothing",
    "jewelery",
    "women's clothing",
    "electronics",
  ]);
  const [selCategory, setSelCategory] = useState("all");
  let [filteredItems, setFilteredItems] = useState([]);

  //useEffect(func, [conditional stmt])
  // dispatches getAllProductsAction at the time of page loading
  useEffect(() => {
    dispatch(getAllProductsAction());
  }, []);

  // get products info from redux store
  const products = useSelector((state) => state.fakestore.products);
  console.log(products);

  const handleCategory = (category) => {
    console.log("Selected Category: " + category);
    setSelCategory(category);
    if (category == "all") {
      setFilteredItems(products);
    } else {
      let filteredItems = products.filter(
        (product) => product.category == category
      );
      console.log(filteredItems);
      setFilteredItems(filteredItems);
    }
  };

  return (
    <div className="container mt-3">
      <div className="row">
        <aside className="col-sm-12 col-md-2">
          <ul className="list-group border">
            {categories.map((category) => (
              <li
                className={
                  selCategory == category
                    ? "list-group-item active"
                    : "list -group-item border"
                }
                type="button"
                onClick={() => handleCategory(category)}
              >
                {category}
              </li>
            ))}
          </ul>
        </aside>
        <div className="col-sm-12 col-md-10">
          <div className="row">
            {products.map((prod) => (
              <div className="col-xs-12 col-sm-6 col-md-4 col-lg-3 text-start mb-3 ">
                <Link
                  to={`/products/get/${prod.id}`}
                  style={{ textDecoration: "none" }}
                >
                  <div className="card h-100 ">
                    <img
                      src={prod.image}
                      className="card-img-top"
                      alt={prod.title}
                      width="120px"
                      height="120px"
                    />
                    <div className="card-body">
                      <small className="card-title">{prod.title}</small>
                    </div>
                    <small className="card-title text-end">
                      <i class="bi bi-currency-rupee"></i>
                      {prod.price}
                    </small>
                  </div>
                </Link>
              </div>
            ))}
          </div>
        </div>
      </div>
    </div>
  );
};

export default Product;
