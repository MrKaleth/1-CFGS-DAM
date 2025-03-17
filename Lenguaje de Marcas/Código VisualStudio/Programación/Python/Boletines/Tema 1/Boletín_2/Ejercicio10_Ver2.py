num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))
num3 = int(input("Introduce el tercer número: "))
num4 = int(input("Introduce el cuarto número: "))

suma = num1 + num2 + num3 + num4
media = suma // 4  

print("La media de los números es:", media)

if num1 > media:
    print(num1, "es superior a la media.")
if num2 > media:
    print(num2, "es superior a la media.")
if num3 > media:
    print(num3, "es superior a la media.")
if num4 > media:
    print(num4, "es superior a la media.")
