import React from "react";
import Navbar from "./component/Navbar"
import Home from "./component/Home"
import Customer from "./component/Customers"
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import RegistrationForm from "./component/Register";
//import Login from "./component/Login";
// import { Router } from "react-router";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import HomeNavbar from "./component/Navbar";
import Customers from "./component/Customers";
import Admin from "./component/Admin";
import Customerlogin from "./component/Customerloging";
import AvailabePlicy from "./component/AvailablePolicy";
import History from "./component/History";
import Categories from "./component/Catergories";
import Product from './component/Product'
// import Customer from './Customers';
function App() {
  return (
    <>
    
    {/* <Navbar></Navbar>
  <Home></Home>
<Customer></Customer>
<RegistrationForm></RegistrationForm>
<Login></Login> */}


     <BrowserRouter>
       <Navbar ></Navbar>
       <Routes>
        <Route path="/home" element={<Home></Home>}></Route>
          {/* <Route path="/Login" element={<Login></Login>}></Route> */}
          <Route path="/home" element={<Home></Home>}>Login...</Route>
          <Route path="/customer" element={<Customers></Customers>}></Route>
          <Route path="/Admin" element={<Admin></Admin>}></Route>
          <Route path="/Register" element={<RegistrationForm></RegistrationForm>}></Route>
          <Route path="/AvailablePolicy" element={<AvailabePlicy ></AvailabePlicy >}></Route>
          <Route path="/History" element={<History></History>}></Route>
          <Route path="/Categories" element={<History></History>}></Route>
          <Route path="/Customerlogin" element={<Customerlogin></Customerlogin>}></Route>
          <Route path="/product" element={<Product/>}></Route>
          
      </Routes> 
     </BrowserRouter>
      
    



    </>
    
     
  );
}



export default App;
