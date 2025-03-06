package factoriaCoches.Controlador;

import factoriaCoches.Modelo.*;

public class GestionaFactoria {

	public static void main(String[] args) {
		Robot[] inventarioRobots = new Robot[20];

		inventarioRobots[0] = new RobotSoldador("Modelo1", 100, Estado.APAGADO, "Electricidad",
				"Robot Soldador de precisión", 1500f, "Especificación A");
		inventarioRobots[1] = new RobotPintor("Modelo2", 90, Estado.ENCENDIDO, "Gasolina", "Robot Pintor Automotriz");
		inventarioRobots[2] = new RobotEnsamblador("Modelo3", 80, Estado.APAGADO, "Gasolina",
				"Robot para ensamblar piezas");

		for (Robot robot : inventarioRobots) {
			if (robot != null) {
				System.out.println(robot.toString());
				robot.ejecutarTarea();
				robot.recargar();
				robot.tieneBateriaSuficiente();
				System.out.println();
			}
		}
	}
}
