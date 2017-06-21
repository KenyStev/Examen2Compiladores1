/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.FloatType;
import types.IntegerType;
import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class DivNode extends BinaryOperatorNode{

    public DivNode(ExpressionNode raito, ExpressionNode leftou) {
        super(raito, leftou);
        
        rules.put("IntegerType,IntegerType", new IntegerType());
        rules.put("IntegerType,FloatType", new FloatType());
        rules.put("FloatType,IntegerType", new FloatType());
    }
    
    
}
