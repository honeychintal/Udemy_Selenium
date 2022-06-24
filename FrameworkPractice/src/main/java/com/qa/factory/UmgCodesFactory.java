package com.qa.factory;

import java.util.List;

import com.qa.data.TestUmgCodesRequest;
import com.qa.model.UmgCodesRequest;

public class UmgCodesFactory {
    public static UmgCodesRequest createUmgCodesRequest(List<String> umgCodes) {
		return UmgCodesRequest.builder()
                .umgCodes(umgCodes)
                .build();
    }
    public static UmgCodesRequest createUmgCodesRequestBody()
    {
       return createUmgCodesRequest(TestUmgCodesRequest.UMG_CODES_REQUEST.getUmgCodes());
    }
    
    public static UmgCodesRequest createUmgCodesRequestBody2()
    {
       return createUmgCodesRequest(TestUmgCodesRequest.UMG_MULTI_CODES_REQUEST.umgCodes);
    }
}
