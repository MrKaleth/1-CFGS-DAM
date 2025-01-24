@echo off
echo Buscando archivo datos.txt...
if exist datos.txt (
    echo El archivo datos.txt esta presente.
) else (
    echo El archivo datos.txt no se encuentra.
)
pause
cls