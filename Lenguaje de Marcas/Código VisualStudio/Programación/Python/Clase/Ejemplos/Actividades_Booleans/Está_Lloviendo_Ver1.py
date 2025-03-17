pregunta_lluvia = input("Está lloviendo? (si/no en minúsculas):")

if pregunta_lluvia == "si":
    lluvia = True
else:
    lluvia = False

if lluvia == True:
    print("Está lloviendo")
else:
    print("No llueve")