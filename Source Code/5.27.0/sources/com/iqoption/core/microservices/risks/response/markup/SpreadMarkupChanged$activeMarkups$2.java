package com.iqoption.core.microservices.risks.response.markup;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "invoke"})
/* compiled from: SpreadMarkupChanged.kt */
final class SpreadMarkupChanged$activeMarkups$2 extends Lambda implements a<a> {
    final /* synthetic */ d this$0;

    SpreadMarkupChanged$activeMarkups$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: ahm */
    public final a invoke() {
        return new a(this.this$0.getActiveId(), this.this$0.byv);
    }
}
