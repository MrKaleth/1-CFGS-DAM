suma = 0

numero = int(input("Ingresa un número (0 finaliza el programa): "))

while numero != 0:
    suma += numero
    numero = int(input("Ingresa otro número (0 finaliza el programa): "))

print("La suma de los números ingresados es:", suma)
