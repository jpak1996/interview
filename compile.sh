#!/bin/bash


STR1=$1
STR2=$(sed 's/\..*$//' <<< $STR1)
STR3=$(sed 's/^.*\.//' <<< $STR1)
echo $STR3
if [ "$STR3" = "c" ]
then
	gcc $STR1 -o $STR2
	./$STR2
elif [ "$STR3" = "cpp" ]
then
	g++ $STR1 -o $STR2
	./$STR2
elif [ "$STR3" = "java" ]
then
	javac $STR1
	java $STR2
else
	echo "Need a .c, .cpp, or .java file extension."
fi