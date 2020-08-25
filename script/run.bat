@echo off
echo ======================================================================
echo KodePas environment variable must be installed correctly
echo You need to have at least a Kode project 
echo ======================================================================
echo Prepare
echo ======================================================================
set /p path="KodePas folder: " 
set /p project="KodePas project folder: "
echo ======================================================================
pause
echo ======================================================================
set PATH=%PATH%:%path%\bin
cd %project%
kodepas run
echo ======================================================================
pause
exit