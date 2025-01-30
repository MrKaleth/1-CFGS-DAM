package cadenas;

import java.util.Scanner;

public class RepasoCadenas {

	public static void main(String[] args) {
		RepasoCadenas r = new RepasoCadenas();

		String[] palabras = r.cargaTabla();

		System.out.println("Las palabras en la frase son:");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}

	String[] cargaTabla() {
		Scanner input = new Scanner(System.in);

		System.out.print("Introduce una frase: ");
		String frase = input.nextLine();

		String[] palabras = frase.split(" ");

		input.close();

		return palabras;
	}

	/*
	 * String[] imprimeTabla() { String[] elemento; return elemento; }
	 */

	Boolean isCadenaEsNumero(String palabra) {
		boolean es = false;
		for (int i = 0; i < palabra.length(); i++) {
			Character c = palabra.charAt(i);// Devuelve el caracter en la posición i
			Character.isDigit(c);
		}
		return es;
	}

	Boolean isMinuscula(String Palabra) {
		boolean esMin = true;

		return esMin;
	}

	String[] convierteTabla(String[] palabras) {
		String[] convertidas = new String[palabras.length];

		return convertidas;
	}

	String realizaConversion(String Palabra) {
		String palabraConvertida = "";

		return palabraConvertida;
	}

	/*
	 * boolean comparaTablas(int[] tabla1, int[] tabla2) { boolean iguales = true;
	 * if (tabla1.length != tabla2.length) { iguales = false; } else { for (int i =
	 * 0; i < tabla1.length; i++) { if(tabla1.charAt() tabla2.charAt()) {
	 * 
	 * } } } return iguales; }
	 */
	
	String[] modificaPalabrasMinusculas(String[] palabras) {
		String[] palabrasModificadas = new String[palabras.length];

		for (int i = 0; i < palabras.length; i++) {
			String palabra = palabras[i];
			if (palabra != null && !palabra.isEmpty()) {
				char primerCaracter = Character.toUpperCase(palabra.charAt(0));
				int longitud = palabra.length();
				String nuevaPalabra = primerCaracter + palabra.substring(1, longitud - 1) + longitud;
				nuevaPalabra = nuevaPalabra.replace('o', '0').replace('O', '0');
				palabrasModificadas[i] = nuevaPalabra;
			} else {
				palabrasModificadas[i] = palabra;
			}
		}

		return palabrasModificadas;
	}
}
