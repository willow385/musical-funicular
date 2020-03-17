#!/bin/bash

# This script will create a file that says "Everything
# should be built already" when it's done building.
if [[ ! -f ".built" ]];
then

    echo "All the things should be built!";
    printf "Everything should be built already" > .built;
else
    cat .built;
    printf "\n";
fi