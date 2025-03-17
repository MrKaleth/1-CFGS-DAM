lista = [0,1]
for i in range(2,7):
    numC = lista[-1] + lista[-2]
    if numC %2 == 0 and numC != 1:
        numC == numC*2
    elif numC %i:
        numC == numC*i
    print(numC)
    lista.append(numC)

print(lista)