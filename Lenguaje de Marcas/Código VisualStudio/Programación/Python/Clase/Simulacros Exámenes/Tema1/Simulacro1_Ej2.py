'''
Diseña y codifica un programa que te vaya pidiendo grupos de 3 números. 
Para cada grupo de 3, debes imprimirlos ordenados y volver a pedirte otros tres. 
El programa debe terminar cuando, al menos, ha leído un grupo en los que dos o más números son 0 o menores que 0.
'''
Funcionar = False
ceros = 0

while not Funcionar:
    ceros = 0

    num1 = int(input("Escribe un número: "))
    num2 = int(input("Escribe un segundo número: "))
    num3 = int(input("Escribe un tercer número: "))

    grupo = [num1, num2, num3]
    print("Grupo Desordenado: ", grupo)

    if grupo[0] > grupo[1]:
        grupo[0], grupo[1] = grupo[1], grupo [0]
    
    if grupo[0] > grupo[2]:
        grupo[0], grupo[2] = grupo[2], grupo[0]

    if grupo[1] > grupo[2]:
        grupo[1], grupo[2] = grupo[2], grupo[1]
    
    print("Grupo Ordenado: ", grupo)

    if num1 <= 0:
        ceros +=1
    if num2 <= 0:
        ceros +=1
    if num3 <= 0:
        ceros +=1

    if ceros >= 2:
        Funcionar = True
        print("Programa Finalizado")