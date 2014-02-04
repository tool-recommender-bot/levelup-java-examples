package com.levelup.java.date.between;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.junit.Test;

/**
 * This java example will demonstrate finding the 
 * number of months between two dates.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/examples/number-of-months-between-two-dates/'>Number of months between dates</a>
 * 
 */
public class MonthsBetweenDates {

	@Test
	public void months_between_two_dates_in_java_with_java8 () {
		
		LocalDate startDate = LocalDate.of(2004, Month.JANUARY, 1);
		LocalDate endDate = LocalDate.of(2005, Month.JANUARY, 1);
		
		long monthsInYear2 = ChronoUnit.MONTHS.between(startDate, endDate);

		assertEquals(12, monthsInYear2);
	}
	
	@Test
	public void months_between_two_dates_in_java_with_joda () {

		DateTime start = new DateTime(2005, 1, 1, 0, 0, 0, 0);
		DateTime end = new DateTime(2006, 1, 1, 0, 0, 0, 0);

		Months months = Months.monthsBetween(start, end);
		
		int monthsInYear = months.getMonths();
		
		assertEquals(12, monthsInYear);
	}
	
}
