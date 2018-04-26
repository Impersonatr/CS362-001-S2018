/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {
	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		String string0 = appt0.toString();
		assertEquals(2, appt0.getRecurBy());
		assertEquals(15, appt0.getStartHour());
		assertEquals(30, appt0.getStartMinute());
		
		assertFalse(appt0.isRecurring());
		assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
		assertEquals(0, appt0.getRecurIncrement());
		appt0.setValid();
	}
	
	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		Appt appt1 = new Appt(9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		String string1 = appt1.toString();
		assertEquals(9, appt1.getStartDay());
		assertEquals(12, appt1.getStartMonth());
		assertEquals(2018, appt1.getStartYear());
		
		assertEquals("Birthday Party", appt1.getTitle());
		assertEquals("This is my birthday party", appt1.getDescription());
		assertEquals("xyz@gmail.com", appt1.getEmailAddress());
		appt1.setValid();
	}
	
	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		Appt appt2 = new Appt(15, 65, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt2.setValid();
	}
	
	@Test(timeout = 4000)
	public void test03()  throws Throwable  {
		Appt appt3 = new Appt(15, 30, 40, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt3.setValid();
	}
	
	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		Appt appt4 = new Appt(12, 12, 9, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt4.setValid();
	}

}
