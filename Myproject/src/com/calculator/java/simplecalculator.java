package com.calculator.java;

import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		int num1,num2;
		// for taking input from user we have to create
		// scanner object
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1 = in.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		num2 = in.nextInt();
		
		System.out.println("sum = "+(num1+num2));
		System.out.println("subtract = "+(num1-num2));
		System.out.println("multiply = "+(num1*num2));
		System.out.println("divide = "+(num1/num2));
		System.out.println("percentage = "+((num1/num2)*100));
		System.out.println("Math.sqrt(" + num1 +")=" + Math.sqrt(num1) );
	}

}


