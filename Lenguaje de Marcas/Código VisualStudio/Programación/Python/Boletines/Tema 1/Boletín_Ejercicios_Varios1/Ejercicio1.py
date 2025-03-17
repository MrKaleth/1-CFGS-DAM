sumaIt= 0
sumaTotal = 0
for i in range(1,4):
    for j in range(3, 0, -1):
        sumaIt = i*10+j
        sumaTotal = sumaTotal + sumaIt
print(sumaTotal)
