#!/bin/bash
read -p "Introduce el nombre del archivo: " archivo
if [ -e "$archivo" ]; then
    echo "El archivo $archivo existe."
else
    echo "El archivo $archivo no existe."
fi