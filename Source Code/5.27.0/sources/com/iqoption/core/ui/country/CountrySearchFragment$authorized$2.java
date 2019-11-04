package com.iqoption.core.ui.country;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: CountrySearchFragment.kt */
final class CountrySearchFragment$authorized$2 extends Lambda implements a<Boolean> {
    final /* synthetic */ d this$0;

    CountrySearchFragment$authorized$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    public final boolean invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getBoolean("ARG_AUTHORIZED");
    }
}
