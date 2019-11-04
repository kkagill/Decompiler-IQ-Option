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
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.b.e;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.ea;
import com.iqoption.fragment.b.b;
import com.iqoption.util.af;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: CfdExpirationFragment */
public class d extends b {
    private Builder ajf;
    private ea cUm;
    private com.iqoption.a.a.a cUn;
    private a cUo = new a();

    /* compiled from: CfdExpirationFragment */
    private static class a extends com.iqoption.system.a.d {
        private final WeakReference<d> bJf;

        private a(d dVar) {
            this.bJf = new WeakReference(dVar);
        }

        @e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if ((this.bJf.get() != null || ((d) this.bJf.get()).isAdded()) && aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$d$a$QkQ9J7nFrBWyXpVBcwECX1J4OiY(this));
            }
        }

        private /* synthetic */ void axu() {
            d dVar = (d) this.bJf.get();
            if (dVar != null && dVar.isAdded() && dVar.cUn != null) {
                dVar.cUn.dataSetChanged();
            }
        }
    }

    public static d axt() {
        return new d();
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "ExpirationFragment";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, axt(), str).addToBackStack(str).commit();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cUm = (ea) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.cfd_expiration_fragment, viewGroup, false);
        this.cUm.a(this);
        return this.cUm.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.cUn = new com.iqoption.a.a.a(new -$$Lambda$d$jT0H3OHYXuGrUCwuJiJE-Xo2YpA(this));
        this.cUm.bYM.setHasFixedSize(true);
        this.cUm.bYM.setAdapter(this.cUn);
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(true));
    }

    private /* synthetic */ void s(View view, int i) {
        TabHelper.IM().e(this.cUn.dw(i));
        onBackPressed();
    }

    public void onStart() {
        super.onStart();
        com.iqoption.a.a.a aVar = this.cUn;
        if (aVar != null) {
            aVar.onStart();
        }
        this.cUo.register();
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "expiration-time").setParameters(u.anp().o("instrument_type", TabHelper.IM().IY()).anr());
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        com.iqoption.a.a.a aVar = this.cUn;
        if (aVar != null) {
            aVar.onStop();
        }
        this.cUo.unregister();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(false));
        return true;
    }

    public void att() {
        this.cUm.bYN.setAlpha(0.0f);
        float f;
        if (af.ebR) {
            Interpolator interpolator = c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            float f2 = (float) dimensionPixelSize2;
            this.cUm.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cUm.bYN.setTranslationY(f);
            this.cUm.bYM.setTranslationX(f2);
            this.cUm.bYM.setTranslationY(f);
            this.cUm.bYM.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cUm.bYN, this.cUm.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cUm.bYN.getWidth(), (double) this.cUm.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cUm.bYN;
            r6 = new PropertyValuesHolder[2];
            String str = "translationX";
            r6[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            String str2 = "translationY";
            r6[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r6);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cUm.bYM;
            r8 = new PropertyValuesHolder[3];
            r8[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            r8[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            r8[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(recyclerView, r8);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.play(ofPropertyValuesHolder2).after(100);
            animatorSet.start();
            this.cUm.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        f = (float) (-dimensionPixelOffset);
        this.cUm.bYN.setTranslationX(f);
        this.cUm.bYN.setTranslationY(f);
        this.cUm.bYN.setPivotX((float) (this.cUm.bYN.getWidth() - dimensionPixelOffset));
        this.cUm.bYN.setPivotY(1.0f);
        this.cUm.bYN.setScaleX(0.3f);
        this.cUm.bYN.setScaleY(0.3f);
        this.cUm.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cUm.bYN.animate().alpha(0.0f).setInterpolator(c.egR).start();
    }
}
