@echo off
echo KodePas - Render
echo ========================================================================
echo KodePas variable must be installed correcly
echo In render step, you can write a list of resources to render
echo ========================================================================
echo Prepare
echo ========================================================================
set /p path="KodePas path: "
set /p project="KodePas project path: "
set /p files="Files to render: "
echo ========================================================================
pause
echo ========================================================================
set PATH=%PATH%:%path%\bin
cd /d %project%
kodepas render %files%
echo ========================================================================
pause
exit