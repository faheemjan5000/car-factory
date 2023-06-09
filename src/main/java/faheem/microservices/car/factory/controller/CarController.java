package faheem.microservices.car.factory.controller;

import faheem.microservices.car.factory.entity.Car;
import faheem.microservices.car.factory.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/car")
@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car) {
        log.info("inside CarController.addCar() method");
        return carService.addCar(car);
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/getCar/{id}")
    public Car getCar(@PathVariable(name="id") Integer carId){
        return carService.getCarById(carId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable(name="id") Integer carId){
        carService.deleteCar(carId);
    }
}
