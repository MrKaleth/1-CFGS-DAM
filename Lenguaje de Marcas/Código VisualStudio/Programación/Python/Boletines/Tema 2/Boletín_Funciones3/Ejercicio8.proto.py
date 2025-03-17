import random

# Generar 100 números aleatorios entre 0 y 1000
def generar_numeros():
    return [random.randint(0, 1000) for _ in range(100)]

# Obtener el mayor número
def obtener_mayor(lista):
    mayor = lista[0]
    for numero in lista:
        if numero > mayor:
            mayor = numero
    return mayor

# Obtener el menor número
def obtener_menor(lista):
    menor = lista[0]
    for numero in lista:
        if numero < menor:
            menor = numero
    return menor

# Calcular la suma de todos los números
def calcular_suma(lista):
    suma = 0
    for numero in lista:
        suma += numero
    return suma

# Calcular la media de los números
def calcular_media(lista):
    return calcular_suma(lista) / len(lista)

# Sustituir un valor por otro
def sustituir_valor(lista, indice, nuevo_valor):
    if 0 <= indice < len(lista):
        lista[indice] = nuevo_valor
        return True
    return False

# Mostrar todos los números
def mostrar_numeros(lista):
    for numero in lista:
        print(numero, end=" ")
    print()

# Programa principal
numeros = generar_numeros()
opcion = None

while opcion != "7":
    print("\n--- Menú ---")
    print("1. Conocer el mayor")
    print("2. Conocer el menor")
    print("3. Obtener la suma de todos los números")
    print("4. Obtener la media")
    print("5. Sustituir el valor de un elemento")
    print("6. Mostrar todos los números")
    print("7. Salir")

    opcion = input("Seleccione una opción: ")

    if opcion == "1":
        print("El mayor número es:", obtener_mayor(numeros))
    elif opcion == "2":
        print("El menor número es:", obtener_menor(numeros))
    elif opcion == "3":
        print("La suma de todos los números es:", calcular_suma(numeros))
    elif opcion == "4":
        print("La media de los números es:", calcular_media(numeros))
    elif opcion == "5":
        indice = int(input("Introduzca el índice del número que desea sustituir (0-99): "))
        nuevo_valor = int(input("Introduzca el nuevo valor: "))
        if sustituir_valor(numeros, indice, nuevo_valor):
            print("El número ha sido sustituido.")
        else:
            print("Índice no válido.")
    elif opcion == "6":
        print("Lista de números:")
        mostrar_numeros(numeros)
    elif opcion == "7":
        print("Saliendo del programa. ¡Hasta pronto!")
    else:
        print("Opción no válida. Intente de nuevo.")
