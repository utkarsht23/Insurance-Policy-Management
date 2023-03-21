
import Button from 'react-bootstrap/Button';
import React, { useState } from "react";
import Login from './Login';
import RegistrationForm from "./Register"
import AvailabePlicy from './AvailablePolicy';

function Admin(){
    const [showComponent, setShowComponent] = useState(false);
  const handleClick = () => {
    setShowComponent(true);
  };

  const [showComponent1, setShowComponent1] = useState(false);
  const handleClick1 = () => {
    setShowComponent1(true);
  }
    return(
        <>
        <div class="Admin">
  <h1>Hello, Admin</h1> 
<h2>Welcome to insurance management system</h2>
<div>
<Button variant="primary" onClick={handleClick1} type="submit">
        Sign In
      </Button>
      {showComponent1 && <RegistrationForm />}
</div>

      <div>
      <Button variant="primary" onClick={handleClick} class="mt-1" type="submit">
        Login
      </Button>
      {showComponent && <Login />}
        </div> 

      <AvailabePlicy></AvailabePlicy>
  </div>
  </>
    )
}
export default Admin;