package test;

public class Asiento {
	String color;
	int precio;
	int registro;

	void cambiarColor(String color){
		switch (color){
			case "rojo": this.color = color;
						 break;
			case "verde": this.color = color;
						  break;
			case "amarillo": this.color = color;
							 break;
			case "negro": this.color = color;
						  break;
			case "blanco": this.color = color;
				           break;
			default: System.out.println("No se ha cambiado el color");
				  	 break;
		}
	}
}