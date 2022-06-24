package com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ReqResClient {

	static CloseableHttpClient httpClient=	HttpClients.createDefault();
	static String USERS_PAGE_API ="https://reqres.in/api/users?page=";
	
	
	public static String getResponse(int pageno) throws ClientProtocolException, IOException
	{
		HttpGet httpget = new HttpGet(USERS_PAGE_API+pageno);
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget); //executing/hitting get method by invoking get method object
		
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		return responseString;
	}
}
