package com.company;

import com.company.operation.*;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.start();

    }

    public void start() {

        String input;
        Scanner scanner = new Scanner(System.in);
        String firstNumber;
        String secondNumber;
        Integer result;
        int i = 0;
        for (; ; ) {
            showMenu();
            input = scanner.nextLine();
            if (isString(input)) {
                continue;
            }
            i = Integer.parseInt(input);
            if (i == 0) {
                break;
            }
            Operation operation = OperationFactory.getOperation(i);
            if (operation == null) {
                continue;
            }
            System.out.println("Enter first number");
            firstNumber = scanner.nextLine();
            if (isString(firstNumber)) {
                continue;
            }
            System.out.println("Enter second number");
            secondNumber = scanner.nextLine();
            if (isString(secondNumber)) {
                continue;
            }
            try {
                result = operation.executeOperation(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
            } catch (Exception e) {
                System.out.println("Incorrect number!");
                continue;
            }
            System.out.println(result);

        }
    }

    public boolean isString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            System.out.println("Enter right number!");
            return true;
        }
        return false;
    }

    public void showMenu() {
        System.out.println("-------Calculator-------");
        System.out.println("Choose operation by number");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("5 - exponentiation");
        System.out.println("6 - square root");
        System.out.println("0 - close calculator");
    }
}

