día = input("Introduce el día de la Semana: ")
día = día.upper()

match día:
    case "LUNES":
        print("==============================\nLUNES\n==============================")
        print("8-9 LM\n9-10 LM\n10-11 LM")
        print("==============================")
    
    case "MARTES":
        print("==============================\nMARTES\n==============================")
        print("8-9 PROG\n9-10 PROG\n10-11 ENT")
        print("==============================")

    case "MIÉRCOLES":
        print("==============================\nMIÉRCOLES\n==============================")
        print("8-9 PROG\n9-10 PROG\n10-11 BD")
        print("==============================")

    case "JUEVES":
        print("==============================\nJUEVES\n==============================")
        print("8-9 PROG\n9-10 PROG\n10-11 IT.PE")
        print("==============================")

    case "VIERNES":
        print("==============================\nVIERNES\n==============================")
        print("8-9 PROG\n9-10 PROG\n10-11 BD")
        print("==============================")

    case "SÁBADO":
        print("==============================\nSÁBADO\n==============================")
        print("Día de estudio y reflexión")
        print("==============================")

    case "DOMINGO":
        print("==============================\nDOMINGO\n==============================")
        print("Día de estudio y reflexión")
        print("==============================")

    case _:
        print("ERROR: SINTAXIS NO VÁLIDA")