package proyecto.Modelo;

public class Desarrollador extends Empleado implements INomina{
	private String[] lenguajes;
	private String[] frameworks;

	public Desarrollador(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHorario, Categoria categoria, String[] lenguajes, String[] frameworks) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHorario, categoria);
		this.lenguajes = lenguajes;
		this.frameworks = frameworks;
	}

	@Override
    public String imprimeHorario() {
        return tieneReduccionHorario ? "Horario: 8:00 - 14:00 o 16:00 - 22:00" : "Horario: 8:00 - 16:00 o 16:00 - 00:00";
    }

    @Override
    public String devuelveFunciones() {
        return "Funciones: Codificar, Diseñar planes de pruebas, Ejecutar pruebas.";
    }
    


	public double calculaImporteNomina() {
	    double extra = lenguajes.length * 0.01 + frameworks.length * 0.03;
        return INomina.calculaImporteNomina(salario, extra);
    }

}
