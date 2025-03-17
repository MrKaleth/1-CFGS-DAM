Contraseña = 1234
num1 = 0

while num1 != Contraseña:
    num1 = int(input("Introduce la contraseña: "))
    if num1 != Contraseña:
        print("Contraseña incorrecta")

print("Acceso Autorizado")