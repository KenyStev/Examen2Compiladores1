/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public abstract class ExpressionNode {

    public abstract Type evaluateType() throws Exception;

}
