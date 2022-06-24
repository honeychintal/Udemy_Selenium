package com.qa.util;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class MyIDUtil {
	static CookieStore cookieStore;
	
	@Test
    public void getSession() throws ClientProtocolException, IOException {
//    Logger log = Logger.getAnonymousLogger();
    cookieStore = new BasicCookieStore();
    HttpClientContext context = HttpClientContext.create();
    context.setAttribute(HttpClientContext.COOKIE_STORE, null);
    context.setRequestConfig(null);
    
	// Create HttpClient using cookie store
	try (CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build()) {
		HttpGet httpget = new HttpGet("https://gorest.co.in/public/v2/posts/100/comments");

		System.out.println("Executing request " + httpget.getRequestLine());
		try (CloseableHttpResponse response = httpclient.execute(httpget,context)) {
			System.out.println("----------------------------------------");
			System.out.println(response.getStatusLine());
			System.out.println( EntityUtils.toString(response.getEntity(),"UTF-8"));
		
			Header[] headersArray = response.getAllHeaders();
			HashMap<String, String> allHeaders = new HashMap<String, String>();
			for(Header header: headersArray)
			{
				allHeaders.put(header.getName(),header.getValue());
			}
			System.out.println("Headers Array-----> "+allHeaders);
			List<Cookie> cookies = cookieStore.getCookies();
			System.out.println("cookoiess:: "+cookies);

			for (Cookie cookie : cookies) {
				// Can access over attributes of cookie
				System.out.println("123"+cookie.getName() + " : " + cookie.getValue());
			}

		}
	}

    }
}

