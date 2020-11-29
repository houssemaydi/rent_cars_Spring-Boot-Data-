package tn.enig.rent_cars.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Car.class)
public interface CarProjection {
	//exemple: http://localhost:8080/cars?projection=P1
	public String getColor();

}
