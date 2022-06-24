package com.qa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReqResponseData {

	private Integer id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
}
