import React, { useState } from "react";
import ReactDOM from "react-dom";
import './Register.css';
import { Link } from "react-router-dom";
import Customerlogin from "./Customerloging";

const form ={
  backgroundColor: "white",
  borderRadius: "5px",
  width:"550px",
 
  margin: "20px auto",
  padding: "20px"
}

function Login() {
  // React States
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);

  // User Login info
  const database = [
    {
      username: "user1",
      password: "pass1"
    },
    {
      username: "user2",
      password: "pass2"
    }
  ];

  const errors = {
    uname: "invalid username",
    pass: "invalid password"
  };

  const handleSubmit = (event) => {
    //Prevent page reload
    event.preventDefault();

    var { uname, pass } = document.forms[0];

    // Find user login info
    const userData = database.find((user) => user.username === uname.value);

    // Compare user info
    if (userData) {
      if (userData.password !== pass.value) {
        // Invalid password
        setErrorMessages({ name: "pass", message: errors.pass });
      } else {
        setIsSubmitted(true);
      }
    } else {
      // Username not found
      setErrorMessages({ name: "uname", message: errors.uname });
    }
  };

  // Generate JSX code for error message
  const renderErrorMessage = (name) =>
    name === errorMessages.name && (
      <div className="error">{errorMessages.message}</div>
    );


    const loginData= async ()=>{
      //console.log(password+" "+" "+email);

    // const res= await axios.post("http://localhost:8080//login", {
  
    //   email:email,
    //   password:password
    // })
  

    // if(res.data.email==email){
    // alert("login successfully");
    // navigate("/AvailablePolicy")
    // }
    // else{
    //   alert("not login")
    // }

    // console.log(res);
    
  } 

  // JSX code for login form
  const renderForm = (
    
    <div className="form" style={form}>
      
      <form onSubmit={handleSubmit}>
      <div className="form-body">
        <div className="input-container">
          <label className="form__label">Username </label>
          <input type="text" name="uname" required />
          {renderErrorMessage("uname")}
        </div>
        <div className="input-container">
          <label className="form__label">Password </label>
          <input type="password" name="pass" required />
          {renderErrorMessage("pass")}
        </div>
       
        <div class="footer">
         <button type="submit" style={{marginLeft: "51px"}} class="btn btn-secondary">Login</button>&nbsp;&nbsp;&nbsp;
              <button type="submit" class="btn btn-secondary" onClick={() => window.close()}>Cancle</button>
          </div>
         
          </div>
      </form>
    </div>
  );

  return (
    <div className="app">
      <div className="login-form">
        <div className="title">Sign In</div>
        {isSubmitted ? <div>
          <Customerlogin></Customerlogin>
          {/* <Link to={`/Customerlogin`}>User is successfully logged in</Link> */}
        </div> : renderForm}
      </div>
    </div>
  );
}

export default Login;