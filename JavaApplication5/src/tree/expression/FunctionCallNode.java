/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import general.ParameterDecl;
import general.SymbolsTable;
import java.util.ArrayList;
import java.util.List;
import types.Type;


/**
 *
 * @author Eduardo
 */
public class FunctionCallNode extends ExpressionNode{
    private String name;
    List<ExpressionNode> parameters;

    public FunctionCallNode(String name,List<ExpressionNode> parameters) {
        this.parameters = parameters;
        this.name = name;
    }

    public List<ExpressionNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExpressionNode> parameters) {
        this.parameters = parameters;
    }
    
    //:(


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
    
    public String getSignFunction() throws Exception
    {
        String sign = name+"(";
        ArrayList<String> a = new ArrayList<>();
        for(ExpressionNode p : parameters)
        {
            Type pType = p.evaluateType();
            a.add(pType.toString());
        }
        return sign + String.join(",", a) + ")";
    }

    @Override
    public Type evaluateType() throws Exception {
        SymbolsTable syst = SymbolsTable.getInstance();
        if(!syst.existFunction(getSignFunction()))
            throw new Exception("Function name: '"+name+"' with this parameter list does not exist!");
        return syst.getFunctionType(getSignFunction());
    }
}
