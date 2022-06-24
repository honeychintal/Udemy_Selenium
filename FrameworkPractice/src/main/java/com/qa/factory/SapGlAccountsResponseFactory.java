package com.qa.factory;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qa.data.TestSapGlAccountsData;
import com.qa.model.SapGlAccounts;

public class SapGlAccountsResponseFactory {

	public static Collection<SapGlAccounts>  createCompleteExpectedResponse()
	{
		return TestSapGlAccountsData.getSapGlAccountsData();	
	}

}
