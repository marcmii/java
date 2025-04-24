package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		int countNames = 0;
		
		do {
			System.out.println("Entra el " + (countNames+1) + " nom: ");
			String name = in.nextLine();
		
			list.add(name);
			
			countNames++;
		} while (countNames < 3);
			
		
		System.out.println(list);
		System.out.println(list.size());	
		
	}

}
