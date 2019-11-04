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
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.b.e;
import com.iqoption.a.a.c;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.ic;
import com.iqoption.fragment.b.b;
import com.iqoption.system.a.d;
import com.iqoption.util.af;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: ExpirationFragment */
public class l extends b {
    private Builder ajf;
    private ic cVk;
    private c cVl;
    private c cVm;
    private a cVn = new a(this, null);

    /* compiled from: ExpirationFragment */
    private static class a extends d {
        private final WeakReference<l> bJf;

        /* synthetic */ a(l lVar, AnonymousClass1 anonymousClass1) {
            this(lVar);
        }

        private a(l lVar) {
            this.bJf = new WeakReference(lVar);
        }

        @e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if ((this.bJf.get() != null || ((l) this.bJf.get()).isAdded()) && aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        l lVar = (l) a.this.bJf.get();
                        if (lVar != null && lVar.isAdded()) {
                            if (lVar.cVm != null) {
                                lVar.cVm.dataSetChanged();
                            }
                            if (lVar.cVl != null) {
                                lVar.cVl.dataSetChanged();
                            }
                        }
                    }
                });
            }
        }
    }

    public long axh() {
        return 400;
    }

    public long axj() {
        return 250;
    }

    private static l axL() {
        return new l();
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "ExpirationFragment";
        fragmentManager.beginTransaction().add(i, axL(), str).addToBackStack(str).commit();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cVk = (ic) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.expiration_fragment, viewGroup, false);
        this.cVk.a(this);
        return this.cVk.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.cVk.bYN.setOnTouchListener(-$$Lambda$l$56ICyIQs0vhHiEBScxiTGOWf9eA.INSTANCE);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.setAutoMeasureEnabled(true);
        linearLayoutManager.setAutoMeasureEnabled(true);
        this.cVk.cev.setLayoutManager(linearLayoutManager2);
        this.cVk.cez.setLayoutManager(linearLayoutManager);
        int IX = TabHelper.IM().IX();
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(IX), InstrumentType.TURBO_INSTRUMENT);
        String str = "%";
        if (a == null || !a.aX(com.iqoption.app.managers.l.HZ().Ib()) || a.isSuspended()) {
            this.cVk.ceA.setText(R.string.n_a);
            this.cVk.cez.setVisibility(8);
            this.cVk.cey.setVisibility(8);
        } else {
            int ahR = 100 - a.ahR();
            TextView textView = this.cVk.ceA;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ahR);
            stringBuilder.append(str);
            textView.setText(stringBuilder.toString());
            this.cVm = new c(InstrumentType.TURBO_INSTRUMENT, com.iqoption.app.managers.a.e.Ig().c(a, Expiration.notInitilizedExpiration), new com.iqoption.a.b.a() {
                public void onItemClick(View view, int i) {
                    if (i >= 0 && i < l.this.cVm.getItemCount() && l.this.cVm.getItemCount() > 0) {
                        Expiration dw = l.this.cVm.dw(i);
                        if (TabHelper.IM().IY() == InstrumentType.TURBO_INSTRUMENT) {
                            TabHelper.IM().e(dw);
                        } else {
                            TabHelper.IM().d(com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(TabHelper.IM().IX()), InstrumentType.TURBO_INSTRUMENT), dw);
                        }
                        l.this.onBackPressed();
                        if (l.this.ajf != null) {
                            EventManager.BS().a(l.this.ajf.calcDuration().setValue(Double.valueOf((double) dw.expValue.longValue())).build());
                        }
                    }
                }
            });
            this.cVm.setHasStableIds(true);
            this.cVk.cez.setAdapter(this.cVm);
        }
        com.iqoption.core.microservices.tradingengine.response.active.a a2 = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(IX), InstrumentType.BINARY_INSTRUMENT);
        if (a2 == null || !a2.aX(com.iqoption.app.managers.l.HZ().Ib()) || a2.isSuspended()) {
            this.cVk.cew.setText(R.string.n_a);
            this.cVk.cev.setVisibility(8);
            this.cVk.ceu.setVisibility(8);
        } else {
            int ahR2 = 100 - a2.ahR();
            TextView textView2 = this.cVk.cew;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(ahR2);
            stringBuilder2.append(str);
            textView2.setText(stringBuilder2.toString());
            this.cVl = new c(InstrumentType.BINARY_INSTRUMENT, com.iqoption.app.managers.a.e.Ig().c(a2, Expiration.notInitilizedExpiration), new com.iqoption.a.b.a() {
                public void onItemClick(View view, int i) {
                    if (i >= 0 && i < l.this.cVl.getItemCount() && l.this.cVl.getItemCount() > 0) {
                        Expiration dw = l.this.cVl.dw(i);
                        if (dw.expirationsInGroup != null) {
                            l.this.cVl.b(dw);
                            return;
                        }
                        if (TabHelper.IM().IY() == InstrumentType.BINARY_INSTRUMENT) {
                            TabHelper.IM().e(dw);
                        } else {
                            TabHelper.IM().d(com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(TabHelper.IM().IX()), InstrumentType.BINARY_INSTRUMENT), dw);
                        }
                        l.this.onBackPressed();
                        if (l.this.ajf != null) {
                            EventManager.BS().a(l.this.ajf.calcDuration().setValue(Double.valueOf((double) dw.expValue.longValue())).build());
                        }
                    }
                }
            });
            this.cVl.setHasStableIds(true);
            this.cVk.cev.setAdapter(this.cVl);
        }
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(true));
    }

    public void onStart() {
        super.onStart();
        c cVar = this.cVm;
        if (cVar != null) {
            cVar.onStart();
        }
        cVar = this.cVl;
        if (cVar != null) {
            cVar.onStart();
        }
        this.cVn.register();
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "expiration-time").setParameters(u.anp().o("instrument_type", TabHelper.IM().IY()).anr());
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        c cVar = this.cVm;
        if (cVar != null) {
            cVar.onStop();
        }
        cVar = this.cVl;
        if (cVar != null) {
            cVar.onStop();
        }
        this.cVn.unregister();
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        IQApp.Ex().bd(new com.iqoption.app.managers.a.e.d(false));
        return true;
    }

    public void att() {
        float f;
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            float f2 = (float) dimensionPixelSize2;
            this.cVk.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cVk.bYN.setTranslationY(f);
            this.cVk.cev.setTranslationX(f2);
            this.cVk.cev.setTranslationY(f);
            this.cVk.cev.setAlpha(0.0f);
            this.cVk.cez.setTranslationX(f2);
            this.cVk.cez.setTranslationY(f);
            this.cVk.cez.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVk.bYN, this.cVk.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVk.bYN.getWidth(), (double) this.cVk.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cVk.bYN;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration(400).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cVk.cev;
            propertyValuesHolderArr = new PropertyValuesHolder[3];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(recyclerView, propertyValuesHolderArr);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView2 = this.cVk.cez;
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
        this.cVk.bYN.setTranslationX(f);
        this.cVk.bYN.setTranslationY(f);
        this.cVk.bYN.setPivotX((float) (this.cVk.bYN.getWidth() - dimensionPixelOffset));
        this.cVk.bYN.setPivotY(1.0f);
        this.cVk.bYN.setScaleX(0.3f);
        this.cVk.bYN.setScaleY(0.3f);
        this.cVk.bYN.setAlpha(0.0f);
        this.cVk.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cVk.bYN.setPivotX((float) this.cVk.bYN.getWidth());
        this.cVk.bYN.setPivotY(1.0f);
        this.cVk.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
