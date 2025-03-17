'''
Ejercicio 1
Diseña y escribe  un programa Python que permita introducir números hasta que se escriba el 0. 
A continuación, se debe mostrar: 
Si Los números han seguido un orden creciente, en ese caso imprime “creciente”.
o si los números han seguido un orden decreciente  (de mayor a menor), , en ese caso imprime “creciente”.
si no sigue orden creciente o decreciente imprimirá la palabra “desordenados”
'''

numeros = []
num = int(input("Introduce un número (0 finaliza el programa): "))

while num != 0:
    numeros.append(num)
    num = int(input("Introduce un número (0 finaliza el programa): "))

if len(numeros) == 0:
    print("No hay números que comparar")

else:
    creciente = True
    decreciente = True

    for i in range(1, len(numeros)):
        if numeros[i] < numeros[i-1]:
            creciente = False
        elif numeros[i] > numeros[i-1]:
            decreciente = False 

    if creciente:
        print("Orden Creciente")
    elif decreciente:
        print("Orden Decreciente")
    else:
        print("No hay orden, Desordenados")