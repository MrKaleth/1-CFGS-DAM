numero = input("Introduce un número entero: ")
digito_buscado = input("Introduce el dígito que deseas encontrar: ")

posicion = -1

for i in range(len(numero)):
    if numero[i] == digito_buscado and posicion == -1:
        posicion = i

if numero[0] == '-' and posicion != -1:
    posicion -= 1

if posicion == -1:
    print(posicion)
else:
    print("La posición del dígito", digito_buscado, "es:", posicion)
