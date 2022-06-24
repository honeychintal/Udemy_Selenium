package com.qa.factory;

import com.qa.model.ReqResponseData;

public class ReqResponseDataFactory {

	public static ReqResponseData createDataResponse(Integer id, String email, String first_name, String last_name, String avatar) 
	{
		return ReqResponseData
				.builder()
				.id(id)
				.email(email)
				.first_name(first_name)
				.last_name(last_name)
				.avatar(avatar)
				.build();
		
	}
}
