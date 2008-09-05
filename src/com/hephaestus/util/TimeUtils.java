package com.hephaestus.util;

import java.util.Calendar;

/**
 * This class provides a variety of time conversion methods.
 * 
 * @author Dave Sieh
 *
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
		Calendar calStartTime = Calendar.getInstance();
		calStartTime.set(Calendar.MONTH, month);
		calStartTime.set(Calendar.DAY_OF_MONTH, day);
		calStartTime.set(Calendar.YEAR, year);
		calStartTime.set(Calendar.HOUR_OF_DAY, 0);
		calStartTime.set(Calendar.MINUTE, 0);
		calStartTime.set(Calendar.SECOND, 0);

		return calStartTime;
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
		Calendar calEndTime = Calendar.getInstance();
		calEndTime.set(Calendar.MONTH, month);
		calEndTime.set(Calendar.DAY_OF_MONTH, day);
		calEndTime.set(Calendar.YEAR, year);
		calEndTime.set(Calendar.HOUR_OF_DAY, 23);
		calEndTime.set(Calendar.MINUTE, 59);
		calEndTime.set(Calendar.SECOND, 59);
		return calEndTime;
	}
}
