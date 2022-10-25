package com.ing.java.dev.school.solid.open_closed.bad;

import java.security.InvalidParameterException;

public class SimpleCalculator implements ICalculator{
    @Override
    public void calculate(IOperation operation)
    {
        if(operation == null) {
            throw new InvalidParameterException("Some message");
        }

        if(operation instanceof Addition) {
            Addition obj = (Addition) operation;
            obj.setResult(obj.getFirstOperand() + obj.getSecondOperand());
        } else if(operation instanceof Substraction) {
            Addition obj = (Addition) operation;
            obj.setResult(obj.getFirstOperand() - obj.getSecondOperand());
        }
    }
}
interface ICalculator {
    void calculate(IOperation operation);
}
interface IOperation {}

class Addition implements IOperation {
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Addition(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    public double getFirstOperand() {
        return firstOperand;
    }
    public double getSecondOperand() {
        return secondOperand;
    }
    public void setResult(double result) {
        this.result = result;
    }
}

class Substraction implements IOperation {
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Substraction(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}
