package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.calls.c;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "R", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$Getter$caller$2 extends Lambda implements a<c<?>> {
    final /* synthetic */ r.c this$0;

    KPropertyImpl$Getter$caller$2(r.c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: bpc */
    public final c<?> invoke() {
        return s.a(this.this$0, true);
    }
}
