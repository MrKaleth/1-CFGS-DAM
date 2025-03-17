numero = input("Introduce un número entero: ")

if numero[0] == '-':
    digitos = len(numero) - 1
else:
    digitos = len(numero)

print("El número tiene", digitos, "dígitos.")

'''
numero = int(input("Introduce un número entero: "))
digitos = 0

while numero != 0:
    numero = numero // 10
    digitos += 1

print("El número tiene", digitos, "dígitos.")

'''