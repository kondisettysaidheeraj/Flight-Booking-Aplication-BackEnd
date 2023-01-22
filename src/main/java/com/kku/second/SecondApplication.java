package com.kku.second;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kku.second.dao.Counter;

@SpringBootApplication
public class SecondApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
		
		System.out.println("kku");
		
		 
	}

}
