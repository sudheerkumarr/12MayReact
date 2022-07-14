import React, { useEffect } from "react";
import { useSelector, useDispatch } from "react-redux";
import { getAllProductsAction } from "../actions/productactions";
import { Link } from "react-router-dom";

const Product = () => {
  const dispatch = useDispatch();
  //useEffect(func, [conditional stmt])
  // dispatches getAllProductsAction at the time of page loading
  useEffect(() => {
    dispatch(getAllProductsAction());
  }, []);

  // get products info from redux store
  const products = useSelector((state) => state.fakestore.products);
  console.log(products);

  return (
    <div>
      <div className="row">
        <aside className="col-sm-12 col-md-2">
          <ul className="list-group">
            <li className="list-group-item active" aria-current="true">
              An active item
            </li>
            <li className="list-group-item">A second item</li>
            <li className="list-group-item">A third item</li>
            <li className="list-group-item">A fourth item</li>
            <li className="list-group-item">And a fifth one</li>
          </ul>
        </aside>
        <div className="col-sm-12 col-md-10">
          <div className="row">
            <div className="col-xs-12 col-sm-6 col-md-4 col-lg-3">
              {products.map((prod) => (
                <Link to={`/products/get/${prod.id}`}>
                  <div className="card">
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
                  </div>
                </Link>
              ))}
              ;
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Product;
