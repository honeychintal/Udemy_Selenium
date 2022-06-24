package com.qa.data;
import com.google.common.collect.ImmutableList;
import com.qa.factory.UmgCodesFactory;
import com.qa.model.UmgCodesRequest;

public class TestUmgCodesRequest {
    public static final UmgCodesRequest UMG_CODES_REQUEST =  UmgCodesFactory
            .createUmgCodesRequest(ImmutableList.of("110"));

    public static final UmgCodesRequest UMG_MULTI_CODES_REQUEST = UmgCodesFactory
            .createUmgCodesRequest(ImmutableList.of("110","105"));
}
