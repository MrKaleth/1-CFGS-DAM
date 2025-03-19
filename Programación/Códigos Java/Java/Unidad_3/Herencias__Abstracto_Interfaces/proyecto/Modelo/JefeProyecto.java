package proyecto.Modelo;

public class JefeProyecto extends Empleado implements INomina {
	private boolean hablaIngles;
	private String[] certificaciones;

	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHorario, Categoria categoria, boolean hablaIngles, String[] certificaciones) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHorario, categoria);
		this.hablaIngles = hablaIngles;
		this.certificaciones = certificaciones;
	}

	@Override
	public String imprimeHorario() {
        return tieneReduccionHorario ? "Horario: 8:00 - 16:00" : "Horario: 8:00 - 19:00";
    }

	@Override
	public String devuelveFunciones() {
        return "Funciones: Planificar, Asegurar calidad y entrega de plazos, Reporting, Elaboración de ofertas.";
    }
	
	public double calcularNomina() {
        double extra = certificaciones.length * 0.05 + (hablaIngles ? 0.3 : 0);
        return INomina.calculaImporteNomina(salario, extra);
    }

}
