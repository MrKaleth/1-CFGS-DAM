def sumaFilasPares(matriz):
    suma_total = 0
    for i in range(len(matriz)):
        if i % 2 == 0:
            for elemento in matriz[i]:
                suma_total += elemento
    return suma_total

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2] 
    ]

print(sumaFilasPares(matriz))