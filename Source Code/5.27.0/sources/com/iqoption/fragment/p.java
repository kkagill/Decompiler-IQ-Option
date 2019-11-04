package com.iqoption.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.iqoption.app.d;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.core.util.af;
import com.iqoption.e.ol;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/fragment/HowToTradeMultiOptionFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/HowToTradeMultiFragmentBinding;", "animateEnter", "", "offset", "", "view", "Landroid/view/View;", "animateExit", "getAnimationDuration", "", "onClose", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHideAnimation", "onShowAnimation", "Companion", "app_optionXRelease"})
/* compiled from: HowToTradeMultiOptionFragment.kt */
public final class p extends com.iqoption.fragment.b.b {
    private static final String TAG = TAG;
    private static final String cVF = cVF;
    public static final a cVG = new a();
    private HashMap apm;
    private ol cVE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/HowToTradeMultiOptionFragment$Companion;", "", "()V", "IS_SHOWED_HOW_TO_TRADE_MULTY_SCREEN", "", "TAG", "getTAG", "()Ljava/lang/String;", "isShowed", "", "newInstance", "Lcom/iqoption/fragment/HowToTradeMultiOptionFragment;", "app_optionXRelease"})
    /* compiled from: HowToTradeMultiOptionFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return p.TAG;
        }

        public final p axR() {
            return new p();
        }

        public final boolean axS() {
            return d.dX(p.cVF);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/HowToTradeMultiOptionFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ p cVH;

        public b(p pVar) {
            this.cVH = pVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cVH.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/HowToTradeMultiOptionFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ p cVH;

        public c(p pVar) {
            this.cVH = pVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            d.i(p.cVF, true);
            this.cVH.onClose();
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public long getAnimationDuration() {
        return 250;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ol olVar = (ol) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.how_to_trade_multi_fragment, viewGroup, false);
        FrameLayout frameLayout = olVar.caT;
        kotlin.jvm.internal.i.e(frameLayout, "screen");
        frameLayout.setOnClickListener(new b(this));
        TextView textView = olVar.clo;
        kotlin.jvm.internal.i.e(textView, "gotIt");
        textView.setOnClickListener(new c(this));
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.core.microservices.tradingengine.response.active.a Ja = IM.Ja();
        if (!(Ja instanceof j)) {
            Ja = null;
        }
        j jVar = (j) Ja;
        if (jVar != null) {
            int c = (int) com.iqoption.core.microservices.f.a.a.a.bzg.c(com.iqoption.app.helpers.a.Gs().a(jVar.getActiveId(), jVar.getInstrumentType()));
            TextView textView2 = olVar.cln;
            kotlin.jvm.internal.i.e(textView2, "discr");
            textView2.setText(getString(R.string.the_percentage_of_profit_from_the_asset_n1, af.i(Integer.valueOf(c))));
        }
        this.cVE = olVar;
        olVar = this.cVE;
        if (olVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return olVar.getRoot();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        return true;
    }

    public void att() {
        float gd = gd(R.dimen.dp12);
        ol olVar = this.cVE;
        if (olVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        CardView cardView = olVar.clm;
        kotlin.jvm.internal.i.e(cardView, "binding.content");
        a(gd, cardView);
    }

    public void atu() {
        ol olVar = this.cVE;
        if (olVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        CardView cardView = olVar.clm;
        kotlin.jvm.internal.i.e(cardView, "binding.content");
        Z(cardView);
    }

    private final void a(float f, View view) {
        view.setAlpha(0.0f);
        view.setTranslationX(-f);
        view.setTranslationY(f);
        view.setPivotX(0.0f);
        view.setPivotY((float) view.getMeasuredHeight());
        com.iqoption.core.ext.a.i(view, 0.3f);
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f);
        animate.translationX(0.0f).translationY(0.0f);
        animate.scaleX(1.0f).scaleY(1.0f);
        animate.setDuration(axh());
        animate.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        animate.start();
    }

    private final void Z(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(0.0f);
        animate.scaleY(0.7f).scaleX(0.7f);
        animate.setDuration(axj());
        animate.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        animate.start();
    }
}
