
import java.util.List;
import tree.statement.StatementNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenystev
 */
public class Semantic {

    private final List<StatementNode> statements;

    Semantic(List<StatementNode> result) {
        this.statements = result;
    }

    void evaluate() throws Exception {
        for(StatementNode stmt : statements)
        {
            stmt.evaluate();
        }
    }
    
}
