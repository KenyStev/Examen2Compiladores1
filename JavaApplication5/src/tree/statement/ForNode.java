/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import java.util.List;
import tree.expression.ExpressionNode;
import tree.expression.IdNode;
import types.IntegerType;
import types.Type;
import values.IntegerValue;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class ForNode extends StatementNode{
    
    IdNode id;

    public ForNode(IdNode id, ExpressionNode initialValue, ExpressionNode finalValue, List<StatementNode> statements) {
        this.id = id;
        this.initialExpression = initialValue;
        this.finalExpression = finalValue;
        this.statements = statements;
    }

    public IdNode getId() {
        return id;
    }

    public void setId(IdNode id) {
        this.id = id;
    }

    public ExpressionNode getInitialExpression() {
        return initialExpression;
    }

    public void setInitialExpression(ExpressionNode initialExpression) {
        this.initialExpression = initialExpression;
    }

    public ExpressionNode getFinalExpression() {
        return finalExpression;
    }

    public void setFinalExpression(ExpressionNode finalExpression) {
        this.finalExpression = finalExpression;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }
    ExpressionNode initialExpression;
    ExpressionNode finalExpression;
    List<StatementNode> statements;

    @Override
    public void evaluate() throws Exception {
        Type iType = initialExpression.evaluateType();
        if(!(iType instanceof IntegerType))
            throw new Exception("Initial expression of for should be Integer");
        Type fType = finalExpression.evaluateType();
        if(!(fType instanceof IntegerType))
            throw new Exception("Finale expression of for should be Integer");
        for(StatementNode stmt : statements)
        {
            stmt.evaluate();
        }
    }


}
