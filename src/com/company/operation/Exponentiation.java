package com.company.operation;


public class Exponentiation implements Operation {

    @Override
    public Integer executeOperation(Integer first, Integer second) throws Exception {
        return (int) Math.pow(first, second);
    }
}
