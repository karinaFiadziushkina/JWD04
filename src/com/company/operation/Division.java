package com.company.operation;

public class Division implements Operation {

    @Override
    public Integer executeOperation(Integer first, Integer second) {
        return first / second;
    }
}
