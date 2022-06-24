package com.qa.data;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.qa.factory.SapGlAccountsDataFactory;
import com.qa.model.SapGlAccounts;

public class TestSapGlAccounts{

public static final List<SapGlAccounts> SAP_GL_ACCOUNTS_DATA = ImmutableList.of(
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"8539380190365185886",
				"Unauthorized",
				"Domestic",
				"Return Distribution Fee",
				"Physical",
				"120002",
				"510015",
				"Z6",
				null),
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-1068240581670691168",
				"Unidentified",
				"Domestic",
				"Distribution Fee",
				"DAM",
				"120002",
				"510015",
				"Z6",
				null),
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-7224058590288674900",
				"Unidentified",
				"Domestic",
				"Return",
				"Physical",
				"400001",
				"120001",
				null,
				"Z2"),
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"6956809076030316330",
				"Unidentified",
				"International",
				"Sales",
				"Physical",
				"401001",
				"260030",
				null,
				"Z2"),
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-641568233669926099", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Distribution Fee",		//activityType
				"Digital",				//channel
				"120002",				//revenue
				"510015",				//offset
				null,					//offsetTaxcode
				"Z6"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"5346004233520863175", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Return",		//activityType
				"Digital",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"5189907275713468115", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Return Distribution Fee",		//activityType
				"Digital",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"1126657131108709177", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"Physical",				//channel
				"400001",				//revenue
				"510015",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-2686939695626953114", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Return",		//activityType
				"Physical",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"5636196720896940907", //id
				"Unauthorized",        //category
				"International",  			//region
				"Sales",		//activityType
				"Physical",				//channel
				"400117",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-6645362415291051056", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Return",		//activityType
				"Digital",				//channel
				"400980",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-6782405572305157123", //id
				"Unidentified",        //category
				"International",  			//region
				"Return",		//activityType
				"Physical",				//channel
				"401001",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-2770865885173206854", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Return Distribution Fee",		//activityType
				"Physical",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-1080165588526820955", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"Digital",				//channel
				"400980",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"2407900627837334364", //id
				"Unidentified",        //category
				"International",  			//region
				"Sales",		//activityType
				"Digital",				//channel
				"400980",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"463090366524549222", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Distribution Fee",		//activityType
				"Physical",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-8974065349440626026", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Return",		//activityType
				"DAM",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-2138200846012908670", //id
				"Unauthorized",        //category
				"International",  			//region
				"Return",		//activityType
				"Digital",				//channel
				"400117",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-6199533851728999059", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Return Distribution Fee",		//activityType
				"DAM",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"3387495482459746972", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Return Distribution Fee",		//activityType
				"Digital",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"8915735272224194540", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"DAM",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"5947288065862921324", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"Digital",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-1849699477321697490", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"Physical",				//channel
				"400117",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"2781540026935283434", //id
				"Unauthorized",        //category
				"Domestic",  			//region
				"Distribution Fee",		//activityType
				"DAM",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"8527237286692230071", //id
				"Unauthorized",        //category
				"International",  			//region
				"Return",		//activityType
				"Physical",				//channel
				"400117",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-8835621213839749710", //id
				"Unauthorized",        //category
				"International",  			//region
				"Sales",		//activityType
				"Digital",				//channel
				"400117",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"8405852199315968457", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Distribution Fee",		//activityType
				"Digital",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"3158000462754919894", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Distribution Fee",		//activityType
				"Physical",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-5979906982765783379", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Return",		//activityType
				"DAM",				//channel
				"400991",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"-3679491093113765949", //id
				"Unidentified",        //category
				"International",  			//region
				"Return",		//activityType
				"Digital",				//channel
				"400980",				//revenue
				"260030",				//offset
				null,					//offsetTaxcode
				"Z2"),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"9201845934282798471", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Return Distribution Fee",		//activityType
				"DAM",				//channel
				"120002",				//revenue
				"510015",				//offset
				"Z6",					//offsetTaxcode
				null),					//revenueTaxcode
		SapGlAccountsDataFactory.createSapGlAccountsItems(
				"1538731896146868994", //id
				"Unidentified",        //category
				"Domestic",  			//region
				"Sales",		//activityType
				"DAM",				//channel
				"400991",				//revenue
				"120001",				//offset
				null,					//offsetTaxcode
				"Z2")					//revenueTaxcode

		);

}