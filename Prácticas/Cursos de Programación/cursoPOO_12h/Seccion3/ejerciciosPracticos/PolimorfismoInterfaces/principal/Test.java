package ejerciciosPracticos.PolimorfismoInterfaces.principal;

import java.util.ArrayList;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Operaciones oper = new Operaciones();
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(10);
		lista1.add(7);
		lista1.add(3);
		lista1.add(22);
		
		Vector<Integer> lista2 = new Vector<Integer>();
		lista2.add(1);
		lista2.add(9);
		lista2.add(4);
		
		System.out.println(oper.filtrarPares(lista1));
		System.out.println(oper.filtrarPares(lista2));
	}
}
