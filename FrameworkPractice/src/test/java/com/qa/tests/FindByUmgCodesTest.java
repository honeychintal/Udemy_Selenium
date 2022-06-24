
package com.qa.tests;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.factory.UmgCodesFactory;
import com.qa.model.UmgCodesRequest;

public class FindByUmgCodesTest {
	@Test
	public void testFindByUmgCodeSingleValue() throws JsonProcessingException{

		ObjectMapper mapper = new ObjectMapper();
		
		UmgCodesRequest requestBody = UmgCodesFactory.createUmgCodesRequestBody();
        System.out.println("requestBody1:::: "+requestBody);
		String jsrting = mapper.writeValueAsString(requestBody);
		System.out.println("requestBody1 + jsonify:::: "+jsrting);
        
        UmgCodesRequest requestBody2 = UmgCodesFactory.createUmgCodesRequestBody2();
        System.out.println("requestBody2:::: "+requestBody2);
        String jsrting2 = mapper.writeValueAsString(requestBody2);
        System.out.println("requestBody2 + jsonify:::: "+jsrting2);
        
        System.out.println("listprint::: ");
    }
}
