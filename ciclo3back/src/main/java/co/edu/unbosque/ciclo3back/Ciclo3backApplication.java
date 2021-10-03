package co.edu.unbosque.ciclo3back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class Ciclo3backApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3backApplication.class, args);
	}

}
