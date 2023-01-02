package com.gl.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.gl.library.model.FullName;
import com.gl.library.model.GL;
import com.gl.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

	@Override
	public GL get() {
		log.info("Inside get() method");
		GL gl = new GL();
		gl.setCourseName("Learn controllers in Spring Boot");
		gl.setCourseType("Information Technology");
		gl.setInstructorName(FullName.builder().firstName("Samarth").lastName("Narula").build());
//		gl.setInstructorName("Samarth Narula");
		return gl;
	}
	
	@Override
	public GL customInfo(String courseName, String courseType, String firstName, String lastName) {
		log.info("Inside customInfo() method");
		GL gl = new GL();
		gl.setCourseName(courseName);
		gl.setCourseType(courseType);
		gl.setInstructorName(FullName.builder().firstName("Samarth").lastName("Narula").build());
//		gl.setInstructorName(instructorName);
		return gl;
	}
	
}
	
