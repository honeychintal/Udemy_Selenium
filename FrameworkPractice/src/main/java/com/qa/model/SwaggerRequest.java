package com.qa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class SwaggerRequest {

	Integer id;
	Integer petId;
	Integer quantity;
	String shipDate;
	String status;
	boolean complete;
}
