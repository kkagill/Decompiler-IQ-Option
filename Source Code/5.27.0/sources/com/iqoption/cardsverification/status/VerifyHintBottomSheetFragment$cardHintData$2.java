package com.iqoption.cardsverification.status;

import android.os.Parcelable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/cardsverification/status/CardHintData;", "invoke"})
/* compiled from: VerifyHintBottomSheetFragment.kt */
final class VerifyHintBottomSheetFragment$cardHintData$2 extends Lambda implements a<c> {
    final /* synthetic */ i this$0;

    VerifyHintBottomSheetFragment$cardHintData$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: LN */
    public final c invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_CARD_HINT_DATA");
        if (parcelable != null) {
            return (c) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.cardsverification.status.CardHintData");
    }
}
