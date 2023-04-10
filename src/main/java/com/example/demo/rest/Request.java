package com.example.demo.rest;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;
import java.util.HashMap;
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class Request {
    public HashMap<String,Object> body;
    public HashMap<String,Object> header;

    public  Request(){
        this.body = new HashMap<String,Object>();
        this.header = new HashMap<String,Object>();
    }

    public String getHeaderString(String param){
        return String.valueOf(this.header.get(param));
    }
    public String getBodyString(String param){
        return String.valueOf(this.body.get(param));
    }
    public BigDecimal getHeaderBigDecimal(String param){
        return new BigDecimal(String.valueOf(this.header.get(param)));
    }
    public BigDecimal getBodyBigDecimal(String param){
        return new BigDecimal(String.valueOf(this.body.get(param)));
    }
    public Integer getBodyInt(String param){
        return Integer.parseInt(String.valueOf(this.body.get(param)));
    }
}
