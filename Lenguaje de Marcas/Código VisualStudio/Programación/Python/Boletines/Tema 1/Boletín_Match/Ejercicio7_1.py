salir = False
while not salir:
    print("========================================")
    print("CALCULADORA")
    print("========================================")
    print("Introduzca + si desea sumar")
    print("Introduzca - si desea restar")
    print("Introduzca * si desea multiplicar")
    print("Introduzca / si desea dividir")
    print("Introduzca @ para salir del menú.")
    print("=========================================")

    operador = input("Seleccione una opción: ")

    if operador == "+" or operador == "-" or operador == "*" or operador == "/" or operador == "@":
        num1 = int(input("Introduce el primer número: "))
        num2 = int(input("Introduce el segundo número: "))
        
        match operador:
            case "+":
                resultado = num1 + num2
                print("El resultado de la suma es:", resultado)
            case "-":
                resultado = num1 - num2
                print("El resultado de la resta es:", resultado)
            case "*":
                resultado = num1 * num2
                print("El resultado de la multiplicación es:", resultado)
            case "/":
                if num2 != 0:
                    resultado = num1 / num2
                    print("El resultado de la división es:", resultado)
                else:
                    print("Error: No se puede dividir entre cero.")
            case "@":
                salir = True
                print("Saliendo del menú...")
    else:
        print("ERROR. Caracter no reconocido.")