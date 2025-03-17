def es_numero(cadena):
    es_num = True
    for char in cadena:
        if char < "0" or char > "9":
            es_num = False
    return es_num


def validaDNI():
    LetrasDNI = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", 
                 "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"]

    valido = False
    tipoDNI = input("Introduce el tipo de DNI que es (Español Residente o Extranjero Residente): ").lower()

    if tipoDNI == "español residente":
        dni = input("Introduce el DNI completo (8 dígitos + letra): ").upper()
        
        if len(dni) == 9 and es_numero(dni[:-1]) and dni[-1] in LetrasDNI:
            dniNums = dni[:-1]
            dniLetra = dni[-1]
            resto = int(dniNums) % 23
            if LetrasDNI[resto] == dniLetra:
                print("Este DNI es válido")
                valido = True
            else:
                print("Este DNI no es válido")
        else:
            print("Formato incorrecto de DNI")

    elif tipoDNI == "extranjero residente":
        dni = input("Introduce el NIE completo (letra inicial + 7 dígitos + letra de verificación): ").upper()
        
        if len(dni) == 9 and dni[0] in "XYZ" and es_numero(dni[1:-1]) and dni[-1] in LetrasDNI:
            dniNums = dni[1:-1]
            dniLetra = dni[0]
            dniCode = dni[-1]

            if dniLetra == "X":
                dniNums = "0" + dniNums
            elif dniLetra == "Y":
                dniNums = "1" + dniNums
            elif dniLetra == "Z":
                dniNums = "2" + dniNums

            resto = int(dniNums) % 23
            if LetrasDNI[resto] == dniCode:
                print("Este DNI es válido")
                valido = True
            else:
                print("Este DNI no es válido")
        else:
            print("Formato incorrecto de NIE")

    else:
        print("Tipo de DNI no reconocido.")

    return valido

validaDNI()
