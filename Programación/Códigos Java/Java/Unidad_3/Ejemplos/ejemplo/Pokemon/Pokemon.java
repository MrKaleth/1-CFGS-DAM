package ejemplo.Pokemon;

public class Pokemon {
	String nombre;
	int nivel;
	String tipo;

	String convierteEnCadena() {
		String cadena = "Pokémon 1: " + nombre + " " + nivel + ". Tipo: " + tipo;
		return cadena;

	}
	
	boolean luchar(Pokemon p2) {
		boolean gana = false;
		if(nivel > p2.nivel) {
			gana = true;
			nivel = nivel+1;
		}
		else {
			gana = false;
			p2.nivel = p2.nivel+1;
		}
		return gana;
	}
}
