package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "R", "invoke"})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_typeParameters$1 extends Lambda implements a<List<? extends v>> {
    final /* synthetic */ e this$0;

    KCallableImpl$_typeParameters$1(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<v> invoke() {
        List bsM = this.this$0.box().bsM();
        kotlin.jvm.internal.i.e(bsM, "descriptor.typeParameters");
        Iterable<ao> iterable = bsM;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ao vVar : iterable) {
            arrayList.add(new v(vVar));
        }
        return (List) arrayList;
    }
}
