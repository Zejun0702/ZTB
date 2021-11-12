package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value = {"com.example.demo.Mybatis.Repository.MRZDQSRep"})
public class DemoApplication implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) {
		System.out.println("1123324");
	}


	public static void main(String[] args) {

//		run();

//		String str = new String();
		SpringApplication.run(DemoApplication.class, args);
	}

}
