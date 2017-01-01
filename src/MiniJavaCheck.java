import java.io.File;
import java.io.FileWriter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MiniJavaCheck {

	public static void main(String[] args) throws Exception {

		System.out.printf("Start analyzing %s\n", args[0]);
		
		MiniJavaLexer lexer = new MiniJavaLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniJavaParser parser = new MiniJavaParser(tokens);
		ParseTree tree = parser.goal();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MiniJavaWalkerDefine(), tree);
		
		System.out.println(tree.toStringTree(parser));
		
		String outputFileName = args[0].replaceAll("java", "txt");
		outputFileName = outputFileName.replaceAll("test_codes", "results");
		File file = new File(outputFileName);
		FileWriter fileWriteer = new FileWriter(file);
		fileWriteer.write(tree.toStringTree(parser));
		fileWriteer.close();
		
		org.antlr.v4.gui.Trees.inspect(tree, parser);
		
	}
	
	public static void printError(Token token, String errorMessage) {
		if (token == null) {
			System.err.printf("%s\n", errorMessage);
		} else {
			System.err.printf("line %d:%d %s\n", token.getLine(), token.getCharPositionInLine(), errorMessage);
		}
		
	}

}