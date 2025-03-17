numero = int(input("Introduce un número: "))
if numero % 2 == 0:
    for i in range(7, 1, -2):
        if numero % 3 == 0:
            numero = 4*i-numero
        else:
            numero = numero-1
    print(numero)
else:
    for i in range(4, 1, -1):
        if i % 2 == 0:
            numero = numero-1
        else:
            numero = i+numero*3
        print(numero)
print("finaliza el programa")