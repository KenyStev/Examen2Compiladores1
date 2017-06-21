/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import java.util.HashMap;
import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public abstract class BinaryOperatorNode extends ExpressionNode{
    ExpressionNode raito;
    ExpressionNode leftou;
    HashMap<String, Type> rules = new HashMap<>();;

    public BinaryOperatorNode(ExpressionNode raito, ExpressionNode leftou) {
        this.raito = raito;
        this.leftou = leftou;
//        this.rules = new HashMap<>();
    }

    public ExpressionNode getRaito() {
        return raito;
    }

    public void setRaito(ExpressionNode raito) {
        this.raito = raito;
    }

    public ExpressionNode getLeftou() {
        return leftou;
    }

    public void setLeftou(ExpressionNode leftou) {
        this.leftou = leftou;
    }

    @Override
    public Type evaluateType() throws Exception {
        Type lType = leftou.evaluateType();
        Type rType = raito.evaluateType();
        String sign = lType.toString()+","+rType.toString();
        if(!rules.containsKey(sign))
            throw new Exception("Not valid binary operation!");
        return rules.get(sign);
    }

   
   

}
