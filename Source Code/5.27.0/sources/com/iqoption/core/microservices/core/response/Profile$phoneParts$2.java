package com.iqoption.core.microservices.core.response;

import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "", "invoke"})
/* compiled from: Profile.kt */
final class Profile$phoneParts$2 extends Lambda implements a<List<? extends String>> {
    final /* synthetic */ String $phone;

    Profile$phoneParts$2(String str) {
        this.$phone = str;
        super(0);
    }

    /* renamed from: acZ */
    public final List<String> invoke() {
        return v.b((CharSequence) this.$phone, new String[]{" "}, false, 0, 6, null);
    }
}
