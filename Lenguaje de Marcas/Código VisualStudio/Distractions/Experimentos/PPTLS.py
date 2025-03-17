import random
ganador = False
puntuacion_maq = 0
puntuacion_usu = 0
partidas = 0

jugadas = ["PIEDRA", "PAPEL", "TIJERA", "LAGARTO", "SPOCK"]

while not ganador:
    elec_usuario = input("Elige: Piedra, Papel, Tijera, Lagarto o Spock: ").upper()
    
    if elec_usuario not in jugadas:
        print("Opción no válida, elige nuevamente.")
        continue
    
    elec_maquina = random.randint(0, 4)
    maquina = jugadas[elec_maquina]

    match elec_usuario:
        case "PIEDRA":
            if maquina == "PIEDRA":
                resultado = "Empate"
            elif maquina in ["PAPEL", "SPOCK"]:
                resultado = "La máquina gana"
                puntuacion_maq += 1
            else:
                resultado = "El usuario gana"
                puntuacion_usu += 1
        case "PAPEL":
            if maquina == "PAPEL":
                resultado = "Empate"
            elif maquina in ["TIJERA", "LAGARTO"]:
                resultado = "La máquina gana"
                puntuacion_maq += 1
            else:
                resultado = "El usuario gana"
                puntuacion_usu += 1
        case "TIJERA":
            if maquina == "TIJERA":
                resultado = "Empate"
            elif maquina in ["PIEDRA", "SPOCK"]:
                resultado = "La máquina gana"
                puntuacion_maq += 1
            else:
                resultado = "El usuario gana"
                puntuacion_usu += 1
        case "LAGARTO":
            if maquina == "LAGARTO":
                resultado = "Empate"
            elif maquina in ["PIEDRA", "TIJERA"]:
                resultado = "La máquina gana"
                puntuacion_maq += 1
            else:
                resultado = "El usuario gana"
                puntuacion_usu += 1
        case "SPOCK":
            if maquina == "SPOCK":
                resultado = "Empate"
            elif maquina in ["PAPEL", "LAGARTO"]:
                resultado = "La máquina gana"
                puntuacion_maq += 1
            else:
                resultado = "El usuario gana"
                puntuacion_usu += 1
    
    print("El usuario eligió:", elec_usuario)
    print("La máquina eligió:", maquina)
    print(resultado)
    print("Puntuación: Máquina", puntuacion_maq, "Usuario", puntuacion_usu)
    partidas += 1

    if puntuacion_usu == 3 or puntuacion_maq == 3:
        ganador = True
        if puntuacion_maq == 3:
            print("¡La máquina es la ganadora definitiva!")
        else:
            print("¡El usuario es el ganador definitivo!")
    
    elif partidas == 3:
        continuar = input("¿Deseas seguir jugando? (Sí/No): ").upper()
        if continuar == "SÍ":
            partidas = 0 
        elif continuar == "NO":
            ganador = True
            print("Juego terminado.")
        else:
            print("Eres un puto Impaciente")
            partidas = 0
