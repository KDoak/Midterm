package com.cisc181.core;
import java.util.UUID;

public class Section{
	
	//Attributes
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	//Contructor
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID) {
		this.setCourseID(CourseID);
		this.setSemesterID(SemesterID);
		this.setSectionID(SectionID);
		this.setRoomID(RoomID);
	}
	//Getters and Setters
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
}