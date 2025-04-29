package Tasca1_Metodes2;

import java.util.Scanner;

public class Metodes2_5 {

	private static final int TABLE = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantes taules de multiplicar vols mostrar?");
		int num = in.nextInt();
		
		for (int i = 1; i <= num; i++) {
			taulesMultiplicar(i);
			System.out.println();
		}
		
	}
	
	
	public static void taulesMultiplicar (int number) {
		
		for (int i = 1; i <= TABLE ; i++) {
			System.out.println( number + "x" + i + "=" + number * i);
		}
		
	}

}
