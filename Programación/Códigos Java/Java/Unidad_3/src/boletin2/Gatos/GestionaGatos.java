package boletin2.Gatos;

public class GestionaGatos {
	public static void main(String[] args) {
	/*	Gatos gato1 = new Gatos();
		gato1.color = "Naranja";
		gato1.raza = "Persa";
		gato1.sexo = "Macho";
		gato1.edad = 12;
		gato1.peso = 15;

		Gatos gato2 = new Gatos();
		gato2.color = "Blanco";
		gato2.raza = "Siames";
		gato2.sexo = "Hembra";
		gato2.edad = 10;
		gato2.peso = 12;

		Gatos gato3 = new Gatos();
		gato3.color = "Gris";
		gato3.raza = "Maine Coon";
		gato3.sexo = "Hembra";
		gato3.edad = 8;
		gato3.peso = 10;*/
		
	
		Gatos gato1 = new Gatos("Persa", "Naranja", "Macho", 12, 15);
		Gatos gato2 = new Gatos("Siames", "Blanco", "Hembra", 10, 12);
		Gatos gato3 = new Gatos("Maine Coon", "Gris", "Hembra", 8, 10);

		gato1.maullar();
		gato1.comer("pienso");

		gato2.ronronear();
		gato2.comer("pescado");

		gato2.pelear(gato3);
		gato1.pelear(gato2);
		
		System.out.println(gato1);
			}
		}
