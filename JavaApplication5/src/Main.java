
import java.io.*;
import java.util.HashMap;
import java.util.List;

import general.SymbolsTable;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import tree.expression.SubNode;
import tree.statement.StatementNode;

public class Main {

    static public void main(String argv[]) {
        /* Start the parser */
        try {
            parser p = new parser(new Lexer(new FileReader("src/test.txt")));
            List<StatementNode> result = (List<StatementNode>) p.parse().value;
//            System.out.println("Hola");
//            SubNode s = new SubNode(null, null);
            Semantic evaluator = new Semantic(result);
            evaluator.evaluate();

           int a=1;
            a++;
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
