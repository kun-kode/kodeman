clear
string='kodepas import'
echo =======================================================================
echo KodePas: Import
echo =======================================================================
echo Warning
echo =======================================================================
echo KodePas and file need to import must be existed. KodePas also need to 
echo be installed correctly 
echo =======================================================================
echo Prepare
echo =======================================================================
echo KodePas directory
read path 
echo KodePas project path
read project
read -p "Import C file? (Y/N)" choice
case "$choice" in
y|Y ) string="${string} --c";;
n|N ) string="${string}";;
* ) read -p  "Invalid option. Any key to exit ";clear;exit;;
esac
echo File path
read file
stringa="${string} ${file}"
echo ======================================================================
read -p "Any key to execute"
echo ======================================================================
export PATH=$PATH:$path/bin
cd $project
eval ${stringa}
echo ======================================================================
read -p "Finshed"
clear
exit
