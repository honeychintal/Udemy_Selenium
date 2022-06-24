package com.qa.data;
import com.google.common.collect.ImmutableList;
import com.qa.factory.SaleTypeFactory;
import com.qa.model.SaleType;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class TestSaleTypes {

    public static final List<String> SALE_TYPE_NAMES = Arrays.asList("PORTABLE SUB STREAMS");

    public static final List<SaleType> SALE_TYPE_LIST = ImmutableList.of(
            SaleTypeFactory.createSaleType(
                    "110",
                    "PORTABLE SUB STREAMS",
                    0.1,
                    "110",
                    true,
                    "PRTSS",
                    "Portable Sub Streams",
                    "Digital")
    );
    public static final List<SaleType> SALE_TYPE_LIST_MULTIPLE = ImmutableList.of(
            SaleTypeFactory.createSaleType(
                    "110",
                    "PORTABLE SUB STREAMS",
                    0.1,
                    "110",
                    true,
                    "PRTSS",
                    "Portable Sub Streams",
                    "Digital"),
            SaleTypeFactory.createSaleType(
                    "105",
                    "CLIENT PLAYS",
                    0.08,
                    "105",
                    false,
                    "CTPLY",
                    "Client Plays",
                    "Digital")

    );
}
