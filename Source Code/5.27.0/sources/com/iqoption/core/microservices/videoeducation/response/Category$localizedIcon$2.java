package com.iqoption.core.microservices.videoeducation.response;

import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: Category.kt */
final class Category$localizedIcon$2 extends Lambda implements a<String> {
    final /* synthetic */ a this$0;

    Category$localizedIcon$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        c.a aVar = c.bDA;
        List b = this.this$0.bDy;
        if ((b.isEmpty() ^ 1) == 0) {
            b = null;
        }
        if (b == null) {
            b = this.this$0.bDx;
        }
        b bVar = (b) aVar.aC(b);
        return bVar != null ? bVar.getUrl() : null;
    }
}
