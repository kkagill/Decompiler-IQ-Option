package com.iqoption.deposit.light.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.c;
import com.iqoption.deposit.b.ab;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.f;
import java.util.HashMap;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u0006!"}, bng = {"Lcom/iqoption/deposit/light/web/RedirectWebPaymentLightFragment;", "Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment;", "()V", "<set-?>", "Lcom/iqoption/deposit/databinding/FragmentRedirectWebPaymentLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentRedirectWebPaymentLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentRedirectWebPaymentLightBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "isCustomAnimationsEnabled", "", "()Z", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimation", "", "onExitAnimation", "onViewCreated", "view", "toolbarClose", "Landroid/widget/ImageView;", "webView", "Landroid/webkit/WebView;", "Companion", "deposit_release"})
/* compiled from: RedirectWebPaymentLightFragment.kt */
public final class a extends com.iqoption.deposit.web.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentRedirectWebPaymentLightBinding;"))};
    public static final a cGc = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private final d bIb = kotlin.f.a.eWg.bnQ();

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, bng = {"Lcom/iqoption/deposit/light/web/RedirectWebPaymentLightFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "redirectUrl", "redirectParams", "Ljava/util/HashMap;", "session", "isPost", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "deposit_release"})
    /* compiled from: RedirectWebPaymentLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final c a(String str, HashMap<String, String> hashMap, String str2, boolean z, com.iqoption.deposit.i iVar) {
            String str3 = str;
            HashMap<String, String> hashMap2 = hashMap;
            com.iqoption.deposit.i iVar2 = iVar;
            kotlin.jvm.internal.i.f(str3, "redirectUrl");
            kotlin.jvm.internal.i.f(hashMap2, "redirectParams");
            kotlin.jvm.internal.i.f(iVar2, "depositParams");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_REDIRECT_URL", str3);
            bundle.putSerializable("ARG_REDIRECT_PARAMS", hashMap2);
            bundle.putBoolean("ARG_REDIRECT_METHOD_IS_POST", z);
            bundle.putParcelable("ARG_DEPOSIT_PARAMS", iVar2);
            bundle.putString("ARG_SESSION", str2);
            return new c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    private final void a(ab abVar) {
        this.bIb.a(this, anY[0], abVar);
    }

    private final ab asN() {
        return (ab) this.bIb.b(this, anY[0]);
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
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((ab) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_redirect_web_payment_light, viewGroup, false));
        return asN().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        asQ().setBackgroundColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), b.deposit_grey));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: asO */
    public ImageView asP() {
        ImageView imageView = asN().cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.toolbarBack");
        return imageView;
    }

    /* Access modifiers changed, original: protected */
    public WebView asQ() {
        WebView webView = asN().cCN;
        kotlin.jvm.internal.i.e(webView, "binding.paymentAuthorizationWebView");
        return webView;
    }

    public boolean PU() {
        return this.bIN;
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        View root = asN().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) displayMetrics.heightPixels, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(asN().getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void PY() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        View root = asN().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f, (float) displayMetrics.heightPixels});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(asN().getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }
}
