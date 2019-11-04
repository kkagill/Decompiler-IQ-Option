package com.iqoption.core.microservices.videoeducation.response;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: Video.kt */
final class Video$localizedPath$2 extends Lambda implements a<String> {
    final /* synthetic */ g this$0;

    Video$localizedPath$2(g gVar) {
        this.this$0 = gVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        h c = this.this$0.ajn();
        return c != null ? c.getUrl() : null;
    }
}
