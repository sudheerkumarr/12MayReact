import { combineReducers } from "redux";
import counterReducer from "./counterreducer";

const rootReducer = combineReducers({
  count: counterReducer,
});

export default rootReducer;
