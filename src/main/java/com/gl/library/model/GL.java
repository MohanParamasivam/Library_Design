package com.gl.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GL {

//	public GL(String courseName, String courseType, String instructorName) {
//		super();
//		this.courseName = courseName;
//		this.courseType = courseType;
//		this.instructorName = instructorName;
//	}

	private String courseName;
	private String courseType;
//	private String instructorName;
	private FullName instructorName;
	
	public GL(String courseName) {
		this.courseName = courseName;
	}
	
	public GL(String courseName, String courseType) {
		this.courseName = courseName;
		this.courseType = courseType;	
	}
	

//	@Override
//	public String toString() {
//		return "GL [courseName=" + courseName + ", courseType=" + courseType + ", instructorName=" + instructorName
//				+ "]";
//	}

}
