numero = int(input("Introduce un número entero (número negativo para salir): "))

while numero >= 0:
    cuadrado = numero ** 2
    print("El cuadrado de", numero, "es:", cuadrado)
    
    numero = int(input("Introduce otro número entero (número negativo para salir): "))

print("Has introducido un número negativo. El programa ha terminado.")
