package com.giansanz.rest.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.giansanz.rest.model.external.GetRequest;

public class GetHandler implements RequestHandler<GetRequest, String> {

    public String handleRequest(final GetRequest request, final Context context) {
        final LambdaLogger log = context.getLogger();

        log.log(request.toString());

        return "Success";
    }
}