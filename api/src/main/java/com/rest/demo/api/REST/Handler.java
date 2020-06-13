package com.rest.demo.api.REST;

import com.rest.demo.api.REST.Model.Request.*;
import com.rest.demo.api.REST.Model.Response.*;
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

    public PostResponseBody PostBody(PostRequestBody requestBody){
        return  PostResponseBody.builder()
                .response("Request Body "+ requestBody + " Post Example").build();
    }

    public PutResponseBody PutBody(PutRequestBody requestBody){
        return  PutResponseBody.builder()
                .response("Request Body "+ requestBody + " Put Example").build();
    }

    public PatchResponseBody PatchBody(PatchRequestBody requestBody){
        return  PatchResponseBody.builder()
                .response("Request Body "+ requestBody + " Patch Example").build();
    }

    public DeleteResponseBody DeleteBody(DeleteRequestBody requestBody){
        return  DeleteResponseBody.builder()
                .response("Request Body "+ requestBody + " Delete Example").build();
    }
}
