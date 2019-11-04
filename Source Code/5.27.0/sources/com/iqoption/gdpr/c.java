package com.iqoption.gdpr;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.b.d;
import com.iqoption.core.util.b.e;
import com.iqoption.core.util.b.f;
import com.iqoption.dto.Event;
import com.iqoption.e.fy;
import com.iqoption.popup.PopupPriority;
import com.iqoption.util.ak;
import com.iqoption.util.u;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/gdpr/GdprWarningDialog;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/DialogGdprWarningBinding;", "viewModel", "Lcom/iqoption/gdpr/GdprViewModel;", "acceptAgreement", "", "onClose", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "reportAnalyticsButtonPressed", "eventName", "", "reportAnalyticsShown", "setConfirmButton", "setConfirmButtonState", "progress", "setMessage", "Companion", "app_optionXRelease"})
/* compiled from: GdprWarningDialog.kt */
public final class c extends com.iqoption.fragment.b.b {
    private static final String TAG;
    public static final a drb = new a();
    private HashMap apm;
    private fy dqZ;
    private b dra;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/gdpr/GdprWarningDialog$Companion;", "", "()V", "TAG", "", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tryShow", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: GdprWarningDialog.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: GdprWarningDialog.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = c.drb;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.d(fragmentManager);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void p(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
            if (!A.js(c.TAG)) {
                A.a((Runnable) new a(supportFragmentManager), c.TAG, PopupPriority.VERY_HIGH);
            }
        }

        private final void d(FragmentManager fragmentManager) {
            fragmentManager.beginTransaction().replace(R.id.other_fragment, new c(), c.TAG).addToBackStack(c.TAG).commitAllowingStateLoss();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: GdprWarningDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ c this$0;

        b(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            this.this$0.aIq();
            this.this$0.iz("gdpr_update-terms-ok");
        }
    }

    public static final void p(FragmentActivity fragmentActivity) {
        drb.p(fragmentActivity);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
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
        this.dqZ = (fy) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.dialog_gdpr_warning, viewGroup, false, 4, null);
        fy fyVar = this.dqZ;
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return fyVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.dra = b.dqY.u(com.iqoption.core.ext.a.r(this));
        aIo();
        aIp();
        if (bundle == null) {
            aIr();
        }
    }

    private final void aIo() {
        fy fyVar = this.dqZ;
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = fyVar.cbt;
        kotlin.jvm.internal.i.e(textView, "binding.gdprWarningText");
        String string = getString(R.string.terms_and_conditions);
        kotlin.jvm.internal.i.e(string, "getString(R.string.terms_and_conditions)");
        com.iqoption.core.util.b.a aVar = new com.iqoption.core.util.b.a(string, f.bn(com.iqoption.core.ext.a.q(this)));
        String string2 = getString(R.string.privacy_policy);
        kotlin.jvm.internal.i.e(string2, "getString(R.string.privacy_policy)");
        com.iqoption.core.util.b.a aVar2 = new com.iqoption.core.util.b.a(string2, f.bo(com.iqoption.core.ext.a.q(this)));
        string2 = getString(R.string.update_of_terms_future_description_p1_p2, aVar.getText(), aVar2.getText());
        kotlin.jvm.internal.i.e(string2, "getString(textResId, ter…Link.text, gdprLink.text)");
        com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aVar, aVar2};
        d.a(new e(aVarArr, textView, string2, 0, 0, false, null, 120, null));
    }

    private final void aIp() {
        fy fyVar = this.dqZ;
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        fyVar.cbm.setOnClickListener(new b(this));
    }

    private final void aIq() {
        ef(true);
        b bVar = this.dra;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        u.a(bVar.b(new com.iqoption.core.microservices.busapi.response.b(Boolean.valueOf(true), null, null, null, null, 30, null)), new GdprWarningDialog$acceptAgreement$1(this), new GdprWarningDialog$acceptAgreement$2(this), null, 4, null);
    }

    private final void ef(boolean z) {
        fy fyVar = this.dqZ;
        String str = "binding";
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = fyVar.cbm;
        kotlin.jvm.internal.i.e(textView, "binding.gdprConfirm");
        textView.setEnabled(z ^ 1);
        fy fyVar2;
        if (z) {
            fyVar2 = this.dqZ;
            if (fyVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            fyVar2.cbn.show();
            return;
        }
        fyVar2 = this.dqZ;
        if (fyVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        fyVar2.cbn.hide();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.core.ext.a.t(this).executePendingTransactions();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public void att() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        fy fyVar = this.dqZ;
        String str = "binding";
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = fyVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        aVar.d(frameLayout, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        fyVar = this.dqZ;
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(fyVar.cbo, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})});
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "popup");
        ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator(2.5f));
        fy fyVar2 = this.dqZ;
        if (fyVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fyVar2.cbo, View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alphaPopup");
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void atu() {
        com.iqoption.core.ui.animation.b.a aVar = com.iqoption.core.ui.animation.b.bHe;
        fy fyVar = this.dqZ;
        String str = "binding";
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = fyVar.aoG;
        kotlin.jvm.internal.i.e(frameLayout, "binding.everything");
        Animator d = aVar.d(frameLayout, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        fyVar = this.dqZ;
        if (fyVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = fyVar.cbo;
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

    private final void aIr() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "gdpr_update-terms").build());
    }

    private final void iz(String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, str).build());
    }
}
