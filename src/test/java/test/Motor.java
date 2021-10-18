package test;

public class Motor{
	int numeroCilindros;
	String tipo;
	int registro;

	void cambiarRegistro (int registro){
		this.registro = registro;
	}

	void asignarTipo (String tipo){
		switch (tipo){
			case "electrico": this.tipo = tipo;
							  break;
			case "gasolina": this.tipo = tipo;
							 break;
			default: System.out.println("No se cambio el tipo de motor");
					 break;
		}
	}
}