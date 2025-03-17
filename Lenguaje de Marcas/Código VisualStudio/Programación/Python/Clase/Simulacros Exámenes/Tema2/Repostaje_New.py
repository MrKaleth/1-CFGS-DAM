# Variables iniciales
surtidores = [
    {"tipo": "gasolina", "distribuido": 0, "capacidad": 5000, "precio": 0},
    {"tipo": "gasolina", "distribuido": 0, "capacidad": 5000, "precio": 0},
    {"tipo": "diésel", "distribuido": 0, "capacidad": 5000, "precio": 0},
    {"tipo": "diésel", "distribuido": 0, "capacidad": 5000, "precio": 0}
]

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

def asignarSurtidor(tipo_combustible):
    surtidores_posibles = [0, 1] if tipo_combustible == "gasolina" else [2, 3]
    surtidor_seleccionado = surtidores_posibles[0]
    menor_distribuido = surtidores[surtidor_seleccionado]["distribuido"]
    
    for i in surtidores_posibles:
        if surtidores[i]["distribuido"] < menor_distribuido:
            surtidor_seleccionado = i
            menor_distribuido = surtidores[i]["distribuido"]
    
    return surtidor_seleccionado

def calculaLitros(importe, precio):
    return importe / precio

def consultarSurtidores():
    estado = []
    for i in range(len(surtidores)):
        restante = surtidores[i]["capacidad"] - surtidores[i]["distribuido"]
        estado.append({
            "surtidor": i + 1,
            "tipo": surtidores[i]["tipo"],
            "distribuido": surtidores[i]["distribuido"],
            "restante": restante,
            "precio": surtidores[i]["precio"]
        })
    return estado

def recargarSurtidor(num_surtidor):
    surtidores[num_surtidor]["distribuido"] = 0
    return "Surtidor " + str(num_surtidor + 1) + " recargado a su capacidad máxima."

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

# Inicialización de precios
for i in range(len(surtidores)):
    precio = input("Introduce el precio para " + surtidores[i]["tipo"] + " (€/litro): ")
    surtidores[i]["precio"] = int(precio)

# Bucle principal
opcion = ""
while opcion != "5":
    opcion = menu()

    if opcion == "1":
        matricula = input("\nIntroduce la matrícula del vehículo: ")
        if validaMatricula(matricula):
            print("Matrícula válida.")
            importe = int(input("¿Cuánto dinero deseas gastar en el combustible? (Mínimo 10€): "))
            if importe >= 10:
                tipo_combustible = input("¿gasolina o diésel? ").upper()
                if tipo_combustible == "gasolina" or tipo_combustible == "diésel":
                    surtidor = asignarSurtidor(tipo_combustible)
                    litros = calculaLitros(importe, surtidores[surtidor]["precio"])
                    if surtidores[surtidor]["distribuido"] + litros <= surtidores[surtidor]["capacidad"]:
                        surtidores[surtidor]["distribuido"] += litros
                        print("Repostando " + str(litros) + " litros de " + tipo_combustible.upper() + " en el surtidor " + str(surtidor + 1))
                    else:
                        print("No hay suficiente capacidad en el surtidor " + str(surtidor + 1) + ".")
                else:
                    print("Tipo de combustible no válido. Elige entre 'gasolina' o 'diésel'.")
            else:
                print("El importe debe ser como mínimo 10€.")
        else:
            print("Matrícula no válida. Formato: 1234ABC.")

    elif opcion == "2":
        estado = consultarSurtidores()
        for s in estado:
            print("Surtidor " + str(s["surtidor"]) + " (" + s["tipo"] + "):")
            print(" - Combustible distribuido: " + str(s["distribuido"]) + " litros")
            print(" - Capacidad restante: " + str(s["restante"]) + " litros")
            print(" - Precio: " + str(s["precio"]) + " €/litro")
            print("-" * 40)

    elif opcion == "3":
        surtidor = int(input("Introduce el número del surtidor (1-4): ")) - 1
        if 0 <= surtidor <= 3:
            nuevo_precio = int(input("Introduce el nuevo precio para el surtidor " + str(surtidor + 1) + ": "))
            if nuevo_precio > 1:
                surtidores[surtidor]["precio"] = nuevo_precio
                print("Precio del surtidor " + str(surtidor + 1) + " actualizado a " + str(nuevo_precio) + " €/litro.")
            else:
                print("El precio debe ser mayor a 1 €/litro.")
        else:
            print("Número de surtidor no válido.")

    elif opcion == "4":
        surtidor = int(input("Introduce el número del surtidor a recargar (1-4): ")) - 1
        if 0 <= surtidor <= 3:
            mensaje = recargarSurtidor(surtidor)
            print(mensaje)
        else:
            print("Número de surtidor no válido.")

    elif opcion == "5":
        print("Saliendo del programa. ¡Hasta pronto!")
    else:
        print("Opción no válida. Intente de nuevo.")
