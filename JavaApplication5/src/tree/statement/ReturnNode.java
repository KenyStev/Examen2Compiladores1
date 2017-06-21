/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import tree.expression.ExpressionNode;

/**
 *
 * @author Eduardo
 */
public class ReturnNode extends StatementNode{

    ExpressionNode value;

    public ReturnNode(ExpressionNode value) {
        this.value = value;
    }

    public ExpressionNode getValue() {
        return value;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void evaluate() throws Exception {
        
    }

}
