package values;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 12/4/14.
 */
public class ArrayValue extends Value {

    Value [] value;

    public ArrayValue(Value[] value) {
        this.value = value;
    }

    public Value[] getValue() {
        return value;
    }

    public void setValue(Value[] value) {
        this.value = value;
    }

    public Value getIndexValue(int index) {
        return value[index];
    }
    public void setIndexValue(int index,Value newValue) {
         value[index]=newValue;
    }
}
