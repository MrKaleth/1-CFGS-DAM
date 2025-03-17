Abecedario = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
              "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

def buscar_posicion(letra):
    posicion = -1
    for i in range(len(Abecedario)):
        if Abecedario[i] == letra and posicion == -1:
            posicion = i
    return posicion

def cifrarCesar(texto, numDesplazamiento):
    texto = texto.upper()
    cifrado = ""
    for letra in texto:
        if letra in Abecedario:
            pos_actual = buscar_posicion(letra)
            nueva_pos = (pos_actual + numDesplazamiento) % len(Abecedario)
            cifrado += Abecedario[nueva_pos]
        else:
            cifrado += letra
    return cifrado

def descifrarCesar(texto, numDesplazamiento):
    texto = texto.upper()
    descifrado = ""
    for letra in texto:
        if letra in Abecedario:
            pos_actual = buscar_posicion(letra)
            nueva_pos = (pos_actual - numDesplazamiento) % len(Abecedario)
            descifrado += Abecedario[nueva_pos]
        else:
            descifrado += letra
    return descifrado


