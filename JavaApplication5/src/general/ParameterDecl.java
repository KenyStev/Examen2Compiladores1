package general;

import types.Type;

/**
 * Created by mac on 11/25/14.
 */
public class ParameterDecl {

    String name;
    Type type;

    public ParameterDecl(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
