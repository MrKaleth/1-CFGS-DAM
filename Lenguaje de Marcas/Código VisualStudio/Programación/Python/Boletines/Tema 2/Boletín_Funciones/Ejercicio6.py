import math

def areaCirculo(num):
    area = math.pi * num ** 2
    return area

def perimetroCirculo(num):
    perimetro = 2 * math.pi * num
    return perimetro

radio = int(input("Introduce el valor del Radio de la Circunferencia: "))
print("El valor del Área de la Circunferencia es:", areaCirculo(radio))
print("El valor del Perímetro de la Circunferencia es:", perimetroCirculo(radio))