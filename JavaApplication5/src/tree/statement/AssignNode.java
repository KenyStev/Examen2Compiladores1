/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import general.SymbolsTable;
import java.util.HashMap;
import tree.expression.ExpressionNode;
import tree.expression.IdNode;
import types.ArrayType;
import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class AssignNode extends StatementNode{
    
    ExpressionNode raitoVarue;
    
    IdNode leftouVarue;
    HashMap<String, Type> rules;

    public AssignNode(ExpressionNode raitoVarue, IdNode leftouVarue) {
        this.raitoVarue = raitoVarue;
        this.leftouVarue = leftouVarue;
        rules = new HashMap<>();
        
        
    }

    public ExpressionNode getRaitoVarue() {
        return raitoVarue;
    }

    public void setRaitoVarue(ExpressionNode raitoVarue) {
        this.raitoVarue = raitoVarue;
    }

    public IdNode getLeftouVarue() {
        return leftouVarue;
    }

    public void setLeftouVarue(IdNode leftouVarue) {
        this.leftouVarue = leftouVarue;
    }

    @Override
    public void evaluate() throws Exception{
        SymbolsTable symbT = SymbolsTable.getInstance();
        Type lType = symbT.getVariableType(leftouVarue.getName());
        Type rType = raitoVarue.evaluateType();
        
        if(lType instanceof ArrayType)
        {
            lType = ((ArrayType)lType).getOfType();
        }
        
        if(!lType.Compare(rType))
            throw new Exception("Can not assign type: "+rType.toString()+" to "+lType.toString());
    }

}
