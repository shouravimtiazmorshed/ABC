package com.example.demo.rest;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;
import java.util.HashMap;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class Response {

    public HashMap<String,Object> header;
    public HashMap<String,Object> body;

    public Response() {
        this.header = new HashMap<String,Object>();
        this.body = new HashMap<String,Object>();
    }

    public void setStatus(int status)
    {
        this.header.put("Status",status);
    }
    public int getHeaderInt(String param)
    {
        return Integer.parseInt(
                String.valueOf(this.header.get(param))
        );
    }
    public void setMessage(String message)
    {
        this.header.put("Message",message);
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

}
