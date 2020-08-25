@echo off
echo ====================================================================
echo KodePas environment variable must be installed correctly
echo You should have a name to the .kpa project
echo ====================================================================
set /p path= "KodePas folder: "
set /p folder= "Kode Project folder: "
set /p kpa = ".kpa project name: "
echo ====================================================================
pause
echo ====================================================================
set PATH=%PATH%:%path%\bin
cd /d %folder%
kodepas pack $kpa
echo ====================================================================
pause
exit