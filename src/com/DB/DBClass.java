package com.DB;

import java.util.HashMap;
import java.util.Map;

import com.model.Quotes;

public class DBClass {
	
	private static Map<Long, Quotes> quotes = new HashMap<>();
	
	public static Map<Long, Quotes> getAllQuotes(){
		return quotes;	
	}
}
