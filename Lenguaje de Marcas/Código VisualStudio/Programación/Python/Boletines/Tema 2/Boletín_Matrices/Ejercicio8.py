def maxFila(matriz, numFila):
    maximo = matriz[numFila][0]
    for elemento in matriz[numFila]:
        if elemento > maximo:
            maximo = elemento
    return maximo

def maxColumna(matriz, numColumna):
    maximo = matriz[0][numColumna]
    for fila in matriz:
        if fila[numColumna] > maximo:
            maximo = fila[numColumna]
    return maximo

def maxTotal(matriz):
    maximo_total = maxFila(matriz, 0)
    for numFila in range(len(matriz)):
        max_fila = maxFila(matriz, numFila)
        if max_fila > maximo_total:
            maximo_total = max_fila
    return maximo_total

matriz = [
    [8, 1, 6, 3],
    [3, 5, 7, 2],
    [4, 9, 2, 1]
]

print(maxFila(matriz, 0), maxFila(matriz, 1), maxFila(matriz, 2))
print("\n")
print(maxColumna(matriz, 0), maxColumna(matriz, 1), maxColumna(matriz, 2), maxColumna(matriz, 3))
print("\n")
print(maxTotal(matriz))


