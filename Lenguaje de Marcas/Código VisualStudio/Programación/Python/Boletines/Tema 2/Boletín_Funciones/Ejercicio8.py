def convertirSegundos(horas, minutos, segundos):
    total_segundos = horas * 3600 + minutos * 60 + segundos
    return total_segundos

def convertirHorMinSeg(segundos):
    horas = segundos // 3600
    minutos = (segundos % 3600) // 60
    segundos = segundos % 60
    return horas, minutos, segundos

salir = False
while not salir:
    print("========================================================")
    print("CONVERSOR DE TIEMPO")
    print("1. Para Convertir a segundos introduzca (1)")
    print("2. Para Convertir a horas, minutos y segundos introduzca (2)")
    print("3. Para Salir introduzca (3)")
    print("========================================================")
    
    opcion = int(input("Elige una opción: "))
    
    if opcion == 1:
        horas = int(input("Introduce las horas: "))
        minutos = int(input("Introduce los minutos: "))
        segundos = int(input("Introduce los segundos: "))
        total_segundos = convertirSegundos(horas, minutos, segundos)
        print("El tiempo total en segundos es:", total_segundos)
    
    elif opcion == 2:
        segundos = int(input("Introduce el tiempo en segundos: "))
        horas, minutos, segundos = convertirHorMinSeg(segundos)
        print("El tiempo es:", horas, "horas,", minutos, "minutos y", segundos, "segundos")
    
    elif opcion == 3:
        salir = True
        print("Saliendo del programa...")
    
    else:
        print("Opción no válida. Intenta de nuevo.")
