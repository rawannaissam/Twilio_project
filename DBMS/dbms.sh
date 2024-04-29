#!/bin/bash



# Store the output of ls command into an array
createDB(){

local dbname

read -p "please Enter Your DB Name: " dbname

local folderArray

readarray -t folderArray <<< "$(ls)"

let i=0

for file in "${folderArray[@]}"; do
    if [ "$dbname" = "$file" ]
        then 
            echo "this db is already exsit"
            echo $i
            break
    fi
    ((i++))
done

mkdir $dbname

echo "$dbname db created Succssfuly "
}

listDB(){

readarray -t folderArray <<< "$(ls)"

for file in "${folderArray[@]}"; do
    echo "$file"
done
}


select name in ahmed mahmoud mostafa exit
do
case $REPLY in
"exit")
break
;;
"mahmoud")
echo hello manager
;;
"ahmed")
echo hello boss 
;;
"mostafa")
echo hello sasa
;;
*)
echo invalid input
;;
esac

done 