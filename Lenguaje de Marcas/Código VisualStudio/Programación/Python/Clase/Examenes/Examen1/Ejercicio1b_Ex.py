salir = False

incidentes = 0
leves = 0
graves = 0
eso = 0
po = 0

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
            elif gravedad == "G":
                graves += 1
                print("Añadido incidente grave")
            else:
                print("Error, repita proceso")
                eso -= 1

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
                po -= 1
        
        else:
            print("Error, repita proceso")

    elif incidente == "N":
        print("Todos los incidentes registrados")
        salir = True

    else:
        print("Error, pruebe de nuevo")

total = eso + po
if total > 0:
    porcentaje_eso = (eso / total) * 100
    porcentaje_po = (po / total) * 100
    print("Se han producido", incidentes, "incidentes en el centro:", leves, "de ellos Leves y", graves, "Graves, siendo el", porcentaje_eso, "% en la ESO y el", porcentaje_po, "% en Post-Obligatoria")
else:
    print("No se ha producido ningún incidente en el curso")