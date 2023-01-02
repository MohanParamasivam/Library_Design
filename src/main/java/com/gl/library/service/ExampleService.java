package com.gl.library.service;

import com.gl.library.model.GL;

public interface ExampleService {

	GL get();

	GL customInfo(String courseName, String courseType, String firstName, String lastName);

}