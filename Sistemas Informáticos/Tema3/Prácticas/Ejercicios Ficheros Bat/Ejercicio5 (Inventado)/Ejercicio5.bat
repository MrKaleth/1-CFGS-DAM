@echo off
cls

:menu
echo ----------------------------------
echo         Seleccione una opcion
echo ----------------------------------
echo a) Opcion A
echo b) Opcion B
echo c) Opcion C
echo ----------------------------------
set /p opcion=Ingrese su opcion (a/b/c): 

if /i "%opcion%"=="a" (
    echo Ha pulsado la opcion A
    pause
    goto fin
) else if /i "%opcion%"=="b" (
    echo Ha pulsado la opcion B
    pause
    goto fin
) else if /i "%opcion%"=="c" (
    echo Ha pulsado la opcion C
    pause
    goto fin
) else (
    echo Opcion no valida, intente de nuevo.
    pause
    goto menu
)

:fin
