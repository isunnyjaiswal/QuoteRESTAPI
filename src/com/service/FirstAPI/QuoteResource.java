package com.service.FirstAPI;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.model.Quotes;
import com.service.Service.QuoteService;

@Path("/quotes")
public class QuoteResource {
	QuoteService quote = new QuoteService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Quotes> getAllQuotes(){
		return quote.getAllQuotesServiceMethod();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Quotes postQuotes(Quotes newquote){
		quote.postQuotesServiceMethod(newquote);
		return newquote;
	}	
}
