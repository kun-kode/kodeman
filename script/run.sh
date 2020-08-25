clear
echo ======================================================================
echo KodePas environment variable must be installed correctly
echo You need to have at least a Kode project 
echo ======================================================================
echo Prepare
echo ======================================================================
echo KodePas folder
read path 
echo KodePas project folder
read project
echo ======================================================================
read -p "Any key to process"
echo ======================================================================
export PATH=$PATH:$path/bin
cd $project
kodepas run
echo ======================================================================
read -p "Processed. Any key to exit"
clear
exit
