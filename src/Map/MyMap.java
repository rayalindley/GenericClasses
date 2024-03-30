package Map;
import java.util.ArrayList;

public class MyMap<KeyT, ValueT>{
    ArrayList<KeyT> keyList;
    ArrayList<ValueT> valueList;
    int i;

    public MyMap() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }

    public void put(KeyT key, ValueT val) {
        i = keyList.indexOf(key);

        if (i != -1) {
            valueList.set(i, val);
        } else {
            keyList.add(key);
            valueList.add(val);
        }
    }

    public ValueT get(KeyT key) {
        if(keyList.contains(key)) {
            i = keyList.indexOf(key);
            return valueList.get(i);
        }

        return null;
    }

    public ValueT remove(KeyT key) {
        if(keyList.contains(key)) {
            i = keyList.indexOf(key);
            keyList.remove(i);
            return valueList.remove(i);
        }

        return null;
    }
}
