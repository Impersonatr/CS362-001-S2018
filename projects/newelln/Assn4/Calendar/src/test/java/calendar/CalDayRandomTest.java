package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

import calendar.Appt;
import calendar.CalDay;

import java.util.GregorianCalendar;


/**
 * Random Test Generator  for CalDay class.
 */
 
public class CalDayRandomTest {
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 
	private static final long TestTimeout = 60 * 200 * 1; /* Timeout at 12 seconds */
	private static final int NUM_TESTS=100;
	
	@Test
	public void radnomtest()  throws Throwable  {
		System.out.println("Start testing #2...");
		 
		try{
			for (int iteration = 0; iteration < 10000; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
				Random random = new Random(randomseed);
				
				
				//make a new appt
				int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 65);
				int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 32);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, -1, 13);
				int startYear = ValuesGenerator.getRandomIntBetween(random, 1900, 2018);
				
				String title="Birthday Party";
				String description="This is my birthday party.";
				String emailAddress="xyz@gmail.com";

				//Construct a new Appointment object with the initial data
				Appt appt = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description,
						emailAddress);
				
				//make new CalDay, test addAppt
				GregorianCalendar greg = new GregorianCalendar(startYear, startMonth, startDay);
				CalDay cal0 = new CalDay(greg);
				cal0.addAppt(appt);
				
				startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 65);
				startDay=ValuesGenerator.getRandomIntBetween(random, -1, 32);
				startMonth=ValuesGenerator.getRandomIntBetween(random, -1, 13);
				startYear = ValuesGenerator.getRandomIntBetween(random, 1900, 2018);
				
				Appt appt2 = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description,
						emailAddress);
						
				cal0.addAppt(appt2);
			}
		}catch(NullPointerException e){
			
		}
		
		 System.out.println("Done testing #2...");
	}
}
