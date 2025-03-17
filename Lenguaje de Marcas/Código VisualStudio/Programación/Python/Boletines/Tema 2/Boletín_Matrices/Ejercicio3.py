def devuelvePares(matriz):
    Lista = []
    for fila in matriz:
        for elemento in fila:
            if elemento % 2 == 0:
                Lista.append(elemento)
    return Lista

matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2] 
    ]

print(devuelvePares(matriz))