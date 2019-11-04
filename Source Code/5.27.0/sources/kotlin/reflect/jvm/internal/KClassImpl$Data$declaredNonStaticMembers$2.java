package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$declaredNonStaticMembers$2 extends Lambda implements a<Collection<? extends e<?>>> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$declaredNonStaticMembers$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: boS */
    public final Collection<e<?>> invoke() {
        return g.this.a(g.this.boJ(), MemberBelonginess.DECLARED);
    }
}
