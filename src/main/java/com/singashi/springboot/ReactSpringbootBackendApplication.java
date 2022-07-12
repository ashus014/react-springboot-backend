package com.singashi.springboot;

import com.singashi.springboot.model.User;
import com.singashi.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactSpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ashu", "Singh" ,"ashu@123.com"));
		this.userRepository.save(new User("Akash", "Singh" ,"akash@123.com"));
		this.userRepository.save(new User("Anu", "Singh" ,"anu@123.com"));
	}
}
