package com.qa.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class ReqResponseSupport {

	public String url;
	public String text;
}
