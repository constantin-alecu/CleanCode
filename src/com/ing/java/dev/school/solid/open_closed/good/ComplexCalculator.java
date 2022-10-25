package com.ing.java.dev.school.solid.open_closed.good;

import java.security.InvalidParameterException;

public class ComplexCalculator implements ICalculator{
    @Override
    public void calculate(IOperation operation)
    {
        if(operation == null) {
            throw new InvalidParameterException("Some message");
        }
        operation.performOperation();
    }
}

interface IOperation {
    void performOperation();
}
class Addition implements IOperation
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Addition(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    @Override
    public void performOperation() {
        result = firstOperand + secondOperand;
    }
}
class Substraction implements IOperation
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Substraction(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    @Override
    public void performOperation() {
        result = firstOperand - secondOperand;
    }
}
class Multiplication implements IOperation
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Multiplication(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    @Override
    public void performOperation() {
        result = firstOperand * secondOperand;
    }
}
interface ICalculator {
    void calculate(IOperation operation);
}