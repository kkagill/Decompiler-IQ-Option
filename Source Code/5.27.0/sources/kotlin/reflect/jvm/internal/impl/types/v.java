package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: IntersectionTypeConstructor.kt */
public final class v implements an {
    private final LinkedHashSet<w> fxn;
    private final int hashCode;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((w) t).toString(), ((w) t2).toString());
        }
    }

    public f brQ() {
        return null;
    }

    public boolean brS() {
        return false;
    }

    public v(Collection<? extends w> collection) {
        i.f(collection, "typesToIntersect");
        int isEmpty = collection.isEmpty() ^ 1;
        if (m.eVC && isEmpty == 0) {
            throw new AssertionError("Attempt to create an empty intersection");
        }
        this.fxn = new LinkedHashSet(collection);
        this.hashCode = this.fxn.hashCode();
    }

    public List<ao> getParameters() {
        return m.emptyList();
    }

    public Collection<w> bup() {
        return this.fxn;
    }

    public final h bPz() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.m.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.m.fuJ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("member scope for intersection type ");
        stringBuilder.append(this);
        return aVar.a(stringBuilder.toString(), this.fxn);
    }

    public g btw() {
        g btw = ((w) this.fxn.iterator().next()).bMZ().btw();
        i.e(btw, "intersectedTypes.iterato…xt().constructor.builtIns");
        return btw;
    }

    public String toString() {
        return ae(this.fxn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return i.y(this.fxn, ((v) obj).fxn);
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }

    private final String ae(Iterable<? extends w> iterable) {
        return u.a(u.a((Iterable) iterable, (Comparator) new a()), " & ", "{", "}", 0, null, null, 56, null);
    }
}
