print("Selecciona la operación:")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")

eleccion = int(input("Introduce el número de la operación que deseas realizar (1/2/3/4): "))

num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

match eleccion:
    case 1:
        print("El resultado de la suma es:", num1 + num2)
    case 2:
        print("El resultado de la resta es:", num1 - num2)
    case 3:
        print("El resultado de la multiplicación es:", num1 * num2)
    case 4:
        if num2 != 0:
            print("El resultado de la división es:", num1 / num2)
        else:
            print("Error: División por cero no permitida.")
    case _:
        print("Operación no válida.")
