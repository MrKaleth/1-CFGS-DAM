n = int(input("Introduce un número: "))
numeroCalculado = 0

if n == 1:
    listaNumeros = [0]
else :
    listaNumeros = [0, 1]

for i in range(2, n):
    numeroCalculado = listaNumeros[-1] + listaNumeros[-2]
    
    if numeroCalculado %i == 0 and numeroCalculado != 1 :
        numeroCalculado = numeroCalculado*i
    elif numeroCalculado %2 == 0 :
        numeroCalculado = numeroCalculado*2
    
    listaNumeros.append(numeroCalculado)
    print(numeroCalculado)

print ("Devolviendo resultados: ", listaNumeros)