package com.qa.data;

import java.util.List;

import com.qa.model.ReqResponseData;
import com.qa.model.ReqResponseSupport;

public class TestReqResponseData {

	public static List<ReqResponseData> getReqResData()
	{
		return TestReqResponse.LIST_REQ_RESPONSE_DATA;
	}
	
	public static ReqResponseSupport getReqResSupport()
	{
		return TestReqResponse.REQ_RESPONSE_SUPPORT;
	}
}
