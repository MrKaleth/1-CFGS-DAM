numero = input("Introduce un número entero: ")
n = int(input("Introduce la posición del dígito que deseas obtener: "))

if n >= len(numero) or (numero[0] == '-' and n >= len(numero) - 1):
    print("La posición está fuera del rango.")
else:
    if numero[0] == '-':
        digito = numero[n + 1]
    else:
        digito = numero[n]
    
    print("El dígito en la posición", n, "es:", digito)
