package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements a<List<? extends g<? extends T>>> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$sealedSubclasses$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<g<? extends T>> invoke() {
        Collection<d> brH = this.this$0.boI().brH();
        kotlin.jvm.internal.i.e(brH, "descriptor.sealedSubclasses");
        Collection arrayList = new ArrayList();
        for (d dVar : brH) {
            if (dVar != null) {
                Class a = ae.a(dVar);
                Object gVar = a != null ? new g(a) : null;
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return (List) arrayList;
    }
}
