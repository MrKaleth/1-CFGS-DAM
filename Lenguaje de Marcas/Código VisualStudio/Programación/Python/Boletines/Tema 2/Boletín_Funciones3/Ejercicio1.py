def Invertir_Lista(lista):
    return lista[::-1]

cantidad_numeros = int(input("¿Cuántos números deseas introducir?: "))

numeros = []
contador = 0
while contador < cantidad_numeros:
    numero = int(input("Introduce un número: "))
    numeros.append(numero)
    contador += 1

numeros_invertidos = Invertir_Lista(numeros)
print("Los números en orden inverso son:")
for numero in numeros_invertidos:
    print(numero)
