package com.iqoption.chat.fragment;

import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"})
/* compiled from: ImagePreviewSliderFragment.kt */
final class ImagePreviewSliderFragment$getSourceSelector$1 extends Lambda implements a<ImageView> {
    final /* synthetic */ l this$0;

    ImagePreviewSliderFragment$getSourceSelector$1(l lVar) {
        this.this$0 = lVar;
        super(0);
    }

    /* renamed from: Ss */
    public final ImageView invoke() {
        b o = this.this$0.aTw;
        if (o == null) {
            return null;
        }
        List f = this.this$0.aTt;
        ViewPager viewPager = l.e(this.this$0).aRy;
        kotlin.jvm.internal.i.e(viewPager, "binding.pager");
        return (ImageView) o.invoke(f.get(viewPager.getCurrentItem()));
    }
}
