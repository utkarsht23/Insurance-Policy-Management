


import React, { useState } from "react";
import Login from './Login';
import RegistrationForm from "./Register"

import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import { Link } from "react-router-dom";

function Customerlogin(){
  
  
    return(
        <>
        <div class="customer">
  <h1><center>Hello, Customer</center></h1> 
<h2><center>Welcome to insurance management system</center></h2>
<div class="row">
    <div class="col-3">
<Card style={{ width: '7rem' }}>
      
      <Card.Body>
      <Link to={`/AvailablePoloicy`}>
        <Card.Title> Availabe Policy</Card.Title></Link>
        <Card.Text>
          4
        </Card.Text>
        
      </Card.Body>
    </Card>
    </div>
    <div class="col-3">
    <Card style={{ width: '7rem' }}>
      
      <Card.Body>
        <Card.Title> Applied Policy</Card.Title>
        <Card.Text>
          0
        </Card.Text>
        
      </Card.Body>
    </Card>
    </div>
    <div class="col-3">
    <Card style={{ width: '8rem' }}>
      
      <Card.Body>
      <Link to={`/Categories`}>
        <Card.Title> Policy categories</Card.Title></Link>
        <Card.Text>
          4
        </Card.Text>
       
      </Card.Body>
    </Card> 
    </div>
    <div class="col-3">
    <Card style={{ width: '7rem' }}>
      
      <Card.Body>
        
        <Link to={`/History`}>
        <Card.Title> History</Card.Title>
        </Link>
        <Card.Text>
          4
        </Card.Text>
       
      </Card.Body>
    </Card>
    </div>
    </div>   
  </div>
  </>
    )
}
export default Customerlogin;