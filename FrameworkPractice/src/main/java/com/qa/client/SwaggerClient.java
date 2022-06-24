package com.qa.client;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class SwaggerClient {

	static CloseableHttpClient httpClient=	HttpClients.createDefault();
	static String SWAGGER_PETSTORE_API ="https://petstore.swagger.io/v2/store/order";

	//Hitting POST request with only body
	public static String getResponse(String requestBody) throws ClientProtocolException, IOException
	{
		HttpPost httpost = new HttpPost(SWAGGER_PETSTORE_API);
		httpost.setEntity(new StringEntity(requestBody));

		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpost); //executing/hitting get method by invoking get method object

		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		return responseString;
	}

	//Hitting POST request with header and body
	public static String getResponse(String requestBody,Map<String, String> headers) throws ClientProtocolException, IOException
	{
		HttpPost httpost = new HttpPost(SWAGGER_PETSTORE_API);
		httpost.setEntity(new StringEntity(requestBody));

		for(Map.Entry<String,String> entry : headers.entrySet()) //Adding headers to httpost object
		{
			httpost.addHeader(entry.getKey(), entry.getValue()); 
		}

		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpost); //executing/hitting get method by invoking get method object

		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		return responseString;
	}
}
