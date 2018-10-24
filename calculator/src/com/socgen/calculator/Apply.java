package com.socgen.calculator;
/**
 * ceci est la JAVADOC
 */
public class Apply {
    /**
     * ceci est la JAVADOC
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 ceci est un commentaire multiligne
	 */
	Calculator calc = new Calculator(5,6);
	
	double result= calc.divide();
	 double result1=calc.add();
	 double result2= calc.multiply();
	 double result3= calc.substract();
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3); 
	System.out.println("le premier resultat est de: " + result + "\n" + "le seconbd est de: " + result2 + "\n" + "et le troisième est de: " + result3 );

    }

}
