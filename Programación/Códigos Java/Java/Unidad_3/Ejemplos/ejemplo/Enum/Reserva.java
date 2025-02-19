package ejemplo.Enum;

public class Reserva {

	private enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}

	Mes mes = Mes.ENERO;


	public static void main(String[] args) {

		/* Mes mes2 = Mes.valueOf("VERANO");
		System.out.println(mes2); */
		
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
			if(dia == DiaSemana.MARTES) {
				System.out.println("Hoy es martes amigos");
				
			}
		}

	}

}
