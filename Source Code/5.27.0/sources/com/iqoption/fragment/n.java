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
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.a.a.d;
import com.iqoption.a.a.e;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.od;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: FxExpirationFragment */
public class n extends com.iqoption.fragment.b.b {
    private Builder cVb;
    private e cVg;
    @NonNull
    private com.iqoption.f.a cVh;
    private od cVt;
    private b cVu = new b();
    private d cVv;
    private a cVw = new a();

    /* compiled from: FxExpirationFragment */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<n> anu;

        private a(n nVar) {
            this.anu = new WeakReference(nVar);
        }

        public void onTick(long j) {
            n nVar = (n) this.anu.get();
            if (nVar != null && nVar.cVg != null && nVar.cVv != null) {
                nVar.cVv.dataSetChanged();
                nVar.cVg.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: FxExpirationFragment */
    private static class b extends com.iqoption.system.a.d {
        private final WeakReference<n> bJf;

        private b(n nVar) {
            this.bJf = new WeakReference(nVar);
        }

        @com.google.common.b.e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$n$b$0bR2y22hoXQ8REaP3ParN8s7gVg(this, aVar));
            }
        }

        private /* synthetic */ void a(com.iqoption.app.managers.a.e.a aVar) {
            n nVar = (n) this.bJf.get();
            if (nVar != null && nVar.isAdded()) {
                if (nVar.cVv != null) {
                    nVar.cVv.notifyDataSetChanged();
                }
                if (nVar.cVg != null) {
                    nVar.cVg.dataSetChanged();
                }
                if (aVar.avG) {
                    nVar.axG();
                }
            }
        }
    }

    public long axh() {
        return 400;
    }

    public long axj() {
        return 250;
    }

    private static n axM() {
        return new n();
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "FxExpirationFragment";
        fragmentManager.beginTransaction().add(i, axM(), str).addToBackStack(str).commit();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.cVh = com.iqoption.f.a.W(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cVb = com.iqoption.analytics.e.aqT.f(TabHelper.IM().Ja());
        this.cVt = (od) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fx_expiration_fragment, viewGroup, false);
        this.cVt.a(this);
        return this.cVt.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.cVt.cel.setLayoutTransition(ak.anP());
        this.cVv = new d(new -$$Lambda$n$1kNl7As7ssyT-QW-X6ITiZ9eKfY(this));
        this.cVt.cek.setAdapter(this.cVv);
        this.cVt.cek.addItemDecoration(new com.iqoption.view.stickyheadersrecyclerview.d(this.cVv));
        this.cVt.cek.setHasFixedSize(true);
        this.cVg = new e(new -$$Lambda$n$K5qbLwR3bpmcEYWzrjeNtHK_8s8(this), new -$$Lambda$n$gpfgA6MfR92D-H7n-dfLFeqZOOU(this));
        this.cVt.ceq.setAdapter(this.cVg);
        this.cVt.ceq.setHasFixedSize(true);
        this.cVg.dataSetChanged();
        this.cVt.cei.setOnCheckedChangeListener(new -$$Lambda$n$QTd3TJ_-SLG5ROCa5D4niz4ujQ4(this));
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            if (Jh.JE()) {
                axG();
            } else {
                axH();
            }
        }
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(true));
    }

    private /* synthetic */ void s(View view, int i) {
        if (i >= 0 && i < this.cVv.getItemCount() && this.cVv.getItemCount() > 0) {
            com.iqoption.a.a.d.a dy = this.cVv.dy(i);
            if (!dy.anG || dy.anH == null) {
                onBackPressed();
                TabHelper.IM().u(dy.anF);
                com.iqoption.analytics.e.aqT.g(TabHelper.IM().Ja());
                return;
            }
            TabHelper.IM().e(dy.anH);
            com.iqoption.analytics.e.aqT.a(dy.anH.expValue.doubleValue(), TabHelper.IM().Ja());
        }
    }

    private /* synthetic */ void t(View view, int i) {
        if (i >= 0 && i < this.cVg.getItemCount() && this.cVg.getItemCount() > 0) {
            com.iqoption.core.microservices.tradingengine.response.instrument.e dA = this.cVg.dA(i);
            i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                Jh.JB();
                Jh.c(dA);
                axI();
                com.iqoption.analytics.e.aqT.b(dA.getValue(), Jh.Js());
            }
            onBackPressed();
        }
    }

    private /* synthetic */ void axN() {
        e(TabHelper.IM().Jb());
    }

    private /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            a(z, Jh);
        }
    }

    private void e(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
        int a = this.cVg.a(eVar);
        if (a >= 0) {
            this.cVt.ceq.scrollToPosition(a);
        }
    }

    private void a(boolean z, i iVar) {
        iVar.bC(z);
        iVar.JA();
        com.iqoption.analytics.e.aqT.a(z, iVar.Js());
    }

    private void axG() {
        q(TabHelper.IM().Jh());
    }

    private void axH() {
        axI();
    }

    private void q(i iVar) {
        if (iVar != null) {
            this.cVt.cei.setChecked(iVar.JE());
        } else {
            axI();
        }
    }

    private void axI() {
        this.cVt.cei.setChecked(false);
    }

    private void AQ() {
        com.iqoption.view.a.b.aYv().a(this.cVw, Integer.valueOf(5));
    }

    private void AR() {
        com.iqoption.view.a.b.aYv().b(this.cVw);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.microservices.tradingengine.response.active.a avd = this.cVh.avd();
        e eVar = this.cVg;
        if (eVar != null) {
            eVar.e(avd);
        }
        this.cVu.register();
        AQ();
    }

    public void onStop() {
        super.onStop();
        AR();
        this.cVu.unregister();
        this.cVh.onStop();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.cVb != null) {
            com.iqoption.analytics.e.aqT.a(this.cVb);
        }
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(false));
        return true;
    }

    public void att() {
        float f;
        if (af.ebR) {
            Interpolator interpolator = c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            float f2 = (float) dimensionPixelSize2;
            this.cVt.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cVt.bYN.setTranslationY(f);
            this.cVt.cek.setTranslationX(f2);
            this.cVt.cek.setTranslationY(f);
            this.cVt.cek.setAlpha(0.0f);
            this.cVt.ceq.setTranslationX(f2);
            this.cVt.ceq.setTranslationY(f);
            this.cVt.ceq.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVt.bYN, this.cVt.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVt.bYN.getWidth(), (double) this.cVt.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cVt.bYN;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration(400).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cVt.cek;
            propertyValuesHolderArr = new PropertyValuesHolder[3];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(recyclerView, propertyValuesHolderArr);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView2 = this.cVt.ceq;
            r3 = new PropertyValuesHolder[3];
            r3[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            r3[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(recyclerView2, r3);
            ofPropertyValuesHolder3.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.play(ofPropertyValuesHolder3).with(ofPropertyValuesHolder2).after(100);
            animatorSet.start();
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        f = (float) (-dimensionPixelOffset);
        this.cVt.bYN.setTranslationX(f);
        this.cVt.bYN.setTranslationY(f);
        this.cVt.bYN.setPivotX((float) (this.cVt.bYN.getWidth() - dimensionPixelOffset));
        this.cVt.bYN.setPivotY(1.0f);
        this.cVt.bYN.setScaleX(0.3f);
        this.cVt.bYN.setScaleY(0.3f);
        this.cVt.bYN.setAlpha(0.0f);
        this.cVt.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cVt.bYN.setPivotX((float) this.cVt.bYN.getWidth());
        this.cVt.bYN.setPivotY(1.0f);
        this.cVt.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(c.egR).start();
    }
}
