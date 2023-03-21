
import React, {useState} from 'react';
import axios from "axios";
import './Register.css';
import { useNavigate } from 'react-router';
const form ={
    backgroundColor: "white",
    borderRadius: "5px",
    width:"550px",
   
    margin: "20px auto",
    padding: "20px"
}

function RegistrationForm() {

    const [firstName,setFname]=useState("");
    const [lastName,setLname]=useState("");
    const [email,setEmail]=useState("");
    const [password,setPass]=useState("");
   const[temp,setTemp]=useState(0)
    let navigate = useNavigate();



const postData= async ()=>{
        console.log(firstName+" "+lastName+" "+email);

      const res= await axios.post("http://localhost:8080/createUser", {
        name:firstName,
        email:email,
        password:password,
        dateOfBirth : "1998/11/11",
        city:"nashik",
        gender:"female",
        role:"unknown",
        policyStatus:"unknown",
        policy : null
      })
    

      if(res.data.email==email){
      alert("Registered successfully");
      navigate("/login")
      }
      else{
        alert("not uploaded")
      }

      console.log(res);
      
    } 



    return(
      <div className="form" style={form}>
          <div className="form-body">
              <div className="username">
                  <label className="form__label" for="firstName">First Name </label>
                  <input className="form__input" type="text" id="firstName" placeholder="First Name" onChange={(e)=>{setFname(e.target.value)}}/>
              </div>
              <div className="lastname">
                  <label className="form__label" for="lastName">Last Name </label>
                  <input  type="text" name="" id="lastName"  className="form__input"placeholder="LastName" onChange={(e)=>{setLname(e.target.value)}}/>
              </div>
              <div className="email">
                  <label className="form__label" for="email">Email </label>
                  <input  type="email" id="email" className="form__input" placeholder="Email" onChange={(e)=>{setEmail(e.target.value)}}/>
              </div>
              <div className="password">
                  <label className="form__label" for="password">Password </label>
                  <input className="form__input" type="password"  id="password" placeholder="Password" onChange={(e)=>{setPass(e.target.value)}}/>
              </div>
              <div className="confirm-password">
                  <label className="form__label" for="confirmPassword">Confirm Password </label>
                  <input className="form__input" type="password" id="confirmPassword" placeholder="Confirm Password"/>
              </div>
              {/* <div classNam="gender">
                  <label className="form__label" for="confirmPassword">Confirm Password </label>
                  <input className="form__input" type="password" id="confirmPassword" placeholder="Confirm Password"/>
              </div> */}
          </div>
          <div class="footer">
              <button type="submit" class="btn btn-secondary" onClick={postData()}>Register</button>
          </div>
      </div>      
    )       
}
export default RegistrationForm;