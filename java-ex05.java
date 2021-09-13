/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the first number?");
        int inputFirst = myObj.nextInt();

        System.out.println("What is the second number?");
        int inputSecond = myObj.nextInt();

        int sum = inputFirst + inputSecond;
        int diff = inputFirst - inputSecond;
        int product = inputFirst * inputSecond;
        int quotient = inputFirst / inputSecond;

        System.out.println(inputFirst + " + " + inputSecond + " = " + sum);
        System.out.println(inputFirst + " - " + inputSecond + " = " + diff);
        System.out.println(inputFirst + " * " + inputSecond + " = " + product);
        System.out.println(inputFirst + " / " + inputSecond + " = " + quotient);

        myObj.close();
    }
}