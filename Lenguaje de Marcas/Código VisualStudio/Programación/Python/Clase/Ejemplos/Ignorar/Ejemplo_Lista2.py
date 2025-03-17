'''
lista = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
print(lista)

for posición in range(len(lista)):
    print(lista[posición])

for valor in lista:
    print(valor)
'''

lista = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]

posición = 0

while posición < len(lista):
    print(lista[posición])
    posición += 1
