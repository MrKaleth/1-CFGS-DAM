caracter = input("Introduce un carácter: ")

if caracter == "A" or "a":
    print("Es la primera vocal (A).")
elif caracter == "E" or "e":
    print("Es la segunda vocal (E).")
elif caracter == "I" or "i":
    print("Es la tercera vocal (I).")
elif caracter == "O" or "o":
    print("Es la cuarta vocal (O).")
elif caracter == "U" or "u":
    print("Es la quinta vocal (U).")
else:
    print(caracter, "no es una vocal.")
