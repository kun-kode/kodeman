@echo off
echo KodePas - Create
echo ===============================================================================
echo KodePas environment variable must be installed correctly 
echo - Some information about KodePas project
echo A:Native project: For applications that can execute only on one OS (Windows, OS X, Debian, Arch, Gentoo, RedHat, Android, iOS, Haiku, ReactOS)
echo B:Web Project: For websites, services that can be used with network
echo C:Hybrid Project: Programs that can use both web features and native components
echo D:CLI Project: Programs use command-line interface for its features
echo E:PackNative Project: Packed Native Apps 
echo ===============================================================================
Choice /N /C ABCDE /M "Please enter your choice (A/B/C/D/E) "
if ERRORLEVEL 4 goto :0
if ERRORLEVEL 3 goto :1
if ERRORLEVEL 2 goto :2
if ERRORLEVEL 1 goto :3
if ERRORLEVEL 0 goto :4

:0
set /p path="KodePas path: "
set PATH=%PATH%;%path%\bin
set /p file="Folder to use for your project: "
cd /d %file%
kodepas create --native
goto :end
)

:1
set /p path="KodePas path: "
set PATH=%PATH%;%path%\bin
set /p file="Folder to use for your project: "
cd /d %file%
kodepas create --web
goto :end
)

:2
set /p path="KodePas path: "
set PATH=%PATH%;%path%\bin
set /p file="Folder to use for your project: "
cd /d %file%
kodepas create --hybrid
goto :end
)

:3
set /p path="KodePas path: "
set PATH=%PATH%;%path%\bin
set /p file="Folder to use for your project: "
cd /d %file%
kodepas create --cli
goto :end
)

:4
set /p path="KodePas path: "
set PATH=%PATH%;%path%\bin
set /p file="Folder to use for your project: "
cd /d %file%
kodepas create --packnative
goto :end
)

:end
pause
exit