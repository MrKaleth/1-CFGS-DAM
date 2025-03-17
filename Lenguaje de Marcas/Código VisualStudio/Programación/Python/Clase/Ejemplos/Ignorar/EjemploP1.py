temperatura = int(input("Dame temperatura: "))

if temperatura > 23:
    print("Encendiendo Aire")
    temperatura = int(input("Dime la nueva temperatura: ")) 
    if temperatura <=20:
        print("Apagando aire")
    else:
        print("El aire debe seguir encendido")

else:
    print("No es necesario encender el Aire")

print("Sistema monitorizado independiente")
quit()