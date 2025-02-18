package unidad6.Práctica1;

public class Ejercicio8 {
	public static void main(String[] args) {
		String palabra = null;
		if (palabra != null) {
			int longitud = palabra.length();
			System.out.println("Longitud de la palabra: " + longitud);
		} else {
			System.out.println("La palabra es null, no se puede calcular su longitud.");
		}
	}
}
