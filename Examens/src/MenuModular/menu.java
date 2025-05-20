package MenuModular;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int choice;
		
		do {
			menuModular();
			choice = in.nextInt();
			
			if (choice == 1) {
				helloWorld();
			} else if (choice == 2) {
				numbers.sumTwoNumbers();
			} else if (choice == 3) {
				numbers.sumNumbersUntil();
			}
			
		} while (choice != 6);
		
		System.out.println("Has sortit del programa");
	}

	
	public static void menuModular() {
		System.out.println("[1] Print 'Hello World'");
		System.out.println("[2] Sum two numbers");
		System.out.println("[3] Sum numbers until n");
		System.out.println("[4] Count words");
		System.out.println("[5] Reverse sentence");
		System.out.println("[6] Exit");
		System.out.print("--> ");
	}
	
	public static void helloWorld() {
		System.out.println();
		System.out.println("Hello World!");
		System.out.println();
		
	}
}
