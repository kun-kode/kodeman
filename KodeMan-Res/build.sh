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
echo ======================================================================
read -p "Ready?"
echo ======================================================================
export PATH=$PATH:$path/bin
cd $path
kodepas build
echo ======================================================================
read -p "Process finshed"
clear
exit
