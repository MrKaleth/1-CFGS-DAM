@echo off
:menu
cls
echo ----------------------------------
echo         Seleccione una opcion
echo ----------------------------------
echo Opcion 1. Listar Usuarios
echo Opcion 2. Listar Grupos
echo Opcion 3. Salir
echo ----------------------------------

set /p opcion=Ingrese su opcion (1/2/3): 

if "%opcion%"=="1" goto listar_user
if "%opcion%"=="2" goto listar_grupo
if "%opcion%"=="3" goto salir 

echo Error. Opcion no valida. Volviendo al menu…
pause
goto menu

:listar_user
cls
echo Usuarios disponibles en el equipo:
net user
pause
goto menu

:listar_grupo
cls
echo Grupos disponibles en el equipo:
net localgroup
pause
goto menu

:salir
cls
echo Saliendo del programa...
pause
goto fin


:fin
cls
pause