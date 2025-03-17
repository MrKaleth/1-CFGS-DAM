import random

def generarNumeros():
    return [random.randint(0, 1000) for _ in range(100)]

def obtenerMayor(lista):
    mayor = lista[0]
    for numero in lista:
        if numero > mayor:
            mayor = numero
    return mayor

def obtenerMenor(lista):
    menor = lista[0]
    for numero in lista:
        if numero < menor:
            menor = numero
    return menor

def calculaSuma(lista):
    suma = 0
    for numero in lista:
        suma += numero
    return suma

def calculaMedia(lista):
    suma = calculaSuma(lista)
    return suma / len(lista)

def sustituirValor(lista):
    elemento1 = int(input("Introduce un número para sustituir en la lista: "))
    nuevoElemento = int(input("Introduce el número que sustituirá al anterior: "))
    for i in range(len(lista)):
        if elemento1 == lista[i]:
            lista[i] = nuevoElemento
    return lista

def mostrarNumeros(lista):
    print(lista)

def menu():
    print("\n================================================")
    print("--- Menú ---")
    print("1. Conocer el mayor")
    print("2. Conocer el menor")
    print("3. Obtener la suma de todos los números")
    print("4. Obtener la media")
    print("5. Sustituir el valor de un elemento")
    print("6. Mostrar todos los números")
    print("7. Genera nuevos números.")
    print("8. Salir")
    print("================================================")
    
    return input("\nIntroduce tu elección: ")

numeros = generarNumeros()

opcion = ""

while opcion != "8":
    opcion = menu()

    if opcion == "1":
        print("\nEl mayor número es:", obtenerMayor(numeros))
    elif opcion == "2":
        print("\nEl menor número es:", obtenerMenor(numeros))
    elif opcion == "3":
        print("\nLa suma de todos los números es:", calculaSuma(numeros))
    elif opcion == "4":
        print("\nLa media de los números es:", calculaMedia(numeros))
    elif opcion == "5":
        sustituirValor(numeros)
    elif opcion == "6":
        print("\nLista de números:")
        mostrarNumeros(numeros)
    elif opcion == "7":
        print("\nGenerando nuevos números")
        numeros = generarNumeros()
    elif opcion == "8":
        print("\nSaliendo del programa. ¡Hasta pronto!")
    else:
        print("\nOpción no válida. Intente de nuevo.")