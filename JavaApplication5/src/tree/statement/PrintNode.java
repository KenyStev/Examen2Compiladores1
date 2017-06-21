/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import tree.expression.ExpressionNode;
import types.ArrayType;
import types.Type;

/**
 *
 * @author Eduardo
 */
public class PrintNode extends StatementNode{
    
    ExpressionNode value;

    public PrintNode(ExpressionNode value) {
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
       Type pType = this.value.evaluateType();
       if(pType instanceof ArrayType)
           throw new Exception("Print Statement can not print arrays");
    }

}
