package boletín1;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce la altura del rectángulo: ");
	int altura = input.nextInt();
	
	System.out.println("Introduce la base del rectángulo: ");
	int base = input.nextInt();
	
	int area = base * altura;
	System.out.println("El área del rectángulo es: " + area);
	
	input.close();
}
}
