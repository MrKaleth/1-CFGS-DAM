numero = int(input("Introduce un número entero: "))

if numero % 2 == 0:
    print(numero, "es par.")
    if numero % 6 == 0:
        print(numero, "es múltiplo de 6.")