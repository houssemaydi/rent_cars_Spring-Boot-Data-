package tn.enig.rent_cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.rent_cars.dao.CarRepository;
import tn.enig.rent_cars.entities.Car;



@RestController
public class CarService {
	
	@Autowired
	private CarRepository carrepository;

	public void setCarrepository(CarRepository carrepository) {
		this.carrepository = carrepository;
	}
	
	@GetMapping(value="/listcars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> carList(){
		return carrepository.findAll();
		
	}
	@GetMapping(value="/listcars/{id}")
	public Car carbyid(@PathVariable(name="id") Integer id){
		return carrepository.findById(id).get();
		
	}
	
	
	//requestBody To get a car with empty constructor
	@PutMapping(value="/listcars/{id}")
	public Car update(@PathVariable(name="id") Integer id, @RequestBody Car c){
		c.setId(id);
		return carrepository.save(c);	
	}
	
	@PostMapping(value="/listcars")
	public Car update(@RequestBody Car c){
		return carrepository.save(c);	
	}
	
	@DeleteMapping(value="/listcars/{id}")
	public void delete(@PathVariable(name="id") Integer id){
		carrepository.deleteById(id);	
	}
}
