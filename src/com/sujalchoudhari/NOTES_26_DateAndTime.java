package com.sujalchoudhari;

//import java.util.Date;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.TimeZone;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class NOTES_26_DateAndTime {

	public static void main(String[] args) {
		// Java Stores milliseconds since 1st January 1970
		// But Java assumes 1900 as the Start of the Time.
		
		// System.out.println(System.currentTimeMillis()/1000/3600/24/365); // Years passed since 1970
		// long ms = System.currentTimeMillis();
		// System.out.println(ms);
		// System.out.println(Long.MAX_VALUE);
		
		// Old Package
		// Date d = new Date();
		// System.out.println(d);
		
		// Calendar Class
		//Calendar c = Calendar.getInstance();
		//System.out.println(c.getCalendarType());
		//System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		//Gregorian Calendar
		//GregorianCalendar cal = new GregorianCalendar();
		//System.out.println(c.getWeeksInWeekYear());
		
		// Newer Time Class
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD/MM/YY - hh/mm/ss"); // new formatter
		System.out.println(ldt.format(dtf));  // using formatter
		
		
	}

}
