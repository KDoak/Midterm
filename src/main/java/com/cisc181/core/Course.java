package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	//Attributes
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	//Constructor
	public Course(UUID CourseID, String CourseName, int GradePoints,eMajor eMajor) {
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.setMajor(eMajor);
	}
	//Getters and Setters
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return eMajor;
	}
	public void setMajor(eMajor emajor) {
		eMajor = emajor;
	}
}
