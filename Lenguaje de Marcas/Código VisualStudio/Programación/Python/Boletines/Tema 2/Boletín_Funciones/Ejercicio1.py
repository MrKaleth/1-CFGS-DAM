def EsMultiplo(num1, num2):
    resultado = False
    if num1 % num2 == 0:
        resultado = True
    else:
        resultado = False
    return(resultado)        

num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce un segundo número: "))

resultado = EsMultiplo(num1, num2)
print(resultado)