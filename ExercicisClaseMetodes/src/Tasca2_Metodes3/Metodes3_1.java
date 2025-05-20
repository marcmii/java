package Tasca2_Metodes3;

import java.util.Scanner;

public class Metodes3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra un número entre el 5 i el 29: ");
		int num = in.nextInt();
		
		System.out.println("Amb quina lletra vols que pinti l'arbre? ");
		String word = in.nextLine();
		
		drawTree(num, word);
	}
	
	
	public static void drawTree(int number, String letter) {
		
		
		for (int i = 0; i < number; i++) {
			System.out.println(i);
		}
		
		
		
	}

}
