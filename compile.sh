#! /bin/bash

# Generate ANTLR4 Archives
echo 'Generating ANTLR4 Archives...'
java -jar /usr/local/lib/antlr-4.7.2-complete.jar -no-listener -visitor ./src/grammar/TypeScript.g4
mv ./src/grammar/*.interp ./src/gen
mv ./src/grammar/*.tokens ./src/gen
mv ./src/grammar/*.java ./src/gen
python script/package.py src/gen src.gen

# Compile the .java
echo 'Compiling the java files...'
rm src/symbols/*.class src/gen/*.java src/interp/*.java Main.java
javac src/symbols/*.java src/gen/*.java src/interp/*.java Main.java

echo 'Done.'
