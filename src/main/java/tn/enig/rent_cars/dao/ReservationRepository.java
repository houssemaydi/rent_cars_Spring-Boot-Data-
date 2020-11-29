package tn.enig.rent_cars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enig.rent_cars.entities.Reservation;

@CrossOrigin(value = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE} )
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository< Reservation, Integer>{

}
