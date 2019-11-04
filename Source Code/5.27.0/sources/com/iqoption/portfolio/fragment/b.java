package com.iqoption.portfolio.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.e.ul;
import com.iqoption.e.vp;
import com.iqoption.e.vr;
import com.iqoption.portfolio.component.a.a;
import com.iqoption.portfolio.component.a.c;
import com.iqoption.portfolio.component.a.d;
import com.iqoption.portfolio.component.a.e;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.h;
import com.iqoption.portfolio.component.i;
import com.iqoption.portfolio.component.k;
import com.iqoption.portfolio.component.m;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;
import java.util.ArrayList;

/* compiled from: MacroPortfolioDelegate */
public final class b extends i {
    private static final String TAG = "com.iqoption.portfolio.fragment.b";
    private final ul dPc;
    private final g dPd = new a(this).n(this.dPc.ciF).o(this.dPc.aoq).p(this.dPc.alU).aSy();
    private final l dPe;
    private final n dPf;

    /* Access modifiers changed, original: 0000 */
    public void aSi() {
    }

    /* Access modifiers changed, original: 0000 */
    public int aSm() {
        return R.id.dialogLayer;
    }

    /* Access modifiers changed, original: 0000 */
    public int aSn() {
        return R.id.otherLayer;
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

    public /* bridge */ /* synthetic */ com.iqoption.portfolio.component.a.b aRY() {
        return super.aRY();
    }

    public /* bridge */ /* synthetic */ d aRZ() {
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

    public /* bridge */ /* synthetic */ e aSd() {
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

    b(k kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(kVar);
        this.dPc = (ul) DataBindingUtil.inflate(layoutInflater, R.layout.portfolio_delegate_macro, viewGroup, false);
        k kVar2 = new k(fA(R.dimen.dp10));
        vp e = vp.e(layoutInflater);
        e.col.setOnClickListener(new -$$Lambda$b$yV173A17Mu7CL5pcFWC-8r3dAqk(this));
        this.dPe = new a(this, e).bV(e.aIq).bW(e.com).bX(e.Dk).k(e.aIq).a(new com.iqoption.portfolio.component.f(new com.iqoption.portfolio.component.g(this))).b(kVar2).aSO();
        vr f = vr.f(layoutInflater);
        e.col.setOnClickListener(new -$$Lambda$b$-4uQc3sM9Xm7QNLKI0imTmscfXI(this));
        this.dPf = new a(this, f).bZ(f.Dk).bY(f.com).l(f.aIq).a(new h(new i(this))).c(kVar2).aSQ();
        this.dPc.cfQ.setupWithViewPager(this.dPc.aRy);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.dPe);
        if (!com.iqoption.core.d.Un().Dq()) {
            arrayList.add(this.dPf);
        }
        this.dPc.aRy.setAdapter(new com.iqoption.portfolio.component.a(this.dPc.cfQ, arrayList));
        this.dPc.aRy.addOnPageChangeListener(new OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                if (i == 0) {
                    b.this.dPd.eX(true);
                    com.iqoption.analytics.k.Cf();
                } else if (i == 1) {
                    b.this.dPd.eX(false);
                    com.iqoption.analytics.k.Cl();
                }
            }
        });
        this.dPc.aHK.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.aSB();
            }
        });
        -$$Lambda$b$33LZBmeHLqrCSPcMNIXTR5Fci-w -__lambda_b_33lzbmehlqrcspcmnixtr5fci-w = new -$$Lambda$b$33LZBmeHLqrCSPcMNIXTR5Fci-w(this);
        if (!com.iqoption.core.d.Un().Dq()) {
            this.dPc.alH.setOnClickListener(-__lambda_b_33lzbmehlqrcspcmnixtr5fci-w);
            this.dPc.ciF.setOnClickListener(-__lambda_b_33lzbmehlqrcspcmnixtr5fci-w);
        }
        aSt();
        aSq();
        aSr();
        aSu();
        aSv();
        aQL();
        aQM();
        aSs();
    }

    private /* synthetic */ void V(View view) {
        reload();
    }

    private /* synthetic */ void bO(View view) {
        reload();
    }

    private /* synthetic */ void bN(View view) {
        aSD();
    }

    /* Access modifiers changed, original: 0000 */
    public View getView() {
        return this.dPc.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        this.dPe.destroy();
        IQApp.Ex().bd(new com.iqoption.portfolio.g.c());
    }

    /* Access modifiers changed, original: 0000 */
    public void aQU() {
        aSt();
        aSu();
        aSv();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSe() {
        aSt();
        aSq();
        aQL();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSf() {
        aSq();
        aQM();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSg() {
        aSt();
        aSq();
        aQL();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSh() {
        aSq();
        aQM();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSj() {
        aSr();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSk() {
        aSt();
        aSq();
        aQL();
        aQM();
        aSs();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSl() {
        aSt();
        aQL();
        aQM();
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, com.iqoption.portfolio.component.b.i iVar, boolean z) {
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
        int i = bundle.getInt("sharedKey.page");
        ViewPager viewPager = this.dPc.aRy;
        if (i > 1) {
            i = 1;
        }
        viewPager.setCurrentItem(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void aSo() {
        aQL();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSp() {
        aSr();
        aQL();
        aQM();
        aSt();
        aSu();
        aSv();
        aSs();
    }

    private void aSq() {
        PagerAdapter adapter = this.dPc.aRy.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private void aSr() {
        this.dPe.d(aQK());
        this.dPf.d(aQK());
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

    private void aSt() {
        this.dPd.c(aQK());
    }

    private void aSu() {
        this.dPe.aSu();
    }

    private void aSv() {
        this.dPf.aSv();
    }
}
