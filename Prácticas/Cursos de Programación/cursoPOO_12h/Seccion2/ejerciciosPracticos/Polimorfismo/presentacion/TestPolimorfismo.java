package ejerciciosPracticos.Polimorfismo.presentacion;

import ejerciciosPracticos.Polimorfismo.logica.Circulo;
import ejerciciosPracticos.Polimorfismo.logica.Figura;
import ejerciciosPracticos.Polimorfismo.logica.Triangulo;

public class TestPolimorfismo {
	public static void main(String[] args) {
		mostrarDatosFigura(new Triangulo("Amarillo", 4, 8));
		mostrarDatosFigura(new Circulo("azul", 3));
	}

	private static void mostrarDatosFigura(Figura f) {
		System.out.println("Color: " + f.getColor());
		System.out.println("Superficie: " + f.superficie());
	}
}
