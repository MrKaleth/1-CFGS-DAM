package simulacroIncidentesSeguridad;

import java.time.LocalDate;

public class GestionaIncidentes {

	public static void main(String[] args) {
		Equipo e1 = new Equipo("E1", "1", "Linux", 0);
		Equipo e2 = new Equipo("E2", "2", "Linux", 2);
		Equipo e3 = new Equipo("E2", "3", "Linux", 1);
		Equipo e4 = new Equipo("E4", "4", "Linux", 1);

		Incidente i1 = new Incidente(1, "Fallo de red", "No hay conexión", EstadoIncidente.REGISTRADA, Criticidad.GRAVE,
				LocalDate.now().minusDays(10), e2);
		Incidente i2 = new Incidente(2, "Fallo de x", "No hay x", EstadoIncidente.ANALIZADA, Criticidad.MEDIA,
				LocalDate.now().minusDays(40), e2);
		Incidente i3 = new Incidente(3, "Fallo de z", "No hay z", EstadoIncidente.EN_RESOLUCION, Criticidad.LEVE,
				LocalDate.now().minusDays(10), e3);
		Incidente i4 = new Incidente(4, "Fallo de a", "No hay a", EstadoIncidente.REGISTRADA, Criticidad.CRITICA,
				LocalDate.now().minusDays(1), e4);

		i1.esUrgente();
		i2.esUrgente();
		i3.esUrgente();
		i4.esUrgente();
		
		System.out.println();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		System.out.println();
		
		Incidente incidenciasDepartamento [] = {i1, i2, i3, i4};
		
		for(int i = 0; i<incidenciasDepartamento.length; i++) {
			System.out.println(incidenciasDepartamento[i]);
		}

	}

}
