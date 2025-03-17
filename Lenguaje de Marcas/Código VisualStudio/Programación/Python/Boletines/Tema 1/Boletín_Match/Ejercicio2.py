mes = int(input("Introduce el número de un mes: "))

match mes:
    case 1 | 2 | 3:
        print("Estamos en Invierno")
    case 4 | 5 | 6:
        print("Estamos en Primavera")
    case 7 | 8 | 9:
        print("Estamos en Verano")
    case 10 | 11 | 12:
        print("Estamos en Otoño")