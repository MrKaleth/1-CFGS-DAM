caracter = input("Introduce un carácter: ")

if caracter == "A" or caracter == "a" or caracter == "E" or caracter == "e" or caracter == "I" or caracter == "i" or caracter == "O" or caracter == "o" or caracter == "U" or caracter == "u":
    print("Es la vocal:", caracter.upper())
else:
    print(caracter, "no es una vocal, sino una consonante.")