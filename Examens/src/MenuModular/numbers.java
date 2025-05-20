package MenuModular;

import java.util.Scanner;

public class numbers {

	public static void sumTwoNumbers() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra el primer num");
		int numberOne = in.nextInt();
		
		System.out.println("Entra el segon num");
		int numberTwo = in.nextInt();
		
		int sum = numberOne+numberTwo;
		
		System.out.println();
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
		System.out.println();
		
	}
	
	public static void sumNumbersUntil() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra un numero");
		int number = in.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i <= number; i++) {
			sum+= i;
			

			
			System.out.print(sum);
		}
		
	}
	
}
