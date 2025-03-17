num = input("Introduce un número: ")
num_volt = ""

for i in range(len(num)-1, -1, -1):
    num_volt = num_volt + num[i]

print("Número volteado es:", num_volt)