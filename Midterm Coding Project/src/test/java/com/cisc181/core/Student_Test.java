package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	private static List<Course>  courseList;
	private static List<Semester>  semesterList;
	private static List<Section>   sectionList; 
	private static List<Student>   studentList; 
	private static List<Enrollment> enrollmentList; 
	
	@BeforeClass
	public static void setup() {
		courseList = new ArrayList();
		Course computerCourse = new Course(UUID.randomUUID(), "Computers", 1,
				eMajor.BUSINESS);
		courseList.add(computerCourse);
		courseList = new ArrayList();
		Course chemCourse = new Course(UUID.randomUUID(), "CHEM103", 1,
				eMajor.CHEM);
		courseList.add(chemCourse);
		courseList = new ArrayList();
		Course physicsCourse = new Course(UUID.randomUUID(), "PHYS207", 1,
				eMajor.PHYSICS);
		
		semesterList = new ArrayList();
		Semester fallSemester = new Semester(UUID.randomUUID(),
				new GregorianCalendar(2015, 10, 1).getTime(),
				new GregorianCalendar(2016, 4, 30).getTime());
		Semester springSemester = new Semester(UUID.fromString("2"),
				new GregorianCalendar(2015, 5, 1).getTime(),
				new GregorianCalendar(2016, 9, 30).getTime());

		semesterList.add(fallSemester);
		semesterList.add(springSemester);
	
		sectionList = new ArrayList();
		Section computerSectionForFallSemester = new Section(computerCourse.getCourseID(),fallSemester.getSemesterID(),UUID.randomUUID(),1);
		Section computerSectionForSpringSemester = new Section(computerCourse.getCourseID(),springSemester.getSemesterID(),UUID.fromString("2"),2);	
		sectionList.add(computerSectionForFallSemester);
		sectionList.add(computerSectionForSpringSemester);
		Section chemSectionForFallSemester = new Section(chemCourse.getCourseID(),fallSemester.getSemesterID(),UUID.randomUUID(),1);
		Section chemSectionForSpringSemester = new Section(chemCourse.getCourseID(),springSemester.getSemesterID(),UUID.fromString("2"),2);	
		sectionList.add(chemSectionForFallSemester);
		sectionList.add(chemSectionForSpringSemester);
		Section physicsSectionForFallSemester = new Section(physicsCourse.getCourseID(),fallSemester.getSemesterID(),UUID.randomUUID(),1);
		Section physicsSectionForSpringSemester = new Section(physicsCourse.getCourseID(),springSemester.getSemesterID(),UUID.fromString("2"),2);	
		sectionList.add(physicsSectionForFallSemester);
		sectionList.add(physicsSectionForSpringSemester);
		
		//1
		Student student1 = new Student("raveena", "", "Wadhwa",
				new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
				"306 Haines street", "3028876288", "rwadhwa128@gmail.com");
		studentList = new ArrayList<Student>();
		studentList.add(student1);
		Enrollment enrollment1 = new Enrollment(
				computerSectionForFallSemester.getSectionID(),
				student1.getStudentID());
		enrollment1.setGrade(3.67);
		//2
		Student student2 = new Student("kali", "", "panella",
				new GregorianCalendar(2000, 9, 30).getTime(), eMajor.CHEM,
				"306 Haines street", "3023334444", "kali@gmail.com");
		studentList = new ArrayList<Student>();
		studentList.add(student2);
		Enrollment enrollment2 = new Enrollment(
				chemSectionForFallSemester.getSectionID(),
				student2.getStudentID());
		enrollment2.setGrade(4.0);
		//3
		Student student3 = new Student("Rebecca", "", "Willams",
				new GregorianCalendar(2000, 9, 30).getTime(), eMajor.PHYSICS,
				"306 Haines street", "3025556666", "becky@gmail.com");
		studentList = new ArrayList<Student>();
		studentList.add(student3);
		Enrollment enrollment3 = new Enrollment(
				computerSectionForFallSemester.getSectionID(),
				student1.getStudentID());
		enrollment3.setGrade(3.00);
//4
		Student student4 = new Student("Brian", "", "Kurz",
				new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
				"306 Haines street", "3026667777", "bkurz@gmail.com");
		studentList = new ArrayList<Student>();
		studentList.add(student4);
		Enrollment enrollment4 = new Enrollment(
				computerSectionForFallSemester.getSectionID(),
				student4.getStudentID());
		enrollment4.setGrade(3.39);
//5
	Student student5 = new Student("Matt", "", "Smith",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3023434554", "matt@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student1);
	Enrollment enrollment5 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student5.getStudentID());
	enrollment5.setGrade(3.88);
	//6
	Student student6 = new Student("Chip", "", "Pappi",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3024756436", "chippers@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student6);
	Enrollment enrollment6 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student6.getStudentID());
	enrollment6.setGrade(3.67);
	//7
	Student student7 = new Student("Allie", "", "Koski",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3024567543", "allison@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student7);
	Enrollment enrollment7 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student7.getStudentID());
	enrollment7.setGrade(3.67);
	//8
	Student student8 = new Student("Gabby", "", "Janney",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3023327630", "gabby@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student8);
	Enrollment enrollment8 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student8.getStudentID());
	enrollment8.setGrade(3.67);
//9
	Student student9 = new Student("Tommy", "", "Pickles",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3023451347", "Tommy@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student9);
	Enrollment enrollment9 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student9.getStudentID());
	enrollment9.setGrade(3.67);
	
//10
	Student student10 = new Student("Dillon", "", "Pickles",
			new GregorianCalendar(2000, 9, 30).getTime(), eMajor.BUSINESS,
			"306 Haines street", "3026789876", "Dillon@gmail.com");
	studentList = new ArrayList<Student>();
	studentList.add(student10);
	Enrollment enrollment10 = new Enrollment(
			computerSectionForFallSemester.getSectionID(),
			student10.getStudentID());
	enrollment10.setGrade(3.67);
	
	}
	@Test
	public void test() {
		//gpa calculator
		//for each student get grade and multiply by credits of that course to get GPA
		
		Enrollment enrollment1;
		//enrollment1.getGrade() * sectionList.getenrollment1.getSectionID()
		  //totPts= totPtsClass1+totPtsClass2+totPtsClass3+totPtsClass4;
		  //totalCredits = credit1+credit2+credit3+credit4;
		  //gpa= totPts / totalCredits;
		assertEquals(1, 1);
	}
}