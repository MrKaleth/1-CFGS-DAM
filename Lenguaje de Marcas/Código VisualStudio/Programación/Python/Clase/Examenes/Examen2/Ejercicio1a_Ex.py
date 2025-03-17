# Hundir la Flota.
import random
'''
funciones:

crearLista
    return posiciones posibles

iniciaPartida
    return posiciones barcos en partida

disparar
    acertar
    return acertar

resultado
    puntuación
    return Mensaje con puntuación
'''



def creaLista():
    PosicionesTotal = []
    for i in range(0,50):
        PosicionesTotal.append(i)
    return PosicionesTotal

def iniciaPartida():
    PosicionesBarcos = []
    while len(PosicionesBarcos) < 10:
        pos = random.randint(0,49)
        if pos not in PosicionesBarcos:
            PosicionesBarcos.append(pos)
    return PosicionesBarcos

def disparar():
    acertar = False
    posicion = int(input("Elige la posición en la que deseas disparar: "))
    if posicion not in PosicionesTotal:
        print("Error. posicion no válida.")
    else:
        if posicion in PosicionesBarcos:
            print("Tocado y hundido. Has acertado en la posición", posicion)
            acertar = True
        else:
            print("¡Agua! No había ningún barco en la posición", posicion)
    return acertar

def Resultado():
    puntuación = barcosHundidos / disparos * 100
    mensaje = "nº de disparos realizados:", disparos, "nº de barcos hundidos:", barcosHundidos, "nº de barcos que quedan por hundir:", barcosPorHundir, "Puntuación actual:", puntuación
    return mensaje

def menu():
    print("\n=============================================")
    print("--- Menú principal ---")
    print("I. Iniciar Partida.")
    print("D. Disparar.")
    print("R. Imprime Resultado Actual.")
    print("S. Salir.")
    print("=============================================")
    
    opcion = input("Elige una opción: ").upper()
    return opcion

barcosHundidos = 0
barcosPorHundir = 10 - barcosHundidos
disparos = 0

opcion = ""
while opcion != "S":
    opcion = menu()
    if opcion == "I":
        print("\nIniciando partida.")
        PosicionesTotal = creaLista()
        PosicionesBarcos = iniciaPartida()
        print(PosicionesBarcos)
    elif opcion == "D":
        print("\nDisparando.")
        if disparar() == True:
            disparos += 1
            barcosHundidos +=1
        else:
            disparos += 1
    elif opcion == "R":
        print("\nEl estado actual de la partida es:")
        print(Resultado())
    elif opcion == "S":
        print("\nSaliendo del programa.")
    else:
        print("\nOpción no válida.")    