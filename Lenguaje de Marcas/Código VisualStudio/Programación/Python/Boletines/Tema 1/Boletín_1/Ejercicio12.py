import random

numero1 = random.randint(0, 100)
numero2 = random.randint(0, 100)

suma_correcta = numero1 + numero2

print("Calcula la suma de los siguientes dos números:")
print("Número 1:", numero1)
print("Número 2:", numero2)

while True:
    respuesta_usuario = int(input("Introduce tu respuesta: "))
    
    if respuesta_usuario == suma_correcta:
        print("¡Correcto! La suma es:", suma_correcta)
        break 
    else:
        print("Incorrecto. Intenta de nuevo.")

print("Programa terminado.")
