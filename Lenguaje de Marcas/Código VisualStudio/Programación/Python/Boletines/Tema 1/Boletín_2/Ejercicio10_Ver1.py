números = []

for i in range(4):
    número = int(input("Introduce un número: "))
    números.append(número)

media = sum(números) // len(números)

print("La media de los números es:", media)

print("Números superiores a la media:")
for número in números:
    if número > media:
        print(número)