package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"})
/* compiled from: KTypeParameterImpl.kt */
final class KTypeParameterImpl$upperBounds$2 extends Lambda implements a<List<? extends t>> {
    final /* synthetic */ v this$0;

    KTypeParameterImpl$upperBounds$2(v vVar) {
        this.this$0 = vVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<t> invoke() {
        List bod = this.this$0.bpV().bod();
        kotlin.jvm.internal.i.e(bod, "descriptor.upperBounds");
        Iterable<w> iterable = bod;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (w wVar : iterable) {
            kotlin.jvm.internal.i.e(wVar, "kotlinType");
            arrayList.add(new t(wVar, new KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(this)));
        }
        return (List) arrayList;
    }
}
