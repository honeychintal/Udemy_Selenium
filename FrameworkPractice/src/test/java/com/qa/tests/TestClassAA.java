package com.qa.tests;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.qa.data.TestSortList;
import com.qa.model.Isrc;
import com.qa.model.IsrcData;
import com.qa.model.Modified;
import com.qa.model.Sort;
import com.qa.model.SortList;

public class TestClassAA {

	ObjectMapper mapper = new ObjectMapper();
	  @Test
	    public void Test1() throws JsonProcessingException
	    {
//	        List<IsrcData> isrcd = ImmutableList.of();
//	        Isrc.setIsrcCode(isrcd);
//	        List<IsrcData> isrcDataList =Isrc.getIsrcCode();
//	        String jobj = mapper.writeValueAsString(isrcDataList);
		  Modified str = TestSortList.MODIFIED;
		  String jobj = mapper.writeValueAsString(str);
	      System.out.println(jobj);
	      
	      Sort str1 = TestSortList.SORT;
		  String jobj1 = mapper.writeValueAsString(str1);
	      System.out.println(jobj1);
	      
	      SortList str2 = TestSortList.SORTL_LIST;
		  String jobj3 = mapper.writeValueAsString(str2);
	      System.out.println(jobj3);
	    }
}
