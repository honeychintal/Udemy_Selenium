package com.qa.factory;
import com.qa.model.SaleType;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SaleTypeFactory {

    public static SaleType createSaleType(
            String id, String name, Double distributionFee, String umgSaleTypeCode, Boolean excludedFromPricePointMarkupIndicator,
            String alliantSalesTypeId, String alliantSalesTypeDescription, String channelTypeIndicator
    ) {
        return SaleType.builder()
                .id(id)
                .name(name)
                .distributionFee(distributionFee)
                .umgSaleTypeCode(umgSaleTypeCode)
                .excludedFromPricePointMarkupIndicator(excludedFromPricePointMarkupIndicator)
                .alliantSalesTypeId(alliantSalesTypeId)
                .alliantSalesTypeDescription(alliantSalesTypeDescription)
                .channelTypeIndicator(channelTypeIndicator)
                .build();
    }
}
