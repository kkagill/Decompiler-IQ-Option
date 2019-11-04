package com.iqoption.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.bz;
import com.iqoption.util.ak;
import com.iqoption.view.b.c;
import com.iqoption.view.d.d;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;

/* compiled from: AssetSpinner */
public class a extends c implements com.iqoption.view.a.b.a {
    public bz edT;
    private com.iqoption.view.MultiAssetSpinner.b edU;
    private com.iqoption.view.MultiAssetSpinner.b edV;
    private a edW;
    private b edX;
    private Boolean edY;
    private volatile boolean edZ;
    private com.iqoption.mobbtech.connect.response.options.b eea;
    private boolean eeb;

    /* compiled from: AssetSpinner */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<a> bMV;
        private final long eed;
        private final long eee;

        /* synthetic */ a(a aVar, long j, long j2, AnonymousClass1 anonymousClass1) {
            this(aVar, j, j2);
        }

        private a(a aVar, long j, long j2) {
            this.bMV = new WeakReference(aVar);
            this.eed = j2;
            this.eee = j;
        }

        public long getMaxValue() {
            return this.eed;
        }

        public void onTick(long j) {
            a aVar = (a) this.bMV.get();
            if (aVar != null && aVar.aYx()) {
                aVar.edT.bXq.h(this.eee - j, this.eed);
                aVar.g(aVar.eea);
            }
        }
    }

    /* compiled from: AssetSpinner */
    private static class b implements com.iqoption.view.a.b.a {
        private final WeakReference<a> bMV;
        private final long eef;
        private final long eeg;

        /* synthetic */ b(a aVar, long j, long j2, AnonymousClass1 anonymousClass1) {
            this(aVar, j, j2);
        }

        private b(a aVar, long j, long j2) {
            this.bMV = new WeakReference(aVar);
            this.eef = j2 - j;
            this.eeg = j2;
            aVar.edT.bXn.setMax((int) (j2 - this.eef));
        }

        public void onTick(long j) {
            a aVar = (a) this.bMV.get();
            if (aVar != null && aVar.aYx() && this.eeg >= j) {
                aVar.edT.bXn.setProgress((int) (((long) aVar.edT.bXn.getMax()) - (j - this.eef)));
                aVar.g(aVar.eea);
            }
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.edZ = false;
        aXH();
    }

    private void aXH() {
        this.edT = (bz) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.asset_spinner_handle, this, true);
        setOnTouchListener(new d());
        setOnClickListener(new -$$Lambda$a$NLnBxfiqiP1eNkAHXXYPR0VXld4(this));
        this.edT.bXl.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (a.this.edV != null) {
                    a.this.edV.onClick(a.this.getId());
                }
            }
        });
        this.edT.bfS.setLayoutTransition(ak.anP());
        this.edT.bXk.setLayoutTransition(ak.anP());
        this.edT.bXo.setLayoutTransition(ak.anP());
        this.edY = Boolean.valueOf(d.aXZ());
    }

    private /* synthetic */ void cb(View view) {
        com.iqoption.view.MultiAssetSpinner.b bVar = this.edU;
        if (bVar != null) {
            bVar.onClick(getId());
        }
    }

    public void aXI() {
        this.edZ = true;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.asset_change_step1);
        loadAnimation.setAnimationListener(com.iqoption.view.a.a.a.a.c(new -$$Lambda$a$VQ8D1DNQFpNvW9pV9Y1OLAHpzzs(this)));
        this.edT.bXo.startAnimation(loadAnimation);
    }

    private /* synthetic */ void aXN() {
        if (aYx()) {
            i eb = TabHelper.IM().eb(getId());
            if (eb != null) {
                clearAnimation();
                com.iqoption.core.microservices.tradingengine.response.active.a Jt = eb.Jt();
                if (Jt != null) {
                    String image = Jt.getImage();
                    if (!TextUtils.isEmpty(image)) {
                        Picasso.with(getContext()).load(image).into(this.edT.bXh);
                    }
                    this.edT.bXi.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(Jt));
                }
                this.edZ = false;
                g(this.eea);
                this.edT.bXo.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.asset_change_step2));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(5));
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        if (this.edW != null) {
            com.iqoption.view.a.b.aYv().b(this.edW);
            this.edW = null;
        }
    }

    private boolean a(long j, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.mobbtech.connect.response.options.b bVar, Expiration expiration) {
        if (j <= expiration.expValue.longValue() - e.Ig().c(aVar, expiration) || j >= expiration.expValue.longValue()) {
            return false;
        }
        return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(expiration.expValue.longValue() / 1000), Integer.valueOf(bVar.activeId), bVar.instrumentType)) ^ 1;
    }

    /* JADX WARNING: Missing block: B:32:0x00b7, code skipped:
            if (r4 == r0.getMaxValue()) goto L_0x0101;
     */
    public void g(com.iqoption.mobbtech.connect.response.options.b r16) {
        /*
        r15 = this;
        r7 = r15;
        r8 = r16;
        r7.eea = r8;
        r0 = r7.edZ;
        if (r0 == 0) goto L_0x000c;
    L_0x0009:
        r7.eea = r8;
        return;
    L_0x000c:
        r0 = com.iqoption.app.managers.tab.TabHelper.IM();
        r1 = r15.getId();
        r9 = r0.eb(r1);
        if (r9 != 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r10 = r9.Jt();
        r0 = 1;
        r1 = 0;
        if (r10 == 0) goto L_0x002b;
    L_0x0023:
        r2 = r10.isExpired();
        if (r2 == 0) goto L_0x002b;
    L_0x0029:
        r2 = 1;
        goto L_0x002c;
    L_0x002b:
        r2 = 0;
    L_0x002c:
        r11 = r9.Jw();
        if (r8 == 0) goto L_0x016b;
    L_0x0032:
        if (r2 != 0) goto L_0x0036;
    L_0x0034:
        goto L_0x016b;
    L_0x0036:
        r2 = r8.instrumentType;
        r3 = 3;
        r4 = new com.iqoption.core.data.model.InstrumentType[r3];
        r5 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;
        r4[r1] = r5;
        r5 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;
        r4[r0] = r5;
        r5 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;
        r6 = 2;
        r4[r6] = r5;
        r2 = com.iqoption.core.ext.c.b(r2, r4);
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r2 == 0) goto L_0x0070;
    L_0x0050:
        r0 = com.iqoption.app.managers.l.HZ();
        r1 = r0.Ib();
        r0 = r15;
        r3 = r10;
        r4 = r16;
        r5 = r11;
        r0 = r0.a(r1, r3, r4, r5);
        if (r0 != 0) goto L_0x0067;
    L_0x0063:
        r15.am(r10);
        return;
    L_0x0067:
        r0 = com.iqoption.app.managers.a.e.Ig();
        r0 = r0.c(r10, r11);
        goto L_0x0096;
    L_0x0070:
        r2 = r8.instrumentType;
        r3 = new com.iqoption.core.data.model.InstrumentType[r3];
        r4 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;
        r3[r1] = r4;
        r1 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;
        r3[r0] = r1;
        r0 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;
        r3[r6] = r0;
        r0 = com.iqoption.core.ext.c.b(r2, r3);
        if (r0 == 0) goto L_0x008d;
    L_0x0086:
        r0 = r11.expInterval;
        r0 = r0.longValue();
        goto L_0x0096;
    L_0x008d:
        r0 = r8.dJh;
        r2 = r16.getCreated();
        r0 = r0 - r2;
        r0 = r0 * r12;
    L_0x0096:
        r4 = r0;
        r0 = r7.edT;
        r0 = r0.bXp;
        r0 = r0.getNextView();
        r0 = r0.getId();
        r1 = r7.edT;
        r1 = r1.bXh;
        r1 = r1.getId();
        if (r0 != r1) goto L_0x00b9;
    L_0x00ad:
        r0 = r7.edW;
        if (r0 == 0) goto L_0x00b9;
    L_0x00b1:
        r0 = r0.getMaxValue();
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x0101;
    L_0x00b9:
        r0 = r7.edT;
        r0 = r0.bXq;
        r0.reset();
        r0 = r7.edW;
        if (r0 == 0) goto L_0x00cd;
    L_0x00c4:
        r0 = com.iqoption.view.a.b.aYv();
        r1 = r7.edW;
        r0.b(r1);
    L_0x00cd:
        r14 = new com.iqoption.view.a$a;
        r0 = r8.dJh;
        r2 = r0 * r12;
        r6 = 0;
        r0 = r14;
        r1 = r15;
        r0.<init>(r1, r2, r4, r6);
        r7.edW = r14;
        r0 = com.iqoption.view.a.b.aYv();
        r1 = r7.edW;
        r0.a(r1);
        r0 = r7.edT;
        r0 = r0.bXp;
        r0 = r0.getNextView();
        r0 = r0.getId();
        r1 = r7.edT;
        r1 = r1.bXh;
        r1 = r1.getId();
        if (r0 == r1) goto L_0x0101;
    L_0x00fa:
        r0 = r7.edT;
        r0 = r0.bXp;
        r0.showNext();
    L_0x0101:
        r0 = r8.instrumentType;
        r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;
        if (r0 != r1) goto L_0x011d;
    L_0x0107:
        r0 = r16.getSellPnl();
        r2 = r16.getInvestSum();
        r4 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r0 = r0 * r4;
        r0 = r0 / r2;
        r2 = java.lang.Double.valueOf(r0);
        r0 = com.iqoption.core.util.af.r(r0);
        goto L_0x0125;
    L_0x011d:
        r2 = r16.aQb();
        r0 = com.iqoption.util.j.r(r2);
    L_0x0125:
        r1 = r7.edT;
        r1 = r1.bXg;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x014d;
    L_0x012f:
        r1 = r15.aXM();
        if (r1 != 0) goto L_0x0136;
    L_0x0135:
        goto L_0x014d;
    L_0x0136:
        r1 = r7.edT;
        r1 = r1.bXj;
        r1.setText(r0);
        r0 = r7.edT;
        r0 = r0.bXj;
        r1 = r15.getContext();
        r1 = com.iqoption.util.j.a(r1, r2);
        r0.setTextColor(r1);
        goto L_0x016e;
    L_0x014d:
        r0 = r7.edT;
        r0 = r0.bXj;
        r1 = com.iqoption.util.c.a.ai(r10);
        r0.setText(r1);
        r0 = r7.edT;
        r0 = r0.bXj;
        r1 = r15.getContext();
        r2 = 2131100012; // 0x7f06016c float:1.7812393E38 double:1.052903304E-314;
        r1 = androidx.core.content.ContextCompat.getColor(r1, r2);
        r0.setTextColor(r1);
        goto L_0x016e;
    L_0x016b:
        r15.am(r10);
    L_0x016e:
        r0 = r9.getInstrumentType();
        r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;
        if (r0 != r1) goto L_0x019e;
    L_0x0176:
        r15.aXK();
        r8 = new com.iqoption.view.a$b;
        r0 = r11.expInterval;
        r2 = r0.longValue();
        r0 = r11.expValue;
        r4 = r0.longValue();
        r6 = 0;
        r0 = r8;
        r1 = r15;
        r0.<init>(r1, r2, r4, r6);
        r7.edX = r8;
        r0 = com.iqoption.view.a.b.aYv();
        r1 = r7.edX;
        r2 = 5;
        r2 = java.lang.Integer.valueOf(r2);
        r0.a(r1, r2);
        goto L_0x01a1;
    L_0x019e:
        r15.aXK();
    L_0x01a1:
        r15.aXJ();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.view.a.g(com.iqoption.mobbtech.connect.response.options.b):void");
    }

    private void aXJ() {
        if (!this.edY.booleanValue() || this.edX == null) {
            this.edT.bXn.setVisibility(8);
        } else {
            this.edT.bXn.setVisibility(0);
        }
    }

    private void aXK() {
        if (this.edX != null) {
            com.iqoption.view.a.b.aYv().b(this.edX);
            this.edX = null;
        }
    }

    public void fn(boolean z) {
        this.edY = Boolean.valueOf(z);
        aXJ();
    }

    private void am(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.edT.bXj.setText(com.iqoption.util.c.a.ai(aVar));
        this.edT.bXj.setTextColor(ContextCompat.getColor(getContext(), R.color.grey_blur_50));
        if (this.edT.bXp.getNextView().getId() == this.edT.bXh.getId()) {
            this.edT.bXp.showNext();
            com.iqoption.view.a.b.aYv().b(this.edW);
            this.edW = null;
            this.edT.bXq.reset();
        }
    }

    public void setClickView(com.iqoption.view.MultiAssetSpinner.b bVar) {
        this.edU = bVar;
    }

    public void setClickCloseView(com.iqoption.view.MultiAssetSpinner.b bVar) {
        this.edV = bVar;
    }

    public void fo(boolean z) {
        setTag("unselect");
        this.eeb = z;
        int dimensionPixelSize;
        LayoutParams layoutParams;
        if (z) {
            this.edT.bXk.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.dp70), -1));
            this.edT.bXo.setOrientation(1);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp18);
            LayoutParams layoutParams2 = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.gravity = 1;
            this.edT.bXp.setLayoutParams(layoutParams2);
            layoutParams = new LayoutParams(-2, -2, 0.0f);
            layoutParams.gravity = 17;
            this.edT.bfS.setLayoutParams(layoutParams);
            this.edT.bXi.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.sp9));
            this.edT.bXq.setTextSize((float) getResources().getDimensionPixelSize(R.dimen.sp6));
        } else {
            this.edT.bXk.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.dp100), -1));
            this.edT.bXo.setOrientation(0);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp5);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp10);
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dp24);
            LayoutParams layoutParams3 = new LayoutParams(dimensionPixelSize3, dimensionPixelSize3);
            layoutParams3.setMargins(dimensionPixelSize2, 0, dimensionPixelSize, 0);
            this.edT.bXp.setLayoutParams(layoutParams3);
            layoutParams = new LayoutParams(0, -2, 1.0f);
            layoutParams.gravity = 17;
            this.edT.bfS.setLayoutParams(layoutParams);
            this.edT.bXi.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.sp12));
            this.edT.bXq.setTextSize((float) getResources().getDimensionPixelSize(R.dimen.sp8));
        }
        if (aXM()) {
            this.edT.bXj.setVisibility(0);
        } else {
            this.edT.bXj.setVisibility(8);
        }
        setSelected(false);
        this.edT.bXg.setVisibility(8);
        this.edT.bXl.setVisibility(8);
        this.edT.bXm.setVisibility(8);
        this.edT.bXk.setBackgroundColor(Color.parseColor("#001d2539"));
        this.edT.bXn.setPadding(0, 0, 0, 0);
        g(this.eea);
    }

    private boolean aXL() {
        return com.iqoption.core.d.Un().Dq() ^ 1;
    }

    private boolean aXM() {
        return (com.iqoption.core.d.Un().Dq() || this.eeb) ? false : true;
    }

    public void fp(boolean z) {
        setTag("select");
        this.edT.bXk.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(z ? R.dimen.dp100 : R.dimen.dp130), -1));
        this.edT.bXk.setBackgroundColor(Color.parseColor("#1d2539"));
        this.edT.bXo.setOrientation(0);
        this.edT.bXg.setVisibility(0);
        this.edT.bXl.setVisibility(z ? 8 : 0);
        this.edT.bXm.setVisibility(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp5);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp10);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dp24);
        LayoutParams layoutParams = new LayoutParams(dimensionPixelSize3, dimensionPixelSize3);
        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize, 0);
        this.edT.bXp.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = new LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 17;
        this.edT.bfS.setLayoutParams(layoutParams2);
        this.edT.bXi.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.sp12));
        this.edT.bXq.setTextSize((float) getResources().getDimensionPixelSize(R.dimen.sp8));
        if (aXL()) {
            this.edT.bXj.setVisibility(0);
        } else {
            this.edT.bXj.setVisibility(8);
        }
        this.edT.bXn.setPadding(0, 0, getResources().getDimensionPixelOffset(R.dimen.tap_close_width), 0);
        g(this.eea);
    }

    public void onTick(long j) {
        if (aYx() && this.edW == null) {
            g(this.eea);
        }
    }
}
