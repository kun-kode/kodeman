@echo off
echo KodePas - Build
echo ==============================================================================
echo KodePas environment variable must be installed correctly
echo ==============================================================================
set /p path="KodePas path: "
goto :f
:f
set /p file="KodePas project path: "
cd /d %file%
)
pause
echo ==============================================================================
set PATH=%PATH%;%path%\bin
kodepas build
echo ==============================================================================
echo Process excuted
pause
exit