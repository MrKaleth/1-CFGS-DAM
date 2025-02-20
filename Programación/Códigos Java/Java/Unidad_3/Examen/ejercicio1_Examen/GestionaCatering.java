package ejercicio1_Examen;

import java.time.LocalDate;

public class GestionaCatering {

	public static void main(String[] args) {

		Menu menu1 = new Menu(1, "m1", 1000, 9, TipoDieta.VEGETARIANO, LocalDate.now());
		Menu menu2 = new Menu(2, "m2", 500, 0, TipoDieta.SIN_GLUTEN, LocalDate.now().plusDays(2));
		
		menu1.contieneCarne();
		menu1.esBajoEnCalorias();
		
		menu2.contieneCarne();
		menu2.esBajoEnCalorias();
		
		System.out.println(menu1);
		System.out.println(menu2);
		
		Cliente c1 = new Cliente("47568789M", "Darío", "Bonilla Perea", 18, TipoDieta.SIN_LACTOSA, LocalDate.now(), true, menu1);
		Cliente c2 = new Cliente("47568789M", "Darío", "Bonilla Perea", 40, TipoDieta.SIN_LACTOSA, LocalDate.now(), false, menu1);
		Cliente c3= new Cliente("47568789M", "Darío", "Bonilla Perea", 65, TipoDieta.SIN_LACTOSA, LocalDate.now(), true, menu1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	
	

}
