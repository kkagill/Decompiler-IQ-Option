package com.iqoption.cardsverification.list;

import androidx.core.content.ContextCompat;
import com.iqoption.cardsverification.g;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: VerifyCardsFragment.kt */
final class VerifyCardsFragment$selectedColor$2 extends Lambda implements a<Integer> {
    final /* synthetic */ e this$0;

    VerifyCardsFragment$selectedColor$2(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Integer.valueOf(Lk());
    }

    public final int Lk() {
        return ContextCompat.getColor(com.iqoption.core.ext.a.q(this.this$0), g.a.slate_grey_60);
    }
}
