package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* compiled from: ModuleMapping.kt */
public final class m {
    private final LinkedHashMap<String, String> fpg = new LinkedHashMap();
    private final Set<String> fph = new LinkedHashSet();
    private final String fpi;

    public m(String str) {
        i.f(str, "packageFqName");
        this.fpi = str;
    }

    public final Set<String> bJT() {
        Set keySet = this.fpg.keySet();
        i.e(keySet, "packageParts.keys");
        return keySet;
    }

    public final void bi(String str, String str2) {
        i.f(str, "partInternalName");
        this.fpg.put(str, str2);
    }

    public final void mo(String str) {
        i.f(str, "shortName");
        Set set = this.fph;
        if (set != null) {
            o.dn(set).add(str);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (i.y(mVar.fpi, this.fpi) && i.y(mVar.fpg, this.fpg) && i.y(mVar.fph, this.fph)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.fpi.hashCode() * 31) + this.fpg.hashCode()) * 31) + this.fph.hashCode();
    }

    public String toString() {
        return am.a(bJT(), this.fph).toString();
    }
}
