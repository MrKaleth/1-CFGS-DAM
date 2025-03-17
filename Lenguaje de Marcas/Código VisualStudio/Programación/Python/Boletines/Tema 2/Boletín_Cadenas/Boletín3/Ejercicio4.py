frase = input("Introduce una frase: ")
posMedia = len(frase) // 2
if frase[posMedia] == " ":
    print("El caracter central es un espacio")
else:
    print("El caracter central es:", frase[posMedia])