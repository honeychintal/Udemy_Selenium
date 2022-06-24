package com.qa.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class ReqResponse {
	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<ReqResponseData> data;
	private ReqResponseSupport support;
}
