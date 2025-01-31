@echo off
setlocal enabledelayedexpansion

:inicio
cls
set /p num1="Ingrese el primer numero: "
set /p num2="Ingrese el segundo numero: "

:menu
cls
echo 1. Sumar
echo 2. Restar
echo 3. Multiplicar
echo 4. Dividir
echo 5. Salir
echo.
set /p opcion="Seleccione una opcion: "

if "%opcion%"=="1" (
    set /a resultado=num1+num2
    set operacion="suma"
    goto mostrar_resultado
)
if "%opcion%"=="2" (
    set /a resultado=num1-num2
    set operacion="resta"
    goto mostrar_resultado
)
if "%opcion%"=="3" (
    set /a resultado=num1*num2
    set operacion="multiplicacion"
    goto mostrar_resultado
)
if "%opcion%"=="4" (
    if %num2%==0 (
        echo Error: No se puede dividir entre cero.
        pause
        goto menu
    )
    set /a resultado=num1/num2
    set operacion="division"
    goto mostrar_resultado
)
if "%opcion%"=="5" (
pause
exit
)

echo Opcion no valida, intente de nuevo.
pause
goto menu

:mostrar_resultado
echo El resultado de la %operacion% ambos numeros es: %resultado%
pause
goto menu
