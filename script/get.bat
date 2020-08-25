@echo off
echo KodePas - Get
echo =======================================================================
echo KodePas environment variable must be installed 
echo - Some information you may need:
echo If you want to get KodePas packages, the packages' syntax must be like this: channel/package
echo Native: Get packages only from KPA
echo * Choice
echo A: Only get packages 
echo B: Get Package info
echo C: Get Channel packages (no package name require)
echo D: Only get packages with Native
echo E: Package info with Native
echo F: Channel packages with Native
echo =======================================================================
Choice /N /C ABCDEF /M "Your choice (A/B/C/D/E/F)"
if ERRORLEVEL 5 goto :0 
if ERRORLEVEL 4 goto :1
if ERRORLEVEL 3 goto :2
if ERRORLEVEL 2 goto :3 
if ERRORLEVEL 1 goto :4
if ERRORLEVEL 0 goto :5

:0
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
set /p package = "Enter package name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get %channel%/%package%
goto :end
)

:1
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
set /p package = "Enter package name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get --info %channel%/%package%
goto :end
)

:2
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get --list %channel%
goto :end
)

:3
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
set /p package = "Enter package name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get --native %channel%/%package%
goto :end
)

:4
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
set /p package = "Enter package name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get --info --native %channel%/%package%
goto :end
)

:5
set /p path = "Enter KodePas path: "
set /p channel = "Enter channel name: "
set /p package = "Enter package name: "
pause
set PATH=%PATH%;%path%\bin
kodepas get --list --native %channel%
goto :end
)

:end
echo ==========================================================================
pause
exit
