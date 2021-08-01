package com.company.operation;

public class OperationFactory {

    public static Operation getOperation(int i) {
        Operation result = null;
        switch (i) {
            case 1:
                result = new Addition();
                break;
            case 2:
                result = new Subtraction();
                break;
            case 3:
                result = new Multiplication();
                break;
            case 4:
                result = new Division();
                break;
            case 5:
                result = new Exponentiation();
                break;
            case 6:
                result = new SquareRoot();
                break;
            default:
                System.out.println("Enter right number!");
        }
        return result;
    }
}
