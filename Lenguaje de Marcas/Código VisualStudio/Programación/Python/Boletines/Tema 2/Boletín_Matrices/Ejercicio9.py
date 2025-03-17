def devuelve_diagonal_principal(matriz):
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return diagonal

def devuelve_diagonal_secundaria(matriz):
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][len(matriz) - 1 - i])
    return diagonal

print("Matriz:")

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

for fila in matriz:
    print(fila)

diagonal_principal = devuelve_diagonal_principal(matriz)
diagonal_secundaria = devuelve_diagonal_secundaria(matriz)

print("\nDiagonal principal:", diagonal_principal)
print("Diagonal secundaria:", diagonal_secundaria)