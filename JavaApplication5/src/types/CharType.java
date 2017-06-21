package types;

import values.Value;

/**
 * Created by mac on 11/19/14.
 */
public class CharType extends Type {

    @Override
    public boolean Compare(Type rType) {
        return rType instanceof CharType;
    }
    
    @Override
    public String toString() {
        return "CharType";
    }

}
