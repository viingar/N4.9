package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scan.nextDouble();
        System.out.println("Введите число b: ");
        double b = scan.nextDouble();

        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a,b);

        calculator = new Calculator(new Subtractor());
        calculator.calc(a,b);

        calculator = new Calculator(new Mupltiplier());
        calculator.calc(a,b);

        calculator = new Calculator(new Divider());
        if (b > 0) {
            calculator.calc(a,b);
        } else System.out.print("Невозможно разделить на 0");
    }
}