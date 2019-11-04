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
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.b.e;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.sx;
import com.iqoption.system.a.d;
import com.iqoption.util.af;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: MultiExpirationFragment */
public class v extends com.iqoption.fragment.b.b {
    private Builder cVb;
    private b cWa = new b(this, null);
    private sx cWb;
    private a cWc = new a(this, null);
    private com.iqoption.a.a.b cWd;

    /* compiled from: MultiExpirationFragment */
    private static class a extends d {
        private final WeakReference<v> bJf;

        /* synthetic */ a(v vVar, AnonymousClass1 anonymousClass1) {
            this(vVar);
        }

        private a(v vVar) {
            this.bJf = new WeakReference(vVar);
        }

        @e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$v$a$VSKZV9doJFF5iVN7pl9RbLxc15c(this));
            }
        }

        private /* synthetic */ void axu() {
            v vVar = (v) this.bJf.get();
            if (vVar != null && vVar.isAdded() && vVar.cWd != null) {
                vVar.cWd.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: MultiExpirationFragment */
    private static class b implements com.iqoption.view.a.b.a {
        private final WeakReference<v> anu;

        /* synthetic */ b(v vVar, AnonymousClass1 anonymousClass1) {
            this(vVar);
        }

        private b(v vVar) {
            this.anu = new WeakReference(vVar);
        }

        public void onTick(long j) {
            v vVar = (v) this.anu.get();
            if (vVar != null && vVar.cWd != null) {
                vVar.cWd.dataSetChanged();
            }
        }
    }

    public long axh() {
        return 400;
    }

    public long axj() {
        return 250;
    }

    private static v ayc() {
        return new v();
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "DigitalExpirationFragment";
        fragmentManager.beginTransaction().add(i, ayc(), str).addToBackStack(str).commit();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cVb = com.iqoption.analytics.e.aqT.f(TabHelper.IM().Ja());
        this.cWb = (sx) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.multi_expiration_fragment, viewGroup, false);
        this.cWb.a(this);
        return this.cWb.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.cWd = new com.iqoption.a.a.b(new com.iqoption.a.b.a() {
            public void onItemClick(View view, int i) {
                if (i >= 0 && i < v.this.cWd.getItemCount() && v.this.cWd.getItemCount() > 0) {
                    Expiration dw = v.this.cWd.dw(i);
                    TabHelper.IM().e(dw);
                    i Jh = TabHelper.IM().Jh();
                    if (Jh != null) {
                        com.iqoption.analytics.e.aqT.a(dw.expValue.doubleValue(), Jh.Js());
                    }
                    v.this.onBackPressed();
                }
            }
        });
        this.cWb.cek.setAdapter(this.cWd);
        this.cWb.cek.addItemDecoration(new com.iqoption.view.stickyheadersrecyclerview.d(this.cWd));
        this.cWb.cek.setHasFixedSize(true);
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(true));
    }

    public void onStart() {
        super.onStart();
        this.cWc.register();
        com.iqoption.view.a.b.aYv().a(this.cWa, Integer.valueOf(5));
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        this.cWc.unregister();
        com.iqoption.view.a.b.aYv().b(this.cWa);
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
            this.cWb.aRl.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cWb.aRl.setTranslationY(f);
            this.cWb.cek.setTranslationX(f2);
            this.cWb.cek.setTranslationY(f);
            this.cWb.cek.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWb.aRl, this.cWb.aRl.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cWb.aRl.getWidth(), (double) this.cWb.aRl.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cWb.aRl;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration(400).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cWb.cek;
            r3 = new PropertyValuesHolder[3];
            r3[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            r3[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(recyclerView, r3);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.play(ofPropertyValuesHolder2).after(100);
            animatorSet.start();
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        f = (float) (-dimensionPixelOffset);
        this.cWb.aRl.setTranslationX(f);
        this.cWb.aRl.setTranslationY(f);
        this.cWb.aRl.setPivotX((float) (this.cWb.aRl.getWidth() - dimensionPixelOffset));
        this.cWb.aRl.setPivotY(1.0f);
        this.cWb.aRl.setScaleX(0.3f);
        this.cWb.aRl.setScaleY(0.3f);
        this.cWb.aRl.setAlpha(0.0f);
        this.cWb.aRl.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cWb.aRl.setPivotX((float) this.cWb.aRl.getWidth());
        this.cWb.aRl.setPivotY(1.0f);
        this.cWb.aRl.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(c.egR).start();
    }
}
