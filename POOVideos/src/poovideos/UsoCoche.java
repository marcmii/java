package poovideos;

import java.util.Scanner;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Coche seat = new Coche();
		
		System.out.println(seat.dimeDatos());
		
		System.out.print("Introduce el color del coche: ");
	    String color = scanner.nextLine();
	    seat.estableceColor(color);
	     
	    System.out.println("Quieres asientos de cuero?");
	    String seats = scanner.nextLine();
	    seat.configuraAsientos(seats);
	    
	    System.out.println("Quieres climatizador? si/no ");
	    String climate = scanner.nextLine();
	    seat.configuraClimatizador(climate);
	    
		System.out.println(seat.dimeAsientos()); 
	    System.out.println(seat.dime_color());
		System.out.println(seat.dimeClimatizador());
		System.out.println(seat.dimePesoCoche());
		
		System.out.println("El precio final del coche es: " + seat.precioCoche());
	}

}
