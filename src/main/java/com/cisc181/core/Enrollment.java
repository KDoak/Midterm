package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	//Attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	//Constructors
	private Enrollment() {
	}
	public Enrollment(UUID SectionID, UUID StudentID) {
		this.setSectionID(SectionID);
		this.setStudentID(StudentID);
		this.EnrollmentID = EnrollmentID;
	}
	//Getters and Setters
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
}
