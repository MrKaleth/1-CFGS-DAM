num = input("Introduce un número: ")
posIni = int(input("Indica Posición inicial: "))
posFin = int(input("Indica Posición final: "))

if posIni > posFin and posIni < len(num) and posFin < len(num):
    print("Los números dentro del rango son:", num[posIni:posFin])
else: 
    print("Error, rango no válido")
