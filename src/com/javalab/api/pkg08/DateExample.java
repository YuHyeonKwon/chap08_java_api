package com.javalab.api.pkg08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample { // class s

	public static void main(String[] args) { // main s

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	} // main e

} // class e
