matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2] 
    ]

def getElemento(matriz, numFila, numColumna):
    elemento = matriz[numFila][numColumna]
    return elemento

def getFila(matriz, numFila):
    elementos = matriz[numFila]
    return elementos

def getColumna(matriz, numColumna):
    columna = []
    for fila in range(0, len(matriz)):
        columna.append(matriz[fila][numColumna])
    return columna

print(getElemento(matriz, 0, 2))
print("\n")
print(getFila(matriz, 2))
print("\n")
print(getColumna(matriz, 0))