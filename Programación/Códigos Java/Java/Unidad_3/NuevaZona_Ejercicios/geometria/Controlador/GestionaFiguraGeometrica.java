package geometria.Controlador;

import geometria.Modelo.*;

public class GestionaFiguraGeometrica {
	public static void main(String[] args) {
		Figura t = new Triangulo("Azul", 15, 25);
		Figura c = new Circulo("Verde", 8);
		
		System.out.println(t.calcularArea());
		System.out.println(c.calcularArea());
	}
}
