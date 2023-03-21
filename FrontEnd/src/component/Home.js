
 import React, { Component ,useState} from "react";
import Slider from 'react-slider';
import homebanner from "../Images/home-banner.jpg"
import image1 from "../Images/desktop-wallpaper-life-insurance.jpg";
import image2 from "../Images/Health.jpg";
import image3 from "../Images/Home.jpg";
import image4 from "../Images/Vehicle.jpg";
import image5 from "../Images/Travel.jpg";
import SimpleImageSlider from "react-simple-image-slider";
function Home(){
  const images = [
    { url: image1},
    { url: image2},
    { url: image3},
    { url: image4},
    { url: image5},
   
  ];
    
    
    return(
        <>
        <div>
      <SimpleImageSlider
        width={1100}
        height={550}
        images={images}
        showBullets={true}
        showNavs={true}
      />
    </div>
    
        {/* <div class="banner-home">
        <img src={homebanner} alt="react logo" />


        
  
  </div> */}
 
</>
    )
}
export default Home;



// import React from 'react';
// import Slider from '@farbenmeer/react-spring-slider';
// import PropTypes from 'prop-types';


// const Home = () => {
// 	const onSlideChange = index => console.log(`changed to slide ${index}`);

// 	const BulletComponent = ({onClick, isActive}) => (
// 		<li
// 			style={{
// 				width: '25px',
// 				height: '25px',
// 				backgroundColor: 'red',
// 				margin: '0 2px',
// 				opacity: isActive && '0.5'
// 			}}
// 			onClick={onClick}
// 		/>
// 	);

// 	BulletComponent.propTypes = {
// 		onClick: PropTypes.func.isRequired,
// 		isActive: PropTypes.bool.isRequired,

// 	};

// 	const ArrowComponent = ({onClick, direction}) => {
// 		return (
// 			<div
// 				style={{
// 					border: '1px solid black',
// 					padding: '1em',
// 					backgroundColor: 'white'
// 				}}
// 				onClick={onClick}
// 			>
// 				{direction}
// 			</div>
// 		);
// 	};

// 	ArrowComponent.propTypes = {
// 		onClick: PropTypes.func.isRequired,
// 		direction: PropTypes.string.isRequired
// 	};


// 	return (
// 		<Slider 
// 			activeIndex={2} 
// 			auto 
// 			hasBullets 
// 			BulletComponent={BulletComponent}
// 			ArrowComponent={ArrowComponent}
// 			onSlideChange={onSlideChange}
// 			>
// 				<div>child 1</div>
// 				<div>child 2</div>
// 				<div>child 3</div>
// 		</Slider>
    
// 	)
// }
// export default Home;