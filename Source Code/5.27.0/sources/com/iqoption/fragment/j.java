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
import com.google.android.material.tabs.TabLayout.f;
import com.iqoption.a.a.e;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.util.y;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.ia;
import com.iqoption.instruments.strikes.StrikeSelectionMode;
import com.iqoption.system.a.d;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: DigitalExpirationFragment */
public class j extends com.iqoption.fragment.b.b {
    private Builder cVb;
    private ia cVd;
    private b cVe = new b(this, null);
    private com.iqoption.a.a.b cVf;
    private e cVg;
    @NonNull
    private com.iqoption.f.a cVh;
    private a cVi = new a(this, null);

    /* compiled from: DigitalExpirationFragment */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<j> anu;

        /* synthetic */ a(j jVar, AnonymousClass1 anonymousClass1) {
            this(jVar);
        }

        private a(j jVar) {
            this.anu = new WeakReference(jVar);
        }

        public void onTick(long j) {
            j jVar = (j) this.anu.get();
            if (jVar != null && jVar.cVg != null && jVar.cVf != null) {
                jVar.cVf.dataSetChanged();
                jVar.cVg.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: DigitalExpirationFragment */
    private static class b extends d {
        private final WeakReference<j> bJf;

        /* synthetic */ b(j jVar, AnonymousClass1 anonymousClass1) {
            this(jVar);
        }

        private b(j jVar) {
            this.bJf = new WeakReference(jVar);
        }

        @com.google.common.b.e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$j$b$nsQ1RnPBXs-Z_xL0LKDSG0saWT4(this, aVar));
            }
        }

        private /* synthetic */ void a(com.iqoption.app.managers.a.e.a aVar) {
            j jVar = (j) this.bJf.get();
            if (jVar != null && jVar.isAdded()) {
                if (jVar.cVf != null) {
                    jVar.cVf.notifyDataSetChanged();
                }
                if (jVar.cVg != null) {
                    jVar.cVg.dataSetChanged();
                }
                if (aVar.avG) {
                    jVar.axG();
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

    private static j axF() {
        return new j();
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "DigitalExpirationFragment";
        fragmentManager.beginTransaction().add(i, axF(), str).addToBackStack(str).commit();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.cVh = com.iqoption.f.a.W(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cVb = com.iqoption.analytics.e.aqT.f(TabHelper.IM().Ja());
        this.cVd = (ia) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.digital_expiration_fragment, viewGroup, false);
        this.cVd.a(this);
        return this.cVd.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.cVd.cel.setLayoutTransition(ak.anP());
        this.cVf = new com.iqoption.a.a.b(new com.iqoption.a.b.a() {
            public void onItemClick(View view, int i) {
                if (i >= 0 && i < j.this.cVf.getItemCount() && j.this.cVf.getItemCount() > 0) {
                    Expiration dw = j.this.cVf.dw(i);
                    TabHelper.IM().e(dw);
                    com.iqoption.analytics.e.aqT.a(dw.expValue.doubleValue(), TabHelper.IM().Ja());
                }
            }
        });
        this.cVd.cek.setAdapter(this.cVf);
        this.cVd.cek.addItemDecoration(new com.iqoption.view.stickyheadersrecyclerview.d(this.cVf));
        this.cVd.cek.setHasFixedSize(true);
        this.cVg = new e(new -$$Lambda$j$9EKbMjjdZAT2U8BwWVwDkCu5wd8(this), new -$$Lambda$j$xQGKmeew_TYHAqe2wPD2ZnwRARo(this));
        this.cVd.ceq.setAdapter(this.cVg);
        this.cVd.ceq.setHasFixedSize(true);
        this.cVg.dataSetChanged();
        this.cVd.cei.setOnCheckedChangeListener(new -$$Lambda$j$oHdci5YGf_yYmXgfsTSX9J9g3JU(this));
        i Jh = TabHelper.IM().Jh();
        if (Jh != null && Jh.awE.IG()) {
            this.cVd.cei.setVisibility(8);
            this.cVd.cep.setVisibility(0);
            this.cVd.ceo.setVisibility(0);
            this.cVd.ceo.a(new y() {
                public void i(f fVar) {
                    i Jh = TabHelper.IM().Jh();
                    if (Jh != null) {
                        Jh.a(StrikeSelectionMode.values()[fVar.getPosition()]);
                        Jh.JA();
                    }
                }
            });
        }
        if (Jh != null) {
            if (Jh.JE() || Jh.isSpotStrike()) {
                axG();
            } else {
                axH();
            }
        }
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(true));
    }

    private /* synthetic */ void s(View view, int i) {
        if (i >= 0 && i < this.cVg.getItemCount() && this.cVg.getItemCount() > 0) {
            com.iqoption.core.microservices.tradingengine.response.instrument.e dA = this.cVg.dA(i);
            i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                Jh.bC(false);
                Jh.c(dA);
                Jh.JA();
                axH();
                com.iqoption.analytics.e.aqT.b(dA.getValue(), Jh.Js());
            }
            onBackPressed();
        }
    }

    private /* synthetic */ void axK() {
        e(TabHelper.IM().Jb());
    }

    private /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            a(z, Jh);
        }
    }

    private void a(boolean z, i iVar) {
        iVar.bC(z);
        iVar.JA();
        com.iqoption.analytics.e.aqT.a(z, iVar.Js());
    }

    private void e(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
        int a = this.cVg.a(eVar);
        if (a >= 0) {
            this.cVd.ceq.scrollToPosition(a);
        }
    }

    private void axG() {
        i Jh = TabHelper.IM().Jh();
        if (Jh.awE.IG()) {
            r(Jh);
        } else {
            q(Jh);
        }
    }

    private void axH() {
        if (TabHelper.IM().Jh().awE.IG()) {
            axJ();
        } else {
            axI();
        }
    }

    private void q(i iVar) {
        if (iVar != null) {
            this.cVd.cei.setChecked(iVar.JE());
        } else {
            axI();
        }
    }

    private void axI() {
        this.cVd.cei.setChecked(false);
    }

    private void r(i iVar) {
        if (iVar == null) {
            axJ();
        } else if (iVar.awE.IH()) {
            fX(2);
        } else {
            fX(1);
        }
    }

    private void axJ() {
        fX(0);
    }

    private void fX(int i) {
        f aY = this.cVd.ceo.aY(i);
        if (!aY.isSelected()) {
            aY.select();
        }
    }

    private void AQ() {
        com.iqoption.view.a.b.aYv().a(this.cVi, Integer.valueOf(5));
    }

    private void AR() {
        com.iqoption.view.a.b.aYv().b(this.cVi);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.microservices.tradingengine.response.active.a avd = this.cVh.avd();
        e eVar = this.cVg;
        if (eVar != null) {
            eVar.e(avd);
        }
        this.cVe.register();
        AQ();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        AR();
        this.cVe.unregister();
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
            this.cVd.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cVd.bYN.setTranslationY(f);
            this.cVd.cek.setTranslationX(f2);
            this.cVd.cek.setTranslationY(f);
            this.cVd.cek.setAlpha(0.0f);
            this.cVd.ceq.setTranslationX(f2);
            this.cVd.ceq.setTranslationY(f);
            this.cVd.ceq.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVd.bYN, this.cVd.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVd.bYN.getWidth(), (double) this.cVd.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cVd.bYN;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration(400).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cVd.cek;
            propertyValuesHolderArr = new PropertyValuesHolder[3];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(recyclerView, propertyValuesHolderArr);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView2 = this.cVd.ceq;
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
        this.cVd.bYN.setTranslationX(f);
        this.cVd.bYN.setTranslationY(f);
        this.cVd.bYN.setPivotX((float) (this.cVd.bYN.getWidth() - dimensionPixelOffset));
        this.cVd.bYN.setPivotY(1.0f);
        this.cVd.bYN.setScaleX(0.3f);
        this.cVd.bYN.setScaleY(0.3f);
        this.cVd.bYN.setAlpha(0.0f);
        this.cVd.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cVd.bYN.setPivotX((float) this.cVd.bYN.getWidth());
        this.cVd.bYN.setPivotY(1.0f);
        this.cVd.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(c.egR).start();
    }
}
