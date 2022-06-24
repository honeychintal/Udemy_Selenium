package com.qa.data;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.qa.factory.ReqResponseDataFactory;
import com.qa.model.ReqResponseData;
import com.qa.model.ReqResponseSupport;

public class TestReqResponse {

	public static final List<ReqResponseData> LIST_REQ_RESPONSE_DATA = ImmutableList.of(
			ReqResponseDataFactory.createDataResponse(
					7, 
					"michael.lawson@reqres.in",
					"Michael",
					"Lawson",
					"https://reqres.in/img/faces/7-image.jpg"),
			ReqResponseDataFactory.createDataResponse(
					8,
					"lindsay.ferguson@reqres.in",
					"Lindsay",
					"Ferguson",
					"https://reqres.in/img/faces/8-image.jpg"),
			ReqResponseDataFactory.createDataResponse(
					9,
					"tobias.funke@reqres.in",
					"Tobias",
					"Funke",
					"https://reqres.in/img/faces/9-image.jpg"),
			ReqResponseDataFactory.createDataResponse(
					10,
					"byron.fields@reqres.in",
					"Byron",
					"Fields",
					"https://reqres.in/img/faces/10-image.jpg"),
			ReqResponseDataFactory.createDataResponse(
					11,
					"george.edwards@reqres.in",
					"George",
					"Edwards",
					"https://reqres.in/img/faces/11-image.jpg"),
			ReqResponseDataFactory.createDataResponse(
					12,
					"rachel.howell@reqres.in",
					"Rachel",
					"Howell",
					"https://reqres.in/img/faces/12-image.jpg")
			);
	
	public static final ReqResponseSupport REQ_RESPONSE_SUPPORT = ReqResponseSupport.builder()
			.url("https://reqres.in/#support-heading")
			.text("To keep ReqRes free, contributions towards server costs are appreciated!")
			.build();
}
