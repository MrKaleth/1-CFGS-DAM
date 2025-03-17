import random
colores = ["rojo","negro"]
numeros = range(0,37)

numero_usuario = int(input("Elige un número entre 0 y 36: "))
color_usuario = input("Elige un color entre rojo y negro: ").lower()

if numero_usuario not in numeros or color_usuario not in colores:
    print("ERROR, DATOS NO VÁLIDOS")
    quit()

color_ganador = random.choice(colores)
numero_ganador = random.choice(numeros)

print(f"Ha tocado... el {numero_ganador} {color_ganador}")

if numero_ganador == numero_usuario and color_ganador == color_usuario:
    print("¡HAS GANADO!")
elif numero_ganador == numero_usuario:
    print("¡Has acertado el número!")
elif color_ganador == color_usuario:
    print("¡Has acertado el color!")
else:
    print("¡Has perdido!")

quit()