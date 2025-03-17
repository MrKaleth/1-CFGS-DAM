#!/bin/bash

while true; do
    echo "--- MENU ---"
    echo "1. Saludar"
    echo "2. Despedirse"
    echo "3. Salir"
    read -p "Introduce tu elección: " eleccion

    case $eleccion in
        1) echo "Hola!!";;
        2) echo "Adios!!";;
        3) exit;;
        *) echo "Opción no válida";;
    esac
done

