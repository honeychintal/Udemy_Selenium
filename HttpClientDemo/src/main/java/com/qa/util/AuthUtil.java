package com.qa.util;
import java.util.Base64;
public class AuthUtil {

	public static String basicAuthString(String str)
	{
		String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
		return "Basic "+encodedString;
	}
	
	public static String bearerAuthString(String str)
	{
		return "Bearer "+str;
	}
}
