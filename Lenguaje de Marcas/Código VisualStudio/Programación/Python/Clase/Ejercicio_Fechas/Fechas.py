'''
Primero: Investiga y crea un mapa mental que muestre cómo se manejan las fechas es Python. Este mapa debe mostrar

¿Qué librería contiene las funciones relacionadas con fechas en Python? ¿Cómo la utilizo?
Cómo se crea una variable con la fecha de hoy
de un tipo datetime, ¿cómo se saca el día, el mes, el año, la hora y los minutos?
Cómo se suma días y horas a una fecha
Cómo se restan fechas a un día
Cómo se crea una fecha a partir de los enteros de su día, mes y año

Segundo. Resuelve este ejercicio y adjunta el código:
Crea una fecha con la fecha actual
Por teclado pide que introduzca cuántos días han pasado desde el lunes.
Crea una fecha con la fecha calculada del lunes, restando lo leído.
Crea una fecha con el día, mes y año que el usuario a introducido
Investiga e implementa cómo restar dos fechas y qué se devuelve de esta operación
'''

from datetime import datetime
from datetime import timedelta

# Ejercicio 1
fecha_actual = datetime.now()
print("\nFecha actual:", fecha_actual)

# Ejercicio 2
dias_desde_lunes = int(input("\n¿Cuántos días han pasado desde el lunes? "))

fecha_lunes = fecha_actual - timedelta(days=dias_desde_lunes)
print("Fecha del lunes calculada:", fecha_lunes)

# Ejercicio 3
fecha_ayer = fecha_actual - timedelta(days=1)
fecha_pasado_manana = fecha_actual + timedelta(days=2)

print("\nFecha de ayer:", fecha_ayer)
print("Fecha de pasado mañana:", fecha_pasado_manana)

# Ejercicio 4
dia = int(input("\nIntroduce el día: "))
mes = int(input("Introduce el mes: "))
anio = int(input("Introduce el año: "))

fecha_usuario = datetime(anio, mes, dia)
print("\nFecha creada por el usuario:", fecha_usuario)

diferencia = fecha_actual - fecha_usuario
print("\nDiferencia entre", fecha_actual, "y", fecha_usuario, "=", diferencia.days, "días")