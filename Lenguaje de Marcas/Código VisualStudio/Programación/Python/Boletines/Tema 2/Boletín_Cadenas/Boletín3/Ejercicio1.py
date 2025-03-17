Palabra1 = input("Introduce una Palabra: ")
Palabra2 = input("Introduce una segunda palabra: ")

if len(Palabra1) < len(Palabra2):
    print(Palabra1, "es más corta que", Palabra2)
elif len(Palabra2) < len(Palabra1):
    print(Palabra2, "es más corta que", Palabra1)
else:
    print(Palabra1, "y", Palabra2, "tienen la misma longitud")
