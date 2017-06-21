package types;

import values.Value;

/**
 * Created by mac on 11/19/14.
 */
public class BooleanType extends Type {

    @Override
    public boolean Compare(Type rType) {
        return rType instanceof BooleanType;
    }

    @Override
    public String toString() {
        return "BooleanType";
    }
    
    

}
