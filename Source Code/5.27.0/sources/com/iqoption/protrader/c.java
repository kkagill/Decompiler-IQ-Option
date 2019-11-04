package com.iqoption.protrader;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gq;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.protrader.web.ProTraderWebActivity;
import com.iqoption.protrader.web.ProTraderWebType;
import com.iqoption.util.aa;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, bng = {"Lcom/iqoption/protrader/ProTraderApplicationStatusDialog;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/DialogProApplicationStatusBinding;", "event", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "statusType", "Lcom/iqoption/microservice/regulators/response/StatusType;", "getStatusType", "()Lcom/iqoption/microservice/regulators/response/StatusType;", "statusType$delegate", "Lkotlin/Lazy;", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "prepareText", "prepareTitle", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderApplicationStatusDialog.kt */
public final class c extends com.iqoption.fragment.b.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "statusType", "getStatusType()Lcom/iqoption/microservice/regulators/response/StatusType;"))};
    public static final a dQo = new a();
    private HashMap apm;
    private Builder arm;
    private final kotlin.d dQm = g.c(new ProTraderApplicationStatusDialog$statusType$2(this));
    private gq dQn;

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/protrader/ProTraderApplicationStatusDialog$Companion;", "", "()V", "ARG_STATUS_TYPE", "", "TAG", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "statusType", "Lcom/iqoption/microservice/regulators/response/StatusType;", "", "fm", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: ProTraderApplicationStatusDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ProTraderApplicationStatusDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;
            final /* synthetic */ StatusType dju;

            a(FragmentManager fragmentManager, StatusType statusType) {
                this.deH = fragmentManager;
                this.dju = statusType;
            }

            public final void run() {
                a aVar = c.dQo;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.a(fragmentManager, this.dju);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentActivity fragmentActivity, StatusType statusType) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            kotlin.jvm.internal.i.f(statusType, "statusType");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
            if (!A.js(c.TAG)) {
                A.a((Runnable) new a(supportFragmentManager, statusType), c.TAG);
            }
        }

        private final boolean a(FragmentManager fragmentManager, StatusType statusType) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_STATUS_TYPE", statusType);
            cVar.setArguments(bundle);
            fragmentManager.beginTransaction().replace(R.id.other_fragment, cVar, c.TAG).addToBackStack(c.TAG).commitAllowingStateLoss();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderApplicationStatusDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ c this$0;

        b(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderApplicationStatusDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ c this$0;

        c(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderApplicationStatusDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ c this$0;

        d(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            if (this.this$0.aOy() == StatusType.DECLINED) {
                ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this.this$0), ProTraderWebType.APPLY);
            } else {
                this.this$0.onClose();
            }
        }
    }

    public static final void a(FragmentActivity fragmentActivity, StatusType statusType) {
        dQo.a(fragmentActivity, statusType);
    }

    private final StatusType aOy() {
        kotlin.d dVar = this.dQm;
        j jVar = anY[0];
        return (StatusType) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQn = (gq) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.dialog_pro_application_status, viewGroup, false, 4, null);
        gq gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gqVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aSS();
        aST();
        gq gqVar = this.dQn;
        String str2 = "binding";
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gqVar.aoG.setOnClickListener(new b(this));
        gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gqVar.ccu.setOnClickListener(new c(this));
        gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        gqVar.ccu.setOnClickListener(new d(this));
        int i = d.aob[aOy().ordinal()];
        if (i == 1) {
            str = "pro-traders-approved_show";
        } else if (i == 2) {
            str = "pro-traders-declined_show";
        } else {
            aa.cq(aOy());
            throw null;
        }
        this.arm = Event.Builder(Event.CATEGORY_POPUP_SERVED, str);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Builder builder = this.arm;
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
        Bj();
    }

    private final void aSS() {
        CharSequence charSequence;
        int i = d.axg[aOy().ordinal()];
        String string;
        if (i == 1) {
            string = getString(R.string.you_are_a);
            kotlin.jvm.internal.i.e(string, "getString(R.string.you_are_a)");
            if (string != null) {
                string = string.toUpperCase();
                kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toUpperCase()");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.append("  ");
                Drawable drawable = ContextCompat.getDrawable(com.iqoption.core.ext.a.q(this), R.drawable.ic_pro_badge);
                if (drawable == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(drawable, "ContextCompat.getDrawabl….drawable.ic_pro_badge)!!");
                com.iqoption.view.text.c cVar = new com.iqoption.view.text.c(drawable, getResources().getDimensionPixelSize(R.dimen.dp32), getResources().getDimensionPixelSize(R.dimen.dp14));
                i = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(cVar, i - 1, i, 17);
                charSequence = spannableStringBuilder;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else if (i == 2) {
            string = getString(R.string.application_declined);
            kotlin.jvm.internal.i.e(string, "getString(R.string.application_declined)");
            charSequence = string;
        } else {
            aa.cq(aOy());
            throw null;
        }
        gq gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = gqVar.ccw;
        kotlin.jvm.internal.i.e(textView, "binding.proApplicationStatusTitle");
        textView.setText(charSequence);
    }

    private final void aST() {
        CharSequence charSequence;
        int i = d.aFX[aOy().ordinal()];
        if (i == 1) {
            String string = getString(R.string.now_you_are_pro);
            kotlin.jvm.internal.i.e(string, "getString(R.string.now_you_are_pro)");
            charSequence = string;
        } else if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.your_application_for_n1_declined, "*PRO_BADGE_ANCHOR*"));
            Drawable drawable = ContextCompat.getDrawable(com.iqoption.core.ext.a.q(this), R.drawable.ic_pro_badge);
            if (drawable == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(drawable, "ContextCompat.getDrawabl….drawable.ic_pro_badge)!!");
            com.iqoption.view.text.c cVar = new com.iqoption.view.text.c(drawable, getResources().getDimensionPixelSize(R.dimen.dp23), getResources().getDimensionPixelSize(R.dimen.dp10));
            charSequence = spannableStringBuilder;
            int a = v.a(charSequence, r4, 0, false, 6, null);
            spannableStringBuilder.setSpan(cVar, a, a + 18, 17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.learn_more));
            spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 17);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(spannableStringBuilder2);
        } else {
            aa.cq(aOy());
            throw null;
        }
        gq gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = gqVar.ccv;
        kotlin.jvm.internal.i.e(textView, "binding.proApplicationStatusText");
        textView.setText(charSequence);
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public void att() {
        gq gqVar = this.dQn;
        String str = "binding";
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(gqVar.ccu, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(2.5f));
        gq gqVar2 = this.dQn;
        if (gqVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gqVar2.ccu, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        gq gqVar = this.dQn;
        String str = "binding";
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gqVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        Animator d = aVar.d(frameLayout, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        gqVar = this.dQn;
        if (gqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gqVar.ccu;
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
}
