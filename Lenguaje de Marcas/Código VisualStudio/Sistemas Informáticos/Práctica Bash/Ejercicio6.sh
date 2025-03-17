#!/bin/bash

read -p "Introduce el Nombre del archivo a leer: " archivo

if [ -f "$archivo" ]; then
    lineas=$(cat "$archivo" | wc -l)
    if [ -s "$archivo" ]; then
    ((lineas++))
    fi
    echo "El archivo tiene $lineas líneas."
else
    echo "El archivo no existe."
fi