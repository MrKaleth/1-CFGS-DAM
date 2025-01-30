@echo off
:inicio
cls
set /p usuario="Ingrese el nombre del usuario: "
echo.
net user %usuario%
if errorlevel 1 (
    echo El usuario no existe. Intentelo de nuevo.
    pause
    goto inicio
)
echo.
set /p confirmacion="Es este el usuario correcto? (S/N): "
if /i "%confirmacion%"=="N" goto inicio
if /i not "%confirmacion%"=="S" (
    echo Opción no válida.
    pause
    goto inicio
)

:cambiar_contraseña
set /p pass1="Ingrese la nueva contraseña: "
set /p pass2="Confirme la nueva contraseña: "
if not "%pass1%"=="%pass2%" (
    echo Las contraseñas no coinciden, intente de nuevo.
    pause
    goto cambiar_contraseña
)
net user %usuario% %pass1%
if errorlevel 1 (
    echo Error al cambiar la contraseña.
) else (
    echo Contraseña cambiada con éxito.
)
pause
cls
exit