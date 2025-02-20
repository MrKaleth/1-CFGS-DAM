package ejercicio2_Examen;

public class GestionaDispositivo {

	public static void main(String[] args) {

		Laptop l1 = new Laptop("cc", "ccc", 2000, 16, 1);
		Laptop l2 = new Laptop("cc", "ccc", 2000, 16, 1);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println();

		Smartphone s1 = new Smartphone("aa", "aaa", 5000, false, 5);
		Smartphone s2 = new Smartphone("ata", "atata", 5500, true, 3);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();

		PCSobremesa p1 = new PCSobremesa("bb", "bbb", 2500, 32, true);
		PCSobremesa p2 = new PCSobremesa("btb", "btbtb", 2500, 32, true);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println();

		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(p1));

		Dispositivo[] dispositivos = { l1, s1, p1 };
		for (int i = 0; i < dispositivos.length; i++) {
			System.out.println(dispositivos[i]);

		}
	}
}
