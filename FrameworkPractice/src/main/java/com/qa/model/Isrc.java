package com.qa.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
public class Isrc {
	
	private static List<IsrcData> isrcCode;

    @JsonProperty("value")
    public static List<IsrcData> getIsrcCode(){
        return isrcCode;
    }
    public static void setIsrcCode(List<IsrcData> isrcCode_param)
    {
        isrcCode = isrcCode_param;
    }
}
