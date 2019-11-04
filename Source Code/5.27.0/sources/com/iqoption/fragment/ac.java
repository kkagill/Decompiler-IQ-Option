package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.analytics.j;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.dto.ToastEntity;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.mp;
import com.iqoption.fragment.b.b;
import com.iqoption.popup.c;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.util.e;
import com.iqoption.x.R;

/* compiled from: PendingOrderExecutedFragment */
public final class ac extends b {
    private final Runnable cVr = new -$$Lambda$Gx8nAmzyZvFSpBXd0TNOZfCm9rk(this);
    private mp cWI;
    private int cWJ;
    private int cWK;
    private PendingOrderWrapper cWL;
    private final j cWM = new j();
    private final Handler handler = new Handler();

    private static ac N(Bundle bundle) {
        ac acVar = new ac();
        acVar.setArguments(bundle);
        return acVar;
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i, Order order, int i2) {
        Bundle toBundle = new e().a("arg.order", (Parcelable) order).O("arg.order.view.type", i2).toBundle();
        a(fragmentActivity, fragmentManager, i, N(toBundle), toBundle.hashCode());
    }

    private static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i, Fragment fragment, int i2) {
        c A = c.A(fragmentActivity);
        Runnable -__lambda_ac_f0drxbqaerufzo5cffprocsfenm = new -$$Lambda$ac$f0DRxbqaErUFZO5cfFpRocsfEnM(fragmentManager, i, fragment, i2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PendingOrderExecutedFragment");
        stringBuilder.append(i2);
        A.a(-__lambda_ac_f0drxbqaerufzo5cffprocsfenm, stringBuilder.toString());
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, Fragment fragment, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "PendingOrderExecutedFragment";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        if (fragmentManager.findFragmentByTag(stringBuilder.toString()) == null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(i2);
            beginTransaction = beginTransaction.add(i, fragment, stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(i2);
            beginTransaction.addToBackStack(stringBuilder2.toString()).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWI = (mp) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pending_order_executed, viewGroup, false);
        CharSequence charSequence = null;
        try {
            Bundle arguments = getArguments();
            this.cWJ = arguments.hashCode();
            this.cWL = new PendingOrderWrapper((Order) arguments.getParcelable("arg.order"));
            this.cWK = arguments.getInt("arg.order.view.type", 1);
            int i = this.cWK;
            if (i == 1) {
                this.cWI.chh.setText(R.string.order_was_executed);
                this.cWI.chg.setVisibility(0);
                this.cWI.cbI.setVisibility(0);
            } else if (i == 2) {
                this.cWI.chh.setMaxLines(Integer.MAX_VALUE);
                this.cWI.chh.setText(R.string.mkt_on_open_order_has_been_executed);
                this.cWI.chg.setVisibility(0);
                this.cWI.cbI.setVisibility(0);
            } else if (i == 3) {
                this.cWI.chh.setText(R.string.order_was_created);
                this.cWI.chg.setVisibility(8);
                this.cWI.cbI.setVisibility(8);
                this.cWI.bYN.setOnClickListener(new com.iqoption.view.d.b() {
                    public void M(View view) {
                        ac.this.onClose();
                    }
                });
            }
            this.cWI.cfH.setOnClickListener(new com.iqoption.view.d.b() {
                public void M(View view) {
                    ac.this.onClose();
                }
            });
            this.cWI.cbI.setOnClickListener(new com.iqoption.view.d.b() {
                public void M(View view) {
                    a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(ac.this.cWL.activeId), ac.this.cWL.instrumentType);
                    if (a != null) {
                        com.iqoption.gl.c.aIy().setSelectedPosition(TabHelper.IM().u(a).Ju(), Position.createPositionSplitId(ac.this.cWL.instrumentType, Integer.valueOf(ac.this.cWL.activeId), Long.valueOf(-1), Long.valueOf(ac.this.cWL.positionId)));
                        ac.this.cWM.Ce();
                    }
                    ac.this.onClose();
                }
            });
            a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.cWL.activeId), this.cWL.instrumentType);
            ak.j(this.cWI.aoh, this.cWL.isBuy ? R.drawable.ic_triangle_top_green_8 : R.drawable.ic_triangle_down_red_8);
            TextView textView = this.cWI.aoh;
            if (a != null) {
                charSequence = d.B(a);
            }
            textView.setText(charSequence);
            this.cWI.cfM.setText(com.iqoption.util.c.a.ai(a));
            this.cWI.cia.setText(com.iqoption.core.util.j.fr(a == null ? 6 : a.getPrecision()).format(this.cWL.price));
            return this.cWI.getRoot();
        } catch (Exception unused) {
            onClose();
            return null;
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        j jVar = this.cWM;
        int i = this.cWK;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        jVar.aB(z);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.cWM.onStop();
    }

    public boolean onClose() {
        this.handler.removeCallbacks(this.cVr);
        requireFragmentManager().popBackStack();
        c A = c.A(requireActivity());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PendingOrderExecutedFragment");
        stringBuilder.append(this.cWJ);
        A.jr(stringBuilder.toString());
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.cWK == 3) {
            this.handler.postDelayed(this.cVr, ToastEntity.TOAST_DURATION);
        }
    }

    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.cVr);
    }

    public void att() {
        this.cWI.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cWI.cfL.setTranslationX((float) dimensionPixelSize2);
            this.cWI.cfL.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWI.bYN, this.cWI.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cWI.bYN.getWidth(), (double) this.cWI.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cWI.cfL;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cWI.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cWI.bYN.setTranslationX(f);
        this.cWI.bYN.setTranslationY(f);
        this.cWI.bYN.setPivotX((float) (this.cWI.bYN.getWidth() - dimensionPixelOffset));
        this.cWI.bYN.setPivotY(1.0f);
        this.cWI.bYN.setScaleX(0.3f);
        this.cWI.bYN.setScaleY(0.3f);
        this.cWI.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWI.bYN.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
