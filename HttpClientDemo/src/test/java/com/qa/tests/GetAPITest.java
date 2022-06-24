package com.qa.tests;

import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.HeadersUtil;

public class GetAPITest extends TestBase{
	RestClient restClient=new RestClient();
	String url; 
	CloseableHttpResponse closeableHttpResponse;
	
	@Test
	public void getTest() throws ClientProtocolException, IOException 
	{	
		url =restClient.setup();
		closeableHttpResponse= restClient.get(url);
		//a. status code:
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code-----> "+statusCode);
		Assert.assertEquals(statusCode, RESPONSE_CODE_200,"Status code not 200");
				
		//b. json string:
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responJson = new JSONObject(responseString); //parsing string as json
		System.out.println("Response Json from API------> "+responJson);
		System.out.println("value of per-page from json::::::"+responJson.query("/data/0/last_name"));
		
		//b.1. Asserting actual response with expected response
		String expResponse =prop.getProperty("getResponse"); // getting expected response from properties file
		JSONObject expJson = new JSONObject(expResponse); //parsing string as json 
		Assert.assertEquals(responJson.query("/data/0/last_name"), expJson.query("/data/0/last_name"), "Assertion failed -- response not matched with expected response");
	
		
		//c. all Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		//c.1. Calling util class to get map of all Headers
		System.out.println("Headers Array-----> "+HeadersUtil.getHeadersMap(headersArray)); 
	}
}
