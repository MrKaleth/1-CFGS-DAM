package boletín0;

public class EjemploWhile {
	
	public static void main(String[] args) {
		
		boolean salir = false;
		int x = 0;
		
		while (salir == false) {

			if (x != 11) {
				System.out.println(x);
				x = x + 1;
			} else {
				System.out.println("Terminado");
				salir = true;
			}
		}
	}
}
