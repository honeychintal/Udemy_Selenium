package com.qa.util;

import java.util.HashMap;

import org.apache.http.Header;

public class HeadersUtil {
	public static HashMap<String, String> getHeadersMap(Header[] headersArray)
	{
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header: headersArray)
		{
			allHeaders.put(header.getName(),header.getValue());
		}
		return allHeaders;
	}
}
