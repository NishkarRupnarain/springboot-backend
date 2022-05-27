package com.Nishkar.springbootbackend.G4L_Reverside;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import com.Nishkar.springbootbackend.G4L_Reverside.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setFirstName("Nishkar");
		user.setLastName("Rupnarain");
		user.setIdNumber("123456890123");
		user.setEmail("nishkar@gmail.com");
		user.setUsername("Nish");
		user.setMobileNumber("0832070269");
		user.setPassword("password");
		user.setCreatedAt(Instant.now());
		userRepository.save(user);
	}
}
