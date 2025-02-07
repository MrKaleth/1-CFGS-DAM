package ejercicio.Animales;

public class GestionaAnimales2 {
	public static void main(String[] args) {
		Animal perro = new Animal();
		perro.tipo = "Perro";
		perro.nombre = "Perrete";
		/*perro.edad = 21;*/ //Esto no funciona porque esta en private en la clase de origen.
		
		boolean anda = perro.caminar();
		System.out.println(anda);
		
		perro.darComer();
	}
}
