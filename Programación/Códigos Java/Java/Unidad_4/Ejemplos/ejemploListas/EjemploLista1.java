package ejemploListas;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista1 {
	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<String>();

		lista1.add("Pedro");
		lista1.add("David");
		lista1.add("Miguel");
		lista1.add("Antonio");
		lista1.add("Pedro");
		lista1.remove("Pedro");

		System.out.println("Longitud de la lista: " + lista1.size());
		System.out.println();
		for (String cadena : lista1) {
			System.out.println(cadena);
		}
		System.out.println();
		System.out.println(lista1);
		System.out.println(lista1.get(0));
		System.out.println(lista1.set(0, "Gumbersindo"));
		System.out.println(lista1.get(0));
		System.out.println(lista1.indexOf("Pedro"));
	}

}
