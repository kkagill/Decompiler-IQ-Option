package com.iqoption.deposit.crypto.kyc;

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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.deposit.b.v;
import com.iqoption.deposit.o;
import com.iqoption.deposit.o.f;
import com.iqoption.dto.entity.position.Order;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\t¨\u0006'"}, bng = {"Lcom/iqoption/deposit/crypto/kyc/KycWarningFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/deposit/databinding/FragmentKycWarningBinding;", "currency", "", "kotlin.jvm.PlatformType", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "currencyDescription", "getCurrencyDescription", "currencyDescription$delegate", "isCustomAnimationsEnabled", "", "()Z", "limit", "getLimit", "limit$delegate", "close", "", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimation", "onExitAnimation", "onViewCreated", "view", "Companion", "deposit_release"})
/* compiled from: KycWarningFragment.kt */
public final class a extends d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), Order.LIMIT, "getLimit()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "currency", "getCurrency()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "currencyDescription", "getCurrencyDescription()Ljava/lang/String;"))};
    public static final a czN = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private v czJ;
    private final kotlin.d czK = g.c(new KycWarningFragment$limit$2(this));
    private final kotlin.d czL = g.c(new KycWarningFragment$currency$2(this));
    private final kotlin.d czM = g.c(new KycWarningFragment$currencyDescription$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/crypto/kyc/KycWarningFragment$Companion;", "", "()V", "ARG_CURRENCY", "", "ARG_CURRENCY_DESCRIPTION", "ARG_LIMIT", "TAG", "createNavigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "formattedLimit", "currency", "currencyDescription", "deposit_release"})
    /* compiled from: KycWarningFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c p(String str, String str2, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            kotlin.jvm.internal.i.f(str4, "formattedLimit");
            kotlin.jvm.internal.i.f(str5, "currency");
            kotlin.jvm.internal.i.f(str6, "currencyDescription");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_LIMIT", str4);
            bundle.putString("ARG_CURRENCY", str5);
            bundle.putString("ARG_CURRENCY_DESCRIPTION", str6);
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.deposit.navigator.b.cGp.a(this.this$0, false, KycVerificationContext.BILLING_DEPOSIT_AML);
        }
    }

    private final String aqK() {
        kotlin.d dVar = this.czK;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    private final String aqL() {
        kotlin.d dVar = this.czM;
        j jVar = anY[2];
        return (String) dVar.getValue();
    }

    private final String getCurrency() {
        kotlin.d dVar = this.czL;
        j jVar = anY[1];
        return (String) dVar.getValue();
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
        this.czJ = (v) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_kyc_warning, viewGroup, false, 4, null);
        v vVar = this.czJ;
        if (vVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return vVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        v vVar = this.czJ;
        String str = "binding";
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = vVar.cCx;
        kotlin.jvm.internal.i.e(imageView, "binding.back");
        imageView.setOnClickListener(new b(this));
        vVar = this.czJ;
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = vVar.cCy;
        kotlin.jvm.internal.i.e(textView, "binding.kycWarningDescription");
        textView.setText(getString(o.g.you_have_exceeded_total_deposit_limit_n1_n2_n3, aqK(), getCurrency(), aqL()));
        vVar = this.czJ;
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = vVar.cCz;
        kotlin.jvm.internal.i.e(textView, "binding.verifyKycButton");
        textView.setOnClickListener(new c(this));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    private final void close() {
        com.iqoption.deposit.navigator.b.cGp.P(this).alG();
    }

    public boolean PU() {
        return this.bIN;
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        v vVar = this.czJ;
        String str = "binding";
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = vVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) displayMetrics.heightPixels, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        vVar = this.czJ;
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vVar.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
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
        v vVar = this.czJ;
        String str = "binding";
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = vVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f, (float) displayMetrics.heightPixels});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        vVar = this.czJ;
        if (vVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vVar.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }
}
