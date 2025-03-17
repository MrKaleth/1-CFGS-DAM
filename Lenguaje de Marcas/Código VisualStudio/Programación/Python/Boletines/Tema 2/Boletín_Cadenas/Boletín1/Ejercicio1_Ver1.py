'''
esCapicua: Devuelve verdadero si el número que se pasa como 
parámetro es capicúa y falso en caso contrario.  
'''

esCapicua = True
i = 0

cadena = input("Introduce un número: ")
posiciónMedia = int(len(cadena) / 2)

while i < posiciónMedia and esCapicua:
    
    if cadena[i] != cadena[len(cadena) - 1 - i]:
        esCapicua = False
    i += 1

if esCapicua:
    print("El número es Capicua")
else:
    print("No es Capicua")





'''cadena= input("Introduce un número: ")
ultimaPosicion = len(cadena)-1

posicionMedia = int(len(cadena)/2 )

for i in range(0, posicionMedia) :
    if cadena[i] == cadena[ultimaPosicion-i] :
        print("iguales")
    else: 
        print("Distintos")'''