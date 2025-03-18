package boletin1;

public class Actividad1 {
	
	public static void main(String[] args) {
		// Declaro objeto fichero
	//	File fichero = new File("salida.txt");
		// Lo creo si no existe
		// boolean creado = fichero.createNewFile();
	}

}

class File{
	private String Hola;

	public File(String hola) {
		super();
		Hola = hola;
		System.out.println(Hola);
	}
	
}