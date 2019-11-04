package com.iqoption.chat.fragment;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"getSize", "Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment$Size;", "invoke"})
/* compiled from: ImagePreviewSliderFragment.kt */
final class ImagePreviewSliderFragment$getDisplayer$1 extends Lambda implements a<c> {
    final /* synthetic */ float $scale;
    final /* synthetic */ ObjectRef $size;
    final /* synthetic */ l this$0;

    ImagePreviewSliderFragment$getDisplayer$1(l lVar, ObjectRef objectRef, float f) {
        this.this$0 = lVar;
        this.$size = objectRef;
        this.$scale = f;
        super(0);
    }

    /* renamed from: St */
    public final c invoke() {
        c cVar = (c) this.$size.element;
        if (cVar != null) {
            return cVar;
        }
        Resources resources = this.this$0.getResources();
        kotlin.jvm.internal.i.e(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        c cVar2 = new c(c.au(((float) displayMetrics.widthPixels) * this.$scale), c.au(((float) displayMetrics.heightPixels) * this.$scale));
        this.$size.element = cVar2;
        return cVar2;
    }
}
