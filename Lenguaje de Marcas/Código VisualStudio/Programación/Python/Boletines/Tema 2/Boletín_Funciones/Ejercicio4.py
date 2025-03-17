def MaxMin(lista):
    máximo = lista[0]  
    
    for num in lista:
        if num > máximo:
            máximo = num

    return máximo

lista = []
while len(lista) != 10:
    Num = int(input("Introduce un número: "))
    lista.append(Num)

máximo = MaxMin(lista)

print("El número máximo es:", máximo)
