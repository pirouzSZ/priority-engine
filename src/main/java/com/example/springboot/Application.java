package com.example.springboot;

import com.example.springboot.controller.UploadController;
import com.example.springboot.domains.Case;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses= UploadController.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
