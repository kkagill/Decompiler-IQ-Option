package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.iqoption.chat.e.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/fragment/ReturnButtonController;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "button", "Landroid/view/View;", "(Landroid/view/View;)V", "animationListener", "com/iqoption/chat/fragment/ReturnButtonController$animationListener$1", "Lcom/iqoption/chat/fragment/ReturnButtonController$animationListener$1;", "endTranslation", "", "isButtonShown", "", "maxScrollPixels", "", "totalScroll", "hideButton", "", "isFirstItemVisible", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onScrolled", "dx", "dy", "showButton", "Companion", "chat_release"})
/* compiled from: ReturnButtonController.kt */
public final class r extends OnScrollListener {
    private static final String TAG = r.class.getSimpleName();
    public static final a aUy = new a();
    private final float aUs = com.iqoption.core.ext.a.h(this.aUx, d.dp50);
    private final b aUt = new b(this);
    private final int aUu = com.iqoption.core.ext.a.h(this.aUx, 50.0f);
    private int aUv;
    private boolean aUw;
    private final View aUx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/chat/fragment/ReturnButtonController$Companion;", "", "()V", "MAX_SCROLL", "", "TAG", "", "kotlin.jvm.PlatformType", "chat_release"})
    /* compiled from: ReturnButtonController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/chat/fragment/ReturnButtonController$animationListener$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release"})
    /* compiled from: ReturnButtonController.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ r aUz;

        b(r rVar) {
            this.aUz = rVar;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.aUz.aUx.getTranslationY() == this.aUz.aUs) {
                this.aUz.aUx.setVisibility(8);
            }
        }
    }

    public r(View view) {
        kotlin.jvm.internal.i.f(view, "button");
        this.aUx = view;
        view = this.aUx;
        if (this.aUw) {
            view.setVisibility(0);
            view.setTranslationY(0.0f);
            return;
        }
        view.setVisibility(8);
        view.setTranslationY(this.aUs);
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        if (a(recyclerView)) {
            SB();
            return;
        }
        this.aUv += i2;
        int i3 = this.aUv;
        i = this.aUu;
        if (i3 > i) {
            i3 = i;
        } else if (i3 < 0) {
            i3 = 0;
        }
        this.aUv = i3;
        i3 = this.aUv;
        if (i3 == this.aUu) {
            SA();
        } else if (i3 == 0) {
            SB();
        }
    }

    private final boolean a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) == 0;
    }

    private final void SA() {
        if (!this.aUw) {
            this.aUw = true;
            this.aUx.setVisibility(0);
            this.aUx.animate().translationY(0.0f).setInterpolator(new LinearOutSlowInInterpolator()).start();
        }
    }

    private final void SB() {
        if (this.aUw) {
            this.aUw = false;
            this.aUx.setVisibility(0);
            this.aUx.animate().translationY(this.aUs).setListener(this.aUt).setInterpolator(new FastOutLinearInInterpolator()).start();
        }
    }
}
