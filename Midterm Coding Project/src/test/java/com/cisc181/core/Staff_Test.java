package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static List<Staff> listOfStaff;
	@BeforeClass
	public static void setup() {
		listOfStaff = new ArrayList<Staff>();
		Calendar calendar = new GregorianCalendar(200,10,31);
		double sal = 1000.00;
		Staff staff = new Staff("Raveena","","Wadhwa", calendar.getTime(),"306 Haines Street","3023452799","rwadhwa128@gmail.com","9to4",2,sal,new GregorianCalendar(2012,10,20).getTime(),eTitle.MS);
		listOfStaff.add(staff);
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	@Test
	public void testAverage() {
	    double sumOfSal = 0;
		for(Staff staff:listOfStaff) {
			sumOfSal += staff.getSalary();
		}
		double averageSal = sumOfSal/listOfStaff.size();
		assertEquals(averageSal,1000.0,0.1);
	}	
	@Test(expected = PersonException.class)
	public void testInvalidPhone() throws PersonException{
		Staff staff = new Staff("Raveena","","Wadhwa", new GregorianCalendar(200,10,31).getTime(),"306 Haines Street","3023452799","rwadhwa128@gmail.com","9to4",2,1000,new GregorianCalendar(2012,10,20).getTime(),eTitle.MS);
		staff.PrintPhoneNumber();
		
	}
}
