package com.iqoption.dialog;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.l;
import com.iqoption.e.wx;
import com.iqoption.fragment.MenuFragment.MenuItem;
import com.iqoption.fragment.b.b;
import com.iqoption.popup.c;
import com.iqoption.util.e;
import com.iqoption.x.R;

/* compiled from: RateUsDialog */
public class d extends b {
    private ImageView[] anm = new ImageView[5];
    private final l cHb = new l();
    private wx cHc;
    private boolean cHd;
    private boolean cHe;

    /* compiled from: RateUsDialog */
    private class a implements OnClickListener {
        private int cHa;

        public a(int i) {
            this.cHa = i;
        }

        public void onClick(View view) {
            for (int i = 0; i < d.this.anm.length; i++) {
                if (i <= this.cHa) {
                    d.this.anm[i].setImageResource(R.drawable.rate_star_on);
                } else {
                    d.this.anm[i].setImageResource(R.drawable.rate_star_off);
                }
            }
            com.iqoption.app.d.aP(d.this.getContext()).dK(2);
            d.this.fy(this.cHa + 1);
            d.this.fz(this.cHa + 1);
        }
    }

    @NonNull
    private static d cT(boolean z) {
        d dVar = new d();
        dVar.setArguments(new e().z("arg.user.loyalty", z).toBundle());
        return dVar;
    }

    public static void a(FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
        c.A(fragmentActivity).a(new -$$Lambda$d$-idnLuHfC0gjLP0d1g24bdoT1ew(fragmentManager), "RateUsDialog");
    }

    private static void a(@NonNull FragmentManager fragmentManager, @NonNull d dVar) {
        String str = "RateUsDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, dVar, str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        this.cHc = (wx) DataBindingUtil.inflate(layoutInflater, R.layout.rate_us_dialog, viewGroup, false);
        this.cHc.a(this);
        this.cHc.cqK.setText(getString(R.string.please_rate_how_much_n1, getString(R.string.app_name)));
        this.cHd = getArguments().getBoolean("arg.user.loyalty", false);
        this.anm[0] = this.cHc.cqL;
        this.anm[1] = this.cHc.cqM;
        this.anm[2] = this.cHc.cqN;
        this.anm[3] = this.cHc.cqO;
        this.anm[4] = this.cHc.cqP;
        while (true) {
            ImageView[] imageViewArr = this.anm;
            if (i < imageViewArr.length) {
                imageViewArr[i].setOnClickListener(new a(i));
                i++;
            } else {
                this.cHc.cqJ.setOnClickListener(new -$$Lambda$d$VJzgNuLny_HgtripdwBU5Re683E(this));
                this.cHc.ckI.setOnClickListener(new -$$Lambda$d$dNb10M6rlQwa938YiJdp8qZz85k(this));
                return this.cHc.getRoot();
            }
        }
    }

    private /* synthetic */ void aC(View view) {
        if (this.cHe) {
            onClose();
            if (!TextUtils.isEmpty(com.iqoption.core.d.Un().Dw())) {
                com.iqoption.core.util.b.d.a(requireActivity(), com.iqoption.core.d.Un().Dw(), null, null);
                return;
            }
            return;
        }
        onClose();
        TradeRoomActivity tradeRoomActivity = getTradeRoomActivity();
        if (tradeRoomActivity != null && !com.iqoption.core.d.Un().Dq()) {
            tradeRoomActivity.a(MenuItem.SUPPORT);
        }
    }

    private /* synthetic */ void aB(View view) {
        this.cHb.Cn();
        onClose();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cHb.onStart();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.cHb.aD(this.cHd);
        com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
        if (Fa.Fh() != 2) {
            Fa.dK(2);
            fy(0);
        }
    }

    private void fy(int i) {
        String str = "client_platform_id";
        com.iqoption.mobbtech.connect.request.api.e.jh("sendMessage").ji("rate").p("rating", Integer.valueOf(i)).p(str, Integer.valueOf(17)).exec();
    }

    public void att() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(-1476395008)});
        ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(this.cHc.caT));
        ofObject.setDuration(300);
        ofObject.setInterpolator(com.iqoption.view.a.a.c.egR);
        this.cHc.aRl.setAlpha(0.0f);
        this.cHc.aRl.setScaleX(0.3f);
        this.cHc.aRl.setScaleY(0.3f);
        this.cHc.aRl.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        ofObject.start();
    }

    public void atu() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(-1476395008), Integer.valueOf(0)});
        ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(this.cHc.caT));
        ofObject.setDuration(300);
        ofObject.setInterpolator(com.iqoption.view.a.a.c.egR);
        this.cHc.aRl.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        ofObject.start();
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr("RateUsDialog");
        return true;
    }

    private void fz(int i) {
        this.cHe = i >= 4;
        TextView textView = this.cHc.cqH;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getActivity().getString(R.string.your_rating2));
        stringBuilder.append(" ");
        stringBuilder.append(i);
        textView.setText(stringBuilder.toString());
        this.cHc.cqJ.setVisibility(0);
        this.cHc.ckI.setVisibility(8);
        if (this.cHe) {
            this.cHc.cqJ.setText(getActivity().getString(R.string.share));
            this.cHc.cqI.setVisibility(0);
            this.cHb.Co();
            return;
        }
        this.cHc.cqJ.setText(getActivity().getString(R.string.leave_feedback));
        this.cHc.cqI.setVisibility(8);
        this.cHb.i((double) i);
    }
}
