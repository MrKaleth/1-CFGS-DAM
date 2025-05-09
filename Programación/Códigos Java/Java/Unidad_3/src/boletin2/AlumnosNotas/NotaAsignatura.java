package boletin2.AlumnosNotas;

public class NotaAsignatura {
	String nombreAsignatura;
	double notaPrimerTrimestre;
	double notaSegundoTrimestre;
	double notaTercerTrimestre;

	// Constructor con todos los parámetros
	public NotaAsignatura(String nombreAsignatura, double notaPrimerTrimestre, double notaSegundoTrimestre,
			double notaTercerTrimestre) {
		this.nombreAsignatura = nombreAsignatura;
		this.notaPrimerTrimestre = notaPrimerTrimestre;
		this.notaSegundoTrimestre = notaSegundoTrimestre;
		this.notaTercerTrimestre = notaTercerTrimestre;
	}

	// Método público para calcular la nota media
	public double calcularNotaMedia() {
		return (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
	}

	// Método con visibilidad de paquete para contar los trimestres aprobados
	int contarTrimestresAprobados() {
		int aprobados = 0;
		if (notaPrimerTrimestre >= 5)
			aprobados++;
		if (notaSegundoTrimestre >= 5)
			aprobados++;
		if (notaTercerTrimestre >= 5)
			aprobados++;
		return aprobados;
	}

	// Método toString
	@Override
	public String toString() {
		return "Asignatura: " + nombreAsignatura + ", Notas: [" + notaPrimerTrimestre + ", " + notaSegundoTrimestre
				+ ", " + notaTercerTrimestre + "]";
	}
}
