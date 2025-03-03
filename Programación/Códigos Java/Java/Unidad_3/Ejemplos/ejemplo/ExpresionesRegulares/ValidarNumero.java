package ejemplo.ExpresionesRegulares;

public class ValidarNumero {

	public static void main(String[] args) {

		String num = new String(" "); // Con la cadena vacía lo toma como 0,
										// por lo que sí que hay número
		String num2 = new String("12345678a");
		
		String car = new String("abc");
		String car2 = new String("A");


		System.out.println(num.matches("\\d*"));
		System.out.println(num.matches("[0-9]*"));

		System.out.println(num.matches("\\d"));
		System.out.println(num.matches("[0-9]"));

		System.out.println(num.matches("\\d+"));
		System.out.println(num.matches("[0-9]+"));

		System.out.println();

		// System.out.println(num2.matches("\\d{8}\\p{alpha}"));
		
		System.out.println(car.matches("[abc]"));
		System.out.println(car.matches("[abc]*"));
		System.out.println(car.matches("[A-Za-z]"));
		System.out.println(car.matches("[A-Za-z]*"));
		
		System.out.println();
		
		System.out.println(car2.matches("[A-Za-z]{1}"));

		
	}

}
