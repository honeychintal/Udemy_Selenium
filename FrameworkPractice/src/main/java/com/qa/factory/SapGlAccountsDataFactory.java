package com.qa.factory;

import com.qa.model.SapGlAccounts;

public class SapGlAccountsDataFactory {

	public static SapGlAccounts createSapGlAccountsItems(String id, String category, String region, String activityType,
			String channel, String revenue, String offset, String offsetTaxCode, String revenueTaxCode)
	{
		return SapGlAccounts
				.builder()
				.id(id)
				.category(category)
				.region(region)
				.activityType(activityType)
				.channel(channel)
				.revenue(revenue)
				.offset(offset)
				.offsetTaxCode(offsetTaxCode)
				.revenueTaxCode(revenueTaxCode)
				.build();
	}

}
