numero1 = int(input("Introduce el primer número: "))
numero2 = int(input("Introduce el segundo número: "))

if numero1 == numero2:
    print("Los números son iguales.")
elif numero1 > numero2:
    print(numero1, "es mayor que", numero2)
else:
    print(numero1, "es menor que", numero2)
