package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;
import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	
    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		System.out.println("Start testing #3...");
		 
		try{
			for (int iteration = 0; iteration < 50; iteration++) {
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
				
				int startHour2=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				int startMinute2=ValuesGenerator.getRandomIntBetween(random, -1, 65);
				int startDay2=ValuesGenerator.getRandomIntBetween(random, -1, 32);
				int startMonth2=ValuesGenerator.getRandomIntBetween(random, -1, 13);
				int startYear2 = ValuesGenerator.getRandomIntBetween(random, 1900, 2018);
				
				Appt appt2 = new Appt(startHour2,
						startMinute2 ,
						startDay2 ,
						startMonth2 ,
						startYear2 ,
						title,
						description,
						emailAddress);
						
				//make new things
				GregorianCalendar greg = new GregorianCalendar(startYear, startMonth, startDay);
				GregorianCalendar greg2 = new GregorianCalendar(startYear2, startMonth2, startDay2);
				
				CalDay cal0 = new CalDay(greg);
				CalDay cal1 = new CalDay();
				DataHandler data0 = new DataHandler();
				
				cal0.addAppt(appt);
				cal0.addAppt(appt2);
				
				data0.saveAppt(appt);
				data0.saveAppt(appt2);
				
				data0.deleteAppt(appt2);
				System.out.println("Testing number " + iteration + "...");
				try {
					data0.getApptRange(greg, greg2);
					
				} catch(DateOutOfRangeException e) {}
				
			}
		}catch(NullPointerException e){
			
		}
		
		 System.out.println("Done testing #3...");
		
		
	}


	
}
