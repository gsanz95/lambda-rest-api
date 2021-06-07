package com.giansanz.rest.model.external;

import com.giansanz.rest.model.internal.Transaction;

public class LambdaRequest {
    public Transaction transaction;

    @Override
    public String toString() {
        return new StringBuilder()
            .append("{\n")
            .append(String.format("\"transaction\" : %s\n", transaction))
            .append("}")
            .toString();
    }
}
