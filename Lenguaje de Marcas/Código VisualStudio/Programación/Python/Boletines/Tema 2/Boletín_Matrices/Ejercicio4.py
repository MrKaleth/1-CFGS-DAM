def sumaFila(matriz, numFila):
    suma = 0
    for elemento in matriz[numFila]:
        suma += elemento
    return suma


matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2] 
    ]

print(sumaFila(matriz, 0))