package org.example;

public class Adder implements Operation{
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
