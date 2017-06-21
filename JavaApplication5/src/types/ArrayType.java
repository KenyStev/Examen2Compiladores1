package types;

import values.ArrayValue;
import values.Value;

/**
 * Created by mac on 11/19/14.
 */
public class ArrayType extends Type {

    private int size;
    private Type OfType;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getOfType() {
        return OfType;
    }

    public void setOfType(Type ofType) {
        OfType = ofType;
    }

        public ArrayType(int size, Type ofType) {
        this.size = size;
        OfType = ofType;
    }

    @Override
    public boolean Compare(Type rType) {
        if(!(rType instanceof ArrayType))
            return false;
        ArrayType arr = (ArrayType)rType;
        if(!OfType.Compare(rType))
            return false;
        return size == arr.size;
    }

}
