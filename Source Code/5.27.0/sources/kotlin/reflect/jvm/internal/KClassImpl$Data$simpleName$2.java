package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$simpleName$2 extends Lambda implements a<String> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$simpleName$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        if (g.this.bnC().isAnonymousClass()) {
            return null;
        }
        String a;
        kotlin.reflect.jvm.internal.impl.name.a a2 = g.this.getClassId();
        if (a2.bJW()) {
            g.a aVar = this.this$0;
            a = aVar.J(g.this.bnC());
        } else {
            a = a2.bJV().boi();
            kotlin.jvm.internal.i.e(a, "classId.shortClassName.asString()");
        }
        return a;
    }
}
