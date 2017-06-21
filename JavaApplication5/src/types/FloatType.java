package types;

import values.Value;

/**
 * Created by mac on 11/19/14.
 */
public class FloatType extends Type {

    @Override
    public boolean Compare(Type rType) {
        return rType instanceof FloatType;
    }
    
    @Override
    public String toString() {
        return "FloatType";
    }


}
