clear
echo ====================================================================
echo KodePas environment variable must be installed correctly
echo You should have a name to the .kpa project
echo ====================================================================
echo Warning
echo ====================================================================
echo KodePas folder
read path
echo .kpa project name
read project
echo ====================================================================
read -p "Any key to start"
echo ====================================================================
export PATH=$PATH:$path/bin
cd $path
kodepas pack $project
echo ====================================================================
read -p "Process finshed"
clear
exit
