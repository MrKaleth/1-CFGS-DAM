package ejercicio.Animales;

public class Animal {
	String tipo;
	public String nombre;
	/*private int edad;*/

	boolean caminar() {
		return true;
	}
	
	private void comer() {
		System.out.println("Estoy comiendo");
	}
	
	public void darComer() {
		if(tipo.equals("Perro")) {
			comer();
		}
	}
}