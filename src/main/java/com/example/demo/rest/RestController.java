package com.example.demo.rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;

@RequestMapping("abc/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping(value = "test",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response add(@RequestBody String requestJSON){
        System.out.println("testRest->Request : "+ requestJSON);

        Request request = new Request();
        try {
            request=  new ObjectMapper().readValue(requestJSON,Request.class);
            Response response = new Response();
            if(request.getBodyString("Id").equals("1"))
            {
            
            	response.setStatus(0);
            	response.setMessage("Success");
            }
            else
            {
            	response.setStatus(1);
            	response.setMessage("Failed");
            }
            return response;

        }catch(Exception e)
        {
            e.printStackTrace();
            Response response = new Response();
            response.setStatus(2);
            response.setMessage(e.getMessage());
            return response;
        }
    }

}
