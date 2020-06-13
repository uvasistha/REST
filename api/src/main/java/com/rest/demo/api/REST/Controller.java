package com.rest.demo.api.REST;

import com.rest.demo.api.REST.Model.Request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "/*")
@RequestMapping("/api")
public class Controller {

    @Autowired
    Handler handler;
    @Autowired
    ObjectToJson objectToJson;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public HttpEntity<String> getExample(){
        return new HttpEntity(objectToJson.convert(handler.GetBody()));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, path = "/get/{id}")
    public HttpEntity<String> getExamplePath(@PathVariable String id){
        return new HttpEntity(objectToJson.convert(handler.GetBody(id)));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, path = "/get/body")
    public HttpEntity<String> getExampleBody(@RequestBody GetRequestBody requestBody){
        return new HttpEntity(objectToJson.convert(handler.GetBody(requestBody)));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.POST, path = "/post")
    public HttpEntity<String> postExampleBody(@RequestBody PostRequestBody requestBody){
        return new HttpEntity(objectToJson.convert(handler.PostBody(requestBody)));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT, path = "/put")
    public HttpEntity<String> putExampleBody(@RequestBody PutRequestBody requestBody){
        return new HttpEntity(objectToJson.convert(handler.PutBody(requestBody)));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PATCH, path = "/patch")
    public HttpEntity<String> patchExampleBody(@RequestBody PatchRequestBody requestBody){
        return new HttpEntity(objectToJson.convert(handler.PatchBody(requestBody)));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.DELETE, path = "/delete")
    public HttpEntity<String> deleteExampleBody(@RequestBody DeleteRequestBody requestBody){
        return new HttpEntity(objectToJson.convert(handler.DeleteBody(requestBody)));
    }

}
