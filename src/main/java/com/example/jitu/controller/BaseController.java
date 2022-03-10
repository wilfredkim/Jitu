package com.example.jitu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

public class BaseController {

    protected ResponseEntity sendResponse(boolean status, String message) {
        if(!StringUtils.isEmpty(message))
            message= message.replaceAll("\\s{2,}"," ");

        final String res = ("{\"success\" : " + status + ", \"msg\" : \"" + message + "\"}");
        return new ResponseEntity(res, HttpStatus.OK);
    }
}
