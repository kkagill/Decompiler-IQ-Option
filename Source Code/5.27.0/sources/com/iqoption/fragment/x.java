package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.e.lv;
import com.iqoption.fragment.rightpanel.j;
import com.iqoption.util.af;
import com.iqoption.x.R;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: MultiplierFragment */
public final class x extends com.iqoption.fragment.b.b {
    private lv cWh;

    /* compiled from: MultiplierFragment */
    public static class c {
        public final int bBe;

        public c(int i) {
            this.bBe = i;
        }
    }

    /* compiled from: MultiplierFragment */
    private interface e {
        a create(ViewGroup viewGroup);
    }

    /* compiled from: MultiplierFragment */
    private static final class a extends ViewHolder {
        private int bBe;

        /* compiled from: MultiplierFragment */
        interface a {
            void onItemClick(int i, int i2);
        }

        public a(View view, final a aVar) {
            super(view);
            view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (a.this.getAdapterPosition() != -1) {
                        aVar.onItemClick(a.this.bBe, a.this.getAdapterPosition());
                    }
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public void fY(int i) {
            this.bBe = i;
            ((TextView) this.itemView).setText(String.format(Locale.US, "x%d", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* compiled from: MultiplierFragment */
    private static final class b extends Adapter<a> {
        private final e cWk;
        private final int[] cWl;

        private b(e eVar, int[] iArr) {
            this.cWk = eVar;
            this.cWl = iArr;
        }

        /* renamed from: G */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return this.cWk.create(viewGroup);
        }

        /* renamed from: a */
        public void onBindViewHolder(a aVar, int i) {
            aVar.fY(this.cWl[i]);
        }

        public int getItemCount() {
            return this.cWl.length;
        }
    }

    /* compiled from: MultiplierFragment */
    public static class d extends com.iqoption.system.a.c<Boolean> {
    }

    public static x c(@NonNull InstrumentType instrumentType, int i) {
        x xVar = new x();
        xVar.setArguments(new com.iqoption.util.e().a("arg.activeType", (Serializable) instrumentType).O("arg.activeId", i).toBundle());
        return xVar;
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i, @NonNull InstrumentType instrumentType, int i2) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        x c = c(instrumentType, i2);
        String str = "MultiplierFragment";
        beginTransaction.add(i, c, str).addToBackStack(str).commit();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWh = (lv) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_multiplier_chooser, viewGroup, false);
        this.cWh.a(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setAutoMeasureEnabled(true);
        this.cWh.chn.setDuplicateParentStateEnabled(false);
        this.cWh.chn.setLayoutManager(linearLayoutManager);
        Bundle arguments = getArguments();
        InstrumentType instrumentType = (InstrumentType) arguments.getSerializable("arg.activeType");
        com.iqoption.core.microservices.tradingengine.response.b.a a = com.iqoption.app.helpers.a.Gs().a(instrumentType, arguments.getInt("arg.activeId"));
        if (a != null) {
            this.cWh.chn.setAdapter(new b(new -$$Lambda$x$x3NCUFLT3-2g0FQRJ4ryV8QNKrA(this), j.a(a.cB(com.iqoption.app.b.DG().Er()), instrumentType)));
        }
        return this.cWh.getRoot();
    }

    private /* synthetic */ a s(ViewGroup viewGroup) {
        return new a(LayoutInflater.from(getContext()).inflate(R.layout.multiplier_list_item, viewGroup, false), new -$$Lambda$x$T7gMkHnaITp9EuzvkqzYTyDL_2M(this));
    }

    private /* synthetic */ void ax(int i, int i2) {
        IQApp.Ex().bd(new c(i));
        onBackPressed();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        IQApp.Ex().bd(new d().setValue(Boolean.valueOf(true)));
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        IQApp.Ex().bd(new d().setValue(Boolean.valueOf(false)));
        return true;
    }

    public void att() {
        this.cWh.bYN.setAlpha(0.0f);
        float f;
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            float f2 = (float) dimensionPixelSize2;
            this.cWh.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cWh.bYN.setTranslationY(f);
            this.cWh.chn.setTranslationX(f2);
            this.cWh.chn.setTranslationY(f);
            this.cWh.chn.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWh.bYN, this.cWh.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cWh.bYN.getWidth(), (double) this.cWh.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cWh.bYN;
            r6 = new PropertyValuesHolder[2];
            String str = "translationX";
            r6[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            String str2 = "translationY";
            r6[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r6);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cWh.chn;
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
            this.cWh.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        f = (float) (-dimensionPixelOffset);
        this.cWh.bYN.setTranslationX(f);
        this.cWh.bYN.setTranslationY(f);
        this.cWh.bYN.setPivotX((float) (this.cWh.bYN.getWidth() - dimensionPixelOffset));
        this.cWh.bYN.setPivotY(1.0f);
        this.cWh.bYN.setScaleX(0.3f);
        this.cWh.bYN.setScaleY(0.3f);
        this.cWh.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWh.bYN.animate().alpha(0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
