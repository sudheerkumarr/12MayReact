import { combineReducers } from "redux";
import productReducer from "./productsreducer";
import { loginReducer } from "./loginreducer";

const rootReducer = combineReducers({
  fakestore: productReducer,
  login: loginReducer,
});

export default rootReducer;
