package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList <Staff> staffList = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() {
		Date date = new Date(); // for a default date
		Staff s1 = new Staff("Al", "A", "Alpha", date, "111 Ln.", "111-111-1111", "aalpha@udel.edu", "1pm - 2pm", 1, 35000.00, date, eTitle.MR);
		Staff s2 = new Staff("Be", "B", "Beta", date, "222 Ln.", "222-222-2222", "bbeta@udel.edu", "2pm - 3pm", 2, 34000.00, date, eTitle.MR );
		Staff s3 = new Staff("Ch", "C", "Charlie", date, "333 Ln.", "333-333-3333", "ccharlie@udel.edu", "3am - 4pm" , 3, 33000.00, date, eTitle.MRS );
		Staff s4 = new Staff("De", "D", "Delta", date, "444 Ln.", "444-444-4444", "ddelta@udel.edu", "4am - 5pm", 4, 32000.00, date, eTitle.MS);
		Staff s5 = new Staff("Ec", "E", "Echo", date, "555 Ln.", "555-555-5555", "eecho@udel.edu", "85m - 6pm", 5, 31000.00, date, eTitle.MR);
		staffList.add(s1);
		staffList.add(s2);
		staffList.add(s3);
		staffList.add(s4);
		staffList.add(s5);
	}
	
	@Test
	public void salaryTester() {
		double expectedSalaryAvg = (35000 + 34000 + 33000 + 32000 + 31000)/5;
		double total = 0;
		for(int i=0; i < staffList.size(); i++){
			total += staffList.get(i).getSalary();
		}
		double actualSalaryAvg = total/5;
		assertEquals(expectedSalaryAvg, actualSalaryAvg, 0.1);
	}	
	/*@Test (expected = PersonException.class)
	public void PhoneNumberTest() throws Exception {
	}
	*/
	
	/*@Test (expected = PersonException.class)
	*public void DOBTest() throws Exception{
	}
	*/

}
