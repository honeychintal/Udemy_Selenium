package com.qa.model;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class SapGlAccounts{

	private String id;
    private String category;
    private String region;
    private String activityType;
    private String channel;
    private String revenue;
    private String offset;
    private String offsetTaxCode;
    private String revenueTaxCode;
}

