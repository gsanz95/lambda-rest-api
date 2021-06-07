package com.giansanz.rest.handlers;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.giansanz.rest.model.external.GetRequest;

public class GetHandler implements RequestHandler<APIGatewayProxyRequestEvent, String> {

    private ObjectMapper mapper;

    public GetHandler() {
        this.mapper = new ObjectMapper();
    }

    public String handleRequest(final APIGatewayProxyRequestEvent event, final Context context) {
        final LambdaLogger logger = context.getLogger();

        try {
            final GetRequest request = mapper.readValue(event.getBody(), GetRequest.class);
            logger.log(request.toString());
        } catch (final IOException e) {
            logger.log(String.format("Error encountered during parsing: %s", e.getMessage()));
        }

        return "Success";
    }
}