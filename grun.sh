
java -jar /usr/local/lib/antlr-4.7.2-complete.jar TypeScript.g4

javac TypeScript*.java

echo 'Running TestRig'
java org.antlr.v4.gui.TestRig TypeScript compilationUnit -gui $1
