package com.iqoption.portfolio.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.e.rz;
import com.iqoption.e.sb;
import com.iqoption.e.sd;
import com.iqoption.e.un;
import com.iqoption.portfolio.component.a.a;
import com.iqoption.portfolio.component.a.b;
import com.iqoption.portfolio.component.a.c;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.e;
import com.iqoption.portfolio.component.h;
import com.iqoption.portfolio.component.k;
import com.iqoption.portfolio.component.m;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;
import java.util.ArrayList;

/* compiled from: MicroPortfolioDelegate */
public final class d extends i {
    private final g dPd;
    private final l dPe;
    private final n dPf;
    private final un dPl;
    private final h dPm;
    private final e dPn;

    /* compiled from: MicroPortfolioDelegate */
    /* renamed from: com.iqoption.portfolio.fragment.d$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] dPq = new int[PortfolioTab.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.portfolio.fragment.PortfolioTab.values();
            r0 = r0.length;
            r0 = new int[r0];
            dPq = r0;
            r0 = dPq;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.portfolio.fragment.PortfolioTab.OPEN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = dPq;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.portfolio.fragment.PortfolioTab.PENDING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = dPq;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.portfolio.fragment.PortfolioTab.CLOSED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.fragment.d$AnonymousClass2.<clinit>():void");
        }
    }

    private void aSw() {
    }

    /* Access modifiers changed, original: 0000 */
    public int aSm() {
        return R.id.fragment;
    }

    /* Access modifiers changed, original: 0000 */
    public int aSn() {
        return R.id.other_fragment;
    }

    public /* bridge */ /* synthetic */ t a(g gVar, Rect rect) {
        return super.a(gVar, rect);
    }

    public /* bridge */ /* synthetic */ f aQK() {
        return super.aQK();
    }

    public /* bridge */ /* synthetic */ m aRX() {
        return super.aRX();
    }

    public /* bridge */ /* synthetic */ b aRY() {
        return super.aRY();
    }

    public /* bridge */ /* synthetic */ com.iqoption.portfolio.component.a.d aRZ() {
        return super.aRZ();
    }

    public /* bridge */ /* synthetic */ c aSa() {
        return super.aSa();
    }

    public /* bridge */ /* synthetic */ com.iqoption.portfolio.component.a.f aSb() {
        return super.aSb();
    }

    public /* bridge */ /* synthetic */ a aSc() {
        return super.aSc();
    }

    public /* bridge */ /* synthetic */ com.iqoption.portfolio.component.a.e aSd() {
        return super.aSd();
    }

    public /* bridge */ /* synthetic */ void i(com.iqoption.portfolio.component.b.m mVar) {
        super.i(mVar);
    }

    public /* bridge */ /* synthetic */ void j(com.iqoption.portfolio.component.b.m mVar) {
        super.j(mVar);
    }

    public /* bridge */ /* synthetic */ t m(Rect rect) {
        return super.m(rect);
    }

    public /* bridge */ /* synthetic */ void reload() {
        super.reload();
    }

    d(k kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(kVar);
        this.dPl = (un) DataBindingUtil.inflate(layoutInflater, R.layout.portfolio_delegate_micro, viewGroup, false);
        -$$Lambda$d$-lcDTtmrzbaCrfIHZhIohX13Kxc -__lambda_d_-lcdttmrzbacrfihzhiohx13kxc = new -$$Lambda$d$-lcDTtmrzbaCrfIHZhIohX13Kxc(this);
        if (!com.iqoption.core.d.Un().Dq()) {
            this.dPl.alH.setOnClickListener(-__lambda_d_-lcdttmrzbacrfihzhiohx13kxc);
            this.dPl.ciF.setOnClickListener(-__lambda_d_-lcdttmrzbacrfihzhiohx13kxc);
        }
        this.dPl.aIs.setOnClickListener(new -$$Lambda$d$znYtsIuOdwfrgPlen7SQmv4NhbM(this));
        this.dPd = new a(this).n(this.dPl.ciF).aSy();
        k kVar2 = new k(fA(R.dimen.dp6));
        sb c = sb.c(layoutInflater);
        this.dPn = new e(kVar.requireContext(), aRX(), aQK(), aSc());
        c.col.setOnClickListener(new -$$Lambda$d$X3L9Y5toqHfg-6_9tfNpdqsHJwY(this));
        this.dPe = new a(this, c).bV(c.aIq).bW(c.com).bX(c.Dk).k(c.aIq).a(new com.iqoption.portfolio.component.f(new com.iqoption.portfolio.component.c(this))).b(kVar2).aSO();
        sd d = sd.d(layoutInflater);
        d.col.setOnClickListener(new -$$Lambda$d$M8IX9tjhRsF4jOb28VhSX0M9VAg(this));
        this.dPf = new a(this, d).bZ(d.Dk).bY(d.com).l(d.aIq).a(new h(new com.iqoption.portfolio.component.d(this))).c(kVar2).eY(false).aSQ();
        rz b = rz.b(layoutInflater);
        b.col.setOnClickListener(new -$$Lambda$d$CW7fUDqU9mss82xX2G7p5WTT8EI(this));
        this.dPm = new a(this, b).bS(b.Dk).bR(b.com).j(b.aIq).a(kVar2).aSA();
        final ArrayList arrayList = new ArrayList();
        arrayList.add(this.dPe);
        if (!com.iqoption.core.d.Un().Dq()) {
            arrayList.add(this.dPf);
        }
        arrayList.add(this.dPm);
        this.dPl.cfQ.setupWithViewPager(this.dPl.aRy);
        this.dPl.aRy.setOffscreenPageLimit(2);
        this.dPl.aRy.setAdapter(new com.iqoption.portfolio.component.a(this.dPl.cfQ, arrayList));
        this.dPl.aRy.addOnPageChangeListener(new OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                i = AnonymousClass2.dPq[((m) arrayList.get(i)).aSz().ordinal()];
                if (i == 1) {
                    com.iqoption.analytics.k.Cf();
                } else if (i == 2) {
                    com.iqoption.analytics.k.Cl();
                } else if (i == 3) {
                    com.iqoption.analytics.k.Cg();
                }
            }
        });
        aSw();
        aSx();
        aSs();
        aSq();
        aSr();
        aSu();
        aSv();
        aQL();
        aQM();
        aQN();
        IQApp.Ex().bd(new com.iqoption.portfolio.g.b());
    }

    private /* synthetic */ void V(View view) {
        bT(this.dPl.alH);
    }

    private /* synthetic */ void bO(View view) {
        aSC();
    }

    private /* synthetic */ void bN(View view) {
        reload();
    }

    private /* synthetic */ void bQ(View view) {
        reload();
    }

    private /* synthetic */ void bP(View view) {
        reload();
    }

    /* Access modifiers changed, original: 0000 */
    public View getView() {
        return this.dPl.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public void resume() {
        super.resume();
        this.dPe.aSM();
        this.dPf.aSM();
    }

    /* Access modifiers changed, original: 0000 */
    public void pause() {
        super.pause();
        this.dPe.aSN();
        this.dPf.aSN();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        this.dPe.destroy();
        this.dPf.destroy();
        IQApp.Ex().bd(new com.iqoption.portfolio.g.a());
    }

    /* Access modifiers changed, original: 0000 */
    public void aQU() {
        aSx();
        aSu();
        aSv();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSe() {
        aQL();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSf() {
        aQM();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSg() {
        aSw();
        aSx();
        aSq();
        aQL();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSh() {
        aSw();
        aSq();
        aQM();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSi() {
        aSq();
        aQN();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSj() {
        aSr();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSk() {
        aSw();
        aSx();
        aSs();
        aSq();
        aQL();
        aQM();
        aQN();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSl() {
        aSw();
        aSx();
        aSu();
        aSv();
        aQL();
        aQM();
        aQN();
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, i iVar, boolean z) {
        this.dPe.b(str, iVar, z);
    }

    /* Access modifiers changed, original: 0000 */
    public void r(String str, String str2, boolean z) {
        this.dPe.t(str, str2, z);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, l lVar, boolean z) {
        this.dPf.b(str, lVar, z);
    }

    /* Access modifiers changed, original: 0000 */
    public void s(String str, String str2, boolean z) {
        this.dPf.t(str, str2, z);
    }

    /* Access modifiers changed, original: 0000 */
    public Bundle akF() {
        return new com.iqoption.util.e().toBundle();
    }

    /* Access modifiers changed, original: 0000 */
    public void X(Bundle bundle) {
        this.dPl.aRy.setCurrentItem(bundle.getInt("sharedKey.page"));
    }

    /* Access modifiers changed, original: 0000 */
    public void aSo() {
        aSw();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSp() {
        aSr();
        aSx();
        aSw();
        aSs();
        aSq();
        aSu();
        aSv();
        aQL();
        aQM();
        aQN();
    }

    private void aSr() {
        this.dPe.d(aQK());
        this.dPf.d(aQK());
        this.dPm.d(aQK());
    }

    private void aQL() {
        this.dPe.e(aQK());
    }

    private void aQM() {
        this.dPf.e(aQK());
    }

    private void aSs() {
        this.dPd.b(aQK());
    }

    private void aSx() {
        this.dPn.aRh();
    }

    private void aSu() {
        this.dPe.aSu();
    }

    private void aSv() {
        this.dPf.aSv();
    }

    private void aQN() {
        this.dPm.e(aQK());
    }

    private void aSq() {
        PagerAdapter adapter = this.dPl.aRy.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
