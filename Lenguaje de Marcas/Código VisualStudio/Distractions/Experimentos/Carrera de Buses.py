
import os
import random
import time

GREN = "\033[32m"
END = "\033[0m"

def buses(n1, n2, n3):
    output = []
    output.append(115 * "-")
    output.append((n1 * " ") + "_______________  " + ((100 - n1) * " ") + "|")
    output.append((n1 * " ") + "|__|__|__|__|__|___ " + ((97  - n1) * " ") + "|")
    output.append((n1 * " ") + "|     SORAYA      |)" + ((96  - n1) * " ") + "|")
    output.append((n1 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n1) * " ") + "|")
    output.append(115 * "_")
    output.append((n2 * " ") + "_______________  " + ((100 - n2) * " ") + "|")
    output.append((n2 * " ") + "|__|__|__|__|__|___ " + ((97  - n2) * " ") + "|")
    output.append((n2 * " ") + "|      ISABEL     |)" + ((96  - n2) * " ") + "|")
    output.append((n2 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n2) * " ") + "|")
    output.append(115 * "_")
    output.append((n3 * " ") + "_______________  " + ((100 - n3) * " ") + "|")
    output.append((n3 * " ") + "|__|__|__|__|__|___ " + ((97  - n3) * " ") + "|")
    output.append((n3 * " ") + "|       RAFA      |)" + ((96  - n3) * " ") + "|")
    output.append((n3 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n3) * " ") + "|")
    output.append(115 * "_")
    return "\n".join(output)

a = 0
b = 0
c = 0
gano = None  # Inicializa 'gano' aquí

os.system("cls" if os.name == "nt" else "clear")
presentacion = """
        <<<<<<<<<<<  CARRERA DE BUSES >>>>>>>>>>
                 SORAYA VS ISABEL VS RAFA """
print(presentacion)
time.sleep(3)

while a < 97 and b < 97 and c < 97:
    d = random.randint(1, 3)
    if d == 1:
        a += 1
    if d == 2:
        b += 1
    if d == 3:
        c += 1
    os.system("cls" if os.name == "nt" else "clear")
    print(buses(a, b, c))
    time.sleep(0.07)

if a >= 97:
    gano = "SORAYA"
if b >= 97:
    gano = "ISABEL"
if c >= 97:
    gano = "RAFA"

print(f"{GREN}GANÓ LA CARRERA: {gano}{END}")


'''
import os
import random
import time

GREN = "\033[32m"
END = "\033[0m"

def buses(n1, n2, n3):
    output = []
    output.append(115 * "-")
    output.append((n1 * " ") + "_______________  " + ((100 - n1) * " ") + "|")
    output.append((n1 * " ") + "|__|__|__|__|__|___ " + ((97  - n1) * " ") + "|")
    output.append((n1 * " ") + "|     SORAYA      |)" + ((96  - n1) * " ") + "|")
    output.append((n1 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n1) * " ") + "|")
    output.append(115 * "_")
    output.append((n2 * " ") + "_______________  " + ((100 - n2) * " ") + "|")
    output.append((n2 * " ") + "|__|__|__|__|__|___ " + ((97  - n2) * " ") + "|")
    output.append((n2 * " ") + "|      ISABEL     |)" + ((96  - n2) * " ") + "|")
    output.append((n2 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n2) * " ") + "|")
    output.append(115 * "_")
    output.append((n3 * " ") + "_______________  " + ((100 - n3) * " ") + "|")
    output.append((n3 * " ") + "|__|__|__|__|__|___ " + ((97  - n3) * " ") + "|")
    output.append((n3 * " ") + "|       RAFA      |)" + ((96  - n3) * " ") + "|")
    output.append((n3 * " ") + "|~~~@~~~~~~~~~@~~~|)" + ((95  - n3) * " ") + "|")
    output.append(115 * "_")
    return "\n".join(output)

a = 0
b = 0
c = 0
gano = None  # Inicializa 'gano' aquí

os.system("cls" if os.name == "nt" else "clear")
presentacion = """
        <<<<<<<<<<<  CARRERA DE BUSES >>>>>>>>>>
                 SORAYA VS ISABEL VS RAFA """
print(presentacion)
time.sleep(3)

while a < 97 and b < 97 and c < 97:
    # Cambiar la probabilidad: 1/6 para Soraya, 1/6 para Isabel, 2/3 para Rafa
    d = random.randint(1, 6)
    if d == 1:  # Probabilidad 1/6 para Soraya
        a += 1
    elif d == 2:  # Probabilidad 1/6 para Isabel
        b += 1
    else:  # Probabilidad 4/6 para Rafa
        c += 1
    
    os.system("cls" if os.name == "nt" else "clear")
    print(buses(a, b, c))
    time.sleep(0.07)

if a >= 97:
    gano = "SORAYA"
if b >= 97:
    gano = "ISABEL"
if c >= 97:
    gano = "RAFA"

print(f"{GREN}GANÓ LA CARRERA: {gano}{END}")
'''