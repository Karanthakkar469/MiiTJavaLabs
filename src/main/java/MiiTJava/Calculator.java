
/*
package MiiTJava;

import java.util.Scanner;;

class Cal {

	int num1, num2, result1,result2,result3,result4, i = 0;

	public void process() {

		while (i == 0) {

			Scanner Obj1 = new Scanner(System.in);

			System.out.print("Which operation do you want to perform +,-,*,/ :");
			char Operator = Obj1.next().charAt(0);
			System.out.print("First Number : ");
			num1 = Obj1.nextInt();
			System.out.print("Second Number : ");
			num2 = Obj1.nextInt();
			switch (Operator) {
			case '+': {
				
				result1 = num1 + num2;
				System.out.println("Result is : " + result1);
				break;
			}
			case '-': {
				result2 = num1 - num2;
				System.out.println("Result is : " + result2);
				break;
			}
			case '*': {
				result3 = num1 * num2;
				System.out.println("Result is : " + result3);
				break;
			}
			case '/': {
				result4 = num1 / num2;
				System.out.println("Result is : " + result4);
				break;
			}

			}
			//System.out.println(result);
			System.out.println("DO you want to perfrom other operation(y/n) : ");
			char Op2 = Obj1.next().charAt(0);
			if (Op2 == 'y') {
				i = 0;
			} else {
				System.out.println("Bye");
				break;
			}
		}

	}
}

public class Calculator {

	public static void main(String[] args) {
		Cal C1 = new Cal();
		C1.process();
	}

}
*/