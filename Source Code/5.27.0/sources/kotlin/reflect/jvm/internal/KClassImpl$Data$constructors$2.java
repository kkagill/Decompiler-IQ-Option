package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.e;
import kotlin.reflect.jvm.internal.impl.descriptors.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$constructors$2 extends Lambda implements a<List<? extends e<? extends T>>> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$constructors$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<e<T>> invoke() {
        Iterable<j> bog = g.this.bog();
        Collection arrayList = new ArrayList(n.e(bog, 10));
        for (j iVar : bog) {
            arrayList.add(new i(g.this, iVar));
        }
        return (List) arrayList;
    }
}
