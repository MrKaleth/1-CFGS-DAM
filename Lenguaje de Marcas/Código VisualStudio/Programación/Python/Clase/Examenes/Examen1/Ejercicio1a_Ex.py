# Creamos las Variables a utilizar

salir = False
incidentes = 0
leves = 0
graves = 0
eso = 0
po = 0

'''
Creamos el bucle while para que funcione mientras la variable booleana salir no sea verdadera.
Durante este bucle, se pregunta si se desea registrar incidentes. Si decimos que sí se preguntará tambien el nivel y la gravedad de la incidencia.
En caso de escribir un valor no procesado por el código, el proceso se interrumpirá y se volverá al primer paso, borrando los datos que habíamos introducido anteriormente.
Al introducir que no queremos más incidencias el programa vuelve salir verdadero, por lo que el while finaliza
'''

while not salir:
    incidente = input("¿Desea registrar un nuevo incidente? S (para Sí) o N (para No): ").upper()

    if incidente == "S":
        incidentes += 1
        nivel = input("¿En qué nivel ha ocurrido: E (para incidentes en la ESO) o P (para los incidentes en Post-Obligatoria)?: ").upper()

        if nivel == "E":
            eso += 1
            gravedad = input("¿Qué tipo de incidente ha ocurrido? L (para incidentes leves) o G (para incidentes Graves): ").upper()

            if gravedad == "L":
                leves += 1
                print("Añadido incidente leve")
            if gravedad == "G":
                graves += 1
                print("Añadido incidente grave")

        elif nivel == "P":
            po += 1
            gravedad = input("¿Qué tipo de incidente ha ocurrido? L (para incidentes leves) o G (para incidentes Graves): ").upper()

            if gravedad == "L":
                leves += 1
                print("Añadido incidente leve")
            if gravedad == "G":
                graves += 1
                print("Añadido incidente grave")
        
        else:
            print("Error, repita proceso")

    elif incidente == "N":
        print("Todos los incidentes registrados")
        salir = True

    else:
        print("Error, pruebe de nuevo")