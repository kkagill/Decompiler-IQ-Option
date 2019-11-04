package com.iqoption.deposit.light.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.core.ui.d.c;
import com.iqoption.deposit.b;
import com.iqoption.deposit.b.x;
import com.iqoption.deposit.o.f;
import com.iqoption.deposit.o.g;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\b\u0010,\u001a\u00020&H\u0014J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0017J\b\u00100\u001a\u00020\u0019H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u00062"}, bng = {"Lcom/iqoption/deposit/light/complete/CompletePaymentLightFragment;", "Lcom/iqoption/deposit/complete/BaseCompletePaymentFragment;", "()V", "<set-?>", "Lcom/iqoption/deposit/databinding/FragmentPaymentCompletedLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentPaymentCompletedLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentPaymentCompletedLightBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "isCustomAnimationsEnabled", "", "()Z", "animationStartDelayMillis", "", "()Ljava/lang/Long;", "backButton", "Landroid/widget/ImageView;", "buyingTextView", "Landroid/widget/TextView;", "copyErrorButton", "doneButton", "errorAnimation", "Lcom/iqoption/deposit/CurrencyAnimation;", "leftButton", "line1TextView", "line2TextView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimation", "", "onExitAnimation", "progressLogoView", "Lcom/airbnb/lottie/LottieAnimationView;", "resultTextView", "rightButton", "showError", "showSuccessUI", "mainText", "", "successAnimation", "Companion", "deposit_release"})
/* compiled from: CompletePaymentLightFragment.kt */
public final class a extends com.iqoption.deposit.complete.a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentPaymentCompletedLightBinding;"))};
    public static final a cEE = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private final d bIb = kotlin.f.a.eWg.bnQ();

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/light/complete/CompletePaymentLightFragment$Companion;", "", "()V", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "showTag", "", "currencyName", "payAmount", "Ljava/math/BigDecimal;", "errorSession", "isGooglePay", "", "deposit_release"})
    /* compiled from: CompletePaymentLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(String str, String str2, BigDecimal bigDecimal, String str3, boolean z) {
            String str4 = str;
            String str5 = str2;
            BigDecimal bigDecimal2 = bigDecimal;
            String str6 = str3;
            kotlin.jvm.internal.i.f(str4, "showTag");
            kotlin.jvm.internal.i.f(str5, "currencyName");
            kotlin.jvm.internal.i.f(bigDecimal2, "payAmount");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_TAG", str4);
            bundle.putString("ARG_CURRENCY_NAME", str5);
            bundle.putSerializable("ARG_PAY_AMOUNT", bigDecimal2);
            if (str6 != null) {
                bundle.putString("ARG_ERROR_SESSION", str6);
            }
            bundle.putBoolean("ARG_IS_GOOGLE_PAY", z);
            return new c(com.iqoption.deposit.complete.a.cyi.Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    private final void a(x xVar) {
        this.bIb.a(this, anY[0], xVar);
    }

    private final x arK() {
        return (x) this.bIb.b(this, anY[0]);
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((x) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_payment_completed_light, viewGroup, false, 4, null));
        return arK().getRoot();
    }

    /* Access modifiers changed, original: protected */
    public void Lg() {
        super.Lg();
        TextView textView = arK().alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        com.iqoption.core.ext.a.ak(textView);
        arK().alH.setText(g.payment_error);
    }

    @SuppressLint({"SetTextI18n"})
    public void J(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "mainText");
        arK().alH.setText(g.payment_processed);
        com.iqoption.core.ext.a.ak(apO());
        com.iqoption.core.ext.a.al(apP());
        com.iqoption.core.ext.a.al(apQ());
        com.iqoption.core.ext.a.ak(apV());
        TextView textView = arK().cCG;
        String str = "binding.resultText";
        kotlin.jvm.internal.i.e(textView, str);
        com.iqoption.core.ext.a.ak(textView);
        String string = getString(g.success2);
        kotlin.jvm.internal.i.e(string, "getString(R.string.success2)");
        string = u.mY(string);
        TextView textView2 = arK().cCG;
        kotlin.jvm.internal.i.e(textView2, str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(charSequence);
        textView2.setText(stringBuilder.toString());
        TextView textView3 = arK().cCH;
        kotlin.jvm.internal.i.e(textView3, "binding.resultTextTitle");
        com.iqoption.core.ext.a.al(textView3);
    }

    /* renamed from: arL */
    public ImageView apO() {
        ImageView imageView = arK().cCx;
        kotlin.jvm.internal.i.e(imageView, "binding.back");
        return imageView;
    }

    /* renamed from: arM */
    public TextView apY() {
        TextView textView = arK().cCB;
        kotlin.jvm.internal.i.e(textView, "binding.copyErrorMessage");
        return textView;
    }

    public TextView apR() {
        TextView textView = arK().cCA;
        kotlin.jvm.internal.i.e(textView, "binding.buyingText");
        return textView;
    }

    public TextView apU() {
        TextView textView = arK().cCD;
        kotlin.jvm.internal.i.e(textView, "binding.line1");
        return textView;
    }

    public TextView apS() {
        TextView textView = arK().cCE;
        kotlin.jvm.internal.i.e(textView, "binding.line2");
        return textView;
    }

    public TextView apV() {
        TextView textView = arK().cCJ;
        kotlin.jvm.internal.i.e(textView, "binding.startTradingButton");
        return textView;
    }

    public TextView apP() {
        TextView textView = arK().cCC;
        kotlin.jvm.internal.i.e(textView, "binding.leftButton");
        return textView;
    }

    public TextView apQ() {
        TextView textView = arK().cCI;
        kotlin.jvm.internal.i.e(textView, "binding.rightButton");
        return textView;
    }

    public TextView apT() {
        TextView textView = arK().cCG;
        kotlin.jvm.internal.i.e(textView, "binding.resultText");
        return textView;
    }

    public LottieAnimationView apW() {
        LottieAnimationView lottieAnimationView = arK().cCF;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.progressLogo");
        return lottieAnimationView;
    }

    public Long apX() {
        return Long.valueOf(150);
    }

    public boolean PU() {
        return this.bIN;
    }

    public b apZ() {
        return com.iqoption.deposit.c.cwH.aok();
    }

    public b aqa() {
        return com.iqoption.deposit.c.cwH.aoj();
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        View root = arK().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) displayMetrics.heightPixels, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(arK().getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
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
        View root = arK().getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f, (float) displayMetrics.heightPixels});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(arK().getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }
}
