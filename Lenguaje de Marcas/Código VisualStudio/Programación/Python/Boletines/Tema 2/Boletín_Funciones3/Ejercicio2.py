Lista = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

def imprimir_sublistas(Lista):
    for sublista in Lista:
        print(sublista)

def imprimir_filas_invertidas(Lista):
    indice = len(Lista) - 1
    while indice >= 0:
        print(Lista[indice])
        indice -= 1

def imprimir_filas_contenido_invertido(Lista):
    for fila in Lista:
        fila_invertida = []
        indice = len(fila) - 1
        while indice >= 0:
            fila_invertida.append(fila[indice])
            indice -= 1
        print(fila_invertida)

def imprimir_filas_y_columnas_invertidas(Lista):
    indice_fila = len(Lista) - 1
    while indice_fila >= 0:
        fila_invertida = []
        indice_elemento = len(Lista[indice_fila]) - 1
        while indice_elemento >= 0:
            fila_invertida.append(Lista[indice_fila][indice_elemento])
            indice_elemento -= 1
        print(fila_invertida)
        indice_fila -= 1

def imprimir_por_columnas(Lista):
    num_columnas = len(Lista[0])
    num_filas = len(Lista)
    columna = 0
    while columna < num_columnas:
        fila = 0
        while fila < num_filas:
            # Imprime cada elemento seguido de un espacio manualmente
            print(Lista[fila][columna], " ", end="")
            fila += 1
        print()  # Imprime un salto de línea al final de cada columna
        columna += 1

print("Lista original:")
imprimir_sublistas(Lista)

print("\nLista por filas, comenzando por la última:")
imprimir_filas_invertidas(Lista)

print("\nLista con filas en orden invertido:")
imprimir_filas_contenido_invertido(Lista)

print("\nLista con filas y columnas en orden invertido:")
imprimir_filas_y_columnas_invertidas(Lista)

print("\nLista por columnas:")
imprimir_por_columnas(Lista)
