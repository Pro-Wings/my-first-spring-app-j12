package com.prowings.myapp;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class TimezoneConverterTest {
	
    public static String convertTimezoneToOffset(String timezoneId) {
        ZoneId zoneId = ZoneId.of(timezoneId);
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(java.time.Instant.now());
        return zoneOffset.toString();
    }


    public static void main(String[] args) {
		
    	String input1 = "America/Chicago";
    	String input2 = "America/New_York";
    	String input3 = "America/Los_Angeles";
    	
    	System.out.println(convertTimezoneToOffset(input1));
    	System.out.println(convertTimezoneToOffset(input2));
    	System.out.println(convertTimezoneToOffset(input3));
	}
    
}
