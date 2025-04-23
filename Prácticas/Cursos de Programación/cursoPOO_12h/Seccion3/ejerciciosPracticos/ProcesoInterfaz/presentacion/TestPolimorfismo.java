package ejerciciosPracticos.ProcesoInterfaz.presentacion;

import ejerciciosPracticos.ProcesoInterfaz.auxiliar.IProceso;
import ejerciciosPracticos.ProcesoInterfaz.logica.Circulo;
import ejerciciosPracticos.ProcesoInterfaz.logica.Figura;
import ejerciciosPracticos.ProcesoInterfaz.logica.Triangulo;
import ejerciciosPracticos.ProcesoInterfaz.varios.Mesa;

public class TestPolimorfismo {
	public static void main(String[] args) {
		mostrarDatosFigura(new Triangulo("Amarillo", 4, 8));
		mostrarDatosFigura(new Circulo("azul", 3));
		
		System.out.println();
		
		operarObjeto(new Circulo("azul", 3));
		operarObjeto(new Mesa(2, 9));
	}

	static void mostrarDatosFigura(Figura f) {
		System.out.println("Color: " + f.getColor());
		System.out.println("Superficie: " + f.superficie());
	}
	
	static void operarObjeto(IProceso pr) {
		pr.aumentar(9);
		pr.imprimir();
	}
}
