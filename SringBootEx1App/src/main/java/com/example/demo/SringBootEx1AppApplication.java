package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(ConfigClass.class)
public class SringBootEx1AppApplication {
	/*@Autowired
	 Hello helloObj;
	
	@Autowired
	ConfigClass configClass;
	*/
	
	public static void main(String[] args)  {
		SpringApplication.run(SringBootEx1AppApplication.class, args);
	}

	/*	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		//.printdetails();
		
		
		System.out.println(configClass.getName());
		System.out.println(configClass.getUploadDir());
		System.out.println(configClass.getDescription());
		System.out.println(configClass.getRoles().get(0));
	}*/
	

	

}

