num1 = int(input("Dime un número: "))
num2 = int(input("Dime un segundo número: "))
num3 = int(input("Dime un tercer número: "))

num_ordenar = [num1, num2, num3]

print("Entonces, los números son estos? ", num_ordenar)

num_ordenar.sort()
print("Bien, los números ya están ordenados: ", num_ordenar)

quit()