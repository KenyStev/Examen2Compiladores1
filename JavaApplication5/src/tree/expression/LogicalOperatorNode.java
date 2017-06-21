package tree.expression;

import types.*;
import values.Value;

/**
 * Created by mac on 11/20/14.
 */
public abstract class LogicalOperatorNode extends BinaryOperatorNode {
    public LogicalOperatorNode(ExpressionNode raito, ExpressionNode leftou) {
        super(raito, leftou);
        
        rules.put("IntegerType,IntegerType", new BooleanType()); 
        rules.put("FloatType,FloatType", new BooleanType()); 
    }
    
    

}
