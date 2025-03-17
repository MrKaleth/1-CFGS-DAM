Clave_Usu = input("Intorduce tu clave: ")

match Clave_Usu:
    case "1234" | "4321":
        print("Clave correcta")
    case _:
        print("Clave incorrecta")