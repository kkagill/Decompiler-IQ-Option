package com.iqoption.chat.component;

import android.widget.ImageView;
import com.iqoption.chat.a.ag;
import com.iqoption.core.graphics.animation.a.b;
import com.iqoption.core.graphics.animation.a.d;
import kotlin.i;
import kotlin.jvm.a.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/component/ImagePreviewTransitionInfo;", "Lcom/iqoption/core/graphics/animation/transition/TransitionInfo;", "getImageSource", "Lkotlin/Function0;", "Landroid/widget/ImageView;", "getImageDest", "getSelectorSource", "skipSharedElements", "", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentImagePreviewSliderBinding;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/iqoption/chat/databinding/ChatFragmentImagePreviewSliderBinding;)V", "getBinding", "()Lcom/iqoption/chat/databinding/ChatFragmentImagePreviewSliderBinding;", "getGetImageDest", "()Lkotlin/jvm/functions/Function0;", "getGetImageSource", "getGetSelectorSource", "getSkipSharedElements", "chat_release"})
/* compiled from: ImagePreviewTransition.kt */
public final class s extends d {
    private final a<ImageView> aOT;
    private final a<ImageView> aOU;
    private final a<ImageView> aOV;
    private final a<Boolean> aOW;
    private final ag aOX;

    public final a<ImageView> Ri() {
        return this.aOT;
    }

    public final a<ImageView> Rj() {
        return this.aOU;
    }

    public final a<ImageView> Rk() {
        return this.aOV;
    }

    public final a<Boolean> Rl() {
        return this.aOW;
    }

    public s(a<? extends ImageView> aVar, a<? extends ImageView> aVar2, a<? extends ImageView> aVar3, a<Boolean> aVar4, ag agVar) {
        kotlin.jvm.internal.i.f(aVar, "getImageSource");
        kotlin.jvm.internal.i.f(aVar2, "getImageDest");
        kotlin.jvm.internal.i.f(aVar3, "getSelectorSource");
        kotlin.jvm.internal.i.f(aVar4, "skipSharedElements");
        kotlin.jvm.internal.i.f(agVar, "binding");
        super(new b(500));
        this.aOT = aVar;
        this.aOU = aVar2;
        this.aOV = aVar3;
        this.aOW = aVar4;
        this.aOX = agVar;
    }

    public final ag Rm() {
        return this.aOX;
    }
}
