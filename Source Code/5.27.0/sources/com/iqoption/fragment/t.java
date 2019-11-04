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
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.b.e;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.lt;
import com.iqoption.fragment.b.b;
import com.iqoption.gl.c;
import com.iqoption.mobbtech.connect.response.options.OptionEvents;
import com.iqoption.system.a.d;
import com.iqoption.util.af;
import com.iqoption.x.R;
import java.util.Objects;

/* compiled from: MarketOnOpenCreatedFragment */
public class t extends b {
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private lt cVO;
    private Order cVP;
    private final com.iqoption.view.a.b.a cVQ = new -$$Lambda$t$3-a_YpNiOz9CfuX2a4_yffS_sxc(this);
    private final a cVR = new a(this);

    /* compiled from: MarketOnOpenCreatedFragment */
    public static class a extends d {
        private final t cVT;

        a(t tVar) {
            this.cVT = tVar;
        }

        @e
        public void onDeferredOrderExecutedEvent(final OptionEvents.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    if (a.this.cVT != null && a.this.cVT.isAdded()) {
                        if (Order.ON_MKT_OPEN.equals(((Order) eVar.getValue()).getType()) && Objects.equals(a.this.cVT.cVP.getId(), ((Order) eVar.getValue()).getId())) {
                            a.this.cVT.onClose();
                        }
                    }
                }
            });
        }
    }

    private /* synthetic */ void ak(long j) {
        axT();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cVO = (lt) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_mkt_on_open_created, viewGroup, false);
        this.cVP = (Order) getArguments().getParcelable("arg.order");
        this.anF = com.iqoption.app.helpers.a.Gs().a(this.cVP.getInstrumentActiveId(), this.cVP.getInstrumentType());
        if (this.anF == null) {
            return null;
        }
        this.cVO.cfH.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
            }
        });
        this.cVO.cbI.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(t.this.cVP.getInstrumentActiveId(), t.this.cVP.getInstrumentType());
                if (a != null) {
                    c.aIy().setSelectedPosition(TabHelper.IM().u(a).Ju(), Position.createPositionSplitId(t.this.cVP.getInstrumentType(), t.this.cVP.getInstrumentActiveId(), Long.valueOf(-1), t.this.cVP.getPositionId()));
                }
                t.this.onClose();
            }
        });
        axT();
        return this.cVO.getRoot();
    }

    public void att() {
        this.cVO.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cVO.cfL.setTranslationX((float) dimensionPixelSize2);
            this.cVO.cfL.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVO.bYN, this.cVO.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVO.bYN.getWidth(), (double) this.cVO.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cVO.cfL;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cVO.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cVO.bYN.setTranslationX(f);
        this.cVO.bYN.setTranslationY(f);
        this.cVO.bYN.setPivotX((float) (this.cVO.bYN.getWidth() - dimensionPixelOffset));
        this.cVO.bYN.setPivotY(1.0f);
        this.cVO.bYN.setScaleX(0.3f);
        this.cVO.bYN.setScaleY(0.3f);
        this.cVO.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void onStart() {
        super.onStart();
        this.cVR.register();
    }

    public void onStop() {
        this.cVR.unregister();
        super.onStop();
    }

    public void onResume() {
        super.onResume();
        com.iqoption.view.a.b.aYv().a(this.cVQ);
    }

    public void onPause() {
        com.iqoption.view.a.b.aYv().b(this.cVQ);
        super.onPause();
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        com.iqoption.popup.c A = com.iqoption.popup.c.A(requireActivity());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MarketOnOpenCreatedFragment");
        stringBuilder.append(getArguments().hashCode());
        A.jr(stringBuilder.toString());
        return true;
    }

    public void atu() {
        this.cVO.bYN.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    private void axT() {
        long Ib = l.HZ().Ib();
        long aY = this.anF.aY(Ib);
        if (this.anF.aX(Ib)) {
            this.cVO.chm.setVisibility(8);
            this.cVO.chl.setVisibility(8);
        } else if (aY == Long.MAX_VALUE) {
            this.cVO.chm.setVisibility(0);
            this.cVO.chl.setVisibility(0);
            this.cVO.chm.setText(R.string.not_available);
        } else {
            this.cVO.chm.setVisibility(0);
            this.cVO.chl.setVisibility(0);
            this.cVO.chm.setText(TimeUtil.s(Ib, aY));
        }
    }

    private static t M(Bundle bundle) {
        t tVar = new t();
        tVar.setArguments(bundle);
        return tVar;
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i, Order order) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg.order", order);
        int hashCode = bundle.hashCode();
        t M = M(bundle);
        com.iqoption.popup.c A = com.iqoption.popup.c.A(fragmentActivity);
        Runnable -__lambda_t_xk2-visithiw5u8qcqeuh7txsvs = new -$$Lambda$t$XK2-viSIthIw5u8Qcqeuh7TXSVs(fragmentManager, i, M, hashCode);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MarketOnOpenCreatedFragment");
        stringBuilder.append(hashCode);
        A.a(-__lambda_t_xk2-visithiw5u8qcqeuh7txsvs, stringBuilder.toString());
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, Fragment fragment, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "MarketOnOpenCreatedFragment";
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
}
