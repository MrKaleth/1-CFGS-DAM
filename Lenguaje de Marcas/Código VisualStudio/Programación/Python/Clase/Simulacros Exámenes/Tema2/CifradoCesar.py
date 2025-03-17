'''
Cifrado César. En criptografía, el cifrado César, también conocido como cifrado por
desplazamiento, código de César o desplazamiento de César, es una de las técnicas
de cifrado más simples y más usadas.

1. Construye un programa que cifre y descifre utilizando el cifrado César. El
programa deberá recibir el número clave (o número de espacios) y también la
cadena a cifrar y devolverá la cadena cifrada y viceversa. El mensaje no
deberá ser superior a 100 caracteres. El número clave no podrá ser mayor que
27 (sin la ch y la ll) --> YA HECHO Y MODIFICADO

2. Amplía el ejercicio anterior para que se almacenen una lista de usuarios y su
número clave. El programa debe mostrar el siguiente menú:
a. Introducir nuevo usuario
b. Modificar palabra clave de cifrado
c. Cifrar un mensaje
d. Descifrar un mensaje
e. Eliminar usuario
f. Terminar

a) Introducir un nuevo usuario. El programa pedirá un nombre de usuario,
comprobará que el usuario no existe en el sistema y te pedirá la clave de
cifrado (número de desplazamiento)

b) Modificar número clave de cifrado.El programa pedirá un nombre de usuario,
el número anterior y si se corresponden, te pedirá el número nuevo y lo
actualizará.

c) Cifrar un mensaje. El programa te pedirá tu nombre de usuario y el mensaje
que deseas cifrar y devolverá el mensaje cifrado.

d) Descifrar un mensaje. El programa pedirá un mensaje cifrado y el nombre del
usuario emisor y devolverá el mensaje descifrado.

e) Eliminar un usuario. Para ello será necesario el nombre de usuario y su
palabra clave.
'''

# Lista con el Abecedario y las listas a usar en el programa
Abecedario = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
              "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

usuarios = []
claves = []

# Función que cifra un mensaje y Función que descifra el mensaje
def cifrarMensajeCesar():
    mensaje = ""
    usuario = input("\nIntroduce tu nombre de usuario: ").upper()
    if usuario in usuarios:
        posUsuario = usuarios.index(usuario)
        texto = input("Introduce el mensaje a cifrar: ")
        if validaCaracteres(texto):
            clave = claves[posUsuario]
            texto = texto.upper()
            cifrado = ""
            for letra in texto:
                if letra in Abecedario:
                    pos_actual = Abecedario.index(letra)
                    nueva_pos = (pos_actual + clave) % len(Abecedario)
                    cifrado += Abecedario[nueva_pos]
                else:
                    cifrado += letra
            mensaje = "\nMensaje cifrado: " + cifrado
        else:
            mensaje = "El mensaje contiene caracteres no válidos."
    else:
        mensaje = "Usuario no encontrado."
    return mensaje

def descifrarMensajeCesar():
    mensaje = ""
    usuario = input("\nIntroduce el nombre del usuario emisor: ").upper()
    if usuario in usuarios:
        posUsuario = usuarios.index(usuario)
        texto = input("Introduce el mensaje cifrado: ")
        clave = claves[posUsuario]
        texto = texto.upper()
        descifrado = ""
        for letra in texto:
            if letra in Abecedario:
                pos_actual = Abecedario.index(letra)
                nueva_pos = (pos_actual - clave) % len(Abecedario)
                descifrado += Abecedario[nueva_pos]
            else:
                descifrado += letra
        mensaje = "\nMensaje descifrado: " + descifrado
    else:
        mensaje = "Usuario no encontrado."
    return mensaje

def validaCaracteres(texto):
    texto = texto.upper()
    valido = True
    for letra in texto:
        if letra not in Abecedario and letra != " ":
            valido = False
    return valido

def validaNumClave(clave):
    es_valida = False
    if 0 < clave <= 27:
        es_valida = True
    return es_valida

def crearUsuario():
    mensaje = ""
    usuario = input("\nIntroduce un nombre de usuario: ").upper()
    if usuario not in usuarios:
        clave = int(input("Introduce la clave de cifrado (1-27): "))
        if validaNumClave(clave):
            usuarios.append(usuario)
            claves.append(clave)
            mensaje = "Usuario agregado correctamente."
        else:
            mensaje = "Clave no válida."
    else:
        mensaje = "El usuario ya existe."
    return mensaje

def modificarClave():
    mensaje = ""
    usuario = input("\nIntroduce tu nombre de usuario: ").upper()
    if usuario in usuarios:
        posUsuario = usuarios.index(usuario)
        nueva_clave = int(input("Introduce la nueva clave (1-27): "))
        if validaNumClave(nueva_clave):
            claves[posUsuario] = nueva_clave
            mensaje = "Clave actualizada correctamente."
        else:
            mensaje = "Nueva clave no válida."
    else:
        mensaje = "Usuario no encontrado."
    return mensaje

def eliminarUsuario():
    mensaje = ""
    usuario = input("\nIntroduce tu nombre de usuario: ").upper()
    if usuario in usuarios:
        posUsuario = usuarios.index(usuario)
        clave = int(input("Introduce tu clave: "))
        if clave == claves[posUsuario]:
            usuarios.pop(posUsuario)
            claves.pop(posUsuario)
            mensaje = "Usuario eliminado correctamente."
        else:
            mensaje = "Clave incorrecta."
    else:
        mensaje = "Usuario no encontrado."
    return mensaje

# Generamos un menu para el programa
def menu():
    print("\n=============================================")
    print("--- Menú principal ---")
    print("1. Introducir nuevo usuario.")
    print("2. Modificar número clave de cifrado.")
    print("3. Cifrar un mensaje.")
    print("4. Descifrar un mensaje.")
    print("5. Eliminar usuario.")
    print("6. Terminar el Programa.")
    print("=============================================")
    
    opcion = input("Elige una opción: ")
    return opcion

opcion = ""
while opcion != "6":
    opcion = menu()
    if opcion == "1":
        print(crearUsuario())
    elif opcion == "2":
        print(modificarClave())
    elif opcion == "3":
        print(cifrarMensajeCesar())
    elif opcion == "4":
        print(descifrarMensajeCesar())
    elif opcion == "5":
        print(eliminarUsuario())
    elif opcion == "6":
        print("Saliendo del programa.")
    else:
        print("Opción no válida.")