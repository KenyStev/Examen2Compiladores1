package general;

import java.util.ArrayList;
import tree.statement.StatementNode;
import types.IntegerType;
import types.Type;
import values.IntegerValue;
import values.Value;

import java.util.Hashtable;

/**
 * Created by mac on 11/19/14.
 */
public class SymbolsTable
{
    private Hashtable<String,Type> variables;
    private ArrayList<String> functions;
    private Hashtable<String,Function> functionsSign;
    private static SymbolsTable instance;

    private SymbolsTable()
    {
        variables = new Hashtable<>();
        functions = new ArrayList<>();
        functionsSign = new Hashtable<>();
        //instance = getInstance();
    }

    public static SymbolsTable getInstance()
    {
        if(instance==null)
            instance = new SymbolsTable();
        return instance;
    }



    public void declareVariable(String name,Type type) throws Exception {
        if(variables.containsKey(name))
            throw new Exception("Variable "+name+" already exist!");
        variables.put(name, type);
    }

    public Type getVariableType(String name) throws Exception {
        if(!variables.containsKey(name))
            throw new Exception("Variable: "+name+" does not exist!");
        return variables.get(name);
    }

    public void declareFunction(String name,Function functionInfo) throws Exception {
        if(variables.containsKey(name))
            throw new Exception("ID name: '"+name+"' already exist on global variable!");
        if(functions.contains(name))
            throw new Exception("ID name: '"+name+"' already exist on functions!");
        Hashtable<String,Type> parametes_duplicated = new Hashtable<>();
        for(ParameterDecl dec : functionInfo.parameterList)
        {
            if(name.equals(dec.name))
                throw new Exception("Parameter name: '"+dec.name+"' can not be the same as function name");
            if(functions.contains(dec.name))
                throw new Exception("ID '"+dec.name+"' in prameter of function: "+ name +" is already used by a function!");
            if(parametes_duplicated.containsKey(dec.name))
                throw new Exception("Parameter name: '"+dec.name+"' already exist in this function cotext: "+name);
        }
        if(functionsSign.containsKey(functionInfo.getSignFunction()))
            throw new Exception("Already exist a function called: "+name+"with the same parameter list");
        functions.add(name);
        functionsSign.put(functionInfo.getSignFunction(), functionInfo);
    }

    public boolean existFunction(String signFunction) {
        return functionsSign.containsKey(signFunction);
    }

    public Type getFunctionType(String signFunction) {
        return functionsSign.get(signFunction).returnType;
    }


}
