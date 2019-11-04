package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public abstract class g<T> {
    private final T value;

    public abstract w g(v vVar);

    public g(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object value = getValue();
            Object obj2 = null;
            if (!(obj instanceof g)) {
                obj = null;
            }
            g gVar = (g) obj;
            if (gVar != null) {
                obj2 = gVar.getValue();
            }
            if (!i.y(value, obj2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object value = getValue();
        return value != null ? value.hashCode() : 0;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
