package com.iqoption.charttools.tools;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"})
/* compiled from: ToolsFragment.kt */
final class ToolsFragment$parentView$2 extends Lambda implements a<FrameLayout> {
    final /* synthetic */ f this$0;

    ToolsFragment$parentView$2(f fVar) {
        this.this$0 = fVar;
        super(0);
    }

    /* renamed from: Qc */
    public final FrameLayout invoke() {
        FrameLayout frameLayout = new FrameLayout(com.iqoption.core.ext.a.q(this.this$0));
        frameLayout.setId(R.id.card);
        View view = frameLayout;
        com.iqoption.charttools.tools.b.a.aNH.ab(view);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(com.iqoption.core.ext.a.f(view, R.color.bg_dialog));
        gradientDrawable.setCornerRadius(com.iqoption.core.ext.a.h(view, (int) R.dimen.dp8));
        frameLayout.setBackground(gradientDrawable);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.startToEnd = R.id.mainContent;
        layoutParams.bottomToBottom = R.id.mainContent;
        frameLayout.setLayoutParams(layoutParams);
        ViewCompat.setElevation(view, com.iqoption.core.ext.a.g(view, 14.0f));
        return frameLayout;
    }
}
