package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.common.base.f;
import com.iqoption.analytics.EventManager;
import com.iqoption.analytics.m;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gg;
import com.iqoption.system.a.c;
import com.iqoption.util.af;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.Locale;

/* compiled from: OtnCommisssionChangedDialog */
public final class y extends com.iqoption.fragment.b.b {
    private Builder ajf;
    private gg cWm;

    /* compiled from: OtnCommisssionChangedDialog */
    public static class a extends c<Boolean> {
    }

    /* compiled from: OtnCommisssionChangedDialog */
    public static class b extends c<Boolean> {
    }

    @NonNull
    private static y a(int i, int i2, double d) {
        y yVar = new y();
        yVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).i("arg.comm.value", d).toBundle());
        return yVar;
    }

    public static void a(FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3, double d) {
        com.iqoption.popup.c.A(fragmentActivity).a(new -$$Lambda$y$DYXvq_7NGc7FSJtKS_W4BDUjIT0(fragmentManager, i, i2, i3, d), "OtnCommisssionChangedDialog");
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3, double d) {
        String str = "OtnCommisssionChangedDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, a(i2, i3, d), str).addToBackStack(str).commit();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        CharSequence a;
        this.cWm = (gg) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_otn_commision_changed, viewGroup, false);
        this.cWm.a(this);
        Bundle arguments = getArguments();
        final int i = arguments.getInt("arg.anchorY");
        double d = arguments.getDouble("arg.comm.value");
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        Balance DM = com.iqoption.app.b.DG().DM();
        int i2 = ((DM == null || !f.equal(DM.amount, Double.valueOf(0.0d))) && d.dX("otn_commmision")) ? 1 : 0;
        final ConversionCurrency du = DG.du(Balance.getCurrency(DG.dH(1)));
        CharSequence charSequence = Currencies.OTN_CURRENCY;
        ConversionCurrency du2 = DG.du(charSequence);
        String c = j.c(du);
        String c2 = j.c(du2);
        double doubleValue = j.b(du).doubleValue();
        double doubleValue2 = j.b(du2).doubleValue();
        if (du2 != null) {
            charSequence = du2.name;
        }
        DecimalFormat fq = com.iqoption.core.util.j.fq(2);
        DecimalFormat aWK = j.aWK();
        this.cWm.cbO.setText(j.a(c, Double.valueOf(d), fq));
        this.cWm.cbN.setText(j.d(du));
        double doubleValue3 = j.b(j.c(Double.valueOf(Balance.getBalanceValue(DG.DM())), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue)).doubleValue() - d;
        if (doubleValue3 > 0.0d) {
            a = j.a(c2, Double.valueOf(j.b(j.c(Double.valueOf(d), Double.valueOf(doubleValue)), Double.valueOf(doubleValue2)).doubleValue()), aWK);
        } else {
            String a2 = j.a(c, Double.valueOf(Math.abs(doubleValue3)), fq);
            d = j.b(j.c(Double.valueOf(d - Math.abs(doubleValue3)), Double.valueOf(doubleValue)), Double.valueOf(doubleValue2)).doubleValue();
            a = String.format(Locale.US, "%s + %s", new Object[]{j.a(c2, Double.valueOf(d), aWK), a2});
        }
        this.cWm.cbU.setText(a);
        this.cWm.cbR.setText(charSequence);
        if (com.iqoption.app.managers.feature.c.Iw().ep("show-otn-rate")) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = String.format(Locale.US, c2, new Object[]{String.valueOf(1)});
            objArr[1] = j.a(c, j.b(j.c(Double.valueOf(1.0d), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue)), fq);
            this.cWm.cbS.setText(String.format(locale, "%s = %s", objArr));
            this.cWm.cbT.setVisibility(0);
            this.cWm.cbS.setVisibility(0);
        } else {
            this.cWm.cbT.setVisibility(8);
            this.cWm.cbS.setVisibility(8);
        }
        this.cWm.cbM.setSelected(i2 ^ 1);
        this.cWm.cbM.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (!y.this.cWm.cbM.isSelected()) {
                    y.this.cWm.cbM.setSelected(true);
                    y.this.cWm.cbQ.setSelected(false);
                    d.i("otn_commmision", false);
                    IQApp.Ex().bd(new a().setValue(Boolean.valueOf(false)));
                    m.b(true, j.d(du));
                }
            }
        });
        this.cWm.cbQ.setSelected(i2);
        this.cWm.cbQ.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Balance DM = com.iqoption.app.b.DG().DM();
                if (DM == null || !f.equal(DM.amount, Double.valueOf(0.0d))) {
                    if (!y.this.cWm.cbQ.isSelected()) {
                        y.this.cWm.cbQ.setSelected(true);
                        y.this.cWm.cbM.setSelected(false);
                        d.i("otn_commmision", true);
                        IQApp.Ex().bd(new a().setValue(Boolean.valueOf(true)));
                        m.b(true, charSequence);
                    }
                    return;
                }
                m.b(false, charSequence);
                com.iqoption.app.a.b.dY(y.this.getString(R.string.the_otn_balance_is_0));
            }
        });
        this.cWm.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                y.this.cWm.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                ((LayoutParams) y.this.cWm.bYN.getLayoutParams()).topMargin = i;
                y.this.cWm.bYN.requestLayout();
                return false;
            }
        });
        return this.cWm.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "crypto-confirmation_change-commission-currency");
        IQApp.Ex().bd(new b().setValue(Boolean.valueOf(true)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        com.iqoption.popup.c.A(requireActivity()).jr("OtnCommisssionChangedDialog");
        IQApp.Ex().bd(new b().setValue(Boolean.valueOf(false)));
        return true;
    }

    public void att() {
        this.cWm.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cWm.aGo.setTranslationX((float) dimensionPixelSize2);
            this.cWm.aGo.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWm.bYN, this.cWm.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cWm.bYN.getWidth(), (double) this.cWm.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cWm.aGo;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cWm.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cWm.bYN.setTranslationX(f);
        this.cWm.bYN.setTranslationY(f);
        this.cWm.bYN.setPivotX((float) (this.cWm.bYN.getWidth() - dimensionPixelOffset));
        this.cWm.bYN.setPivotY(1.0f);
        this.cWm.bYN.setScaleX(0.3f);
        this.cWm.bYN.setScaleY(0.3f);
        this.cWm.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWm.bYN.setPivotX((float) this.cWm.bYN.getWidth());
        this.cWm.bYN.setPivotY(1.0f);
        this.cWm.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
