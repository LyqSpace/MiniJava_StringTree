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
		
		org.antlr.v4.gui.Trees.inspect(tree, parser);
		
	}
	
	public static void printError(Token token, String errorMessage) {
		System.err.printf("line %d:%d %s\n", token.getLine(), token.getCharPositionInLine(), errorMessage);
	}

}