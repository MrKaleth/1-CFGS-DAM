def sumaColumna(matriz, numColumna):
    suma = 0
    for fila in matriz:
        suma += fila[numColumna]
    return suma

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

print(sumaColumna(matriz, 0))