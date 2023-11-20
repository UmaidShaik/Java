package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int firstNumber=Integer.parseInt(args[0]);
			int secNumber=Integer.parseInt(args[1]);
			int div=firstNumber/secNumber;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("Number cannot be divided");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("number is not access");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid conversion");
		}
		finally {
			System.out.println("inside finally");
		}
		

	}

}
