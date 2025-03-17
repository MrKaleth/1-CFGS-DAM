edades = []
alturas = []

for i in range (4):
    edad = int(input("Introduce la Edad: "))
    altura = int(input("Introduce altura (en cm): "))

    edades.append(edad)
    alturas.append(altura)

mayor18 = [i+1 for i in range(4) if edades[i] > 18]

altura_media = sum(alturas) / len(alturas)