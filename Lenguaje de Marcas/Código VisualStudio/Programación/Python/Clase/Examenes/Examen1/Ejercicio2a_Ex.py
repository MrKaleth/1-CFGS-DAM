salir = False
impares = []

while not salir:
    num1 = int(input("Introduce un número: "))
    num2 = int(input("Introduce un segundo número: "))

    if num1 >= num2:
        if num1 == 0 and num2 == 0:
            salir = True
            print("Saliendo del Programa")
        else:
            print("Por favor, introduzca otros números diferentes")   

    elif num1 < num2:
        print("===================================================")
        print("Impares que existen entre: [", num1, "-", num2, "]")

        for i in range(num1, num2, 1):
            if i % 2 != 0:
                print(i)
                impares.append(i)
        if num2 % 2 !=0:
            print(num2)
            impares.append(num2)

        print("En total existen", len(impares), "numeros imapares en el rango")
        print("===================================================") 