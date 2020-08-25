@echo off
echo KodePas - Setup
echo =============================================================================
echo KodePas environment variable must be installed correctly
echo You need the path to KodePas and Free Pascal 
echo =============================================================================
echo Prepare
echo =============================================================================
set /p path="Path to KodePas: "
pause
set PATH=%PATH%;%path%\bin
kodepas setup 
echo =============================================================================
echo Process finshed !!!
pause
exit