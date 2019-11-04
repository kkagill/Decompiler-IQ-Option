package com.iqoption.protrader.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gs;
import com.iqoption.e.ph;
import com.iqoption.e.pl;
import com.iqoption.e.pn;
import com.iqoption.protrader.web.ProTraderWebActivity;
import com.iqoption.protrader.web.ProTraderWebType;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/protrader/dialog/ProTraderBenefitsDialog;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "avatarTransformation", "Lcom/iqoption/core/ui/picasso/CircleTransformation;", "binding", "Lcom/iqoption/databinding/DialogProTraderBenefitsBinding;", "bottomRow", "Lcom/iqoption/databinding/LayoutProTraderBenefitsBottomRowBinding;", "event", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "topRow", "Lcom/iqoption/databinding/LayoutProTraderBenefitsTopRowBinding;", "applyNow", "", "initAvatar", "initToolbar", "learnMore", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "reportClick", "", "showBouncing", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderBenefitsDialog.kt */
public final class a extends com.iqoption.fragment.b.b {
    private static final String TAG;
    public static final a dQD = new a();
    private final com.iqoption.core.ui.picasso.a aPf = new com.iqoption.core.ui.picasso.a();
    private HashMap apm;
    private Builder arm;
    private gs dQA;
    private pn dQB;
    private pl dQC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/protrader/dialog/ProTraderBenefitsDialog$Companion;", "", "()V", "TAG", "", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: ProTraderBenefitsDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ProTraderBenefitsDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = a.dQD;
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
            if (!A.js(a.TAG)) {
                A.a((Runnable) new a(supportFragmentManager), a.TAG);
            }
        }

        private final boolean k(FragmentManager fragmentManager) {
            fragmentManager.beginTransaction().replace(R.id.other_fragment, new a(), a.TAG).addToBackStack(a.TAG).commitAllowingStateLoss();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderBenefitsDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a dQE;

        b(a aVar) {
            this.dQE = aVar;
        }

        public final void onClick(View view) {
            this.dQE.jD("pro-traders-intro_close");
            this.dQE.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderBenefitsDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a dQE;

        c(a aVar) {
            this.dQE = aVar;
        }

        public final void onClick(View view) {
            this.dQE.atB();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderBenefitsDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ a dQE;

        d(a aVar) {
            this.dQE = aVar;
        }

        public final void onClick(View view) {
            this.dQE.aSV();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderBenefitsDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ a dQE;

        e(a aVar) {
            this.dQE = aVar;
        }

        public final void onClick(View view) {
            this.dQE.aSW();
        }
    }

    public static final void C(FragmentActivity fragmentActivity) {
        dQD.C(fragmentActivity);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQA = (gs) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.dialog_pro_trader_benefits, viewGroup, false, 4, null);
        gs gsVar = this.dQA;
        String str = "binding";
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        pn pnVar = gsVar.ccB;
        kotlin.jvm.internal.i.e(pnVar, "binding.proBenefitsTopRow");
        this.dQB = pnVar;
        gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        pl plVar = gsVar.ccy;
        kotlin.jvm.internal.i.e(plVar, "binding.proBenefitsBottomRow");
        this.dQC = plVar;
        gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return gsVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        view.setLayerType(1, null);
        Lb();
        aTb();
        pn pnVar = this.dQB;
        if (pnVar == null) {
            kotlin.jvm.internal.i.lG("topRow");
        }
        TextView textView = pnVar.cmB;
        kotlin.jvm.internal.i.e(textView, "topRow.proBenefitsCurrentType");
        textView.setText(getString(R.string.your_type_n1, getString(R.string.retail)));
        String string = getString(R.string.access_to_higher_leverages_n1, String.valueOf(500));
        kotlin.jvm.internal.i.e(string, "getString(R.string.acces…LABLE_FOR_PRO.toString())");
        gs gsVar = this.dQA;
        String str = "binding";
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView2 = gsVar.ccx;
        kotlin.jvm.internal.i.e(textView2, "binding.proBenefitsAccessToHigherLeverages");
        textView2.setText(string);
        gs gsVar2 = this.dQA;
        if (gsVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gsVar2.aoG.setOnClickListener(new c(this));
        pl plVar = this.dQC;
        String str2 = "bottomRow";
        if (plVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        plVar.cmv.setOnClickListener(new d(this));
        plVar = this.dQC;
        if (plVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        plVar.cmy.setOnClickListener(new e(this));
        this.arm = Event.Builder(Event.CATEGORY_POPUP_SERVED, "pro-traders-intro_show");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Builder builder = this.arm;
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
        Bj();
    }

    private final void Lb() {
        gs gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ph phVar = gsVar.ccA;
        kotlin.jvm.internal.i.e(phVar, "binding.proBenefitsToolbar");
        phVar.cmt.setText(R.string.introducing_account_categories);
        phVar.cms.setOnClickListener(new b(this));
    }

    private final void aTb() {
        pn pnVar = this.dQB;
        if (pnVar == null) {
            kotlin.jvm.internal.i.lG("topRow");
        }
        ImageView imageView = pnVar.cmA;
        kotlin.jvm.internal.i.e(imageView, "topRow.proBenefitsAvatar");
        com.iqoption.core.microservices.avatar.a avatar = com.iqoption.app.b.aK(com.iqoption.core.ext.a.q(this)).getAvatar();
        com.iqoption.core.microservices.avatar.d am = avatar != null ? avatar.am(imageView.getMeasuredWidth(), imageView.getMeasuredHeight()) : null;
        if (am != null) {
            RequestCreator load = Picasso.with(com.iqoption.core.ext.a.q(this)).load(am.getUrl());
            Drawable drawable = AppCompatResources.getDrawable(com.iqoption.core.ext.a.q(this), R.drawable.ic_avatar_placeholder);
            if (drawable != null) {
                load.placeholder(drawable);
            }
            load.transform((Transformation) this.aPf).fit().into(imageView);
            return;
        }
        imageView.setImageResource(R.drawable.ic_avatar_placeholder);
    }

    private final void aSV() {
        jD("pro-traders-intro_learn-more");
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.MOR_INFO);
    }

    private final void aSW() {
        jD("pro-traders-intro_apply-now");
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.APPLY);
        onClose();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    private final void atB() {
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        int bi = com.iqoption.core.util.b.bi(context);
        gs gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = gsVar.ccz;
        kotlin.jvm.internal.i.e(linearLayout, "binding.proBenefitsContainer");
        com.iqoption.core.util.b.o(linearLayout, bi);
    }

    public void att() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        gs gsVar = this.dQA;
        String str = "binding";
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gsVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        aVar.d(frameLayout, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(gsVar.ccz, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(2.5f));
        gs gsVar2 = this.dQA;
        if (gsVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gsVar2.ccz, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        gs gsVar = this.dQA;
        String str = "binding";
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gsVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        Animator d = aVar.d(frameLayout, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        gsVar = this.dQA;
        if (gsVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gsVar.ccz;
        r2 = new PropertyValuesHolder[3];
        r2[0] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f});
        r2[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f});
        r2[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r2);
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
