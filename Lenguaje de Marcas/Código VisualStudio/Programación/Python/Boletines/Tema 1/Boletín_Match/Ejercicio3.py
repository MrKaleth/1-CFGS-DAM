mes = int(input("Introduce el número de un mes: "))
día = int(input("Introduce el día del mes: "))

match mes:
    case 1 | 2:
        print("Estamos en Invierno")
    case 3:
        if día <= 20:
            print("Estamos en Invierno")
        else:
            print("Estamos en Primavera")
    case 4 | 5:
        print("Estamos en Primavera")
    case 6:
        if día <= 20:
            print("Estamos en Primavera")
        else:
            print("Estamos en Verano")
    case 7 | 8:
        print("Estamos en Verano")
    case 9:
        if día <= 20:
            print("Estamos en Verano")
        else:
            print("Estamos en Otoño")
    case 10 | 11:
        print("Estamos en Otoño")
    case 12:
        if día <= 20:
            print("Estamos en Otoño")
        else:
            print("Estamos en Invierno")
    case _:
        print("Número de mes no válido.")