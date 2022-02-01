
# Generate ANTLR4 Archives
echo 'Generating ANTLR4 Archives...'
java -jar /usr/local/lib/antlr-4.7.2-complete.jar -no-listener -visitor -o ./gen TypeScript.g4

# Compile the .java
echo 'Compiling the java files...'
javac symbols/*.java -d ./bin
javac gen/*.java -d ./bin
javac interp/*.java -d ./bin

echo 'Done.'
