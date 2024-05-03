package com.kadiraksoy.springbootpostgresqdocker;

import com.kadiraksoy.springbootpostgresqdocker.model.Person;
import com.kadiraksoy.springbootpostgresqdocker.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootPostgresqlDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlDockerApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(PersonService personService){
		return args -> {
			Person person1 = new Person("kadir", 5);
			Person person2 = new Person("baran", 6);
			Person person3 = new Person("ekin", 7);
			Person person4 = new Person("onur", 8);
			Person person5 = new Person("anıl", 9);

			personService.createPerson(person1);
			personService.createPerson(person2);
			personService.createPerson(person3);
			personService.createPerson(person4);
			personService.createPerson(person5);
		};

	}

}
