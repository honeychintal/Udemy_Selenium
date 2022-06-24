package com.qa.tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.model.ReqResponse;

public class ResponseBuilder1 {
	
	@Test
	public void responsebuild() throws JsonProcessingException
	{	
		
		ReqResponse rsp1 = ReqResponse.builder().page(0).per_page(0).total(0).total_pages(0).data(null).support(null).build();
		ObjectMapper mapper = new ObjectMapper();
		String jsrting = mapper.writeValueAsString(rsp1);	
		System.out.println("This is the output:::::::: "+jsrting);
	}
}
