package transportes.Controlador;

import transportes.Modelo.*;

public class GestionaRutas {
	public static void main(String[] args) {

		Ciudad c1 = new Ciudad("c1", 5000);
		Ciudad c2 = new Ciudad("c2", 7000);
		Ciudad c3 = new Ciudad("c3", 10000);
		Ciudad c4 = new Ciudad("c4", 9000);
		Ciudad c5 = new Ciudad("c5", 200000);
		Ciudad c6 = new Ciudad("c5", 50000);

		RutaTerrestre rt = new RutaTerrestre(1, c1, c4, 200, true);
		RutaAerea a1 = new RutaAerea(4, c1, c6, 200, TipoVuelo.LOW_COST);
		RutaAerea a2 = new RutaAerea(2, c2, c3, 200, TipoVuelo.NORMAL);
		RutaAerea a3 = new RutaAerea(3, c3, c5, 200, TipoVuelo.EXPRESS);

		System.out.println(rt.getCoste());
		System.out.println(rt.getTipoRuta());
		System.out.println(a1.getCoste());
		System.out.println(a1.getTipoRuta());
		System.out.println(a2.getCoste());
		System.out.println(a2.getTipoRuta());
		System.out.println(a3.getCoste());
		System.out.println(a3.getTipoRuta());

		RutaBase[] tablaRutas = new RutaBase[50];
		tablaRutas[0] = rt;
		tablaRutas[1] = a1;
		tablaRutas[2] = a2;
		tablaRutas[3] = a3;

		for (int i = 0; i < tablaRutas.length; i++) {
			if (tablaRutas != null) {
				System.out.println(tablaRutas[i]);
			}
		}
	}
}
