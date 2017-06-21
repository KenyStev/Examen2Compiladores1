/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.IntegerType;
import types.Type;
import values.IntegerValue;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class NumberNode extends ExpressionNode{
    float value;

    public NumberNode(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public Type evaluateType() throws Exception {
        return new IntegerType();
    }



}
