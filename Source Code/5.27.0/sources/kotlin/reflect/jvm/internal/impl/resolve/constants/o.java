package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: IntegerValueTypeConstructor.kt */
public final class o implements an {
    private final v fbz;
    private final ArrayList<w> ftF;
    private final long value;

    public Void bNc() {
        return null;
    }

    public boolean brS() {
        return false;
    }

    public /* synthetic */ f brQ() {
        return (f) bNc();
    }

    public Collection<w> bup() {
        return this.ftF;
    }

    public List<ao> getParameters() {
        return m.emptyList();
    }

    public g btw() {
        return this.fbz.btw();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntegerValueType(");
        stringBuilder.append(this.value);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
