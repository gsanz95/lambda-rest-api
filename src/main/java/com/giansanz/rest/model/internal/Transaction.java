package com.giansanz.rest.model.internal;

public class Transaction {
    public String itemId;
    public String amount;
    public String actor;

    @Override
    public String toString() {
        return new StringBuilder()
            .append("{\n")
            .append(String.format("\"itemId\" : %s,\n", itemId))
            .append(String.format("\"amount\" : %s,\n", amount))
            .append(String.format("\"actor\" : %s\n", actor))
            .append("}")
            .toString();
    }
}
