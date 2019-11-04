package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "invoke"})
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$members$2 extends Lambda implements a<List<? extends e<?>>> {
    final /* synthetic */ a this$0;

    KPackageImpl$Data$members$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<e<?>> invoke() {
        Collection arrayList = new ArrayList();
        for (Object next : m.this.a(m.this.bpo(), MemberBelonginess.DECLARED)) {
            CallableMemberDescriptor box = ((e) next).box();
            if (box != null) {
                b bVar = (b) box;
                k brj = bVar.brj();
                if (brj != null) {
                    y yVar = (y) brj;
                    Object obj = null;
                    if (!(yVar instanceof h)) {
                        yVar = null;
                    }
                    h hVar = (h) yVar;
                    aj brF = hVar != null ? hVar.brF() : null;
                    if (!(brF instanceof o)) {
                        brF = null;
                    }
                    o oVar = (o) brF;
                    n b = oVar != null ? oVar.b(bVar) : null;
                    if (!(b instanceof e)) {
                        b = null;
                    }
                    e eVar = (e) b;
                    if (eVar != null) {
                        obj = eVar.bqi();
                    }
                    if (kotlin.jvm.internal.i.y(obj, m.this.bnC())) {
                        arrayList.add(next);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor");
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor");
        }
        return (List) arrayList;
    }
}
