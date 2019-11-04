package com.iqoption.chat.fragment;

import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"})
/* compiled from: ImagePreviewSliderFragment.kt */
final class ImagePreviewSliderFragment$getDestPreview$1 extends Lambda implements a<ImageView> {
    final /* synthetic */ l this$0;

    ImagePreviewSliderFragment$getDestPreview$1(l lVar) {
        this.this$0 = lVar;
        super(0);
    }

    /* renamed from: Ss */
    public final ImageView invoke() {
        ViewPager viewPager = l.e(this.this$0).aRy;
        View findViewWithTag = viewPager.findViewWithTag(this.this$0.aTt.get(viewPager.getCurrentItem()));
        if (findViewWithTag != null) {
            return (ImageView) findViewWithTag;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
