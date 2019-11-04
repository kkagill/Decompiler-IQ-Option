package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.af;
import com.iqoption.e.is;
import com.iqoption.util.ak;
import com.iqoption.util.e;
import com.iqoption.util.g;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: CommissionsValueChangedFragment */
public final class h extends com.iqoption.fragment.b.b {
    private boolean cUN = false;
    private InstrumentType cUO = InstrumentType.UNKNOWN;
    private is cUP;
    private Animator cUQ;
    private int cUR;

    /* compiled from: CommissionsValueChangedFragment */
    private static class c {
        public final String cUY = j.DO();
        public final Double cUZ = j.aWI();
    }

    /* compiled from: CommissionsValueChangedFragment */
    private interface d {
        a r(ViewGroup viewGroup);
    }

    /* compiled from: CommissionsValueChangedFragment */
    private static final class a extends ViewHolder {
        private final TextView anJ;
        private final TextView cUU;
        private final TextView cUV;
        private final c cUW;
        private final InstrumentType instrumentType;

        public a(View view, InstrumentType instrumentType, c cVar) {
            super(view);
            this.cUW = cVar;
            this.instrumentType = instrumentType;
            this.anJ = (TextView) view.findViewById(R.id.activeName);
            this.cUU = (TextView) view.findViewById(R.id.fixCommission);
            this.cUV = (TextView) view.findViewById(R.id.percentCommission);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(com.iqoption.core.microservices.tradingengine.response.a.a aVar) {
            if (aVar != null) {
                Context context = this.anJ.getContext();
                com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(aVar.aiq(), this.instrumentType);
                if (a != null) {
                    this.anJ.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(a));
                }
                com.iqoption.core.microservices.tradingengine.response.a.a.a air = aVar.air();
                if (air != null) {
                    if (air.ais() == null || com.google.common.c.a.b(0.0d, air.ais().doubleValue(), 0.1d)) {
                        this.cUU.setText(context.getString(R.string.n_a));
                    } else {
                        this.cUU.setText(j.d(this.cUW.cUY, Double.valueOf(air.ais().doubleValue() / this.cUW.cUZ.doubleValue())));
                    }
                    double doubleValue = air.ait() == null ? 0.0d : air.ait().doubleValue() * 100.0d;
                    if (com.google.common.c.a.b(0.0d, doubleValue, 0.1d)) {
                        this.cUV.setText(context.getString(R.string.n_a));
                    } else {
                        this.cUV.setText(af.b(doubleValue, "", 2));
                    }
                }
            }
        }
    }

    /* compiled from: CommissionsValueChangedFragment */
    private static final class b extends Adapter<a> {
        private final ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> atv;
        private final d cUX;

        /* synthetic */ b(d dVar, ArrayList arrayList, AnonymousClass1 anonymousClass1) {
            this(dVar, arrayList);
        }

        private b(d dVar, ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> arrayList) {
            this.cUX = dVar;
            this.atv = arrayList;
        }

        /* renamed from: F */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return this.cUX.r(viewGroup);
        }

        /* renamed from: a */
        public void onBindViewHolder(a aVar, int i) {
            aVar.a((com.iqoption.core.microservices.tradingengine.response.a.a) this.atv.get(i));
        }

        public int getItemCount() {
            return this.atv.size();
        }
    }

    private static h c(InstrumentType instrumentType, ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> arrayList) {
        h hVar = new h();
        hVar.setArguments(new e().a("arg.instrumentType", (Serializable) instrumentType).a("arg.commission_items", (ArrayList) arrayList).toBundle());
        return hVar;
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i, InstrumentType instrumentType, ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> arrayList) {
        com.iqoption.popup.c A = com.iqoption.popup.c.A(fragmentActivity);
        Runnable -__lambda_h_avsuawak4aesqhmltlwh_q4njia = new -$$Lambda$h$avSuawAk4AESQhMLtlWH_q4nJiA(fragmentManager, i, instrumentType, arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommissionsValueChangedFragment");
        stringBuilder.append(instrumentType);
        A.a(-__lambda_h_avsuawak4aesqhmltlwh_q4njia, stringBuilder.toString());
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, InstrumentType instrumentType, ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "CommissionsValueChangedFragment";
        stringBuilder.append(str);
        stringBuilder.append(instrumentType);
        if (fragmentManager.findFragmentByTag(stringBuilder.toString()) == null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            h c = c(instrumentType, arrayList);
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(instrumentType);
            beginTransaction = beginTransaction.add(i, c, stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(instrumentType);
            beginTransaction.addToBackStack(stringBuilder2.toString()).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cUP = (is) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_commission_change, viewGroup, false);
        this.cUR = com.iqoption.core.util.b.bi(requireContext());
        this.cUP.cfH.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                h.this.onClose();
            }
        });
        this.cUP.cbI.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                h.this.axC();
            }
        });
        this.cUP.cfK.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (h.this.cUP.cfK.isSelected()) {
                    h.this.cUP.cfK.setSelected(false);
                    h.this.cUP.cfO.setVisibility(8);
                    h.this.cUP.cfN.setVisibility(8);
                    h.this.cUP.cfI.setVisibility(0);
                    h.this.cUP.cfJ.setVisibility(0);
                    h.this.cUP.cbI.setVisibility(0);
                    return;
                }
                h.this.cUP.cfK.setSelected(true);
                h.this.cUP.cfI.setVisibility(8);
                h.this.cUP.cfJ.setVisibility(8);
                h.this.cUP.cfN.setVisibility(0);
                h.this.cUP.cfO.setVisibility(0);
                h.this.cUP.cbI.setVisibility(8);
            }
        });
        this.cUP.cfL.setLayoutTransition(ak.anP());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setAutoMeasureEnabled(true);
        this.cUP.cfJ.setDuplicateParentStateEnabled(false);
        this.cUP.cfJ.setLayoutManager(linearLayoutManager);
        Bundle arguments = getArguments();
        this.cUO = (InstrumentType) arguments.getSerializable("arg.instrumentType");
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("arg.commission_items");
        final c cVar = new c();
        if (!g.isEmpty(parcelableArrayList)) {
            this.cUP.cfJ.setAdapter(new b(new d() {
                public a r(ViewGroup viewGroup) {
                    return new a(LayoutInflater.from(h.this.getContext()).inflate(R.layout.commission_list_item, viewGroup, false), h.this.cUO, cVar);
                }
            }, parcelableArrayList, null));
        }
        this.cUP.cfM.setText(com.iqoption.util.c.a.af(this.cUO));
        return this.cUP.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void axC() {
        this.cUN = true;
        onClose();
    }

    public boolean onClose() {
        if (this.cUN) {
            requireFragmentManager().popBackStack();
            com.iqoption.popup.c A = com.iqoption.popup.c.A(requireActivity());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CommissionsValueChangedFragment");
            stringBuilder.append(this.cUO);
            A.jr(stringBuilder.toString());
        } else {
            axD();
        }
        return true;
    }

    private void axD() {
        Animator animator = this.cUQ;
        if (animator != null) {
            animator.cancel();
        }
        this.cUQ = com.iqoption.core.util.b.o(this.cUP.bYN, this.cUR);
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void att() {
        this.cUP.bYN.setAlpha(0.0f);
        float f;
        if (com.iqoption.util.af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            float f2 = (float) dimensionPixelSize2;
            this.cUP.bYN.setTranslationX(f2);
            f = (float) (-dimensionPixelSize2);
            this.cUP.bYN.setTranslationY(f);
            this.cUP.cfJ.setTranslationX(f2);
            this.cUP.cfJ.setTranslationY(f);
            this.cUP.cfJ.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cUP.bYN, this.cUP.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cUP.bYN.getWidth(), (double) this.cUP.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cUP.bYN;
            r6 = new PropertyValuesHolder[2];
            String str = "translationX";
            r6[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            String str2 = "translationY";
            r6[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r6);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            RecyclerView recyclerView = this.cUP.cfJ;
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
            this.cUP.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        f = (float) (-dimensionPixelOffset);
        this.cUP.bYN.setTranslationX(f);
        this.cUP.bYN.setTranslationY(f);
        this.cUP.bYN.setPivotX((float) (this.cUP.bYN.getWidth() - dimensionPixelOffset));
        this.cUP.bYN.setPivotY(1.0f);
        this.cUP.bYN.setScaleX(0.3f);
        this.cUP.bYN.setScaleY(0.3f);
        this.cUP.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cUP.bYN.setPivotX((float) this.cUP.bYN.getWidth());
        this.cUP.bYN.setPivotY(1.0f);
        this.cUP.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
