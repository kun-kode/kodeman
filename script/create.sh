clear
string='kodepas create'
echo ========================================================================
echo KodePas environment variable must be installed correctly
echo Only use a option to create the project
echo ========================================================================
echo Warning
echo ========================================================================
echo KodePas path
read path
echo KodePas project path (you can use where do you love)
read project
echo KodePas project
echo 1-Native
echo 2-Web
echo 3-Hybrid
echo 4-CLI
echo 5-Pack Native
echo N-Exit
read -p "KodePas project type [1/2/3/4/5/N]" choice
case "$choice" in
1) string1="${string} --native";;
2) string1="${string} --web";;
3) string1="${string} --hibrid";;
4) string1="${string} --cli";;
5) string1="${string} --packnative";;
N|n) clear;exit;;
* ) echo "Invalid option. Any key to exit";clear;exit;;
esac
echo =======================================================================
read -p "Process ?"
echo =======================================================================
export PATH=$PATH:$path/bin
cd $project
eval ${string1}
echo =======================================================================
read -p "Any key to exit"
clear
exit
