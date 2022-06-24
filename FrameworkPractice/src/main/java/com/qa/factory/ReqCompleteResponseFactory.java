package com.qa.factory;

import java.util.List;

import com.qa.data.TestReqResponseData;
import com.qa.model.ReqResponse;
import com.qa.model.ReqResponseData;
import com.qa.model.ReqResponseSupport;

public class ReqCompleteResponseFactory {

	public static ReqResponse createCompleteReqResponse(Integer page, Integer per_page, Integer total, 
			Integer total_pages, List<ReqResponseData> data,ReqResponseSupport support)
	{
		return ReqResponse.builder()
				.page(page)
				.per_page(per_page)
				.total(total)
				.total_pages(total_pages)
				.data(data)
				.support(support).build();
	}
	
	public static ReqResponse createCompleteExpectedResponse()
	{
		return createCompleteReqResponse(2, 6, 12, 2, TestReqResponseData.getReqResData(), TestReqResponseData.getReqResSupport());
	}
}
