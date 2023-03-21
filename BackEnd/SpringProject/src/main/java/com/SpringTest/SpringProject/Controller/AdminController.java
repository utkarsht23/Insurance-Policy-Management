package com.SpringTest.SpringProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringTest.SpringProject.entity.Bike;
import com.SpringTest.SpringProject.entity.Car;
import com.SpringTest.SpringProject.entity.Health;
import com.SpringTest.SpringProject.entity.Home;
import com.SpringTest.SpringProject.entity.Travel;
import com.SpringTest.SpringProject.service.BikeService;
import com.SpringTest.SpringProject.service.BikeServiceImpl;
import com.SpringTest.SpringProject.service.CarService;
import com.SpringTest.SpringProject.service.CarServiceImpl;
import com.SpringTest.SpringProject.service.HealthService;
import com.SpringTest.SpringProject.service.HomeService;
import com.SpringTest.SpringProject.service.TravelService;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired 
	BikeService bikeService;
	
	@Autowired
	CarService carService;
	
	@Autowired
	HealthService healthService;
	
	
	@GetMapping(value = "bikelist")
	public List<Bike> getAllBikes(){
		
		List<Bike> Bikes = bikeService.getAllBikeList();
		return Bikes;
		
	}
	
	@GetMapping(value = "carlist")
	public List<Car> getAllCars(){
		
		List<Car> Cars = carService.getAllCarList();
		return Cars;
	}
	
	@GetMapping(value="bike/{bno}")
	public Bike getById(@PathVariable int bno)
	{
		Bike b=bikeService.getById(bno);
		if(b!=null) 
			return b;
		else 
			return null;
		
	}
	@GetMapping(value = "car/{cno}")
	public Car getByCarId(@PathVariable int cno){
		Car c=carService.getByCarId(cno);
		if(c!=null)
		return c;
		else
			return null;
	}
	
	@DeleteMapping(value="bike/{bno}")
	public void deleteBike(@PathVariable int bno)
	{
		bikeService.deleteBike(bno);
		
	}
	
	@DeleteMapping(value="car/{cno}")
	public void deleteCar(@PathVariable int cno)
	{
		carService.deleteCar(cno);
	}
	
	@PostMapping(value="car/{cno}")
	public void  addCar(@RequestBody Car c)
	{
		carService.addNewCar(c);
	}
	
	@PostMapping(value="bike/{bno}")
	public void  addBike(@RequestBody Bike b)
	{
		bikeService.addNewBike(b);
	}
	
	@PutMapping(value="bike/{bno}")
	public int updateBike(@RequestBody Bike b)
	{
		int n=bikeService.updateBike(b);
	
		return n;
	}
	//--------------------Health Details-------------------------

	@GetMapping(value = "healthlist")
	public List<Health> getAllHealth(){
		
		List<Health> health = healthService.getAllHealthList();
		return health;
		
	}

	@GetMapping(value="health/{hid}")
	public Health getByHealthId(@PathVariable int hid)
	{
		Health h=healthService.getById(hid);
		if(h!=null) 
			return h;
		else 
			return null;
		
	}
	@PostMapping(value="health/{hid}")
	public void  addHealth(@RequestBody Health h)
	{
		healthService.addNewHealth(h);
	}
	
	
	@DeleteMapping(value="health/{hid}")
	public void deleteHealth(@PathVariable int hid)
	{
		healthService.deleteHealth(hid);
	}
	
	@PutMapping(value="health/{hid}")
	public int updateHealth(@RequestBody Health h)
	{
		int n=healthService.updateHealth(h);
	
		return n;
	}
//----------------------Travels details-----
		private TravelService travelService;
	
	
	@GetMapping(value = "travellist")
	public List<Travel> getAllTravel(){
		
		List<Travel> travel = travelService.getAlltravelList();
		return travel;
		
	}

	@GetMapping(value="travel/{tid}")
	public Travel getByTravelId(@PathVariable int tid)
	{
		Travel t=travelService.getById(tid);
		if(t!=null) 
			return t;
		else 
			return null;
		
	}
	@PostMapping(value="travel/{tid}")
	public void  addTravel(@RequestBody Travel t)
	{
		travelService.addNewTravel(t);
	}
	
	
	@DeleteMapping(value="travel/{tid}")
	public void deleteTravel(@PathVariable int tid)
	{
		travelService.deleteTravel(tid);
	}
	
	@PutMapping(value="travel/{tid}")
	public int updateTravel(@RequestBody Travel t)
	{
		int n=travelService.updateTravel(t);
	
		return n;
	}
	
	//-----Home_-------------------------------_____
	private HomeService homeService;
	
	
	@GetMapping(value = "homelist")
	public List<Home> getAllHome(){
		
		List<Home> home = homeService.getAllhomeList();
		return home;
		
	}

	@GetMapping(value="home/{hid}")
	public Home getByHomeId(@PathVariable int hid)
	{
		Home h=homeService.getById(hid);
		if(h!=null) 
			return h;
		else 
			return null;
		
	}
	@PostMapping(value="home/{hid}")
	public void  addHome(@RequestBody Home h)
	{
		homeService.addNewHome(h);
	}
	
	
	@DeleteMapping(value="home/{hid}")
	public void deleteHome(@PathVariable int hid)
	{
		homeService.deleteHome(hid);
	}
	
	@PutMapping(value="home/{hid}")
	public int updateHome(@RequestBody Home h)
	{
		int n=homeService.updateHome(h);
	
		return n;
	}


}
