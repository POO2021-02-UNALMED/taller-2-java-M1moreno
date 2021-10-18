package test;

public class Auto{
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos(){
		return asientos.length;
	}

	String verificarIntegridad(){
		boolean integro = true;
		for (int i = 0; i < asientos.length; i++){
			if (asientos[i].registro != this.registro){
				integro = false;
			}
		}
		
		if (motor.registro != this.registro){
			integro = false;
		}

		if (integro){
			return "Auto original";
		}else{
			return "Las piezas no son originales";
		}

	}
}