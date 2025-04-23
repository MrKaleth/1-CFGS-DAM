package ejerciciosPracticos.PolimorfismoInterfaces.principal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operaciones {
	public Set<Integer> filtrarPares(List<Integer> lista) {
		HashSet<Integer> resultado = new HashSet<Integer>();
		for (Integer n : lista) {
			if (n % 2 == 0) {
				resultado.add(n);
			}
		}
		return resultado;
	}

	
	
}
