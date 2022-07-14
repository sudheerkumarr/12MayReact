import { combineReducers } from "redux";
import productReducer from "./productsreducer";

const rootReducer = combineReducers({
  fakestore: productReducer,
});

export default rootReducer;
