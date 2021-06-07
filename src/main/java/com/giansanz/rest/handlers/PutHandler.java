package com.giansanz.rest.handlers;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.giansanz.rest.model.external.PutRequest;

public class PutHandler implements RequestHandler<APIGatewayProxyRequestEvent, String> {

    private ObjectMapper mapper;

    public PutHandler() {
        this.mapper = new ObjectMapper();
    }

    public String handleRequest(final APIGatewayProxyRequestEvent event, final Context context) {
        final LambdaLogger logger = context.getLogger();
        
        try {
            final PutRequest request = mapper.readValue(event.getBody(), PutRequest.class);
            logger.log(request.toString());
        } catch (final IOException e) {
            logger.log(String.format("Error encountered during parsing: %s", e.getMessage()));
        }

        return "Success";
    }
}