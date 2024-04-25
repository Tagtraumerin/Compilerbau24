import java.io.OutputStreamWriter;

public class ParserMain {

    public static void main(String[] args) throws Exception {
        compiler.Lexer lexer = new compiler.Lexer();
        compiler.Parser parser = new compiler.Parser(lexer);
        compiler.ast.ASTExprNode rootExpr = parser.parseExpression("4+5");
        OutputStreamWriter outputWriter = new OutputStreamWriter(System.out);
        rootExpr.print(outputWriter, "  ");
        outputWriter.flush();
        int result = rootExpr.eval();
        System.out.println(result);
    }

}