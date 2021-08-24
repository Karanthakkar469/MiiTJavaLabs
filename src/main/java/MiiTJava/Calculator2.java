package MiiTJava;

import java.util.Scanner;

class cal2 {

	Scanner Sc1 = new Scanner(System.in);
	int num1, num2, result, i = 0;

	public int add() {
		result = num1 + num2;
		return result;
	}

	public int sub() {
		result = num1 - num2;
		return result;
	}

	public int mul() {
		result = num1 * num2;
		return result;
	}

	public int div() {
		result = num1 / num2;
		return result;

	}

	public void ASMD() {
		while (i == 0) {
			System.out.print("Which Operation do you want to perform +,-,*,/: ");
			char operator = Sc1.next().charAt(0);
			System.out.print("Enter the first number :");
			num1 = Sc1.nextInt();
			System.out.print("Enter the second number :");
			num2 = Sc1.nextInt();

			switch (operator) {
			case '+': {
				add();
				System.out.println("Your result is :" + result);
				break;
			}
			case '-': {
				sub();
				System.out.println("Your result is :" + result);
				break;
			}
			case '*': {
				mul();
				System.out.println("Your result is :" + result);
				break;
			}
			case '/': {
				div();
				System.out.println("Your result is :" + result);
				break;
			}
			}
			System.out.println("Do you want to perform any extra operation (y/n) :");
			char op2 = Sc1.next().charAt(0);
			if (op2 == 'y') {
				i = 0;
			} else {
				System.out.println("Bye");
				break;
			}

		}

	}

	private void Add() {
		// TODO Auto-generated method stub

	}
}

public class Calculator2 {

	public static void main(String args[]) {
		cal2 c1 = new cal2();
		c1.ASMD();

	}
}