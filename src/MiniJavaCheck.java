import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MiniJavaCheck {

	public static void main(String[] args) throws Exception {

		MiniJavaLexer lexer = new MiniJavaLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniJavaParser parser = new MiniJavaParser(tokens);
		ParseTree tree = parser.goal();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MiniJavaWalker(), tree);
	}

}