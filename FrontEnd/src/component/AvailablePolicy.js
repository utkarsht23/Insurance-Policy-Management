import React, { useEffect, useState } from "react";
import './ApplyPolicy.css';
import {
    Button,
    Typography,
    AppBar,
    Toolbar,
    TextField,
} from "@mui/material";
import Popover from '@mui/material/Popover';
import styled from "styled-components";

const FormWrapper = styled.div`
width:400px;
justify-content: center;
    align-items: center;
    display: flex;
    padding:16px;
`;
const AvailabePlicy = () => {
    const [anchorEl, setAnchorEl] = React.useState(null);
    const [firstname, setFirstName] = useState('');
    const [lastname, setLastName] = useState('');
    const [address, setAddress] = useState('');
    const [email, setEmail] = useState('');
    const [mobile, setMobile] = useState('');
    const [bikeYear, setBikeYear] = useState('');
    const [bikeModel, setBikeModel] = useState('');
    const [selectedPolicy, setSelectedPolicy] = useState();
    const handleClick = (event) => {
        setAnchorEl(event.currentTarget);
    };

    const handleClose = () => {
        setAnchorEl(null);
    };

    const open = Boolean(anchorEl);
    const id = open ? 'simple-popover' : undefined;
    const availablePolicies = [
        {
            policyName: 'Sysca Insurance',
            Category: 'mobile Insurance',
            sumAssured: 5000,
            premium: 2000,
            tenure: 10
        },
        {
            policyName: 'SBI Life Insurance',
            Category: 'Life Insurance',
            sumAssured: 50000,
            premium: 2000,
            tenure: 20
        },
        {
            policyName: 'Explore Insurance',
            Category: 'Travel Insurance',
            sumAssured: 20000,
            premium: 5000,
            tenure: 30
        },
        {
            policyName: 'TVSInsurance',
            Category: 'Motor Insurance',
            sumAssured: 200000,
            premium: 3000,
            tenure: 25
        }
    ];

    const handlApplyClick = (event, item) => {
        setAnchorEl(event.currentTarget);
        setSelectedPolicy(item);
    }
    const handleChange = (e) => {
        if (e.target.name === 'firstname') {
            setFirstName(e.target.value);
        }
        if (e.target.name === 'lastname') {
            setLastName(e.target.value);
        }
        if (e.target.name === 'mobnumber') {
            setMobile(e.target.value);
        }
        if (e.target.name === 'address') {
            setAddress(e.target.value);
        }
        if (e.target.name === 'email') {
            setEmail(e.target.value);
        }
        if (e.target.name === 'bikeyear') {
            setBikeYear(e.target.value);
        }
        if (e.target.name === 'bikemodel') {
            setBikeModel(e.target.value);
        }
    }
    const handleSubmit = () => {
        console.log(firstname)
        console.log(lastname)
        console.log(address)
        console.log(mobile)
        console.log(email)
        console.log(bikeYear)
        console.log(bikeModel)
        console.log(selectedPolicy);
    }
    return (
        <>
            <h3>
                Available Policy
            </h3>
            <table id="customers">

                <tr>
                    <th>
                        Serial No
                    </th>
                    <th>
                        Policy Name
                    </th>
                    <th>
                        Categories
                    </th>
                    <th>
                        Sum Assurance
                    </th>
                    <th>
                        Premium
                    </th>
                    <th>
                        Tenure
                    </th>
                    {/* <th>

                        Creation Date
                    </th> */}
                    <th>
                        Apply
                    </th>
                </tr>
                {availablePolicies.map((item, index) => {
                    return (<tr>
                        <td>{index + 1}</td>
                        <td>{item.policyName}</td>
                        <td>{item.Category}</td>
                        <td>{item.sumAssured}</td>
                        <td>{item.premium}</td>
                        <td>{item.tenure}</td>
                        <td><Button className="btn btn-secondary" variant="contained" onClick={(event) => handlApplyClick(event, item)}>Apply</Button></td>
                    </tr>)
                })}
            </table>
            <Popover
                id={id}
                open={open}
                anchorEl={anchorEl}
                onClose={handleClose}
                anchorOrigin={{
                    vertical: 'bottom',
                    horizontal: 'left',
                }}
            >
                <FormWrapper>
                    <form style={{ display: 'flex', flexDirection: 'column' }}>
                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            name={'firstname'}
                            type="text"
                            label="First Name"
                            variant="outlined"
                            value={firstname}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="text"
                            name={'lastname'}
                            label="Last Name"
                            variant="outlined"
                            value={lastname}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="number"
                            name={'mobnumber'}
                            label="Mobile No"
                            variant="outlined"
                            value={mobile}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="text"
                            name={'address'}
                            label="Address"
                            variant="outlined"
                            value={address}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="email"
                            name={'email'}
                            label="email"
                            variant="outlined"
                            value={email}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="number"
                            name={'bikeyear'}
                            label="Bike Purchase Year"
                            variant="outlined"
                            value={bikeYear}
                            onChange={handleChange}
                        />

                        <TextField
                            style={{ width: "200px", margin: "5px" }}
                            type="text"
                            name={'bikemodel'}
                            label="Bike Model"
                            variant="outlined"
                            value={bikeModel}
                            onChange={handleChange}
                        />

                        <Button variant="contained" color="primary" onClick={handleSubmit}>
                            Submit
                        </Button>
                    </form>
                </FormWrapper>

            </Popover>
        </>
    )
}
export default AvailabePlicy;

