package tn.enig.rent_cars.entities;



import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int number;
    private int serie;
    private String description;
    private String color;
    private String brand;
    private String model;
    private String purchDate;
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category cat;
    private float pricePerDay;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer id, int number, int serie, String description, String color, String brand, String model,
			String purchDate, Category cat, float pricePerDay) {
		super();
		this.id = id;
		this.number = number;
		this.serie = serie;
		this.description = description;
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.purchDate = purchDate;
		this.cat = cat;
		this.pricePerDay = pricePerDay;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", number=" + number + ", serie=" + serie + ", description=" + description + ", color="
				+ color + ", brand=" + brand + ", model=" + model + ", purchDate=" + purchDate + ", cat=" + cat
				+ ", pricePerDay=" + pricePerDay + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPurchDate() {
		return purchDate;
	}
	public void setPurchDate(String purchDate) {
		this.purchDate = purchDate;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public float getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

    
}
