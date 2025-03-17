pregunta_lluvia = input("Está lloviendo? (si/no en minúsculas):")
pregunta_frio = input("¿Hace Frío? (si/no en minúsculas)")

if pregunta_lluvia == "si":
    lluvia = True
else:
    lluvia = False

if pregunta_frio == "si":
    frio = True
else:
    frio = False

if lluvia == True and frio == True:
    print("Llueve y hace Frío")
elif lluvia == True:
    print("Está lloviendo")
elif frio == True:
    print("Hace Frío")
else:
    print("No llueve ni hace frío")