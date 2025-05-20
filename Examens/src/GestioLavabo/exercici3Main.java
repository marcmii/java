package GestioLavabo;

import java.util.ArrayList;
import java.util.Scanner;

public class exercici3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		ArrayList<String> llistaLavabo = new ArrayList<>();
		
		
		int choice;
		
		do {
			menu();
			choice = in.nextInt();
			
			if (choice == 1) {
				CheckList.checkList(llistaLavabo);
			} else if (choice == 2) {
				CheckList.checkLastAlumn(llistaLavabo);
			} else if (choice == 3) {
				counting.countAlumn(llistaLavabo);
			} else if (choice == 4) {
				counting.countTotal(llistaLavabo);
			} else if (choice == 5) {
				Request.request(llistaLavabo);
			}
			
		} while (choice != 6);

		System.out.println("Has sortit del programa");
	
		
		
	}
	
	public static void menu() {
		System.out.println("[1] Consultar llista");
		System.out.println("[2] Consultar últim alumne");
		System.out.println("[3] Recompte ús del lavabo per alumne");
		System.out.println("[4] Recompte ús del lavabo");
		System.out.println("[5] Solicitar anar al lavabo");
		System.out.println("[6] Exit");
		System.out.print("-->");
		
	}
	
	
	

}

