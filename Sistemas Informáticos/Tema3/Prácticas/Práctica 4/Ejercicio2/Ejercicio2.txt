@echo off
setlocal enabledelayedexpansion

:inicio
cls
echo Opciones de colores (Letra/Fondo):
echo 0 = Negro           1 = Azul      
echo 2 = Verde           3 = Aguamarina 
echo 4 = Rojo            5 = Purpura   
echo 6 = Amarillo        7 = Blanco
echo 8 = Gris            9 = Azul claro 
echo A = Verde claro     B = Aguamarina clara
echo C = Rojo claro      D = Purpura claro 
echo E = Amarillo claro  F = Blanco brillante
echo.
set /p letra="Ingrese el codigo del color de la letra: "
set /p fondo="Ingrese el codigo del color del fondo: "

rem Verifica que los valores ingresados sean validos (hexadecimal 0-F)
echo %letra%| findstr /r "^[0-9A-Fa-f]$" >nul || (echo Error: Color de letra no valido. && pause && goto inicio)
echo %fondo%| findstr /r "^[0-9A-Fa-f]$" >nul || (echo Error: Color de fondo no valido. && pause && goto inicio)

rem Evita que la letra y el fondo sean iguales
if /i "%letra%"=="%fondo%" (
    echo Error: El color de la letra y del fondo no pueden ser iguales.
    pause
    goto inicio
)

rem Aplica el cambio de colores
color %fondo%%letra%
echo Cambio de colores aplicado correctamente.
pause
exit
