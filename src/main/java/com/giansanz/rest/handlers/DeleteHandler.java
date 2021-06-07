package com.giansanz.rest.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.giansanz.rest.model.external.DeleteRequest;

public class DeleteHandler implements RequestHandler<DeleteRequest, String> {

    public String handleRequest(final DeleteRequest request, final Context context) {
        final LambdaLogger log = context.getLogger();

        log.log(request.toString());

        return "Success";
    }
}