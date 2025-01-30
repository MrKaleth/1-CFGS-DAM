package tablas;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		String diasSemana[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		for (int pos = 0; pos < diasSemana.length; pos++) {
			if (pos < 5) {
				System.out.print("Laborable: ");
				System.out.println(diasSemana[pos]);
			} else {
				System.out.print("Festivo: ");
				System.out.println(diasSemana[pos]);
			}

		}

		System.out.println();
		int pos = 0;
		while (pos < diasSemana.length) {
			if (pos < 5) {
				System.out.print("Laborable: ");
				System.out.println(diasSemana[pos]);
				pos++;
			} else {
				System.out.print("Festivo: ");
				System.out.println(diasSemana[pos]);
				pos++;

			}
			
		}
		pos = 0;
		while (!(diasSemana[pos].equals("Miércoles"))) {
		    System.out.println(diasSemana[pos]);
		    pos++;
		}

	}
}
