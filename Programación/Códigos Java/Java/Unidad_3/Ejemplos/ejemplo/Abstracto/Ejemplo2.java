package ejemplo.Abstracto;

import java.io.IOException;
import java.util.InputMismatchException;

public class Ejemplo2 {
	
	public static void main(String[] args) throws IOException {

		try {
			GeneraExcepcion g = new GeneraExcepcion();
			g.generaIOException();
		}

		catch (InputMismatchException e) {
			System.out.println("Ocurre una Excepción: " + e.getMessage());
		}
		
		System.out.println("Llego aquí");
		
	}
}
