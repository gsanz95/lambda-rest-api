package com.giansanz.rest.handlers;

import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PutHandler implements RequestHandler<PutRequest, String> {

    public String handleRequest(final PutRequest request, final Context context) {
        final LambdaLogger log = context.getLogger();

        log.log(request.toString());

        return "Success";
    }
}