edad1 = int(input("Introduce la edad del alumno 1: "))
altura1 = float(input("Introduce la altura del alumno 1 (en metros): "))

edad2 = int(input("Introduce la edad del alumno 2: "))
altura2 = float(input("Introduce la altura del alumno 2 (en metros): "))

edad3 = int(input("Introduce la edad del alumno 3: "))
altura3 = float(input("Introduce la altura del alumno 3 (en metros): "))

edad4 = int(input("Introduce la edad del alumno 4: "))
altura4 = float(input("Introduce la altura del alumno 4 (en metros): "))

print("\nAlumnos mayores de 18 años:")
if edad1 > 18:
    print("Alumno 1 con", edad1, "años")
if edad2 > 18:
    print("Alumno 2 con", edad2, "años")
if edad3 > 18:
    print("Alumno 3 con", edad3, "años")
if edad4 > 18:
    print("Alumno 4 con", edad4, "años")

media_altura = (altura1 + altura2 + altura3 + altura4) / 4

print("\nAlumnos que miden menos que la media de altura:")
if altura1 < media_altura:
    print("Alumno 1 con una altura de", round(altura1, 2), "metros")
if altura2 < media_altura:
    print("Alumno 2 con una altura de", round(altura2, 2), "metros")
if altura3 < media_altura:
    print("Alumno 3 con una altura de", round(altura3, 2), "metros")
if altura4 < media_altura:
    print("Alumno 4 con una altura de", round(altura4, 2), "metros")

print("\nLa altura media es:", round(media_altura, 2), "metros")
