/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.BooleanType;
import types.FloatType;
import types.IntegerType;
import types.StringType;
import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class SubNode extends BinaryOperatorNode{

    public SubNode(ExpressionNode raito, ExpressionNode leftou) {
        super(raito, leftou);
        
        rules.put("IntegerType,IntegerType", new BooleanType());
        rules.put("FloatType,FloatType", new BooleanType());
        rules.put("BooleanType,BooleanType", new BooleanType());
        rules.put("CharType,CharType", new BooleanType());
        rules.put("StringType,StringType", new BooleanType());
    }
    
    
}
