package general;

import tree.statement.StatementNode;
import types.Type;

import java.util.ArrayList;

/**
 * Created by mac on 11/25/14.
 */
public class Function {
       String name;
       ArrayList<ParameterDecl> parameterList;
       ArrayList<StatementNode> code;
       Type returnType;

    public Function(String name, ArrayList<ParameterDecl> parameterList, ArrayList<StatementNode> code, Type returnType) {
        this.name = name;
        this.parameterList = parameterList;
        this.code = code;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ParameterDecl> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<ParameterDecl> parameterList) {
        this.parameterList = parameterList;
    }

    public ArrayList<StatementNode> getCode() {
        return code;
    }

    public void setCode(ArrayList<StatementNode> code) {
        this.code = code;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
    
    public String getSignFunction()
    {
        String sign = name+"(";
        ArrayList<String> a = new ArrayList<>();
        for(ParameterDecl p : parameterList)
        {
            a.add(p.type.toString());
        }
        return sign + String.join(",", a) + ")";
    }
}
