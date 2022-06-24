package com.qa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleType {

    private String id;
    private String name;
    private Double distributionFee;
    private String umgSaleTypeCode;
    private Boolean excludedFromPricePointMarkupIndicator;
    private String alliantSalesTypeId;
    private String alliantSalesTypeDescription;
    private String channelTypeIndicator;
}
