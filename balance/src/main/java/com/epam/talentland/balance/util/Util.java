package com.epam.talentland.balance.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Util {

	
	public static String getNowDateYYYmmDD() {
		Date myDate = new Date();
		return new SimpleDateFormat("yyyy-MM-dd").format(myDate);
	}
	
	public static String getNowDateYYYmmDDMonthaddSub(int month) {
		 Calendar cal = Calendar.getInstance();
	        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
	        cal.add(Calendar.MONTH, month);
	        return "" + cal.get(Calendar.YEAR) +"-" +
    		String.format("%02d",(cal.get(Calendar.MONTH)+1)) + "-" + String.format("%02d", cal.get(Calendar.DATE));
	}
}
