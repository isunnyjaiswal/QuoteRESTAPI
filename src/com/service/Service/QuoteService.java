package com.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.DB.DBClass;
import com.model.Quotes;

public class QuoteService {
	
	private Map<Long, Quotes> quotes = DBClass.getAllQuotes();
	
	public QuoteService(){
		quotes.put(1L, new Quotes(1L, "New Quote", "admin"));
		quotes.put(2L, new Quotes(2L, "New Awesome Quote", "admin"));
		
		
	}
	
	public List<Quotes> getAllQuotesServiceMethod(){
		return new ArrayList<Quotes>(quotes.values());		
	}
	
	public Quotes postQuotesServiceMethod(Quotes newquote){
		newquote.setId((long) (quotes.size() + 1));
		quotes.put(newquote.getId(), newquote);
		return newquote;
	}
}
