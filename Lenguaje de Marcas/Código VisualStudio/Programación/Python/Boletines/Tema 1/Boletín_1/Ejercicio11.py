while True:
    numero1 = int(input("Introduce el primer número: "))
    numero2 = int(input("Introduce el segundo número: "))

    if numero1 == 0 and numero2 == 0:
        break 

    suma = numero1 + numero2
    print("La suma es:", suma)

print("Programa terminado.")
