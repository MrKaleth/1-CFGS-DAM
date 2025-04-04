package ejemplo.Pokemon;

public class GestionaPokemon {
	public static void main(String[] args) {
		Pokemon Pikachu = new Pokemon();
		Pikachu.nombre = "Pikachu";
		Pikachu.nivel = 15;
		Pikachu.tipo = "Eléctrico";

		Pokemon Mewtwo = new Pokemon();
		Mewtwo.nombre = "Mewtwo";
		Mewtwo.nivel = 99;
		Mewtwo.tipo = "Psíquico";

		Pikachu.nivel = Pikachu.nivel +2;
		System.out.println("Pokémon 1: " + Pikachu.nombre + " " + Pikachu.nivel + ". Tipo: " + Pikachu.tipo);
		System.out.println("Pokémon 2: " + Mewtwo.nombre + " " + Mewtwo.nivel + ". Tipo: " + Mewtwo.tipo);

		boolean gana = Pikachu.luchar(Mewtwo);
		System.out.println(gana);
		
		String cadenaPikachu = Pikachu.convierteEnCadena();
		String cadenaMewtwo = Mewtwo.convierteEnCadena();
		
		System.out.println(cadenaMewtwo);
		System.out.println(cadenaPikachu);
	}
}
