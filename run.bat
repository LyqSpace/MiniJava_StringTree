call antlr4 .\src\MiniJava.g4
call javac .\src\MiniJava*.java -d .\bin
call cd .\bin
call grun MiniJava goal ..\test_codes\example1.java -gui
call cd ..