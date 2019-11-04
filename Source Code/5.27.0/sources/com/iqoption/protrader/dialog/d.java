package com.iqoption.protrader.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.b.f;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gu;
import com.iqoption.protrader.web.ProTraderWebActivity;
import com.iqoption.protrader.web.ProTraderWebType;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/protrader/dialog/ProTraderSelectedDialog;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/DialogProTraderSelectedBinding;", "event", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "applyNow", "", "learnMore", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "prepareText", "reportClick", "", "showBouncing", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderSelectedDialog.kt */
public final class d extends com.iqoption.fragment.b.b {
    private static final String TAG;
    public static final a dQH = new a();
    private HashMap apm;
    private Builder arm;
    private gu dQG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/protrader/dialog/ProTraderSelectedDialog$Companion;", "", "()V", "TAG", "", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: ProTraderSelectedDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ProTraderSelectedDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = d.dQH;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.k(fragmentManager);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void C(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
            if (!A.js(d.TAG)) {
                A.a((Runnable) new a(supportFragmentManager), d.TAG);
            }
        }

        private final boolean k(FragmentManager fragmentManager) {
            fragmentManager.beginTransaction().replace(R.id.other_fragment, new d(), d.TAG).addToBackStack(d.TAG).commitAllowingStateLoss();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderSelectedDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ d dQI;

        b(d dVar) {
            this.dQI = dVar;
        }

        public final void onClick(View view) {
            this.dQI.atB();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderSelectedDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ d dQI;

        c(d dVar) {
            this.dQI = dVar;
        }

        public final void onClick(View view) {
            this.dQI.jD("pro-traders-eligibility_close");
            this.dQI.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderSelectedDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ d dQI;

        d(d dVar) {
            this.dQI = dVar;
        }

        public final void onClick(View view) {
            this.dQI.aSV();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderSelectedDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ d dQI;

        e(d dVar) {
            this.dQI = dVar;
        }

        public final void onClick(View view) {
            this.dQI.aSW();
        }
    }

    public static final void C(FragmentActivity fragmentActivity) {
        dQH.C(fragmentActivity);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQG = (gu) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.dialog_pro_trader_selected, viewGroup, false, 4, null);
        gu guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return guVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aST();
        gu guVar = this.dQG;
        String str = "binding";
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        guVar.aoG.setOnClickListener(new b(this));
        guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        guVar.ccE.setOnClickListener(new c(this));
        guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        guVar.ccG.setOnClickListener(new d(this));
        guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        guVar.ccD.setOnClickListener(new e(this));
        this.arm = Event.Builder(Event.CATEGORY_POPUP_SERVED, "pro-traders-eligibility_show");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Builder builder = this.arm;
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
        Bj();
    }

    private final void aST() {
        String string = getString(R.string.esma_measures);
        kotlin.jvm.internal.i.e(string, "getString(R.string.esma_measures)");
        String string2 = getString(R.string.high_risk_options_instruments);
        kotlin.jvm.internal.i.e(string2, "getString(R.string.high_risk_options_instruments)");
        String string3 = getString(R.string.up_to_xn1, String.valueOf(500));
        kotlin.jvm.internal.i.e(string3, "getString(R.string.up_to…LABLE_FOR_PRO.toString())");
        String string4 = getString(R.string.n1_are_coming_into_force_soon_n2_n3, string, string2, string3);
        kotlin.jvm.internal.i.e(string4, "getString(R.string.n1_ar…measures, highRisk, upTo)");
        CharSequence charSequence = string4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int a = v.a(charSequence, string2, 0, false, 6, null);
        spannableStringBuilder.setSpan(new StyleSpan(1), a, string2.length() + a, 33);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        string2 = string3;
        a = v.a(charSequence, string3, 0, false, 6, null);
        spannableStringBuilder2.setSpan(new StyleSpan(1), a, string2.length() + a, 33);
        com.iqoption.core.util.b.a aVar = new com.iqoption.core.util.b.a(string, f.a(com.iqoption.core.ext.a.q(this), (int) R.string.blog_link_n1_n2, com.iqoption.core.d.EE().Vj()));
        gu guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = guVar.ccH;
        kotlin.jvm.internal.i.e(textView, "binding.proSelectedText");
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aVar};
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView, spannableStringBuilder2, 0, 0, false, null, 120, null));
    }

    private final void atB() {
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        int bi = com.iqoption.core.util.b.bi(context);
        gu guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        FrameLayout frameLayout = guVar.ccF;
        kotlin.jvm.internal.i.e(frameLayout, "binding.proSelectedContainer");
        com.iqoption.core.util.b.o(frameLayout, bi);
    }

    private final void aSV() {
        jD("pro-traders-eligibility_learn-more");
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.MOR_INFO);
    }

    private final void aSW() {
        jD("pro-traders-eligibility_check-now");
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.APPLY);
        onClose();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public void att() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        gu guVar = this.dQG;
        String str = "binding";
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = guVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        aVar.d(frameLayout, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(guVar.ccF, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(2.5f));
        gu guVar2 = this.dQG;
        if (guVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(guVar2.ccF, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        gu guVar = this.dQG;
        String str = "binding";
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = guVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        Animator d = aVar.d(frameLayout, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        guVar = this.dQG;
        if (guVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        frameLayout = guVar.ccF;
        r2 = new PropertyValuesHolder[3];
        r2[0] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f});
        r2[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f});
        r2[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{d, ofPropertyValuesHolder});
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.start();
    }

    private final void jD(String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, str).build());
    }
}
