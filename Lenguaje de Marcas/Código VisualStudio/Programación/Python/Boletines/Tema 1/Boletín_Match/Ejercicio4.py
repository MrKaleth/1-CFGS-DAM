print("Listado de habitaciones disponibles:")
print("Habitación 1")
print("Habitación 2")
print("Habitación 3")
print("Habitación 4")
print("Habitación 5")

num_habitacion = int(input("Introduce el número de la habitación que deseas consultar: "))

while num_habitacion != 0:
    match num_habitacion:
        case 1:
            print("La habitación 1 está en la planta 1 y tiene 2 camas.")
        case 2:
            print("La habitación 2 está en la planta 1 y tiene 1 cama.")
        case 3:
            print("La habitación 3 está en la planta 2 y tiene 3 camas.")
        case 4:
            print("La habitación 4 está en la planta 2 y tiene 1 cama.")
        case 5:
            print("La habitación 5 está en la planta 3 y tiene 2 camas.")
    num_habitacion = int(input("Introduce el número de la habitación que deseas consultar: "))
