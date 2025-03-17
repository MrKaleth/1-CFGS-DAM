lista = []

lista[:]  
lista[0:len(lista)] 
lista[-len(lista):] 
lista[:len(lista)] 
lista[len(lista)-1] 
lista[-1]

"""
lista[:]
Valor devuelto: ['a', 'b', 'c', 'd', 'e']
Explicación: Esta expresión devuelve una copia superficial de la lista completa. Es como si seleccionaras todos los elementos de la lista.

lista[0:len(lista)]
Valor devuelto: ['a', 'b', 'c', 'd', 'e']
Explicación: Aquí estamos utilizando un slice que va desde el índice 0 hasta el último índice de la lista (que es len(lista) - 1). Por lo tanto, devuelve todos los elementos de la lista.

lista[-len(lista):]
Valor devuelto: ['a', 'b', 'c', 'd', 'e']
Explicación: El índice -len(lista) se refiere al primer índice de la lista (en este caso, -5). El operador : sin un segundo índice significa que tomará todos los elementos desde ese índice hasta el final de la lista.

lista[:len(lista)]
Valor devuelto: ['a', 'b', 'c', 'd', 'e']
Explicación: Aquí estamos seleccionando todos los elementos desde el principio de la lista hasta el índice len(lista), que incluye todos los elementos.

lista[len(lista)-1]
Valor devuelto: 'e'
Explicación: Esta expresión accede al último elemento de la lista utilizando el índice len(lista) - 1, que es el índice del último elemento.

lista[-1]
Valor devuelto: 'e'
Explicación: El índice -1 se refiere al último elemento de la lista. Por lo tanto, devuelve 'e'.
"""