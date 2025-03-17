def exponente(num1, num2):
    if num2 == 0:
        resultado = 1

    for i in range(1, num2):
        resultado = resultado * num1
    return resultado

resultado_Fun = exponente(5,1)
print(resultado_Fun)

resultado_Fun = exponente(5,2)
print(resultado_Fun)

resultado_Fun = exponente(5,3)
print(resultado_Fun)