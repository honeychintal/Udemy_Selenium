package com.qa.tests;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.client.SwaggerClient;
import com.qa.factory.SwaggerReqestFactory;
import com.qa.factory.SwaggerResponseFactory;
import com.qa.model.SwaggerRequest;
import com.qa.model.SwaggerResponse;

public class SwaggerPostTest {

	//POST request without headers 
	@Test
	public void postTest_withoutHeaders() throws ClientProtocolException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		SwaggerRequest swag_req = SwaggerReqestFactory.createswaggerRequest();
		String req = mapper.writeValueAsString(swag_req);	
		System.out.println("Request body :::: "+req);
		
		SwaggerResponse swag_exp_resp = SwaggerResponseFactory.createSwaggerResponse() ;
		String exp_resp = mapper.writeValueAsString(swag_exp_resp);	
		System.out.println("Expected response:::: "+exp_resp);
		
		String actual_resp = SwaggerClient.getResponse(req);
		System.out.println("Actual response:::"+actual_resp);
		
		Assert.assertEquals(actual_resp, exp_resp,"Assertion failed response not matched");
	}
	
	//POST request with headers 
	@Test
	public void postTest_with_Headers() throws ClientProtocolException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		SwaggerRequest swag_req = SwaggerReqestFactory.createswaggerRequest();
		String req = mapper.writeValueAsString(swag_req);	
		System.out.println("Request body :::: "+req);
		
		SwaggerResponse swag_exp_resp = SwaggerResponseFactory.createSwaggerResponse() ;
		String exp_resp = mapper.writeValueAsString(swag_exp_resp);	
		System.out.println("Expected response:::: "+exp_resp);
		
		Map<String, String> headers = SwaggerReqestFactory.createHeader(); //getting the headers from factory class
		
		String actual_resp = SwaggerClient.getResponse(req,headers); //calling the client with header and request body to hit API 
		
		System.out.println("Actual response:::"+actual_resp);
		
		Assert.assertEquals(actual_resp, exp_resp,"Assertion failed response not matched");
	}
}
