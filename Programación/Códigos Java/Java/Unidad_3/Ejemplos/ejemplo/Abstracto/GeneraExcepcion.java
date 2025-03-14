package ejemplo.Abstracto;

import java.io.IOException;

public class GeneraExcepcion {

	public void generaIOException() throws IOException {
		try {
			throw new IOException();

		} catch (IOException e) {
			System.out.println("En el catch de IO");
			throw e;
		}
	}
}
