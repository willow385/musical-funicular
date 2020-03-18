#!/bin/bash

# This script will create a file that says "Everything
# should be built already" when it's done building.
if test -f ./.built; then
    cat .built;
    printf "\n";
else
    echo "Building...";
    cd mfun/src;
    javac Main.java;
    cd ..;
    cp src/*.class .;
    cd ..;
    echo "All the things should be built!";
    printf "Everything should be built already" > ./.built;
fi