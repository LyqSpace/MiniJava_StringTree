call antlr4 .\src\MiniJava.g4
call javac .\src\*.java -d .\bin
call cd .\bin
@echo off
set dir=..\test_codes\
set filename=%dir%%1%
echo %filename%
@echo on
call grun MiniJava goal %filename% -gui
call cd ..