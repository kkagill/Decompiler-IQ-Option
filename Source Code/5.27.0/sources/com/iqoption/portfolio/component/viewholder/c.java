package com.iqoption.portfolio.component.viewholder;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.o;
import com.iqoption.analytics.k;
import com.iqoption.core.ext.a;
import com.iqoption.core.ext.g;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.util.ak;
import com.iqoption.util.v;
import com.iqoption.x.R;

/* compiled from: CfdItemClickListener */
abstract class c extends g {
    private final l dNo;
    private final View dNp;
    private final View dNq;
    private final View dNr;
    private final View dNs;
    private final boolean dNt;

    public abstract com.iqoption.portfolio.component.b.g aRS();

    c(@NonNull l lVar, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, boolean z) {
        this.dNo = lVar;
        this.dNp = view;
        this.dNq = view2;
        this.dNr = view3;
        this.dNs = view4;
        this.dNt = z;
    }

    public void M(View view) {
        Rect ah;
        j aRS = aRS();
        switch (view.getId()) {
            case R.id.btnClose /*2131362042*/:
                if (!this.dNo.e(aRS)) {
                    this.dNp.setVisibility(8);
                    this.dNq.setVisibility(0);
                    v.b(this.dNo.f(aRS), new o<Object>() {
                        public void onSuccess(Object obj) {
                        }

                        public void l(@NonNull Throwable th) {
                            c.this.dNp.setVisibility(0);
                            c.this.dNq.setVisibility(8);
                        }
                    });
                    if (!this.dNt) {
                        k.b(aRS);
                        break;
                    } else {
                        k.c(aRS);
                        break;
                    }
                }
                return;
            case R.id.btnEdit /*2131362057*/:
                this.dNo.d((com.iqoption.portfolio.component.b.g) aRS);
                break;
            case R.id.custodialInfo /*2131362465*/:
            case R.id.custodialLabel /*2131362466*/:
                ah = a.ah(this.dNs);
                this.dNs.setSelected(true);
                v.b(this.dNo.a(aRS, ah), new o<Object>() {
                    public void onSuccess(Object obj) {
                        c.this.dNs.setSelected(false);
                    }

                    public void l(@NonNull Throwable th) {
                        c.this.dNs.setSelected(false);
                    }
                });
                break;
            case R.id.custodialValue /*2131362469*/:
                this.dNo.b((com.iqoption.portfolio.component.b.g) aRS);
                break;
            case R.id.header /*2131362856*/:
                boolean h = this.dNo.h(aRS);
                if (!this.dNt) {
                    k.a(aRS, h);
                    break;
                } else {
                    k.b(aRS, h);
                    break;
                }
            case R.id.info /*2131362923*/:
                this.dNo.d(aRS);
                break;
            case R.id.infoInvest /*2131362931*/:
                break;
            case R.id.investLabel /*2131362970*/:
                if (!this.dNr.isShown()) {
                    return;
                }
                break;
            case R.id.swapValue /*2131364023*/:
                this.dNo.c((com.iqoption.portfolio.component.b.g) aRS);
                break;
        }
        ah = ak.ah(this.dNr);
        this.dNr.setSelected(true);
        v.b(this.dNo.m(ah), new o<Object>() {
            public void onSuccess(Object obj) {
                c.this.dNr.setSelected(false);
            }

            public void l(@NonNull Throwable th) {
                c.this.dNr.setSelected(false);
            }
        });
    }
}
