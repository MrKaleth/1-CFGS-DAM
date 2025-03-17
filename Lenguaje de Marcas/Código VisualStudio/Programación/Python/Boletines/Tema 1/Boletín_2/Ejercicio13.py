operador = input("Introduce un operador aritmético (+, -, *, /, %): ")

numero1 = int(input("Introduce el primer número: "))
numero2 = int(input("Introduce el segundo número: "))

if operador == "+" or operador == "-" or operador == "*" or operador == "/" or operador == "%":
    if operador == "+":
        resultado = numero1 + numero2
        print("Resultado:", resultado)
    elif operador == "-":
        resultado = numero1 - numero2
        print("Resultado:", resultado)
    elif operador == "*":
        resultado = numero1 * numero2
        print("Resultado:", resultado)
    elif operador == "/":
        if numero2 != 0:
            resultado = numero1 / numero2
            print("Resultado:", resultado)
        else:
            print("Error: División por cero.")
    elif operador == "%":
        if numero2 != 0:
            resultado = numero1 % numero2
            print("Resultado:", resultado)
        else:
            print("Error: División por cero.")
else:
    print("Error: El carácter introducido no es un operador aritmético.")
