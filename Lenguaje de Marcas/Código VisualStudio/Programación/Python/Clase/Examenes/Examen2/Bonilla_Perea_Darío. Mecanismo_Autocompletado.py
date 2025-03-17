# Mecanismo de Autocompletado
# Darío Bonilla Perea
'''
Lista de funciones

busquedaLetra
    listanueva
    elección
    for elemento in lista original
    return lista 2

busquedaCaracteres
    listanueva
    elección caracteres
    for elemento in lista original
        comprobar igualdad de caracteres
    return lista2
'''

lista = ["Core i9", "Ryzen 9", "core i7", "Ryzen 5", "fury Beast", "Vengeance LPX", "trident Z5", "Ballistix Sport", "980 PRO", "Black SN850X", "barracuda HDD", 
         "MX500 SSD", "geForce RTX", "radeon RX", "GeForce GTX", "Radeon 6600",  "ROG STRIX", "MPG B550", "Aorus X570", "steel legend", "Rival 5"]

def busquedaPorCaracteres(lista):
    lista2 = []
    elección = input("Introduce tu búsqueda de caracteres: ")
    for elemento in lista:
        puntos = 0
        cadena = elemento.lower()
        for i in range(len(elección)):
            if cadena[i] == elección[i]:
                puntos += 1
                if puntos == len(elección):
                    lista2.append(elemento)
                    puntos = 0
    return lista2

def busquedaPorLetra():
    lista2 = []
    elección = input("Introduce una letra: ")
    for elemento in lista:
        cadena = elemento.lower()
        if cadena[0] == elección:
            lista2.append(elemento)
    return lista2

Proceso = int(input("¿Que proceso vamos a realizar?.\n1. Buscar por letras\n2. Buscar por conjunto de caracteres\nIntroduce tu eleción: "))
match Proceso:
    case 1:
        print(busquedaPorLetra())
    case 2:
        print(busquedaPorCaracteres())