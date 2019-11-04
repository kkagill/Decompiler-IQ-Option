package com.iqoption.core.microservices.core.response;

import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: Profile.kt */
final class Profile$phone$2 extends Lambda implements a<String> {
    final /* synthetic */ g this$0;

    Profile$phone$2(g gVar) {
        this.this$0 = gVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        List a = this.this$0.adi();
        if ((a.size() > 1 ? 1 : null) == null) {
            a = null;
        }
        return a != null ? (String) a.get(1) : null;
    }
}
