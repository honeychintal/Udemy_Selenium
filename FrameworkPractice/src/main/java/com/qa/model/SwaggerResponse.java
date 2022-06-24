package com.qa.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
@Getter
public class SwaggerResponse {

	Long id;
	Integer petId;
	Integer quantity;
	String shipDate;
	String status;
	boolean complete;
}
