/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar; //add this???


public class CalDayTest{
	
	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		CalDay cal0 = new CalDay();
		assertFalse(cal0.isValid());
	}
	
	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		GregorianCalendar greg = new GregorianCalendar(2018, 9, 9);
		CalDay cal1 = new CalDay(greg);
		assertTrue(cal1.isValid());
		String string1 = cal1.getFullInfomrationApp(cal1);
		
	}
	
	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		GregorianCalendar greg = new GregorianCalendar(2018, 9, 9);
		CalDay cal2 = new CalDay(greg);
		Appt appt2 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		cal2.addAppt(appt2);
	}
	
	@Test(timeout = 4000)
	public void test03()  throws Throwable  {
		GregorianCalendar greg = new GregorianCalendar(2018, 9, 9);
		CalDay cal3 = new CalDay(greg);
		Appt appt3 = new Appt(12, 12, 14, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		cal3.addAppt(appt3);
		
	}
	
	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		GregorianCalendar greg = new GregorianCalendar(2018, 9, 9);
		CalDay cal4 = new CalDay(greg);
		Appt appt1 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		Appt appt3 = new Appt(15, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		cal4.addAppt(appt1);
		cal4.addAppt(appt3);
		String string4 = cal4.getFullInfomrationApp(cal4);
		String string5 = cal4.toString();
	}
	
}