def miFuncion():
    global x
    x = 200
    print("Dentro de la función: ",x)
    return x




x = 300
x = miFuncion()
print("Fuera de la función: ",x)
