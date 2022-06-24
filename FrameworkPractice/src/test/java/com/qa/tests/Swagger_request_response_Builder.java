package com.qa.tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.factory.SwaggerReqestFactory;
import com.qa.factory.SwaggerResponseFactory;
import com.qa.model.SwaggerRequest;
import com.qa.model.SwaggerResponse;

public class Swagger_request_response_Builder {

	@Test
	public void testing_request_response() throws JsonProcessingException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		SwaggerRequest swag_req = SwaggerReqestFactory.createswaggerRequest();		
		String req = mapper.writeValueAsString(swag_req);	
		System.out.println("request body for swagger:::: "+req);
		
		SwaggerResponse swag_resp = SwaggerResponseFactory.createSwaggerResponse() ;
		String resp = mapper.writeValueAsString(swag_resp);	
		System.out.println("Response body for swagger:::: "+resp);
	}
}
