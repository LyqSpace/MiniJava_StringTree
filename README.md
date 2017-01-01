# 编译原理MiniJava前端文档

梁永清 13307130254

## 目录
1. 工作环境搭建
2. 运行代码
3. 运行结果截图（部分）

## 一、工作环境搭建
为Windows电脑搭配ANTLR环境，JDK环境略

- 从 [ANTLR官网](www.antlr.org) 下载 `antlr-4.6-complete.jar`
- 新建 `antlr4` 和 `grun.bat` ，分别写入
	
		java org.antlr.v4.Tool %*
		java org.antlr.v4.gui.TestRig %*

- 把 加入 `antlr-4.6-complete.jar` 系统环境变量 `CLASSPATH`，`antlr4` 和 `grun.bat` 的文件夹位置加入系统环境变量 `PATH` 后，重启Windows电脑

## 运行代码

- 写好 g4 语法文件后，终端输入

		antlr .\src\MiniJava.g4
	
	即可生成 `MiniJavaLexer.java`、`MiniJavaParser.java`、`MiniJavaListener.java` 和 `MiniJavaBaseListener.java`

	![](imgs\gen.png)

### Eclipse
- 本代码通过Eclipse建立，并在上面通过测试，**推荐使用通过Eclipse导入本工程**

### 终端命令

- 终端输入
 
		javac .\src\MiniJava*.java -d .\bin

	可生成对应的class文件
- 终端输入

		cd .\bin
		grun MiniJava goal ..\test_codes\Factorial.java -gui

	即可生成语法分析树，其中 `Facrotial.java` 是被测试源文件

- 也可通过脚本运行，在根目录下，运行 `run.bat Factorial.java` 即可

## 运行结果截图（部分）
	
对 `Factorial.java` 代码语法分析的结果

	class Factorial{
	    public static void main(String[] a){
		System.out.println(new Fac().ComputeFac(10));
	    }
	}
	
	class Fac {
	
	    public int ComputeFac(int num){
		int num_aux ;
		if (num < 1)
		    num_aux = 1 ;
		else 
		    num_aux = num * (this.ComputeFac(num-1)) ;
		return num_aux ;
	    }
	
	}

![](imgs\antlr4_parse_tree.png)