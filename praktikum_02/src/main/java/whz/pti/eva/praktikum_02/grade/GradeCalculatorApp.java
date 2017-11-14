package whz.pti.eva.praktikum_02.grade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradeCalculatorApp {



	public static void main(String[] args) {
		SpringApplication.run(GradeCalculatorApp.class, args);
	}

	/*@Bean
	CommandLineRunner init(){
		return (evt)->{


			System.out.println("Hallo Welt");
		};
	}*/
}
