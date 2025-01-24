@echo off

set /p num1="Introduce el primer numero: "
set /p num2="Introduce el segundo numero: "


if %num1% GTR %num2% (
    echo El primer numero %num1% es mayor que el segundo %num2%.
) else if %num1% LSS %num2% (
    echo El primer numero %num1% es menor que el segundo %num2%.
) else (
    echo Ambos numeros son iguales. %num1% == %num2%.
)

pause
cls