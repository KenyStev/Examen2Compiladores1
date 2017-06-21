/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import java.util.List;
import tree.expression.ExpressionNode;
import types.BooleanType;
import types.Type;

/**
 *
 * @author Eduardo
 */
public class IfNode extends StatementNode {
    
    ExpressionNode condition;

    public IfNode(ExpressionNode condition, List<StatementNode> ifStatements, List<StatementNode> elseStatements) {
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(ExpressionNode condition) {
        this.condition = condition;
    }

    public List<StatementNode> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<StatementNode> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<StatementNode> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<StatementNode> elseStatements) {
        this.elseStatements = elseStatements;
    }
    List<StatementNode> ifStatements;
    List<StatementNode> elseStatements;

    @Override
    public void evaluate() throws Exception {
        Type t = condition.evaluateType();
        if(!(t instanceof BooleanType))
            throw new Exception("Condition type should be boolean");
        for(StatementNode stmt : ifStatements)
        {
            stmt.evaluate();
        }
        
        for(StatementNode stmt : elseStatements)
        {
            stmt.evaluate();
        }
    }


}
