package com.iqoption.core.microservices.videoeducation.response;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: Category.kt */
final class Category$localizedImage$2 extends Lambda implements a<String> {
    final /* synthetic */ a this$0;

    Category$localizedImage$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        b bVar = (b) c.bDA.aC(this.this$0.bDx);
        return bVar != null ? bVar.getUrl() : null;
    }
}
