package com.iqoption.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.c;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.app.managers.tab.TabHelper.k;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.e.sv;
import com.iqoption.mobbtech.connect.response.options.OptionEvents;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.h;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.j;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.m;
import com.iqoption.system.a.e;
import com.iqoption.util.ak;
import com.iqoption.view.b.d;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.util.List;

public class MultiAssetSpinner extends d {
    public a efn = new a();
    private sv efo;
    private int efp = TabHelper.awe;
    private SparseArray<WeakReference<a>> efq = new SparseArray();
    private WeakReference<a> efr = new WeakReference(null);

    public interface b {
        void onClick(int i);
    }

    public static class a extends e<MultiAssetSpinner> {
        private a(MultiAssetSpinner multiAssetSpinner) {
            super(multiAssetSpinner);
        }

        public void hH(int i) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$jHe20Gyx7g6hCTtKreTtc-x2L0A(this, i));
        }

        private /* synthetic */ void hK(int i) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                multiAssetSpinner.ef(i);
            }
        }

        public void hI(int i) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$NcH7jUDuAdlYJ3CnSvP9rukC2jg(this, i));
        }

        private /* synthetic */ void hJ(int i) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                multiAssetSpinner.ed(i);
            }
        }

        public void c(i iVar, boolean z) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$8zqNH5hjFGlx3PiajeFKJb0UyXM(this, iVar, z));
        }

        private /* synthetic */ void d(i iVar, boolean z) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                multiAssetSpinner.b(iVar, z);
            }
        }

        public void bz(List<i> list) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$dfUYH1md1j1nJ87h5YXqN7ezkaA(this, list));
        }

        private /* synthetic */ void bA(List list) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                multiAssetSpinner.E(list);
            }
        }

        public void aYe() {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$VPxjZhe_eqnfobt9iM27vb2iaUo(this));
        }

        private /* synthetic */ void aYh() {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                multiAssetSpinner.aYd();
            }
        }

        @com.google.common.b.e
        public void onShowedEvent(com.iqoption.activity.TradeRoomActivity.b bVar) {
            if ((this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) && !bVar.ajm) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$GlQIOD3Z9787VOXKQfE7H_eEB68(this, bVar));
            }
        }

        @com.google.common.b.e
        public void onTabChangedEvent(k kVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$p8EhbyttPmt9agd4WSz6uBOZq3c(this));
            }
        }

        private /* synthetic */ void aYg() {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            i Jh = TabHelper.IM().Jh();
            if (Jh != null && multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                WeakReference weakReference = (WeakReference) multiAssetSpinner.efq.get(Jh.getId());
                a aVar = weakReference != null ? (a) weakReference.get() : null;
                if (aVar != null && aVar.aYx()) {
                    aVar.g(c.GS().a(Jh.getOptionKey()));
                }
            }
        }

        @com.google.common.b.e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$IgYNPTENu8FEO1AV6hmYmupqSVI(this, aVar));
            }
        }

        private /* synthetic */ void e(com.iqoption.app.managers.a.e.a aVar) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx() && multiAssetSpinner.efq.get(aVar.avF) != null) {
                a aVar2 = (a) ((WeakReference) multiAssetSpinner.efq.get(aVar.avF)).get();
                if (aVar2 != null && aVar2.aYx()) {
                    aVar2.g(c.GS().a(aVar.optionKey));
                }
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroups(m mVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$YyzkMH2DBx0zhb7n_m7HlP2qiVk(this));
            }
        }

        private /* synthetic */ void aYf() {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                for (int i = 0; i < multiAssetSpinner.efq.size(); i++) {
                    a aVar = (a) ((WeakReference) multiAssetSpinner.efq.get(multiAssetSpinner.efq.keyAt(i))).get();
                    if (aVar != null && aVar.aYx()) {
                        aVar.g(null);
                    }
                }
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupRemoved(OptionEvents.k kVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$1FWadwnI7hDxYVBxbeXXSly2xcA(this, kVar));
            }
        }

        private /* synthetic */ void c(OptionEvents.k kVar) {
            MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) this.dUo.get();
            if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                for (int i = 0; i < multiAssetSpinner.efq.size(); i++) {
                    a aVar = (a) ((WeakReference) multiAssetSpinner.efq.get(multiAssetSpinner.efq.keyAt(i))).get();
                    if (aVar != null && aVar.aYx()) {
                        i eb = TabHelper.IM().eb(aVar.getId());
                        if (eb != null && eb.getInstrumentType().equals(kVar.dJv.instrumentType) && eb.Jv() == kVar.dJv.activeId && eb.getExpiration() == kVar.dJv.dJh * 1000) {
                            aVar.g(null);
                        }
                    }
                }
            }
        }

        @com.google.common.b.e
        public void onNewOpenOptionGroup(final h hVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        MultiAssetSpinner multiAssetSpinner = (MultiAssetSpinner) a.this.dUo.get();
                        if (multiAssetSpinner != null && multiAssetSpinner.aYx()) {
                            for (int i = 0; i < multiAssetSpinner.efq.size(); i++) {
                                a aVar = (a) ((WeakReference) multiAssetSpinner.efq.get(multiAssetSpinner.efq.keyAt(i))).get();
                                if (aVar != null && aVar.aYx()) {
                                    i eb = TabHelper.IM().eb(aVar.getId());
                                    if (eb != null && eb.getInstrumentType().equals(hVar.dJr.instrumentType) && eb.Jv() == hVar.dJr.activeId && eb.getExpiration() == hVar.dJr.dJh * 1000) {
                                        aVar.g(hVar.dJr);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionRemoved(j jVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$IPwuiRqcX84LF4tT-ieyPix7DzY(this, jVar));
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionAdded(OptionEvents.i iVar) {
            if (this.dUo.get() != null || ((MultiAssetSpinner) this.dUo.get()).aYx()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$MultiAssetSpinner$a$70n4QMsiGNVdwjjgJzRzXnQVUtI(this, iVar));
            }
        }
    }

    public MultiAssetSpinner(Context context) {
        super(context);
        aXH();
    }

    public MultiAssetSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aXH();
    }

    public MultiAssetSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aXH();
    }

    @TargetApi(21)
    public MultiAssetSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aXH();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.efn.register();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.efn.unregister();
    }

    private void aXH() {
        this.efo = (sv) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.multi_asset_view, this, true);
        this.efo.cos.setOnTouchListener(new com.iqoption.view.d.d());
        this.efo.cos.setOnClickListener(new -$$Lambda$MultiAssetSpinner$tUnXJBoNxrUmjxvk3kuorDytOVs(this));
        this.efo.aGo.setLayoutTransition(ak.anP());
    }

    private /* synthetic */ void cb(View view) {
        getTradeRoomActivity().a(com.iqoption.core.ext.a.i((View) this, (int) R.dimen.dp50), null, this.efq.size() < TabHelper.awe);
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_add-tab").build());
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hF(i);
    }

    private void E(List<i> list) {
        this.efq.clear();
        this.efo.aGo.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            b((i) list.get(i), false);
        }
    }

    private void b(i iVar, boolean z) {
        a(iVar, true, z);
    }

    private void a(i iVar, boolean z, boolean z2) {
        a aVar = new a(getContext());
        aVar.setId(iVar.getId());
        aVar.setClickView(new -$$Lambda$MultiAssetSpinner$zdnVkrfXfOAc3Zg465joo9TAigg(this, aVar));
        aVar.setClickCloseView(new -$$Lambda$MultiAssetSpinner$lDhbF_TfbleGH4_6NKN2mnCeCR8(this));
        aVar.aXI();
        this.efq.put(iVar.getId(), new WeakReference(aVar));
        this.efo.aGo.addView(aVar, z2 ? -1 : 0);
        if (z) {
            ef(iVar.getId());
        } else {
            aYc();
        }
    }

    private /* synthetic */ void hG(int i) {
        i eb = TabHelper.IM().eb(i);
        if (eb != null) {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_close-tab").setParameters(u.anp().o("instrument_type", eb.getInstrumentType()).anr()).build());
        }
        TabHelper.IM().ed(i);
        hE(i);
    }

    private void hE(int i) {
        for (int i2 = 0; i2 < this.efo.aGo.getChildCount(); i2++) {
            if (this.efo.aGo.getChildAt(i2).getId() == i) {
                if (i2 == 0) {
                    TabHelper.IM().ef(this.efo.aGo.getChildAt(i2 + 1).getId());
                } else {
                    TabHelper.IM().ef(this.efo.aGo.getChildAt(i2 - 1).getId());
                }
            }
        }
    }

    private void ef(int i) {
        this.efr = (WeakReference) this.efq.get(i);
        aYc();
    }

    private int getCurrentViewId() {
        WeakReference weakReference = this.efr;
        return (weakReference == null || weakReference.get() == null) ? TabHelper.awa : ((a) this.efr.get()).getId();
    }

    private boolean isLast() {
        return this.efq.size() == 1;
    }

    private boolean aYb() {
        return this.efq.size() > this.efp;
    }

    private void aYc() {
        WeakReference weakReference = this.efr;
        a aVar = weakReference != null ? (a) weakReference.get() : null;
        for (int i = 0; i < this.efq.size(); i++) {
            SparseArray sparseArray = this.efq;
            a aVar2 = (a) ((WeakReference) sparseArray.get(sparseArray.keyAt(i))).get();
            if (aVar2 != null && aVar2.aYx()) {
                if (aVar == null || aVar.getId() != aVar2.getId()) {
                    aVar2.fo(aYb());
                } else {
                    aVar2.fp(isLast());
                }
            }
        }
    }

    private void ed(int i) {
        WeakReference weakReference = (WeakReference) this.efq.get(i);
        if (weakReference != null && weakReference.get() != null) {
            this.efo.aGo.removeView((View) weakReference.get());
            this.efq.remove(i);
        }
    }

    private void aYd() {
        WeakReference weakReference = this.efr;
        if (weakReference != null) {
            a aVar = (a) weakReference.get();
            if (aVar != null && aVar.getId() == TabHelper.IM().Ji()) {
                aVar.aXI();
            }
        }
    }

    private void hF(int i) {
        i -= getResources().getDimensionPixelSize(R.dimen.dp100);
        int dimensionPixelSize = i / getResources().getDimensionPixelSize(R.dimen.dp100);
        if (dimensionPixelSize > 0) {
            this.efp = dimensionPixelSize;
            TabHelper.awe = i / getResources().getDimensionPixelSize(R.dimen.dp70);
        }
    }

    public void fn(boolean z) {
        if (this.efq != null) {
            for (int i = 0; i < this.efq.size(); i++) {
                a aVar = (a) ((WeakReference) this.efq.valueAt(i)).get();
                if (aVar != null && aVar.aYx()) {
                    aVar.fn(z);
                }
            }
        }
    }
}
