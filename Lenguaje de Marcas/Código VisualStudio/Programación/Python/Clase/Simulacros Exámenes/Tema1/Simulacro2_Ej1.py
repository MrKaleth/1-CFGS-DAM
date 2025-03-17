clientes_normales = 0
clientes_premium = 0
correos = []

salir = False

while not salir:
    print("==================================================")
    print("A) Añadir cliente")
    print("B) Mostrar los % de clientes premium y normales")
    print("G) Salir")
    print("==================================================")
    
    comando = input("Introduzca comando: ").upper()

    if comando == "A":
        tipo_cliente = input("¿El Cliente es Premium o no? (S/N) ").upper()
        correo = input("Introduce el correo electrónico del Cliente: ")
        correos.append(correo)

        if tipo_cliente == "S":
            clientes_premium +=1
        elif tipo_cliente == "N":
            clientes_normales +=1
    
    elif comando == "B":
        total_clientes = clientes_normales + clientes_premium
        if total_clientes > 0:
            porcentaje_normales = (clientes_normales / total_clientes) * 100
            porcentaje_premium = (clientes_premium / total_clientes) * 100
            print("Porcentaje de clientes normales: ", porcentaje_normales, "%")
            print("Porcentaje de clientes premium: ", porcentaje_premium, "%")
        else:
            print("No hay clientes para calcular porcentajes.")

    elif comando == "G":
        salir = True
        print("Saliendo del Programa...")

    else:
        print("Comando incorrecto, pruebe de nuevo")