package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// RESTful webservices
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// LocalTime
import java.time.LocalTime;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	// /hello[?name=<string>] 
	// param name can pass another name besides world
	// outputs: Hello <name>! The time is: 14:16:05.211216
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) 
	{
		String greetings = String.format("Hello %s!", name);
		// getTime() is called here but doesn't print the time, 
		// however, initializing it this way does.
		LocalTime lt = LocalTime.now();
		String time = String.format(" The time is: %s", lt.toString());

		System.out.println(greetings + time);
		return greetings + time;
	}

	public String getTime() {
		LocalTime lt = LocalTime.now();
		String ttime = "The time is " + lt.toString();
		System.out.println(ttime);
		return ttime;
	}

}
