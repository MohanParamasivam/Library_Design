package com.gl.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.library.model.FullName;
import com.gl.library.model.GL;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDesignMohanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignMohanApplication.class, args);
		System.out.println("Hello SpringBoot");
		System.out.println("Hello Dev-Tools");
	}

	@Override
	public void run(String... args) throws Exception {
//		GL gl = new GL();
//		gl.setCourseType("Designing Microservices with Spring Boot");
//		gl.setCourseName("Information Technology");
//		gl.setInstructorName("Samarth Narula");
//		System.out.println("GL " + gl);

//		GL glusingAllArgsConstructor = new GL("Designing Microservices with Spring Boot", "Information Technology",
//				"Samarth Narula");
//		System.out.println("GL using All Args Constructor " + glusingAllArgsConstructor);

		// Design Pattern
//		GL glTeleDesignpattern = new GL("Learn creational Design Patterns", "IT");
//		System.out.println("glTeleDesignpattern " + glTeleDesignpattern);
//
//		GL glWithBuilderPattern = GL.builder().courseName("Learn Builder Pattern").courseType("Information Technology")
//				.build();
//		System.out.println("Implementation with Builder Pattern " + glWithBuilderPattern);
//	
//		GL glOnlyCourseName = GL.builder().courseName("Advantage of Builder Pattern").build();
//		
//		System.out.println("glOnlyCourseName " + glOnlyCourseName);

		GL glComplexObject = GL.builder().courseName("Complex object creation with Builder Pattern")
				.courseType("Information Technology")
				.instructorName(FullName.builder().firstName("Samarth").lastName("Narula").build()).build();

//		System.out.println("GL Complex Object Creation " + glComplexObject);
		log.info("GL Complex Object Creation -> {} ", glComplexObject);
	}
}
