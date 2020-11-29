package tn.enig.rent_cars.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enig.rent_cars.entities.Car;

//allow other domains
@CrossOrigin(value = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE} )
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer> {
	
	//exemple: http://localhost:8080/cars/search/bycolor?color=rouge
	@RestResource(path="/bycolor")
	public List<Car> findByColor(@Param("color") String color);
	@RestResource(path="/bybrandpage")
	public Page<Car> findByBrandContains(@Param("mc") String brand, Pageable pageable);
	
	//exemple: http://localhost:8080/cars/search/bycolorpage?color=rouge&page=0&size=2
	@RestResource(path="/bycolorpage ")
	public Page<Car> findByColor(@Param("color") String color, Pageable pageable);
	
	
    public Page<Car> findAll(Pageable pageable);

}
