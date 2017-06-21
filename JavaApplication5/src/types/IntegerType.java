package types;

import values.IntegerValue;
import values.Value;

/**
 * Created by mac on 11/19/14.
 */
public class IntegerType extends Type {

    @Override
    public boolean Compare(Type rType) {
        return rType instanceof IntegerType;
    }
    
    @Override
    public String toString() {
        return "IntegerType";
    }

}
