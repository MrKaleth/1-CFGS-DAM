package ejemploListas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
	public static void main(String[] args) {
		
		List<String> ciudades = new LinkedList<String>();
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Sevilla");
		ciudades.add("Madrid");

		Iterator<String> itr = ciudades.iterator();
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		
	}
}
