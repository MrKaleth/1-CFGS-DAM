# Ejercicio 1


En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra, por ejemplo 56999545W. Realiza un programa donde le pidas al usuario SOLO el número del dni y el programa te devuelva la letra. Para calcular la letra solo tienes que dividir el número del DNI entre 23, el resto de esta división se corresponde con la posición de la letra en el abecedario. Utiliza un array para guardar CADA letra del abecedario. Tienes que tener en cuenta que el número de DNI está compuesto por 8 dígitos.

```java
package unidad6.Práctica1;

import java.util.Scanner;
  
public class Ejercicio1 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Introduce los números (8) de tu DNI: ");

String numDNI = input.nextLine();

char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
'L', 'C', 'K', 'E' };

if (numDNI.length() != 8) {
System.out.println("Número de DNI inválido. No posee 8 dígitos");
} else {
int resto = Integer.parseInt(numDNI) % 23;
String dniCompleto = numDNI + letras[resto];

System.out.println("La Letra de tu DNI debe de ser: " + letras[resto] + ". " 
+ "Tu DNI completo será: " + dniCompleto);
}

input.close();

}}
```

# Ejercicio 2

Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.

```java
package unidad6.Práctica1;
import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int[] tabla = new int[10];
for (int i = 0; i < tabla.length; i++) {
System.out.println("Introduce un número: ");
int num = input.nextInt();
tabla[i] = num;
}

System.out.println();
for (int i = tabla.length - 1; i >= 0; i--) {
System.out.println(tabla[i]);
}
input.close();
}}
```

# Ejercicio 3

Vamos a crear un juego sencillo de "Piedra, Papel o Tijeras". En este juego, el usuario jugará contra la computadora. En este juego, el usuario elige entre Piedra (1), Papel (2) o Tijeras (3). La computadora elige al azar una de las tres opciones. Luego, se determina el ganador según las reglas clásicas del juego. El juego continúa hasta que el usuario decide salir ingresando 0.

```java
package unidad6.Práctica1;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random random = new Random();
int usuario = -1;  

while (usuario != 0) {
System.out.println("Elige una opción:");
System.out.println("1. Piedra");
System.out.println("2. Papel");
System.out.println("3. Tijeras");
System.out.println("0. Salir");
System.out.print("Ingresa el número de tu elección: ");

usuario = input.nextInt();

if (usuario == 0) {
System.out.println("Gracias por jugar. ¡Hasta luego!");
} else if (usuario >= 1 && usuario <= 3) {
int computadora = random.nextInt(3) + 1;
String[] opciones = { "Piedra", "Papel", "Tijeras" };

System.out.println();
System.out.println("Tú elegiste: " + opciones[usuario - 1]);
System.out.println("La computadora eligió: " + opciones[computadora - 1]);

if (usuario == computadora) {
System.out.println("Empate");
} else if ((usuario == 1 && computadora == 3) || (usuario == 2 && computadora == 1)
|| (usuario == 3 && computadora == 2)) {
System.out.println("¡Ganaste!");
System.out.println();
} else {
System.out.println("Perdiste.");
System.out.println();
}
} else {
System.out.println("Elección inválida. Inténtalo de nuevo.");
System.out.println();
}
}
input.close();
}
}
```

# Ejercicio 4
1. El valor de “numero” al comenzar la cuarta iteración del tercer bucle.

![[Pasted image 20250217135157.png]]

1. La suma de “numero” y “array[3]” al final del programa.

array[i] = numero - 26; --->  38 - 26 = 12 

Todo el array tendrá el valor 12.

Por tanto, la suma será la siguiente ---> numero + array[3] = 38 + 12 = 50 

# Ejercicio 5

1. El valor de “numero” al comenzar la cuarta iteración del tercer bucle
![[Pasted image 20250217135918.png]]

1. La suma de “numero” y “array[3]” al final del programa.

numero = -48
array[i] = -48 - 2 = -50

Por lo tanto:
array[3] = -50

Suma final ---> numero + array[3] = -48 + (-50) = -98
