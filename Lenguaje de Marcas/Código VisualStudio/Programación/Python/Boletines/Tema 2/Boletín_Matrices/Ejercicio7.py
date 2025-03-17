from Ejercicio6 import sumaColumna

def sumaColumnaPar(matriz):
    sumaPar = 0
    for sumaColum in range(len(matriz)):
        if sumaColum % 2 == 0:
            sumaPar += sumaColumna(matriz, sumaColum)
    return sumaPar

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

print(sumaColumnaPar(matriz))