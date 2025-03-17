# Leer un número por teclado
mes = int(input("Introduce un número correspondiente a un mes (1-12): "))

if mes < 12:
    print("Valor correcto")
    if mes < 6:
        print("Además, el número es menor que 6")
else:
    print("Valor incorrecto")
