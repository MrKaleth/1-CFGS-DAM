package ejemplo.PublicPrivate;

import ejercicio.Animales.Animal;

public class GestionaAnimales {
	public static void main(String[] args) {
		Animal perro = new Animal();
		// perro.tipo = "Perro"; //No funciona porque no es public.
		perro.nombre = "Perrete";
		// perro.edad = 21; //Tampoco funciona porque es private.
		System.out.println(perro.nombre);
		
		perro.darComer();
	}
}
