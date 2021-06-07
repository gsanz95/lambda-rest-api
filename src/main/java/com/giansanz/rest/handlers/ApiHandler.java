package com.giansanz.rest.handlers;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.RequestHandler;

public interface ApiHandler extends RequestHandler<Map<String,String>, String> {
    
}