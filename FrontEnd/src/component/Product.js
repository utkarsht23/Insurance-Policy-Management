
import React from "react";
import styled from 'styled-components';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { Button, CardActionArea, CardActions } from '@mui/material';
import bikeImage from "../Images/bike.svg";
import carImage from "../Images/car.jpg";
import homeImage from "../Images/home.webp";
import { Container} from '@mui/material';
import AvailabePlicy from './AvailablePolicy';
const SectionWrapper = styled.div`
padding:16px;
margin:0;
margin-top:100px;
display:flex;
justify-content:space-around;
`;
const InsuranceCard = styled(Card)`
background-color:#fff;
button{
    text-transform:none;
}
`;

const CardCompponent = (props) => {

    const handleButtonClick=()=>{
        
    }
    return (
        <InsuranceCard sx={{ maxWidth: 345 }}>
            <CardActionArea>
                <CardMedia
                    component="img"
                    height="140"
                    image={props.image}
                    alt="green iguana"
                />
                <CardContent>
                    <Typography gutterBottom variant="h5" component="div">
                        {props.type}
                    </Typography>
                    <Typography variant="body2" color="text.secondary">
                        {props.description}
                    </Typography>
                </CardContent>
            </CardActionArea>
            <CardActions>
                <Button size="small" color="primary" href="/AvailablePolicy">
                    View Available Policies
                </Button>
            </CardActions>
        </InsuranceCard>
    );
}

const Product = () => {
    return (
        <Container maxWidth={'lg'}>
        <SectionWrapper>     
            <CardCompponent
                image={bikeImage}
                type='Bike Policy'
                description='Bike insurance is an insurance policy that covers you against damage to your two-wheeler due to accident,natural/man-made disaster'
            />
            <CardCompponent
                image={carImage}
                type='Car Policy'
                description='car insurance policy protects the vehicle owner against the covered financial loss(es) due to damage/theft of the insured vehicle'
            />
            <CardCompponent
                image={homeImage}
                type='Home Policy'
                description='The home insurance policy covers various kinds of damage. For example, damaged electric lines, water pipelines, or structure damage.'
            />
            
        </SectionWrapper>
        </Container>
    );
}

export default Product;