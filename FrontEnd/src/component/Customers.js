
import Button from 'react-bootstrap/Button';
import './Customer.css';
import React, { useState } from "react";
import Login from './Login';
import RegistrationForm from "./Register"
import Customerlogin from './Customerloging';
import Sidebar from './Sidebar';


function Customer(){
  const [showComponent, setShowComponent] = useState(false);
  const handleClick = () => {
    setShowComponent(true);
  };

  const [showComponent1, setShowComponent1] = useState(false);
  const handleClick1 = () => {
    setShowComponent1(true);
  };
  
    return(
        <>
        <div class="customer">
  <h2 style={{textAlign:"center"}}>Hello, Customer</h2> 
<h3>Welcome to insurance management system</h3>
<h3>If you are new user click on sign in button</h3>
<center><Button variant="primary" onClick={handleClick1} type="submit" style={{textAlign:"center"}}>
        Sign In
      </Button></center>
      {showComponent1 && <RegistrationForm />}
<h3>If you are existing one go with Login</h3>
<center><Button variant="primary" onClick={handleClick1} type="submit" style={{textAlign:"center"}}>
        
      </Button></center>



       

     {/* <div><Button variant="primary" onClick={handleClick} class="mt-1" type="submit">
        Login
      </Button>
      {showComponent && <Login />}
      </div> */}
      
      {/* <Customerlogin></Customerlogin> */}
  </div>
  </>
    )
}
export default Customer;