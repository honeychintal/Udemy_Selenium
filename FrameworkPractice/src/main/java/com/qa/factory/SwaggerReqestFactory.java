package com.qa.factory;

import java.util.HashMap;
import java.util.Map;

import com.qa.model.SwaggerRequest;

public class SwaggerReqestFactory {

	public static SwaggerRequest swaggerRequest(Integer id, Integer petId, Integer quantity, String shipDate, String status, boolean complete)
	{
		return SwaggerRequest
				.builder()
				.id(id)
				.petId(petId)
				.quantity(quantity)
				.shipDate(shipDate)
				.status(status)
				.complete(complete)
				.build();
	}
	
	public static SwaggerRequest createswaggerRequest()
	{
		return swaggerRequest(0, 0, 0, "2021-12-02T12:43:37.083Z", "placed", true);
	}
	
	public static Map<String, String> createHeader()
	{
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		return headers;
	}
}

