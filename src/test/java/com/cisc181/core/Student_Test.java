package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import java.util.UUID;
import java.util.Date;

public class Student_Test {
	
	static ArrayList <Course> Courses = new ArrayList<Course>();
	static ArrayList <Semester> Semesters = new ArrayList<Semester>();
	static ArrayList <Section> Sections =  new ArrayList<Section>();
	static ArrayList <Student> Students = new ArrayList<Student>();
	static ArrayList<Enrollment> Enrollments = new ArrayList<Enrollment>();
	 
	@BeforeClass
	public static void setup() {
		//Course ArrayList Setup
		Course Business = new Course(UUID.randomUUID(), "Buisness", 3, eMajor.BUSINESS);
		Course CompSci = new Course(UUID.randomUUID(), "CompSci", 4, eMajor.CHEM);
		Course Nursing = new Course(UUID.randomUUID(), "Nursing", 4, eMajor.NURSING);
		Courses.add(Business);
		Courses.add(CompSci);
		Courses.add(Nursing);
		//Semester ArrayList Setup
		Date fallStart = new Date(2016, Calendar.AUGUST, 20);
		Date fallEnd = new Date(2016, Calendar.DECEMBER, 15);		
		Semester Fall = new Semester(UUID.randomUUID(), fallStart, fallEnd);
		Semesters.add(Fall);
		
		Date springStart = new Date(2016, Calendar.FEBRUARY, 5);
		Date springEnd = new Date(2016, Calendar.MAY, 15);
		Semester Spring = new Semester(UUID.randomUUID(), springStart, springEnd);
		Semesters.add(Spring);
		//Section ArrayList Setup
		Section fallBusiness = new Section(Business.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 201);
		Section springBusiness = new Section(Business.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 324);
		Section fallCompSci = new Section(CompSci.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 001);
		Section springCompSci = new Section(CompSci.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 123);
		Section fallNursing= new Section(Nursing.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 321);
		Section springNursing = new Section(Nursing.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 456);
		Sections.add(fallBusiness);
		Sections.add(springBusiness);
		Sections.add(fallCompSci);
		Sections.add(springCompSci);
		Sections.add(fallNursing);
		Sections.add(springNursing);
		//Student ArrayList Setup
		Date DOB1 = new Date(1997, Calendar.JUNE, 25);
		Date DOB2 = new Date(1997, Calendar.JUNE, 26);
		Date DOB3 = new Date(1997, Calendar.JUNE, 27);
		Date DOB4 = new Date(1996, Calendar.JUNE, 25);
		Date DOB5 = new Date(1996, Calendar.JUNE, 26);
		Date DOB6 = new Date(1996, Calendar.JUNE, 27);
		Date DOB7 = new Date(1995, Calendar.JUNE, 25);
		Date DOB8 = new Date(1995, Calendar.JUNE, 26);
		Date DOB9 = new Date(1995, Calendar.JUNE, 27);
		Date DOB10 = new Date(1994, Calendar.JUNE, 25);
		
		Student s1 = new Student("Al", "A", "Alpha", DOB1, eMajor.BUSINESS, "111 St.", "111-111-1111", "aalpha@udel.edu");
		Student s2 = new Student("Be", "B", "Beta", DOB2, eMajor.BUSINESS, "222 St.", "222-222-2222", "bbeta@udel.edu");
		Student s3 = new Student("Ch", "C", "Charlie", DOB3, eMajor.BUSINESS, "333 St.", "333-333-3333", "ccharlie@udel.edu");
		Student s4 = new Student("De", "D", "Delta", DOB4, eMajor.BUSINESS, "444 St.", "444-444-4444", "ddelta@udel.edu");
		Student s5 = new Student("Ec", "E", "Echo", DOB5, eMajor.BUSINESS, "555 St.", "555-555-5555", "eecho@udel.edu");
		Student s6 = new Student("Fo", "F", "Foxtrot", DOB6, eMajor.BUSINESS, "666 St.", "666-666-6666", "ffoxtrot@udel.edu");
		Student s7 = new Student("Go", "G", "Golf", DOB7, eMajor.BUSINESS, "777 St.", "777-777-7777", "ggolf@udel.edu");
		Student s8 = new Student("Ho", "H", "Hotel", DOB8, eMajor.BUSINESS, "888 St.", "888-888-8888", "hhotel@udel.edu");
		Student s9 = new Student("In", "I", "India", DOB9, eMajor.BUSINESS, "999 St.", "999-999-9999", "iindia@udel.edu");
		Student s10 = new Student("Ju", "J", "Juliette", DOB10, eMajor.BUSINESS, "1000 St.", "100-100-1000", "jjuliette@udel.edu");
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		Students.add(s5);
		Students.add(s6);
		Students.add(s7);
		Students.add(s8);
		Students.add(s9);
		Students.add(s10);		
	}

	@Test
	public void majorTester() {
		//Testing with changing the major of a student within Students ArrayList
		Students.get(0).setMajor(eMajor.COMPSI);
		assertEquals(eMajor.COMPSI, Students.get(0).getMajor());
	}
	
	@Test
	public void gradeTester() {
		//Setting up the Enrollment ArrayList
		
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(0).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for fallBusiness section.
			Enrollments.add(e);}
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(1).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for springBusiness section.
			Enrollments.add(e);}
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(2).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for fallCompSci section.
			Enrollments.add(e);}
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(3).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for springCompSci section.
			Enrollments.add(e);}
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(4).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for fallNursing section.
			Enrollments.add(e);}
		for(int i = 0; i < Students.size(); i++) {
			Enrollment e = new Enrollment(Sections.get(5).getSectionID(), Students.get(i).getStudentID());
			e.setGrade(70 + (2*i) );//Will assign grades from student 1 to student 10 for springNursing section.
			Enrollments.add(e);}
		//Finding average of fallBusiness
		double actualFallBusinessAvg = ((Enrollments.get(0).getGrade() + Enrollments.get(1).getGrade() 
				+ Enrollments.get(2).getGrade()+ Enrollments.get(3).getGrade() + Enrollments.get(4).getGrade()
				+ Enrollments.get(5).getGrade() + Enrollments.get(6).getGrade() + Enrollments.get(7).getGrade()
				+ Enrollments.get(8).getGrade() + Enrollments.get(9).getGrade())/10);
		double expectedFallBusinessAvg = ((70 + 72 + 74 + 76 + 78 + 80 + 82 + 84 + 86 + 88)/10);
		assertEquals(expectedFallBusinessAvg, actualFallBusinessAvg, 0.1);		
		}
		
}
