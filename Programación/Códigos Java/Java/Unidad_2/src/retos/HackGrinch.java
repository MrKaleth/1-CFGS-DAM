/*package retos;

public class HackGrinch {
	public static void main(String[] args) {
		HackGrinch f= new HackGrinch();
		String elemento1 = "023122512345678hackGrinch_elfosClothes.png";
		
		String elemento2 = "42hackGrinch_chimey_dimensions.pdf";
		
		String ElementoLimpio1 = f.quitaHack(elemento1);
		System.out.println(ElementoLimpio1);
		
		String ElementoLimpio2 = f.quitaHack(elemento2);
		System.out.println(ElementoLimpio2);
	}

	String quitaHack(String elemento) {

		for (int i = elemento.indexOf("_"); i < elemento.length(); i++) {
			char limpio = elemento.charAt(i);
		}
		
		return limpio;
	}
}
*/