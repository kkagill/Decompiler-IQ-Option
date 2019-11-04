package com.iqoption.core.splash;

import android.view.View;
import android.widget.TextView;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/splash/SplashLogHelper;", "invoke"})
/* compiled from: SplashFragment.kt */
final class SplashFragment$splashLogHelper$2 extends Lambda implements a<SplashLogHelper> {
    final /* synthetic */ d this$0;

    SplashFragment$splashLogHelper$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: akH */
    public final SplashLogHelper invoke() {
        TextView textView = d.b(this.this$0).bfx;
        kotlin.jvm.internal.i.e(textView, "binding.frontText");
        TextView textView2 = d.b(this.this$0).bfz;
        kotlin.jvm.internal.i.e(textView2, "binding.logText");
        TextView textView3 = d.b(this.this$0).bfA;
        kotlin.jvm.internal.i.e(textView3, "binding.noDurationText");
        TextView textView4 = d.b(this.this$0).bfD;
        kotlin.jvm.internal.i.e(textView4, "binding.timerText");
        View view = d.b(this.this$0).bfw;
        kotlin.jvm.internal.i.e(view, "binding.bottomLeftView");
        return new SplashLogHelper(textView, textView2, textView3, textView4, view);
    }
}
