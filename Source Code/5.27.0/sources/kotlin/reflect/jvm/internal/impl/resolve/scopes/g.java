package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.storage.e;

/* compiled from: LazyScopeAdapter.kt */
public final class g extends a {
    private final e<h> fuy;

    public g(e<? extends h> eVar) {
        i.f(eVar, "scope");
        this.fuy = eVar;
    }

    /* Access modifiers changed, original: protected */
    public h bNn() {
        return (h) this.fuy.invoke();
    }
}
