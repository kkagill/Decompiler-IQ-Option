package com.iqoption.view.toppanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.google.common.collect.aj;
import com.iqoption.app.managers.c;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.app.managers.tab.TabHelper.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.aad;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.tradingtoday.e;
import com.iqoption.gl.NativeHandler.q;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse;
import com.iqoption.mobbtech.connect.response.options.OptionEvents;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.h;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.j;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.m;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

public class TopPanelFragment extends d implements com.iqoption.fragment.dialog.c.a {
    private AnimatorSet ddI;
    private Position eiC;
    private com.iqoption.mobbtech.connect.response.options.b eiK;
    private a eiV = new a(this, null);
    private aad eiW;
    private Animation eiX;
    private Animation eiY;
    private final SparseArray<String> eiZ = new SparseArray();
    private e eja;
    private View ejb;
    private SparseArray<Integer> ejc = new SparseArray();
    private Runnable ejd = new Runnable() {
        public void run() {
            if (TopPanelFragment.this.isAdded()) {
                ah PM = TopPanelFragment.this.PM();
                if (PM != null) {
                    PM.cXA.f(-TopPanelFragment.this.hP(R.dimen.dp34), 200);
                    PM.cXT.f(TopPanelFragment.this.hP(R.dimen.dp50), 200);
                    e eVar = (e) PM.requireFragmentManager().findFragmentByTag(e.dqJ.Bx());
                    if (eVar != null) {
                        eVar.gj(0);
                    }
                }
                TopPanelFragment.this.eiW.aIb.startAnimation(TopPanelFragment.this.eiX);
            }
        }
    };
    private Runnable eje = new Runnable() {
        public void run() {
            if (TopPanelFragment.this.isAdded()) {
                ah PM = TopPanelFragment.this.PM();
                if (PM != null) {
                    PM.cXA.f(TopPanelFragment.this.hP(R.dimen.dp38), 200);
                    PM.cXT.f(TopPanelFragment.this.hP(R.dimen.dp80), 200);
                    e eVar = (e) PM.requireFragmentManager().findFragmentByTag(e.dqJ.Bx());
                    if (eVar != null) {
                        eVar.gj(TopPanelFragment.this.hP(R.dimen.dp30));
                    }
                }
                TopPanelFragment.this.ejb.setVisibility(0);
                TopPanelFragment.this.eiW.aIb.startAnimation(TopPanelFragment.this.eiY);
            }
        }
    };
    private b ejf = new b(this, null);
    public boolean isVisible;

    private static class a extends com.iqoption.system.a.d {
        private final WeakReference<TopPanelFragment> bJf;

        /* synthetic */ a(TopPanelFragment topPanelFragment, AnonymousClass1 anonymousClass1) {
            this(topPanelFragment);
        }

        private a(TopPanelFragment topPanelFragment) {
            this.bJf = new WeakReference(topPanelFragment);
        }

        @com.google.common.b.e
        public void onTabChangedEvent(k kVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$txGawXg7OyxrFmq-asSXdNIzfug(this));
            }
        }

        private /* synthetic */ void aZh() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    topPanelFragment.a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
                }
            }
        }

        @com.google.common.b.e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if ((this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded()) && aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$XpwVt-PFrEoODRGeZWX2g8fRtZA(this, aVar));
            }
        }

        private /* synthetic */ void b(com.iqoption.app.managers.a.e.a aVar) {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                topPanelFragment.a(c.GS().a(aVar.optionKey), aVar.anH.getDigitalExpirationPeriod());
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroups(m mVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$mI9w5UkvctJwWfV3Fq4NUMVjI7k(this));
            }
        }

        private /* synthetic */ void aZg() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                topPanelFragment.j(null);
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupRemoved(OptionEvents.k kVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded() || ((TopPanelFragment) this.bJf.get()).eiK != null) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$LM8QE1atNDKeZWYmamsltZKUiXM(this));
            }
        }

        private /* synthetic */ void aZf() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    topPanelFragment.a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
                }
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionRemoved(j jVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded() || ((TopPanelFragment) this.bJf.get()).eiK != null) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$rtP_tCpqurn-qlcRpU0i2hpjC5k(this));
            }
        }

        private /* synthetic */ void aZe() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    topPanelFragment.a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
                }
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionAdded(OptionEvents.i iVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$FEf_O77Ay-9l9X50FHHw9rzR3Y8(this));
            }
        }

        private /* synthetic */ void aZd() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    topPanelFragment.a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
                }
            }
        }

        @com.google.common.b.e
        public void onNewOpenOptionGroup(h hVar) {
            if (this.bJf.get() != null || ((TopPanelFragment) this.bJf.get()).isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$bggiyvNyxkGD5Wll9KZBZEqcg7k(this));
            }
        }

        private /* synthetic */ void aZc() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    topPanelFragment.a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
                }
            }
        }

        @com.google.common.b.e
        public void onSellResponse(com.iqoption.mobbtech.connect.request.api.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$8mURFLov8vLzLvo8RnzOiCOuHHo(this, aVar));
        }

        @com.google.common.b.e
        public void onBuybackResponse(ArrayBuybackResponse arrayBuybackResponse) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$O0RJb60Ks8bwaTHvDjO9ua2LtxQ(this));
        }

        private /* synthetic */ void aZb() {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded() && topPanelFragment.eja != null) {
                topPanelFragment.eja.fu(false);
            }
        }

        @com.google.common.b.e
        public void onSelectTradingPosition(q qVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$TopPanelFragment$a$ixzS1qbB36t3hnrxoZYZH2baxOA(this, qVar));
        }
    }

    private static class b implements com.iqoption.view.a.b.a {
        private final WeakReference<TopPanelFragment> bJf;

        /* synthetic */ b(TopPanelFragment topPanelFragment, AnonymousClass1 anonymousClass1) {
            this(topPanelFragment);
        }

        private b(TopPanelFragment topPanelFragment) {
            this.bJf = new WeakReference(topPanelFragment);
        }

        public void onTick(long j) {
            TopPanelFragment topPanelFragment = (TopPanelFragment) this.bJf.get();
            if (topPanelFragment != null && topPanelFragment.isAdded()) {
                topPanelFragment.bE(j);
            }
        }
    }

    private boolean c(@NonNull com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        return true;
    }

    public void ayM() {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.eiW = (aad) DataBindingUtil.inflate(layoutInflater, R.layout.top_panel, viewGroup, false);
        this.ejb = this.eiW.getRoot();
        return this.ejb;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ejb.setVisibility(8);
        this.eiX = AnimationUtils.loadAnimation(getContext(), R.anim.appear_from_top_to_bottom_alpha_hide);
        this.eiX.setDuration(200);
        this.eiX.setAnimationListener(com.iqoption.view.a.a.a.a.c(new -$$Lambda$TopPanelFragment$pRYKbcsnoFZ4V_YQkHHwuyLEz3Q(this)));
        this.eiY = AnimationUtils.loadAnimation(getContext(), R.anim.appear_from_top_to_bottom_alpha_show);
        this.eiY.setDuration(200);
        this.eiV.register();
        auo();
    }

    private /* synthetic */ void aZa() {
        this.ejb.clearAnimation();
        this.ejb.setVisibility(8);
    }

    public void onDestroyView() {
        super.onDestroyView();
        e eVar = this.eja;
        if (eVar != null) {
            eVar.destroy();
        }
        this.eiV.unregister();
        aup();
    }

    public void bE(long j) {
        if (this.ejb.getVisibility() == 0) {
            e eVar = this.eja;
            if (eVar != null) {
                eVar.cy(j);
            }
        }
    }

    private int hP(@DimenRes int i) {
        Integer num = (Integer) this.ejc.get(i);
        if (num == null) {
            num = Integer.valueOf(fA(i));
            this.ejc.put(i, num);
        }
        return num.intValue();
    }

    public int aYZ() {
        return this.isVisible ? hP(R.dimen.dp30) : 0;
    }

    private void hide() {
        if (isAdded() && !isHidden() && this.isVisible) {
            this.isVisible = false;
            this.eiW.aIb.post(this.ejd);
        }
    }

    private void show() {
        if (isAdded() && !isHidden() && !this.isVisible) {
            this.isVisible = true;
            this.eiW.aIb.post(this.eje);
        }
    }

    public void oF() {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            a(c.GS().a(Jh.getOptionKey()), Jh.Jy());
        } else {
            a(null, 0);
        }
    }

    private void j(com.iqoption.mobbtech.connect.response.options.b bVar) {
        a(bVar, TabHelper.IM().Jc());
    }

    private void a(com.iqoption.mobbtech.connect.response.options.b bVar, long j) {
        bVar = b(bVar, j);
        Position position = null;
        if (bVar == null) {
            hide();
        } else {
            int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[bVar.instrumentType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                position = k(bVar);
            }
            b(bVar, position);
            show();
        }
        this.eiK = bVar;
        this.eiC = position;
    }

    private com.iqoption.mobbtech.connect.response.options.b b(com.iqoption.mobbtech.connect.response.options.b bVar, long j) {
        return (bVar == null || InstrumentType.DIGITAL_INSTRUMENT != bVar.instrumentType) ? bVar : bVar.bW(j);
    }

    private void b(@NonNull com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        e eVar = this.eja;
        if (c(bVar, position)) {
            this.eja = d(bVar, position);
            View e = this.eja.e(LayoutInflater.from(getContext()), this.eiW.aIb);
            this.eiW.aIb.addView(e);
            if (eVar != null) {
                View childAt = this.eiW.aIb.getChildAt(this.eiW.aIb.getChildCount() - 2);
                boolean z = (this.eiC == null && position == null) ? false : true;
                a(childAt, e, z).start();
                eVar.destroy();
                return;
            }
            return;
        }
        this.eja.a(bVar, position);
    }

    private e d(@NonNull com.iqoption.mobbtech.connect.response.options.b bVar, Position position) {
        switch (bVar.instrumentType) {
            case CFD_INSTRUMENT:
            case FOREX_INSTRUMENT:
            case CRYPTO_INSTRUMENT:
                if (position != null) {
                    return new a(this, bVar, position);
                }
                return new b(this, bVar);
            case FX_INSTRUMENT:
            case DIGITAL_INSTRUMENT:
                if (position == null) {
                    return new f(this, bVar);
                }
                return new f(this, bVar.n(position));
            case TURBO_INSTRUMENT:
            case BINARY_INSTRUMENT:
            case MULTI_INSTRUMENT:
                return new f(this, bVar);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Active with type: ");
                stringBuilder.append(bVar.instrumentType);
                stringBuilder.append(" is not supported");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private AnimatorSet a(View view, View view2, boolean z) {
        Animator ofPropertyValuesHolder;
        Animator ofPropertyValuesHolder2;
        AnimatorSet animatorSet = this.ddI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp22);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[4];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.95f, 1.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.95f, 1.0f});
            propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) (dimensionPixelSize * 2), 0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
            r4 = new PropertyValuesHolder[4];
            r4[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            r4[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.95f});
            r4[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.95f});
            r4[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) (dimensionPixelSize / 2)});
            ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, r4);
        } else {
            ofPropertyValuesHolder2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        }
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhT);
        ofPropertyValuesHolder2.setInterpolator(com.iqoption.view.a.a.c.bhU);
        this.ddI = new AnimatorSet();
        this.ddI.playTogether(new Animator[]{ofPropertyValuesHolder2, ofPropertyValuesHolder});
        com.iqoption.core.util.b.a(this.ddI, 500);
        this.ddI.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                TopPanelFragment.this.eiW.aIb.removeViewAt(0);
                TopPanelFragment.this.ddI = null;
            }
        });
        return this.ddI;
    }

    public void o(com.iqoption.mobbtech.connect.response.options.c cVar) {
        e eVar = this.eja;
        if (eVar != null && (eVar instanceof d)) {
            ((d) eVar).x(cVar);
        }
    }

    public void b(com.iqoption.mobbtech.connect.response.options.b bVar) {
        e eVar = this.eja;
        if (eVar != null && (eVar instanceof c)) {
            ((c) eVar).h(bVar);
        }
    }

    private Position k(com.iqoption.mobbtech.connect.response.options.b bVar) {
        String str = (String) this.eiZ.get(TabHelper.IM().Ji());
        if (!(TextUtils.isEmpty(str) || bVar == null)) {
            aj sK = bVar.aPX().iterator();
            while (sK.hasNext()) {
                Position position = (Position) ((com.iqoption.mobbtech.connect.response.options.c) sK.next());
                if (position.getPositionSplitId().equals(str)) {
                    return position;
                }
            }
        }
        return null;
    }

    private void auo() {
        com.iqoption.view.a.b.aYv().a(this.ejf, Integer.valueOf(5));
    }

    private void aup() {
        com.iqoption.view.a.b.aYv().b(this.ejf);
    }
}
