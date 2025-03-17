def MaxMin(lista):
    máximo = lista[0]  
    mínimo = lista[0] 
    
    for num in lista:
        if num > máximo:
            máximo = num
        if num < mínimo:
            mínimo = num

    return máximo, mínimo

lista = []
while len(lista) != 10:
    Num = int(input("Introduce un número: "))
    lista.append(Num)

máximo, mínimo = MaxMin(lista)

print("El número máximo es:", máximo)
print("El número mínimo es:", mínimo)
