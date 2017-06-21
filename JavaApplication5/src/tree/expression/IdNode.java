/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import general.SymbolsTable;
import types.Type;
import values.ArrayValue;
import values.IntegerValue;
import values.Value;

import java.util.List;
import types.IntegerType;



/**
 *
 * @author Eduardo
 */
public class IdNode extends ExpressionNode{
    //a[4][5][7]
    List<ExpressionNode> indices;

    public IdNode(List<ExpressionNode> indices, String name) {
        this.indices = indices;
        this.name = name;
    }

    public List<ExpressionNode> getIndices() {
        return indices;
    }

    public void setIndices(List<ExpressionNode> indices) {
        this.indices = indices;
    }
    
    //:(
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        
        
    }

    @Override
    public Type evaluateType() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new IntegerType();
    }


}
