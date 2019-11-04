package com.iqoption.alerts.util;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Landroid/animation/Animator;", "contentView", "Landroid/view/View;", "isEnter", "", "invoke"})
/* compiled from: PositionController.kt */
final class PositionController$onCreateTransitionProvider$1 extends Lambda implements m<View, Boolean, Animator> {
    final /* synthetic */ c this$0;

    PositionController$onCreateTransitionProvider$1(c cVar) {
        this.this$0 = cVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return b((View) obj, ((Boolean) obj2).booleanValue());
    }

    public final Animator b(View view, boolean z) {
        kotlin.jvm.internal.i.f(view, "contentView");
        view = view.findViewById(this.this$0.aqv);
        String str = Promotion.ACTION_VIEW;
        c cVar;
        if (z) {
            cVar = this.this$0;
            kotlin.jvm.internal.i.e(view, str);
            return cVar.P(view);
        }
        cVar = this.this$0;
        kotlin.jvm.internal.i.e(view, str);
        return cVar.Q(view);
    }
}
