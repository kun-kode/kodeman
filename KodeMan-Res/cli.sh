clear
echo ======================================================================
echo KodePas environment variable must be installed correctly
echo ======================================================================
echo Prepare 
echo ======================================================================
echo KodePas path
read path
echo ======================================================================
read -p "Process the task?"
echo ======================================================================
export PATH=$PATH:$path/bin
cd $path
kodepas
echo ======================================================================
read -p "Process excuted"
clear
