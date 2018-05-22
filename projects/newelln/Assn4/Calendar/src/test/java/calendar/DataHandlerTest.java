
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		DataHandler data0 = new DataHandler();
		DataHandler data1 = new DataHandler("test1.xml");
		DataHandler data2 = new DataHandler("test2.xml", false);
		
		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		data0.getApptRange(greg1, greg2);
	}
	
	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		DataHandler data2 = new DataHandler("test2.xml", false);
		
		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		//CalDay cal1 = new CalDay(greg1);
		//CalDay cal2 = new CalDay(greg2);
		data2.getApptRange(greg1, greg2);
		
	}
	
	@Test(expected = DateOutOfRangeException.class)
	public void test02()  throws Throwable  {
		DataHandler data2 = new DataHandler("test2.xml", false);
		
		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		//CalDay cal1 = new CalDay(greg1);
		//CalDay cal2 = new CalDay(greg2);
		data2.getApptRange(greg2, greg1);
	}
	
	@Test(timeout = 4000)
	public void test03()  throws Throwable  {
		DataHandler data0 = new DataHandler();

		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		Appt appt4 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");

		data0.saveAppt(appt4);
	}

	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		DataHandler data0 = new DataHandler();

		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		int recur[] = {1, 3, 4};
		Appt appt4 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt4.setRecurrence(recur, 1, 1, -1);
		
		
		data0.getApptRange(greg1, greg2);
	}
	
	@Test(timeout = 4000)
	public void test05()  throws Throwable  {
		DataHandler data0 = new DataHandler();

		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		int recur[] = {2, 3, 4};
		Appt appt4 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt4.setRecurrence(recur, 1, 2, 4);
		
		
		data0.getApptRange(greg1, greg2);
	}
	
	@Test(timeout = 4000)
	public void test06()  throws Throwable  {
		DataHandler data0 = new DataHandler();

		GregorianCalendar greg1 = new GregorianCalendar(2018, 9, 9);
		GregorianCalendar greg2 = new GregorianCalendar(2018, 9, 11);
		int recur[] = {1, 3, 4};
		Appt appt4 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt4.setRecurrence(recur, 1, 3, 4);
		
		
		data0.getApptRange(greg1, greg2);
	}
}
