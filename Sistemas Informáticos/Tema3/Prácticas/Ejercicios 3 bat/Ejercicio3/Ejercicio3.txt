@echo off
setlocal enabledelayedexpansion

:inicio
cls
set /p num1="Ingrese el primer numero: "
set /p num2="Ingrese el segundo numero: "

if %num1% GTR %num2% (
    echo Error: El segundo numero debe ser mayor o igual al primero.
    pause
    goto inicio
)

for /l %%i in (%num1%,1,%num2%) do (
    echo.
    echo Tabla del %%i
    for /l %%j in (1,1,10) do (
        set /a resultado=%%i*%%j
        echo %%i x %%j = !resultado!
    )
)

pause
exit