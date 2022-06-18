package com.Nishkar.springbootbackend.G4L_Reverside;

import com.Nishkar.springbootbackend.G4L_Reverside.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {


/*
Instant instant = clock.instant();
		User user = new User();
		user.setFirstName("Nishkar");
		user.setLastName("Rupnarain");
		user.setIdNumber("123456890123");
		user.setEmail("nishkar@gmail.com");
		user.setUsername("Nish");
		user.setMobileNumber("0832070269");
		user.setPassword("password");
		user.setCreatedAt(instant);
		userRepository.save(user);*/
	}
}
