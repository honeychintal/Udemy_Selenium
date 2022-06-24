package com.qa.factory;

import com.qa.model.SwaggerResponse;

public class SwaggerResponseFactory {

	public static SwaggerResponse swaggerResponse(Long id,Integer petId, Integer quantity, String shipDate, String status, boolean complete)
	{
		return SwaggerResponse
				.builder()
				.id(id)
				.petId(petId)
				.quantity(quantity)
				.shipDate(shipDate)
				.status(status)
				.complete(complete)
				.build();
	}
	
	public static SwaggerResponse createSwaggerResponse()
	{
		return swaggerResponse(9223372036854775807L, 0, 0, "2021-12-02T12:43:37.083+0000", "placed", true);
	}
}
