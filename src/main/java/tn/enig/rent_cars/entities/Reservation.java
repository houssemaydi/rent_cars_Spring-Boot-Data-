package tn.enig.rent_cars.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Customer customer;
    private Car car;
    private float price;
    private int period;
    private Date getCarDate;
    private Date backCarDate;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Integer id, Customer customer, Car car, float price, int period, Date getCarDate,
			Date backCarDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.car = car;
		this.price = price;
		this.period = period;
		this.getCarDate = getCarDate;
		this.backCarDate = backCarDate;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", customer=" + customer + ", car=" + car + ", price=" + price + ", period="
				+ period + ", getCarDate=" + getCarDate + ", backCarDate=" + backCarDate + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public Date getGetCarDate() {
		return getCarDate;
	}
	public void setGetCarDate(Date getCarDate) {
		this.getCarDate = getCarDate;
	}
	public Date getBackCarDate() {
		return backCarDate;
	}
	public void setBackCarDate(Date backCarDate) {
		this.backCarDate = backCarDate;
	}
    
    

}
