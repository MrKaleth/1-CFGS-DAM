salir = False
while not salir:
    print("========================================")
    print("BIENVENIDOS AL JUEGO DE ADIVINAR CONTRASEÑAS")
    print("========================================")
    print("Introduzca J1 si es el jugador 1")
    print("Introduzca J2 si es el jugador 2")
    print("=========================================")

    jugador = input("Realice la Selección de jugador: ").upper()

    if jugador == "J1":
        contraseña = input("Introduce tu contaseña secreta para que J2 la adivine: ")
    if jugador == "J2":
        print("Jugador 2, debes tratar de adivinar la Contraseña del jugador 1")
        print("Para ello, te otorgaré las siguientes pistas:")
        print("la contraseña tiene el siguiente número de caracteres:", len(contraseña))
        print("El primer caracter de la contraseña es:", contraseña[0])
        print("El último caracter de la contraseña es:", contraseña[-1])
        respuesta = input("Bien, realiza tu intento: ")
        
        if respuesta == contraseña:
            salir = True
        else:
            while respuesta != contraseña:
                print("Vaya, has fallado, prueba de nuevo")
                respuesta = input("Realiza un nuevo intento: ")

print("Enhorabuena, has ganado.")