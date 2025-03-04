package animales.Controlador;

import animales.Modelo.*;

public class GestionaAnimales {

	public static void main(String[] args) {

		Animal p = new Perro();
		Animal g = new Gato();
		Animal pez = new Pez();
		
		
		System.out.println(p.getAlimento());
		System.out.println(p.getsonidoQueEmite());
		
		System.out.println(g.getAlimento());
		System.out.println(g.getsonidoQueEmite());
		
		System.out.println(pez.getAlimento());
		System.out.println(pez.getsonidoQueEmite());
	}

}
