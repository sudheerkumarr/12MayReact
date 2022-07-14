import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { getProductByIdAction } from "../actions/productactions";
import { useParams, useNavigate } from "react-router-dom";

const ProductDetails = () => {
  const dispatch = useDispatch();
  const params = useParams();

  // Dispatch action to get product based on id at the of page loading
  useEffect(() => {
    dispatch(getProductByIdAction(params.id));
  }, []);

  const product = useSelector((state) => state.fakestore.product);

  console.log(product);
  return (
    <div>
      <h1>Product Details Page</h1>
    </div>
  );
};

export default ProductDetails;
