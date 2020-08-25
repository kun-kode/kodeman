@echo off
echo KodePas - Import
echo ==============================================================================
echo KodePas environment variable must be installed correctly
echo ==============================================================================
Choice /N /C YN /M "Would you like to import C file ? (Y/N)"
if ERRORLEVEL 1 goto :0
if ERRORLEVEL 0 goto :1
echo ==============================================================================
:0
set /p file="Enter file path: "
set /p path="Enter KodePas path: "
set /p project="Enter KodePas project path: "
set PATH=%PATH%;%path%\bin
cd /d %project%
kodepas import --c %file%
goto end
)

:1
set /p file="Enter file path: "
set /p path="Enter KodePas path: "
set /p project="Enter KodePas project path: "
set PATH=%PATH%;%path%\bin
cd /d %project%
kodepas import %file%
goto end
)

:end
echo ==============================================================================
pause
exit
