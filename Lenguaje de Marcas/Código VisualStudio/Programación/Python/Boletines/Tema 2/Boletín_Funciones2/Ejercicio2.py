def calculoRentabilidad(cantidad, tasa, tiempo):
    if cantidad < 100 :
        return cantidad
    else:
        interes = cantidad * (tasa / 100) * tiempo
        cantidadTotal = cantidad + interes
        print(f"Interés ganado: {interes}")
        print(f"Cantidad final: {cantidadTotal}")
    return cantidadTotal


cantidadInicial = int(input("Introduce la cantidad que deseas invertir: "))
periodo_tiempo = 3
if cantidadInicial > 1000:
    cantidadFinal = calculoRentabilidad(cantidadInicial, 5, periodo_tiempo)
else:
    cantidadFinal = calculoRentabilidad(cantidadInicial, 2, periodo_tiempo)
