package com.rest.demo.api.REST;

import com.rest.demo.api.REST.Model.GetRequestBody;
import com.rest.demo.api.REST.Model.GetResponseBody;
import org.springframework.stereotype.Component;


@Component
public class Handler {

    public GetResponseBody GetBody(){
        return  GetResponseBody.builder()
                .response("Empty Get Example").build();
    }

    public GetResponseBody GetBody(String id){
        return  GetResponseBody.builder()
                .response("Path Variable "+ id + " Get Example").build();
    }

    public GetResponseBody GetBody(GetRequestBody requestBody){
        return  GetResponseBody.builder()
                .response("Request Body "+ requestBody + " Get Example").build();
    }

}
