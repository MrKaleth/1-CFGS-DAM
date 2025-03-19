package proyecto.Modelo;

public interface INomina {
	String NOMBRE_EMPRESA = "Jacarandá S.A.";
	String CIF_EMPRESA = "B12345678";

	static double calculaImporteNomina(float salario, double extra) {
        return salario + (salario * extra);
	}
}