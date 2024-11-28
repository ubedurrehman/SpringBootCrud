package com.example.springboot;

import com.example.springboot.dao.UserRepository;
import com.example.springboot.entities.User;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringbootApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);



//		User user=new User();
//		user.setName("Ubed Ur Rehman");
//		user.setCity("karachi sindh pakistan");
//		User user1=userRepository.save(user);
//		System.out.println(user1);

		//second way
//
//		user.setName("azhar");
//		user.setCity("karachi sindh pakistan");
//
//		User user1=new User();
//		user1.setName("Rehman");
//		user1.setCity("karachi sindh pakistan");
//
//		List<User> users=List.of(user,user1);
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user2 -> {
//			System.out.println(user);
//		});User user=new User();
//

		// 3rd way
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(user->{
//			System.out.println(user);
//		});
//		System.out.println("Done");


	}

}
