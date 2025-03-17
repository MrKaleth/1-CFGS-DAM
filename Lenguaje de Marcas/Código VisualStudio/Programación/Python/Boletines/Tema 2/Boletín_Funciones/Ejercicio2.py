def CalcMedia(num1, num2):
    operación = num1 + num2 / 2
    return operación

num_días = int(input("Introduce el número de días de los que quieres calcular la media: "))
contador = 0

while num_días > contador:
    tempMin = int(input("Introduce la temperatura mínima del día: "))
    tempMax = int(input("Introduce la temperatura máxima: "))
    print("La media de temperatura del día es:", CalcMedia(tempMax,tempMin), "ºC")
    contador +=1