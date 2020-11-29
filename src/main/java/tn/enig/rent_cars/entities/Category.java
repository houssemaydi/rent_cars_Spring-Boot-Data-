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
@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String label;
    private String description;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer id, String label, String description) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", label=" + label + ", description=" + description + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
