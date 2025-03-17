def es_numero(cadena):
    es_num = True
    for elemento in cadena:
        if elemento < "0" or elemento > "9":
            es_num = False
    return es_num

def son_letras(cadena):
    es_letra = True
    for c in cadena:
        if not ("A" <= c <= "Z" or "a" <= c <= "z"):
            es_letra = False
    return es_letra 
 
def validaMatricula(matricula):
    valido = False
    if len(matricula) == 7:
        if es_numero(matricula[:4]) and son_letras(matricula[4:]):
            valido = True
    return valido

def asignarSurtidor():

    return

def calculaLitros():
    
    return

def getSurtidor():

    return

def menu():
    print("\n================================================")
    print("--- Gasolinera Algagas ---")
    print("1. Asignar coche a surtidor y repostar")
    print("2. Consultar estado de surtidores")
    print("3. Asignar precio al surtidor")
    print("4. Recargar surtidor")
    print("5. Cerrar el programa y salir")
    print("================================================")
    
    return input("\nIntroduce tu elección: ")

opcion = ""

while opcion != "5":
    opcion = menu()

    if opcion == "1":
        matricula = input("\nIntroduce la matrícula del vehículo: ")
        if validaMatricula(matricula):
            print("La matrícula es válida")
            importe = int(input("¿Cuánto dinero deseas gastar en el combustible? Importe mínimo 10 euros. "))
            tipo_Combustible = input("¿Gasolina o Diesel? ")
        else:
            print("La matrícula no es válida. Recuerda: formato 1234ABC.")

    elif opcion == "2":
        print("\nConsulta de estado de surtidores (en desarrollo).")

    elif opcion == "3":
        print("\nAsignación de precio a surtidores (en desarrollo).")

    elif opcion == "4":
        print("\nRecarga de surtidores (en desarrollo).")

    elif opcion == "5":
        print("\nSaliendo del programa. ¡Hasta pronto!")

    else:
        print("\nOpción no válida. Intente de nuevo.")
