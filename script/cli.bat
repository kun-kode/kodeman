@echo off
echo KodePas - CLI 
echo ===============================================================================
echo KodePas must have an already installed environment variable
echo ===============================================================================
set /p path ="KodePas path: "
pause
echo ===============================================================================
set PATH=%PATH%;%path%\bin
kodepas
echo ===============================================================================
pause 
exit