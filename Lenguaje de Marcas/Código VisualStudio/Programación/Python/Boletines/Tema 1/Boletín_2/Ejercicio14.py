calificacion = int(input("Introduce la calificación del examen (0-100): "))

if 90 <= calificacion <= 100:
    letra = 'A'
elif 80 <= calificacion < 90:
    letra = 'B'
elif 70 <= calificacion < 80:
    letra = 'C'
elif 60 <= calificacion < 70:
    letra = 'D'
elif 0 <= calificacion < 60:
    letra = 'F'
else:
    letra = 'Invalida'  

if letra != 'Invalida':
    print("La calificación equivalente es:", letra)
else:
    print("Error: Calificación fuera del rango permitido.")
