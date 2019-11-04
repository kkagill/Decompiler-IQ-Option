package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$2 extends Lambda implements b<w, List<? extends String>> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.b $renderer;

    RawTypeImpl$render$2(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        this.$renderer = bVar;
        super(1);
    }

    /* renamed from: aa */
    public final List<String> invoke(w wVar) {
        i.f(wVar, "type");
        Iterable<ap> btD = wVar.btD();
        Collection arrayList = new ArrayList(n.e(btD, 10));
        for (ap a : btD) {
            arrayList.add(this.$renderer.a(a));
        }
        return (List) arrayList;
    }
}
