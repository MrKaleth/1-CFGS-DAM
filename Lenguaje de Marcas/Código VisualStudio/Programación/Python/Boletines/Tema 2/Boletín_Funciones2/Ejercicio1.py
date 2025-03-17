def identidad():
    nombre = input("Introduce tu nombre: ")
    apellido1 = input("Introduce tu primer apellido: ")
    apellido2 = input("Introduce tu segundo apellido: ")
    
    return [nombre, apellido1, apellido2]

def num_A(lista_nombre):
    total_a = 0
    for palabra in lista_nombre:
        for letra in palabra.lower():
            if letra == "a":
                total_a += 1
    return total_a

nombre_completo = identidad()
cantidad_a = num_A(nombre_completo)
print("Tu nombre completo es:", nombre_completo)
print("El nombre completo contiene", cantidad_a, "letras 'a'.")

