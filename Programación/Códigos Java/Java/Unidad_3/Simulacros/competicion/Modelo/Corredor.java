package competicion.Modelo;

import java.time.LocalDate;

public class Corredor extends Deportista {

	public Corredor(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super(nombre, pais, edad, peso, altura, pruebas);
	}

	@Override
	public int getTiempoCalentamiento() {
		return 30;
	}

	@Override
	public int getCaloriasNecesariasDia() {
		return (int) (getPeso() * 50);
	}

	@Override
	public int getHorasEntrenamiento(LocalDate fecha) {
		long diasHastaPrueba = fecha.getDayOfYear() - LocalDate.now().getDayOfYear();
		int horasEntrenamiento;

		if (diasHastaPrueba > 10) {
			horasEntrenamiento = 6;
		} else if (diasHastaPrueba >= 4) {
			horasEntrenamiento = 4;
		} else {
			horasEntrenamiento = 3;
		}

		return horasEntrenamiento;
	}

	@Override
	public Prueba getProximaPrueba() {
		Prueba proxima = null;
		for (Prueba prueba : getPruebas()) {
			if (prueba != null && prueba.getEstado() == Estado_Prueba.PLANIFICADA) {
				if (proxima == null || prueba.getFecha().isBefore(proxima.getFecha())) {
					proxima = prueba;
				}
			}
		}
		return proxima;
	}

	@Override
	public int contarPruebasPorEstado(Estado_Prueba estado) {
		int contador = 0;
		for (Prueba prueba : getPruebas()) {
			if (prueba != null && prueba.getEstado() == estado) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public void competir() {
		System.out.println("El corredor " + getNombre() + " participa en una carrera.");
	}

	@Override
	public int getTiempoPrueba() {
		int distancia = 42;
		int ritmoPromedioPorKm = 5;

		int tiempoTotal = distancia * ritmoPromedioPorKm;

		return tiempoTotal;
	}
}
