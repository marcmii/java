package poovideos;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		largo = 3000;
		ancho = 200;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	public String dimeDatos() { //GETTER
		
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas"
				+ ". mide" + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de la plataforma de " + pesoPlataforma + " kg";
		
	}
	
	public void estableceColor(String colorCoche) { //SETTER
		
		color=colorCoche;
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) { //SETTER
		
		if (asientosCuero == "si") {
			this.asientosCuero= true;
		} else {
			this.asientosCuero= false;
		}
		
	}
	
	public String dimeAsientos() { //GETTER
		
		if (asientosCuero==true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	
	public void configuraClimatizador(String climatizador) { //SETTER
		
		if(climatizador == "si") {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
		
	}
	
	public String dimeClimatizador() { //GETTER
		if (climatizador==true) {
			return "El coche tiene climatizador" ;
		} else {
			return "El coche no tiene climatizador" ;
		}
	}
	
	public String dimePesoCoche() { //SETTER + GETTER
		
		int pesoCarroceria = 500;
		
		pesoTotal = pesoPlataforma+pesoCarroceria;
		
		if (asientosCuero = true) {
			
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador=true) {
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso del coche es " + pesoTotal;
		
	}
	
	
	public int precioCoche() { //GETTER
		
		int precioFinal = 10000;
		
		if (asientosCuero=true) {
			precioFinal+= 2000;
		}
		if (climatizador=true) {
			precioFinal+= 1500;
		}
		
		return precioFinal;
	}
	
	
	
	
	
	
}
