cadena = input("Introduce un texto: ")
numero = int(input("Introduce un número: "))

longitud = len(cadena)
continuar = True

while continuar:
    if len(cadena)<4:
        cadena = input("Vuelva a introducir el texto: ")
    else:
        continuar = False

if numero % 2 == 0:
    print((cadena[2]+cadena[4])*longitud)
elif numero % 3 == 0:
    print((cadena[1]+cadena[2])*longitud)

elif numero % 7 == 0:
    print((cadena[0]+cadena[3])*longitud)
