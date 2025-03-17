num1 = int(input("Dime un número para dividir: "))
num2 = int(input("Dime el número por el cual dividiremos: "))

if num2 == 0:
    print("No puedes dividir entre 0")
else:
    print(num1 / num2)
quit()