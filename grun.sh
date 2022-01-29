
java -jar /usr/local/lib/antlr-4.7.2-complete.jar -o ./bin TypeScript.g4

javac ./bin/TypeScript*.java
javac Main.java -d ./bin -sourcepath ./bin

echo 'Running TestRig'
# java org.antlr.v4.gui.TestRig ./bin/TypeScript compilationUnit -gui $1

cd bin
java Main
