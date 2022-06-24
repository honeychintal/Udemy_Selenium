package com.qa.tests;

import java.util.Collection;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.factory.SapGlAccountsResponseFactory;
import com.qa.model.SapGlAccounts;

public class ResponseBuilder2 {

	@Test
	public void responsebuild() throws JsonProcessingException
	{	
		ObjectMapper mapper = new ObjectMapper();
		
		//List<SapGlAccounts> swag_req = TestSapGlAccountsData.getSapGlAccountsData();		
		Collection<SapGlAccounts> swag_req1 = SapGlAccountsResponseFactory.createCompleteExpectedResponse();
		
		String req = mapper.writeValueAsString(swag_req1);	
		System.out.println("request body for swagger:::: "+req);
	}
}
