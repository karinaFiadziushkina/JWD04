package com.company.operation;

public class SquareRoot implements Operation {

    @Override
    public Integer executeOperation(Integer first, Integer second) throws Exception {
        return (int) Math.sqrt(first);
    }

}
