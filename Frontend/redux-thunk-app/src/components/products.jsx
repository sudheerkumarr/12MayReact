import React, { useEffect, useState } from "react";
import { useSelector, useDispatch } from "react-redux";
import { getAllProductsAction } from "../actions/productactions";

import Card from "./card";

const Product = () => {
  const dispatch = useDispatch();

  const [categories, setCategories] = useState([
    "all",
    "men's clothing",
    "jewelery",
    "women's clothing",
    "electronics",
  ]);

  const [searchName, setSearchName] = useState("");
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

  let [searchProducts, setSearchProducts] = useState([]);
  const handleSearch = (event) => {
    setSearchName(event.target.value);
    console.log(event.target.value);
    searchProducts = products.filter((prod) =>
      prod.title.toLowerCase().includes(event.target.value)
    );
    setSearchProducts(searchProducts);
  };

  return (
    <div className="container mt-3">
      <div className="row">
        <aside className="col-sm-12 col-md-2 my-3">
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
          <form className="my-3 w-25">
            <input
              type="search"
              placeholder="Search By Name"
              className="form-control"
              name="searchName"
              value={searchName}
              onChange={handleSearch}
            />
          </form>

          <div className="row">
            {searchProducts.length != 0
              ? searchProducts.map((prod) => <Card prod={prod} />)
              : products.map((prod) => <Card prod={prod} />)}
          </div>
        </div>
      </div>
    </div>
  );
};

export default Product;
