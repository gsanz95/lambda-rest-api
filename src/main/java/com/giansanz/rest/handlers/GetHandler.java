package com.giansanz.rest.handlers;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetHandler implements ApiHandler {

    public String handleRequest(final Map<String, String> request, final Context context) {
        final LambdaLogger log = context.getLogger();

        log.log(request.toString());

        return "Success";
    }
}