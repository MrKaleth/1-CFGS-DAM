# Embajador Galáctico

import random

def iniciarMision():
    planetas = []
    for i in range(0,30):
        planetas.append(i)           
    return planetas

def Amigos(planetas):
    planetasAmigos = []
    amigosLleno = False
    while amigosLleno == False:
            amigo = random.randint(0,30)
            if amigo in planetas:
                if amigo not in planetasAmigos:
                    planetasAmigos.append(amigo)
                    if len(planetasAmigos) == 15:
                        amigosLleno = True
    return planetasAmigos

def Hostiles(planetasAmigos):
    planetasHostiles = []
    hostilesLlenos = False
    while not hostilesLlenos:
            hostil = random.randint(0,30)
            if hostil not in planetasAmigos:
                if hostil not in planetasHostiles:
                    planetasHostiles.append(hostil)
                    if len(planetasHostiles) == 5:
                        hostilesLlenos = True
    return planetasHostiles

def visitarPlaneta(visita):
    tipo = 0
    if visita in planetasAmigos:
        print("El planeta visitado nº:", visita, "es amigo.")
        tipo = 1
    elif visita in planetasHostiles:
        print("El planeta visitado nº:", visita, "es hostil. Cuidado.")
        tipo = 2
    elif visita > 29:
        print("Error. Planeta no existente.")
    else:
        print("El planeta visitado nº:", visita, "es neutral.")
        tipo = 3
    return tipo

def puntuacion(amigosVisitados, hostilesVisitados, neutralesVisitados):
    totales = amigosVisitados + hostilesVisitados + neutralesVisitados
    puntaje = amigosVisitados - hostilesVisitados
    print("Nº de planetas totales visitados:", totales)
    print("Nº de planetas amigos visitados:", amigosVisitados)
    print("Nº de planetas hostiles visitados:", hostilesVisitados)
    print("Nº de planetas neutrales visitados: ", neutralesVisitados)
    
    return puntaje

def menu():
    print("\nI). Iniciar Misión.")
    print("V). Visitar Planeta.")
    print("E). Imprime estado actual de la misión.")
    print("S). Salir.")
    opcion = input("\nIntroduce tu elección: ").upper()
    return opcion

salir = False
opcion = ""
amigosVisitados = 0
hostilesVisitados = 0
neutralesVisitados = 0
while not salir:
    opcion = menu()
        
    if opcion == "I":
        planetas = iniciarMision()
        planetasAmigos = Amigos(planetas)
        planetasHostiles = Hostiles(planetasAmigos)
        print("\n", planetas)
        print("\n", planetasAmigos)
        print("\n", planetasHostiles)
        
    elif opcion == "V":
        visita = int(input("Introduce el planeta que deseas visitar: "))
        tipo = visitarPlaneta(visita)
        if tipo == 1:
            amigosVisitados += 1
        elif tipo == 2:
            hostilesVisitados += 1
        elif tipo == 3:
            neutralesVisitados +=1
            
    elif opcion == "E":
        print("Estado actual de la misión")
        puntaje = puntuacion(amigosVisitados, hostilesVisitados, neutralesVisitados)
        if puntaje < 0:
            print("Has perdido")
    elif opcion == "S":
        print("Saliendo del programa")
        salir = True
    else:
        print("Error, opción no válida.")