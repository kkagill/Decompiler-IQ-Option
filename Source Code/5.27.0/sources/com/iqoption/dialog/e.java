package com.iqoption.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.core.util.j;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gw;
import com.iqoption.fragment.b.b;
import com.iqoption.mobbtech.connect.request.api.Requests;
import com.iqoption.popup.c;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;

/* compiled from: ReloadPracticeDialog */
public class e extends b {
    private Builder ajf;
    private DecimalFormat cHg;
    private double cHh;
    private String cHi;
    private AnimatorSet cHj;
    private gw cHk;

    /* compiled from: ReloadPracticeDialog */
    private static class a implements Runnable {
        private static volatile a cHo;
        private final WeakReference<FragmentManager> cHm;
        private final WeakReference<FragmentActivity> cHn;

        public a(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
            this.cHn = new WeakReference(fragmentActivity);
            this.cHm = new WeakReference(fragmentManager);
        }

        public void run() {
            FragmentActivity fragmentActivity = (FragmentActivity) this.cHn.get();
            FragmentManager fragmentManager = (FragmentManager) this.cHm.get();
            if (fragmentActivity != null && fragmentManager != null) {
                e.a(fragmentActivity, fragmentManager);
            }
        }

        public static synchronized boolean aty() {
            boolean z;
            synchronized (a.class) {
                z = cHo == null;
            }
            return z;
        }

        public static synchronized a b(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
            a aVar;
            synchronized (a.class) {
                if (cHo == null) {
                    synchronized (a.class) {
                        if (cHo == null) {
                            cHo = new a(fragmentActivity, fragmentManager);
                        }
                    }
                }
                aVar = cHo;
            }
            return aVar;
        }
    }

    public long getAnimationDuration() {
        return 350;
    }

    private static e atv() {
        return new e();
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager, com.iqoption.app.b bVar) {
        if (!d.dX("is_showed_reload_practice_dialog") && !bVar.Ej() && bVar.DJ() == 4 && bVar.DI().doubleValue() < 1000.0d && a.aty()) {
            com.iqoption.core.c.a.biN.postDelayed(a.b(fragmentActivity, fragmentManager), 5000);
        }
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
        c.A(fragmentActivity).a(new -$$Lambda$e$PZF6k4piOj3s7SuQd8WAjdU-DTw(fragmentManager), "ReloadPracticeDialog");
    }

    private static void d(@NonNull FragmentManager fragmentManager) {
        String str = "ReloadPracticeDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, atv(), str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cHk = (gw) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_reload_practice, viewGroup, false);
        d.i("is_showed_reload_practice_dialog", true);
        this.cHk.ccJ.setOnClickListener(new -$$Lambda$e$rWf_OLiPrpdIC4hbs4DWzhsdhY8(this));
        this.cHk.aoG.setOnClickListener(new -$$Lambda$e$Lgq9fdGfRkuYv4pOZRVOC880oAs(this));
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        Balance dH = DG.dH(4);
        ConversionCurrency du = DG.du(Balance.getCurrency(dH));
        this.cHg = j.fq(com.iqoption.util.j.e(du));
        this.cHh = Balance.getBalanceValue(dH);
        this.cHi = com.iqoption.util.j.c(du);
        this.cHk.ccI.setText(com.iqoption.util.j.a(this.cHi, Double.valueOf(this.cHh), this.cHg));
        this.cHk.ccN.setOnClickListener(new -$$Lambda$e$zBwUrROUr8NeO6li8LDFzHlXPaY(this));
        return this.cHk.getRoot();
    }

    private /* synthetic */ void aD(View view) {
        onBackPressed();
    }

    private /* synthetic */ void aC(View view) {
        onBackPressed();
    }

    private /* synthetic */ void aB(View view) {
        Requests.aPA();
        onBackPressed();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "reload_practice_dialog");
        com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$e$JI5-wZpvSBFKvury56TCDCyoYqk(this), getAnimationDuration());
    }

    private /* synthetic */ void atx() {
        atw();
    }

    public void onDestroyView() {
        super.onDestroyView();
        AnimatorSet animatorSet = this.cHj;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.cHj.cancel();
            this.cHj = null;
        }
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    public boolean onClose() {
        AnimatorSet animatorSet = this.cHj;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.cHj.cancel();
            this.cHj = null;
        }
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr("ReloadPracticeDialog");
        return true;
    }

    public void att() {
        com.iqoption.core.ui.animation.b.d(this.cHk.aoG, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        ObjectAnimator.ofPropertyValuesHolder(this.cHk.ccK, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})}).setInterpolator(new OvershootInterpolator(2.5f));
        ObjectAnimator.ofFloat(this.cHk.ccK, View.ALPHA, new float[]{0.0f, 1.0f}).setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, r1, r3});
        animatorSet.start();
    }

    public void atu() {
        Animator d = com.iqoption.core.ui.animation.b.d(this.cHk.aoG, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        FrameLayout frameLayout = this.cHk.ccK;
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

    private void atw() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.cHk.ccM, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.5f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.5f, 1.0f})});
        ofPropertyValuesHolder.setDuration(500);
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.egR);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.cHk.ccM, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(com.iqoption.view.a.a.c.egR);
        ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator<Double>() {
            /* renamed from: a */
            public Double evaluate(float f, Double d, Double d2) {
                double doubleValue = d.doubleValue();
                double d3 = (double) f;
                double doubleValue2 = d2.doubleValue() - d.doubleValue();
                Double.isNaN(d3);
                return Double.valueOf(doubleValue + (d3 * doubleValue2));
            }
        }, new Object[]{Double.valueOf(this.cHh), Double.valueOf(10000.0d)});
        ofObject.setDuration(500);
        ofObject.setInterpolator(com.iqoption.view.a.a.c.egR);
        ofObject.addUpdateListener(new -$$Lambda$e$PIgnPrCidXH67VJRg69BAT08ST4(this));
        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(this.cHk.ccI, "textColor", new ArgbEvaluator(), new Object[]{Integer.valueOf(-1), Integer.valueOf(getColor(R.color.orange_practice))});
        ofObject2.setDuration(500);
        ofObject2.setInterpolator(com.iqoption.view.a.a.c.egR);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(1000);
        this.cHj = new AnimatorSet();
        this.cHj.play(ofPropertyValuesHolder).after(500);
        this.cHj.play(ofFloat).after(ofPropertyValuesHolder).with(ofObject).with(ofObject2);
        this.cHj.play(ofFloat2).after(ofObject);
        this.cHj.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                e.this.cHk.ccM.setAlpha(1.0f);
                e.this.cHk.ccI.setTextColor(-1);
                e.this.cHk.ccI.setText(com.iqoption.util.j.a(e.this.cHi, Double.valueOf(e.this.cHh), e.this.cHg));
            }

            public void onAnimationEnd(Animator animator) {
                e.this.cHj.start();
            }
        });
        this.cHj.start();
    }

    private /* synthetic */ void g(ValueAnimator valueAnimator) {
        this.cHk.ccI.setText(com.iqoption.util.j.a(this.cHi, (Double) valueAnimator.getAnimatedValue(), this.cHg));
    }
}
