numero = int(input("Introduce un número entero: "))
if numero % 2 == 0 and numero % 3 == 0:
    if numero % 6 == 0:
        print(numero, "es múltiplo de 6")
        print(numero, "al ser un múltiplo de 2 es par")
elif numero % 2 == 0:
    print(numero, "es múltiplo de 2,", "es par.")
else:
    print(numero, "es impar.")
