package faheem.microservices.car.factory.service;

import faheem.microservices.car.factory.entity.Car;
import faheem.microservices.car.factory.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Integer carId){
         Optional<Car> optionalCar =carRepository.findById(carId);
         if(optionalCar.isPresent()){
             return optionalCar.get();
         }
         else {
             throw new NoSuchElementException("car with this id not found!");
         }
    }
}
