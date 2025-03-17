def Login(usuario, contraseña, intentos):
    if usuario == "usuario1" and contraseña == "asdasd":
        return True, intentos
    else:
        intentos += 1
        return False, intentos

intentos = 0
max_intentos = 3
acceso = False

while intentos < max_intentos and not acceso:
    usuario = input("Introduce el nombre de usuario: ")
    contraseña = input("Introduce la contraseña: ")
    
    acceso, intentos = Login(usuario, contraseña, intentos)
    
    if not acceso:
        print("Inicio de Sesión incorrecto. Intentos restantes:", max_intentos - intentos)

if acceso:
    print("Inicio de Sesión exitoso. Bienvenido.")
else:
    print("Has alcanzado el número máximo de intentos. Acceso bloqueado.")