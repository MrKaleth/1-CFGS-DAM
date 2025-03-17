def ConvertirEspaciado(cadena):
    cadenaResultado = ""  
    for caracter in cadena: 
        if caracter != " ":
            cadenaResultado += caracter + " "  
    return cadenaResultado

Cad1 = input("Introduce tu cadena: ")
print(ConvertirEspaciado(Cad1))
