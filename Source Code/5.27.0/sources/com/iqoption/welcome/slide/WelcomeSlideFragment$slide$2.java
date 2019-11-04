package com.iqoption.welcome.slide;

import android.os.Parcelable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/welcome/slide/WelcomeSlideData;", "invoke"})
/* compiled from: WelcomeSlideFragment.kt */
final class WelcomeSlideFragment$slide$2 extends Lambda implements a<c> {
    final /* synthetic */ d this$0;

    WelcomeSlideFragment$slide$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: bbw */
    public final c invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("arg.slide");
        if (parcelable != null) {
            return (c) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.welcome.slide.WelcomeSlideData");
    }
}
