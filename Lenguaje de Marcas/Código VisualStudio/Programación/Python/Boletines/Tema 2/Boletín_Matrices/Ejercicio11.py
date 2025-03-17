def es_cuadrada(matriz):
    cuadrada = False
    fila = len(matriz)
    columna = len(matriz[0])
    if fila == columna:
        cuadrada = True
    return cuadrada

def suma_diagonal(matriz, esPrincipal):
    suma = 0
    if es_cuadrada(matriz):
        for i in range(len(matriz)):
            if esPrincipal:
                suma += matriz[i][i]
            else:
                suma += matriz[i][len(matriz) - 1 - i]
    else:
        suma = 0
    return suma


matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

print("Matriz:")
for fila in matriz:
    print(fila)

if es_cuadrada(matriz):
    suma_principal = suma_diagonal(matriz, True)
    suma_secundaria = suma_diagonal(matriz, False)
    print("Suma de la diagonal principal:", suma_principal)
    print("Suma de la diagonal secundaria:", suma_secundaria)
else:
    print("La matriz no es cuadrada.")