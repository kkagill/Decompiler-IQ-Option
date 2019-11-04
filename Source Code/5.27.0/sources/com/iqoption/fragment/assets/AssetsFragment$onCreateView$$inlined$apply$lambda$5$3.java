package com.iqoption.fragment.assets;

import android.widget.FrameLayout;
import com.iqoption.fragment.assets.b.h;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/assets/DoHeaderDelegate;", "invoke", "com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$5$doDelegate$2"})
/* compiled from: AssetsFragment.kt */
final class AssetsFragment$onCreateView$$inlined$apply$lambda$5$3 extends Lambda implements a<j> {
    final /* synthetic */ h this$0;

    AssetsFragment$onCreateView$$inlined$apply$lambda$5$3(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    /* renamed from: aAs */
    public final j invoke() {
        FrameLayout frameLayout = this.this$0.daT.cfG;
        kotlin.jvm.internal.i.e(frameLayout, "sortSettingsContainer");
        return new j(frameLayout, this.this$0.getEndPadding(), this.this$0.aVl, b.b(this.this$0.this$0));
    }
}
