clear
echo ================================================================
echo KodePas - Setup
echo ================================================================
echo Warning
echo ================================================================
echo KodePas variable must be installed correctly 
echo FPC path is path to Free Pascal Compiler
echo KodePas path is the KodePas folder
echo ================================================================
echo Prepare
echo ================================================================
echo KodePas folder
read path
echo ================================================================
read -p "Start the process?"
echo ================================================================
export PATH=${PATH}:$path/bin
cd $path
kodepas setup
echo ================================================================
read -p "Any key to exit"
clear
exit

