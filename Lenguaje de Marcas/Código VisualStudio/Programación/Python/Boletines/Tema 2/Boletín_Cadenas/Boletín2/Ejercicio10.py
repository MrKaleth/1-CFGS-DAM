num = input("Introduce un número: ")
CadS = ""
contador = 0

for i in range(len(num)-1,0,-1):
    contador += 1
    if contador != 3:
        CadS = num[i] + CadS
    else:
        CadS = "." + num[i] + CadS
        contador = 0

print(num[0]+CadS)