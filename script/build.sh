clear
echo =======================================================================
echo KodePas - Build
echo ======================================================================
echo Warning
echo ======================================================================
echo KodePas environment variable must be installed correctly
echo ======================================================================
echo Prepare
echo ======================================================================
echo KodePas path
read path
echo KodePas project path
read project
echo ======================================================================
read -p "Ready?"
echo ======================================================================
export PATH=$PATH:$path/bin
cd $project
kodepas build
echo ======================================================================
read -p "Process finshed"
clear
exit
