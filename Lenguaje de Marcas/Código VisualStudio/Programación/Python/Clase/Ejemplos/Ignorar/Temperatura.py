temperatura = int(input("Dime que temperatura hace: "))

if temperatura > 26:
    print("La temperatura está alta:", temperatura,"grados")
    print("Encendiendo el aire")
elif temperatura < 16:
    print("La temperatura está baja:", temperatura,"grados")
    print("Enciende el calefactor")
else:
    print("La temperatura está bien:", temperatura,"grados")
    print("No hace falta encender ni el calefactor ni el aire, sin acciones")