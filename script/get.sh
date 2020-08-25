clear
string='kodepas get'
echo ======================================================================
echo KodePas environment variable must be installed correctly
echo Branch and package name must be existed
echo ======================================================================
echo Prepare
echo ======================================================================
echo KodePas path
read path
export PATH=$PATH:$path/bin
echo ======================================================================
echo Explaining
kodepas get --help
echo ======================================================================
read -p "Do you need --info, --list or not (1/2/N)" choice
case "$choice" in
1 ) string1="${string} --info";;
2 ) string1="${string} --list";;
n|N ) string1="${string}";;
* ) read -p "Invalid choice. Any key to exit ";clear;exit;;
esac
read -p "Do you need native app option? (Y/N)?" choice1
case "$choice1" in
Y|y ) string2="${string1} --native";;
N|n ) string2="${string1}";;
* ) read -p "Invalid choice. Any key to exit";clear;exit;;
esac
echo Branch name
read branch
echo Package name
read pkg
string3="${string2} $branch/$pkg"
echo =====================================================================
read -p "Excute command?"
echo =====================================================================
cd $path
eval ${string3}
echo =====================================================================
read -p "Command excuted. Exit?"
clear
exit
