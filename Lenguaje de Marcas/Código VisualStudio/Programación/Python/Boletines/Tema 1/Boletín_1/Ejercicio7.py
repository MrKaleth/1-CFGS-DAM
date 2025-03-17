num1 = int(input("Dime un número: "))
num2 = int(input("Dime otro número: "))

if num1 > 0 and num2 >0:
    print("Ambos números son positivos")
elif num1 > 0 and num2 < 0:
    print("Tu primer número es positivo, pero tu segundo número es negativo")
elif num1 < 0 and num2 > 0:
    print("Tu segundo número es positivo, pero tu primer número es negativo")
else:
    print("Ambos números son negativos")
quit()