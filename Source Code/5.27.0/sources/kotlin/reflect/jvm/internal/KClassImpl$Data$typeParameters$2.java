package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$typeParameters$2 extends Lambda implements a<List<? extends v>> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$typeParameters$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<v> invoke() {
        List brI = this.this$0.boI().brI();
        kotlin.jvm.internal.i.e(brI, "descriptor.declaredTypeParameters");
        Iterable<ao> iterable = brI;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ao vVar : iterable) {
            arrayList.add(new v(vVar));
        }
        return (List) arrayList;
    }
}
