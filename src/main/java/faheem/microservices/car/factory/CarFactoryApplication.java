package faheem.microservices.car.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CarFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarFactoryApplication.class, args);
	}

}
