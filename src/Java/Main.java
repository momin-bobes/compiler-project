package Java;

import Java.AST.Parse;
import Java.Base.BaseVisitor;
import Java.Visitor.BaseASTVisitor;
import gen.SQLLexer;
import gen.SQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer (cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser (token);
            ParseTree tree = parser.parse();

            Parse p = (Parse) new BaseVisitor().visit(tree);
//            parse g=(parse)  new Basevisitor_fun ().visit(tree);
            //Parse p = (Parse) new Basevisitor_fun().visit(tree);
//           System.out.println(p.toString());
            p.accept(new BaseASTVisitor ());
            System.out.println("done");

//            System.out.println(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
