def sumaMatriz(matriz):
    suma_total = 0
    for fila in matriz:
        for elemento in fila:
            suma_total = elemento + suma_total
    return suma_total

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2] 
    ]

print(sumaMatriz(matriz))