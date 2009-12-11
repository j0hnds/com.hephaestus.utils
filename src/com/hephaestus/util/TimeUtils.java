package com.hephaestus.util;

import java.util.Calendar;

/**
 * This class provides a variety of time conversion methods.
 * 
 * @author Dave Sieh
 */
public class TimeUtils {
	
	/**
	 * Returns the date/time of the start of the specified day of the year.
	 * 
	 * @param year the year 
	 * @param month the month
	 * @param day the day of the month
	 * @return reference to a calendar set to the start of the specified day.
	 */
	public static final Calendar getStartOfDay(int year, int month, int day) {
		return getCalendarAtTime(year, month, day, 0, 0, 0);
	}

	/**
	 * Returns the date/time of the end of the specified day of the year.
	 * 
	 * @param year the year 
	 * @param month the month
	 * @param day the day of the month
	 * @return reference to a calendar set to the end of the specified day.
	 */
	public static final Calendar getEndOfDay(int year, int month, int day) {
		return getCalendarAtTime(year, month, day, 23, 59, 59);
	}

	/**
	 * Returns the calendar for the specified date/time.
	 * 
	 * @param year the year 
	 * @param month the month
	 * @param day the day of the month
	 * @param hour the hour to set
	 * @param minute the minute to set
	 * @param second the second to set
	 * @return reference to a calendar set to the specified date/time.
	 */
	public static final Calendar getCalendarAtTime(int year, int month, int day,
			int hour, int minute, int second) {
		
		Calendar calEndTime = Calendar.getInstance();
		calEndTime.set(Calendar.MONTH, month);
		calEndTime.set(Calendar.DAY_OF_MONTH, day);
		calEndTime.set(Calendar.YEAR, year);
		calEndTime.set(Calendar.HOUR_OF_DAY, hour);
		calEndTime.set(Calendar.MINUTE, minute);
		calEndTime.set(Calendar.SECOND, second);

		return calEndTime;
	}
}
