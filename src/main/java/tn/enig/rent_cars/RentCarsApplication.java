package tn.enig.rent_cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import tn.enig.rent_cars.dao.CarRepository;
import tn.enig.rent_cars.dao.CategoryRepository;
import tn.enig.rent_cars.entities.Car;
import tn.enig.rent_cars.entities.Category;

import static tn.enig.rent_cars.dao.CarRepository.*;

@SpringBootApplication
public class RentCarsApplication implements CommandLineRunner {
    @Autowired
    CarRepository carRepository;
    @Autowired
    CategoryRepository categoryRepository;
    

    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(RentCarsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat=new Category(null,"label","3am12");
        Car atc = new Car(null,6666,169,"descrpition","rouge","Symbole","serie1","12/12/2222",cat,1222);
        categoryRepository.save(cat);
        carRepository.save(atc);
    }
}
