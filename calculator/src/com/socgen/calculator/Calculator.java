package com.socgen.calculator;

public class Calculator {


    private double a; 
    private double b;
    
    public Calculator (double a, double b) {
	this.a = a;
	this.b = b;
	
    }
       
    public double add() {
	return a + b;
    }
    
    public double substract() {
	return a - b;
    }
    
    public double multiply() {
	return a * b;
    }
    
    public double divide() {
	return a / b;
    }
   
}
