package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.Data.Builder;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends InputMerger {
    @NonNull
    public Data merge(@NonNull List<Data> list) {
        Builder builder = new Builder();
        Map hashMap = new HashMap();
        for (Data keyValueMap : list) {
            for (Entry entry : keyValueMap.getKeyValueMap().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            value = concatenateArrays(obj, value);
                        } else {
                            value = concatenateNonArrays(obj, value);
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = concatenateArrayAndNonArray(obj, value);
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        value = concatenateArrayAndNonArray(value, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!cls.isArray()) {
                    value = createArrayFor(value);
                }
                hashMap.put(str, value);
            }
        }
        builder.putAll(hashMap);
        return builder.build();
    }

    private Object concatenateArrays(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    private Object concatenateNonArrays(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    private Object concatenateArrayAndNonArray(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    private Object createArrayFor(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
