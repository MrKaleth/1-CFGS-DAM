n = int(input("Ingrese un número entero positivo: "))
producto = 1
i = 1
while i <= n:
    producto *= i
    i += 1
print("El producto de los números del 1 al", n, "es:", producto)
