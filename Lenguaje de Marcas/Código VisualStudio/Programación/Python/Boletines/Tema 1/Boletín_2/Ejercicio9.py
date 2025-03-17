edad = int(input("Introduce la edad (menor a 100 años): "))

if 0 <= edad < 100:
    if 0 <= edad <= 12:
        print("Eres un niño.")
    elif 13 <= edad <= 17:
        print("Eres un adolescente.")
    elif 18 <= edad <= 29:
        print("Eres un joven.")
    else:
        print("Eres un adulto.")
else:
    print("Edad no válida. Debe ser menor a 100 años.")
