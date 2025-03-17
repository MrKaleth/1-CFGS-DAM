lista = []

while len(lista) < 10:
    nuevo_num = int(input("Introduce un número: "))
    lista.append(nuevo_num)

for i in range(9, -1, -1):
    print(lista[i])
