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

if lluvia == True or frio == True:
    print("Hace mal tiempo")
elif lluvia == False and frio == False:
    print("Hace buen tiempo")
