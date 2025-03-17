def es_cuadrada(matriz):
    cuadrada = False
    fila = len(matriz)
    columna = len(matriz[0])
    if fila == columna:
        cuadrada = True
    return cuadrada

def devuelve_diagonal_principal(matriz):
    diagonal = []
    if es_cuadrada(matriz):
        for i in range(len(matriz)):
            diagonal.append(matriz[i][i])
    return diagonal

def devuelve_diagonal_secundaria(matriz):
    diagonal = []
    if es_cuadrada(matriz):
        for i in range(len(matriz)):
            diagonal.append(matriz[i][len(matriz) - 1 - i])
    return diagonal

matriz = [
    [8, 1, 6, 7],
    [3, 5, 7, 7],
    [4, 9, 2, 7]
]

print("\nMatriz:")
for fila in matriz:
    print(fila)

diagonal_principal = devuelve_diagonal_principal(matriz)
diagonal_secundaria = devuelve_diagonal_secundaria(matriz)

if es_cuadrada(matriz):
    print("\nDiagonal Principal:", diagonal_principal)
    print("Diagonal Secundaria:", diagonal_secundaria)
else:
    print("La matriz no es cuadrada")