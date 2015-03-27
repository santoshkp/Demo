package com.spaneos.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class YearShow {

	public static void main(String[] args) throws ParseException {
		Map<Integer, String> bigYearsList = new LinkedHashMap<Integer, String>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int i = year;
		for (; i > year - 10; i--) {
		bigYearsList.put(i, Integer.toString(i));
		}
		//bigYearsList.put(i, "Before " + (i + 1));
		System.out.println(bigYearsList);
		
		/*Calendar now = Calendar.getInstance();
	    System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
	        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

	    now = Calendar.getInstance();
	    now.add(Calendar.YEAR, -100);
	    System.out.println("date before 100 years : " + (now.get(Calendar.MONTH) + 1) + "-"
	        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));*/

		
		Date date;
		try {
			date = new SimpleDateFormat("MMMM").parse("march");
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			System.out.println("******* "+cal.get(Calendar.MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputFormat.parse("november"));
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM") ;// 01-12
		System.out.println("########### "+outputFormat.format(cal.getTime()));
		
		//Calendar cal = Calendar.getInstance();
	    System.out.println(new SimpleDateFormat("MMMM").format(cal.getTime()));
				
	}

}
