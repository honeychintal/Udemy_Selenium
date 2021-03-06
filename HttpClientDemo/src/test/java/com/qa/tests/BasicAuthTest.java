package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.AuthUtil;

public class BasicAuthTest extends TestBase {
	TestBase testbase;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;

	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {
		testbase = new TestBase();
		url = "https://postman-echo.com/basic-auth";
	}

	@Test
	public void postAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		String auth_str = "postman:password";
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("authorization", AuthUtil.basicAuthString(auth_str));

		// 1. Sending GET request with URL and Basic Auth, Json post body and Header
		closeableHttpResponse = restClient.get(url, headerMap);

		// 2. Getting status code
		System.out.println("Response status code : " + closeableHttpResponse.getStatusLine().getStatusCode());

		// 3. Getting json response
		JSONObject jstring = new JSONObject(EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8"));
		System.out.println("Response Json String : " + jstring);

	}
}
