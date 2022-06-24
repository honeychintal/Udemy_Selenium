package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.qa.client.ReqResClient;
import com.qa.factory.ReqCompleteResponseFactory;
import com.qa.model.ReqResponse;

public class ReqresGetTest {

	Gson gson = new Gson();
	@Test
	public void getTest() throws ClientProtocolException, IOException
	{	
		ReqResponse rsp1 =  ReqCompleteResponseFactory.createCompleteExpectedResponse();
		ObjectMapper mapper = new ObjectMapper();
		String expectedresponse = mapper.writeValueAsString(rsp1);	
		
		System.out.println("This is the created output:::::::: "+expectedresponse);
		
		String actualresponse = ReqResClient.getResponse(2);
		System.out.println("This is the actual output:::::::: "+actualresponse);
		
		Assert.assertEquals(gson.toJson(expectedresponse), gson.toJson(actualresponse),"Failed not same thing");
	}
}
