import random

numero_aleatorio = random.randint(1, 10)

num1 = None

print("He seleccionado un número entre 1 y 10. ¡Intenta adivinarlo!")

while num1 != numero_aleatorio:
    num1 = int(input("Introduce tu número: "))
    
    if num1 < numero_aleatorio:
        print("Demasiado bajo. Intenta de nuevo.")
    elif num1 > numero_aleatorio:
        print("Demasiado alto. Intenta de nuevo.")

print("¡Felicidades! Has adivinado el número:", numero_aleatorio)
