num = input("Introduce un número: ")
num_El = int(input("¿Dígitos que deseas quitar por delante?: "))

while num_El > 0 and len(num) > 0:
    new_Cad = ""
    for i in range(1, len(num)):  
        new_Cad += num[i]
    
    num = new_Cad
    num_El -= 1  

if len(num) == 0:
    num = '0'

print("El nuevo número es:", num)
