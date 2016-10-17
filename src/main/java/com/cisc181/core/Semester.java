package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	//Attributes
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	//Constructor
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.setSemesterID(SemesterID);
		this.setStartDate(StartDate);
		this.setEndDate(EndDate);
	}
	//Getters and Setters
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}

