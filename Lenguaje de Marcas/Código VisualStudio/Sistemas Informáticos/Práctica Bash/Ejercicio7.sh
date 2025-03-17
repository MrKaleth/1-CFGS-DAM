#!/bin/bash
cuadrado() {
    echo $(( $1 * $1 ))
}

read -p "Introduce un número: " num
echo "El cuadrado de $num es $(cuadrado $num)"