package com.tek.teacher;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String studentName;
	private int studentId;
	private double marksPercentage;
	
	public Student() {
		System.out.println("Student Object Created");
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getMarksPercentage() {
		return marksPercentage;
	}
	public void setMarksPercentage(double marksPercentage) {
		this.marksPercentage = marksPercentage;
	}

	
}
