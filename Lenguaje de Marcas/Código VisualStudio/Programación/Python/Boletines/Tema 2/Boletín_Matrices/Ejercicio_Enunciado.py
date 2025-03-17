'''
Deseamos guardar los goles anotados y recibidos por un equipo de pueblo durante un mes. 
Para ello usaremos una matriz con 4 filas (una por semana) y 4 columnas (una por partido)

A) Construye una función que te genere esta matriz con números enteros entre el 0 y el 10.
B) Haz una función que te diga cual es la semana en la que mayores goles se anotaron y cuantos goles se anotaron
'''

import random

def creaMatriz():
    matriz = [[random.randint(0, 10) for NumFilas in range(4)] 
    for NumColumnas in range(4)]
    return matriz

def total_goles_semana(matriz):
    max_goles = 0
    semana_max = 0
    contador = 1
    for semana in matriz:
        total_goles = 0
        for goles in semana:
            total_goles += goles
        if total_goles > max_goles:
            max_goles = total_goles
            semana_max = contador
        contador += 1
    return semana_max, max_goles

print("Matriz de goles (filas: semanas, columnas: partidos):")
matriz1 = creaMatriz()
for fila in matriz1:
    print(fila)

semana, goles = total_goles_semana(matriz1)
print("\n")
print("La semana con más goles anotados fue la semana", semana, "con", goles, "goles.")
