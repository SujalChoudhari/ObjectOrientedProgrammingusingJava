package com.sujalchoudhari;

import java.util.Scanner;

@SuppressWarnings("serial")
class CannotDivideBy8Exception extends Exception {
	@Override
	public String toString() {
		return "You are not allowed to Divide by 8";
	}
}

@SuppressWarnings("serial")
class MaxInputException extends Exception {
	@Override
	public String toString() {
		return "You are not allowed to Enter numbers greater than 100_000";
	}
}

@SuppressWarnings("serial")
class MaxMultiplierReachException extends Exception {
	@Override
	public String toString() {
		return "You are not allowed to Multiply numbers greater than 7_000";
	}
}

@SuppressWarnings("serial")
class InvalidInputException extends Exception {
	@Override
	public String toString() {
		return "This is a wrong Input";
	}
}

class MoodyCalculator {

	private static void m_CheckConditions(int a, int b) throws MaxInputException, CannotDivideBy8Exception {
		if( a >= 100_000 || b >= 100_000) {
			throw new MaxInputException();
		}
		else if(b==8) {
			throw new CannotDivideBy8Exception();
		}
	}
	private static void m_CheckConditions(int a, int b,boolean _a) throws MaxMultiplierReachException {
		if(a >= 7_000 || b >= 7_000) {
			throw new MaxMultiplierReachException();
		}
	}

	static int add(int a, int b) throws MaxInputException, CannotDivideBy8Exception {
		m_CheckConditions(a,b);
		return a + b;
	}

	static int sub(int a, int b) throws MaxInputException, CannotDivideBy8Exception {
		m_CheckConditions(a,b);
		return a - b;
	}

	static int mul(int a, int b) throws MaxMultiplierReachException {
		m_CheckConditions(a,b,true);
		return a * b;
	}

	static int div(int a, int b) throws MaxInputException, CannotDivideBy8Exception {
		m_CheckConditions(a,b);
		return a / b;
	}

}

public class EX_08_Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidInputException {
		System.out.print("Moody Calculator!!\n>>> ");
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		char operator = sc.next().charAt(0);
		int two = sc.nextInt();
		
		try {
		System.out.println(one + " " + operator + " " + two);
		switch (operator) {
		case '+':
			System.out.println(MoodyCalculator.add(one, two));
			break;
		case '-':
			System.out.println(MoodyCalculator.sub(one, two));
			break;
		case '*':
			System.out.println(MoodyCalculator.mul(one, two));
			break;
		case '/':
			System.out.println(MoodyCalculator.div(one, two));
			break;
		default:
			throw new InvalidInputException();
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
