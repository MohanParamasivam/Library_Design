package com.gl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.library.model.GL;
import com.gl.library.service.ExampleService;

//@Controller
@RestController
public class ExampleController {

	@Autowired
	ExampleService exampleService;
	
	@GetMapping("/info")
	// @ResponseBody
	public GL get() {
		return exampleService.get();
		
//		GL gl = new GL();
//		gl.setCourseName("Learn controllers in Spring Boot");
//		gl.setCourseType("Information Technology");
//		gl.setInstructorName("Samarth Narula");
//		return gl;
	}

	@PostMapping("customInfo")
	public GL customInfo(String courseName, String courseType, String firstName, String lastName) {
		return exampleService.customInfo(courseName, courseType, firstName, lastName);
//		GL gl = new GL();
//		gl.setCourseName(courseName);
//		gl.setCourseType(courseType);
//		gl.setInstructorName(instructorName);
//		return gl;
	}
}
