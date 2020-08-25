clear
echo ========================================================================
echo KodePas variable must be installed correcly
echo In render step, you can write a list of resources to render
echo ========================================================================
echo Prepare
echo ========================================================================
echo KodePas path
read path
echo KodePas project folder
read project
echo Files to render 
read res
echo ========================================================================
read -p "Any key to process"
echo ========================================================================
export PATH=$PATH:$path/bin
cd $project
kodepas render $res
echo ========================================================================
read -p "Processed. Any key to exit"
clear
exit
