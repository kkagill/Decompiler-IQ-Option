package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.p;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2 extends Lambda implements a<List<? extends p>> {
    final /* synthetic */ t this$0;

    KTypeImpl$arguments$2(t tVar) {
        this.this$0 = tVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<p> invoke() {
        List btD = this.this$0.bpT().btD();
        if (btD.isEmpty()) {
            return m.emptyList();
        }
        d a = g.a(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this));
        j jVar = t.anY[3];
        Iterable iterable = btD;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            Object bof;
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            ap apVar = (ap) next;
            if (apVar.bPC()) {
                bof = p.eWA.bof();
            } else {
                w bpT = apVar.bpT();
                kotlin.jvm.internal.i.e(bpT, "typeProjection.type");
                t tVar = new t(bpT, new KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(i, this, a, jVar));
                i = u.aob[apVar.bPD().ordinal()];
                if (i == 1) {
                    bof = p.eWA.a(tVar);
                } else if (i == 2) {
                    bof = p.eWA.b(tVar);
                } else if (i == 3) {
                    bof = p.eWA.c(tVar);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(bof);
            i = i2;
        }
        return (List) arrayList;
    }
}
