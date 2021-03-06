package com.qa.tests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.testng.annotations.Test;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.data.Activities;

public class NewHttpClientGet {

	public static String uri="https://fakerestapi.azurewebsites.net/api/v1/Activities/";
	@Test
	public void getTest() throws IOException, InterruptedException
	{
		ObjectMapper mapper= new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.header("Accept","application/json")
				.uri(URI.create(uri))
				.build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		List<Activities> activities = mapper.readValue(response.body(),new TypeReference<List<Activities>>(){});
		activities.stream().forEach(s->System.out.println(s));
		
		//mapper.readValue() is Method to deserialize JSON content from given JSON content String. 
			//takes as Parameters:content and valueTypeRef
				//content is json we need to deserialize and TypeReference is pojo which on which we want to convert as object 
 	}
}
