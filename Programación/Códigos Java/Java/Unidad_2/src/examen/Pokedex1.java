/*
Darío Bonilla Perea. Pokedex 
  
FUNCIONES:
 - imprimeMenu(){
 	scanner
 	salir = false
 	while salir = false {
 	opciones
 	
 	switch(opción elegida)
 	
 	return opción
 	}
 	
  
  
*/
package examen;

import java.util.Random;
import java.util.Scanner;

public class Pokedex1 {
	public static void main(String[] args) {
		Pokedex1 r = new Pokedex1();

		r.pintaMenu();
	}

	String pintaMenu() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		String[] PokemonCapturados = new String[15];
		int[] NivelPokemonCapturados = new int[15];
		Pokedex1 r = new Pokedex1();
		String opcion = "";
		boolean Retirarse = false;

		while (!Retirarse) {
			System.out.println("1. Capturar Pokémon.");
			System.out.println("2. Realizar Batalla Pokémon.");
			System.out.println("3. Mostrar Pokedex.");
			System.out.println("4. Finalizar.");
			System.out.print("Selecciona una opción: ");

			opcion = input.nextLine();

			switch (opcion) {
			case "1":

				String Nombre = r.CapturaPokemonNombre();
				int Nivel = r.CapturaPokemonNivel();
				for (int i = 0; i < PokemonCapturados.length; i++) {
					if (PokemonCapturados[i] != "") {
						PokemonCapturados[i] = Nombre;
					}
				}

				for (int i = 0; i < NivelPokemonCapturados.length; i++) {
					if (NivelPokemonCapturados[i] == 0) {
						NivelPokemonCapturados[i] = Nivel;
					}
				}
				System.out.println(PokemonCapturados[0]);
				System.out.println(NivelPokemonCapturados[0]);
				break;

			case "2":
				System.out.println("Escoge uno de tus pokemon: ");
				int posicion = input.nextInt();
				Nombre = PokemonCapturados[posicion];
				Nivel = NivelPokemonCapturados[posicion];
				
				int PosiciónAzar = random.nextInt(15);

				String NombreAzar = PokemonCapturados[PosiciónAzar];
				int NiveAzar = NivelPokemonCapturados[PosiciónAzar];
				
				r.realizaBatalla(Nombre, Nivel, NombreAzar, Nivel);
				break;

			case "3":
				System.out.println("Mostrando Pokedex");
				for(int i=0; i<PokemonCapturados.length; i++) {
					System.out.println(i+"." + PokemonCapturados[i] + NivelPokemonCapturados[i]);
				}
				break;

			case "4":
				Retirarse = true;
				System.out.println("Finalizando");
				break;

			default:
				System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
				break;
			}
		}
		input.close();
		return opcion;
	}

	String CapturaPokemonNombre() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Enhorabuena, has encontrado un pokémon en la hierba alta.");
		System.out.println("Registra el nombre de tu Pokémon: ");
		String Nombre = input.next();
		return Nombre;
	}

	int CapturaPokemonNivel() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Enhorabuena, has encontrado un pokémon en la hierba alta.");
		System.out.println("Registra el nivel de tu Pokémon: ");
		int nivel = input.nextInt();

		return nivel;
	}
	
	String realizaBatalla(String Nombre, int Nivel, String NombreAzar, int NivelAzar) {
		String Estado = "";
		if(Nivel < NivelAzar) {
			Estado = "Derrota";
		}
		else if (Nivel == NivelAzar) {
			Estado = "Empate";
		}
		else {
			Estado = "Victoria";
		}
		
		String mensaje = "Tu pokémon" + Nombre + "-" + Nivel + "Se enfrentó a" + NombreAzar + "-" + NivelAzar + ". Resultado: " + Estado;
		return mensaje;
	}

}
