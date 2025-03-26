package miembros.Controlador;

import miembros.Modelo.*;

public class GestionaMiembros {
	public static void main(String[] args) {

		MiembroBase[] tablaAmigosP = new MiembroBase[3];

		MiembroBase[] tablaAmigos = new MiembroBase[2];

		MiembroEstandar e1 = new MiembroEstandar(0, "aa@aa", "aa", tablaAmigos);
		MiembroEstandar e2 = new MiembroEstandar(1, "bb@bb", "bb", tablaAmigos);

		System.out.println(e1);
		System.out.println(e2);

		System.out.println();

		MiembroPremium p1 = new MiembroPremium(0, "cc@cc", "cc", tablaAmigosP, TipoPremium.PREMIUM);
		MiembroPremium p2 = new MiembroPremium(0, "dd@dd", "dd", tablaAmigosP, TipoPremium.PREMIUM_VIP);
		
		System.out.println(p1);
		System.out.println(p2);
		
		try {
			e1.addAmigo(p2, tablaAmigos);
		} catch (GuzmanitosException e) {
			e.getMessage();
		}
		
		System.out.println(e1.esAmigo(p2, tablaAmigosP));
	}
}
