estado_civil = input("Introduce tu estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado): ").upper()

edad = int(input("Introduce tu edad: "))

porcentaje_retencion = 0

if (estado_civil == 'S' or estado_civil == 'D') and edad < 35:
    porcentaje_retencion = 12
elif edad > 50:
    porcentaje_retencion = 8.5
elif (estado_civil == 'V' or estado_civil == 'C') and edad < 35:
    porcentaje_retencion = 11.3
else:
    porcentaje_retencion = 10.5

print("El porcentaje de retención es:", porcentaje_retencion, "%")
