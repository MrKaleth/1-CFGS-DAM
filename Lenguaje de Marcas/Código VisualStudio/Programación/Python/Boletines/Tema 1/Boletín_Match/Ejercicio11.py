import random
ganador = False
puntuación_maq = 0
puntuación_usu = 0
partidas = 0

while not ganador:
    elec_usuario = input("Elige: Piedra, Papel o Tijera: ").upper()
    elec_maquina = random.randint(0, 2)

    match elec_maquina:
        case 0:
            maquina = "PIEDRA"
        case 1:
            maquina = "PAPEL"
        case 2:
            maquina = "TIJERA"

    match elec_usuario:
        case "PIEDRA":
            if maquina == "PIEDRA":
                resultado = "Empate"
            elif maquina == "PAPEL":
                resultado = "La máquina gana"
                puntuación_maq += 1
            else:
                resultado = "El usuario gana"
                puntuación_usu += 1
        case "PAPEL":
            if maquina == "PIEDRA":
                resultado = "El usuario gana"
                puntuación_usu += 1
            elif maquina == "PAPEL":
                resultado = "Empate"
            else:
                resultado = "La máquina gana"
                puntuación_maq += 1
        case "TIJERA":
            if maquina == "PIEDRA":
                resultado = "La máquina gana"
                puntuación_maq += 1
            elif maquina == "PAPEL":
                resultado = "El usuario gana"
                puntuación_usu += 1
            else:
                resultado = "Empate"
        case _:
            resultado = "Opción no válida"
        
    print("El usuario eligió:", elec_usuario)
    print("La máquina eligió:", maquina)
    print(resultado)
    print("Puntuación: Máquina", puntuación_maq, "Usuario", puntuación_usu)
    partidas += 1

    if puntuación_usu == 3 or puntuación_maq == 3:
        ganador = True
        if puntuación_maq == 3:
            print("Máquina es el ganador definivo!")
        else:
            print("Usuario es el ganador definitivo!")

    elif partidas == 3 and not puntuación_usu == 3 or puntuación_maq == 3:
        continuar = input("¿Deseas seguir jugando? ").upper()
        if continuar == "SÍ":
            ganador = True