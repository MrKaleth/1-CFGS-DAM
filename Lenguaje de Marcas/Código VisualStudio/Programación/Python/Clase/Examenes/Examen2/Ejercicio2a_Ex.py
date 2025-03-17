# Mecanismo de Autocompletado
'''
Lista de funciones

busqueda
    listanueva
    elección
    for elemento in lista original
    return lista 2
'''

lista = ["Core i9", "Ryzen 9", "core i7", "Ryzen 5", "fury Beast", "Vengeance LPX", "trident Z5", "Ballistix Sport", "980 PRO", "Black SN850X", "barracuda HDD", 
         "MX500 SSD", "geForce RTX", "radeon RX", "GeForce GTX", "Radeon 6600",  "ROG STRIX", "MPG B550", "Aorus X570", "steel legend", "Rival 5"]


def busqueda():
    lista2 = []
    elección = input("Introduce una letra: ")
    for elemento in lista:
        cadena = elemento.lower()
        if cadena[0] == elección:
            lista2.append(elemento)
    return lista2

print(busqueda())