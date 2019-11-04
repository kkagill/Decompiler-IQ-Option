package com.iqoption.fragment.dialog;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.app.managers.feature.a;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.fu;
import com.iqoption.fragment.b.b;
import com.iqoption.popup.c;
import com.iqoption.util.ak;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.text.DecimalFormat;

/* compiled from: DialogCongratOtnEmissionExecuted */
public class d extends b {
    public Builder ajf;
    private double commissionVolumeEnrolled;
    private double dec;
    private final DecimalFormat ded = j.aWK();
    private fu dee;
    private double totalCommissionEnrolled;

    public static void a(FragmentActivity fragmentActivity, @IdRes int i, FragmentManager fragmentManager, double d, double d2, double d3) {
        if (a.Ih() && a.Ii()) {
            c.A(fragmentActivity).a(new -$$Lambda$d$vbT9kCD_WSNo0PbneIptKKHYQYU(fragmentManager, i, new e().i("arg.otn.change.value", d).i("arg.value.balance", d2).i("arg.total.value.balance", d3).toBundle()), "DialogCongratOtnEmissionExecuted");
        }
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle) {
        String str = "DialogCongratOtnEmissionExecuted";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, P(bundle), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    private static d P(Bundle bundle) {
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.dee = (fu) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_congrat_otn_emission_executed, viewGroup, false);
        this.dee.a(this);
        Bundle arguments = getArguments();
        this.dec = arguments.getDouble("arg.otn.change.value");
        this.commissionVolumeEnrolled = arguments.getDouble("arg.value.balance");
        this.totalCommissionEnrolled = arguments.getDouble("arg.total.value.balance");
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        ConversionCurrency du = DG.du(Balance.getCurrency(DG.dH(1)));
        String d = j.d(j.c(du), j.b(Double.valueOf(this.commissionVolumeEnrolled), j.b(du)));
        this.dee.cba.setText(getString(R.string.you_receive_tokens_for_turnover, d));
        this.dee.cbb.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                d.this.onClose();
            }
        });
        this.dee.aRO.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                h.a(d.this.getId(), d.this.getFragmentManager(), d.this.totalCommissionEnrolled, d.this.commissionVolumeEnrolled, d.this.dec);
                com.iqoption.analytics.c.BQ();
            }
        });
        this.dee.cbi.kb("0.000000");
        this.dee.caX.setLayoutTransition(ak.anP());
        this.dee.caZ.setLayoutTransition(ak.anP());
        this.dee.cbd.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                h.a(d.this.getId(), d.this.getFragmentManager(), d.this.totalCommissionEnrolled, d.this.commissionVolumeEnrolled, d.this.dec);
                com.iqoption.analytics.c.BQ();
            }
        });
        return this.dee.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ajf = com.iqoption.analytics.c.BR();
        if (akX()) {
            y.a(getActivity(), this.dee.getRoot());
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.iqoption.analytics.c.a(this.ajf, this.dec, this.commissionVolumeEnrolled);
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr("DialogCongratOtnEmissionExecuted");
        return true;
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void att() {
        this.dee.caT.setAlpha(0.0f);
        this.dee.bYN.setAlpha(0.0f);
        this.dee.cbi.d(this.ded.format(this.dec), 0, 500);
        this.dee.bYN.setTranslationY((float) getResources().getDimensionPixelSize(R.dimen.dp48));
        this.dee.cbf.setAlpha(0.0f);
        this.dee.cbf.setScaleX(0.1f);
        this.dee.cbf.setScaleY(0.1f);
        this.dee.cbe.setAlpha(0.0f);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(-1476395008)});
        ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(this.dee.caT));
        ofObject.setDuration(400);
        FrameLayout frameLayout = this.dee.bYN;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(500);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.dee.cbe, View.ALPHA, new float[]{1.0f});
        ofFloat.setDuration(700);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.dee.cbe, View.ALPHA, new float[]{0.0f});
        ofFloat2.setDuration(300);
        ImageView imageView = this.dee.cbf;
        r8 = new PropertyValuesHolder[4];
        r8[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        r8[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.7f, 1.0f});
        r8[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.7f, 1.0f});
        r8[3] = PropertyValuesHolder.ofFloat(View.ROTATION, new float[]{360.0f});
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, r8);
        ofPropertyValuesHolder2.setDuration(1000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.play(ofObject).with(ofPropertyValuesHolder2).with(ofPropertyValuesHolder);
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.start();
        this.dee.caT.setAlpha(1.0f);
    }

    public void atu() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(-1476395008), Integer.valueOf(0)});
        ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(this.dee.caT));
        FrameLayout frameLayout = this.dee.cbh;
        r3 = new PropertyValuesHolder[3];
        r3[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        r3[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.7f});
        r3[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.7f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        com.iqoption.core.util.b bVar = com.iqoption.core.util.b.bQf;
        com.iqoption.core.util.b.a(animatorSet, 300);
        animatorSet.play(ofObject).with(ofPropertyValuesHolder);
        animatorSet.start();
    }
}
