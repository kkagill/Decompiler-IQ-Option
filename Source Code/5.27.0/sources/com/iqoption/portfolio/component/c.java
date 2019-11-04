package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import com.iqoption.core.util.ae;
import com.iqoption.e.qt;
import com.iqoption.e.qx;
import com.iqoption.e.qz;
import com.iqoption.e.rf;
import com.iqoption.e.rh;
import com.iqoption.e.rl;
import com.iqoption.e.rn;
import com.iqoption.e.rp;
import com.iqoption.e.rx;
import com.iqoption.portfolio.component.b.e;
import com.iqoption.portfolio.component.b.f;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.h;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.viewholder.aj;
import com.iqoption.portfolio.component.viewholder.o;
import com.iqoption.portfolio.component.viewholder.p;
import com.iqoption.portfolio.component.viewholder.q;
import com.iqoption.portfolio.component.viewholder.r;
import com.iqoption.portfolio.component.viewholder.s;
import com.iqoption.portfolio.component.viewholder.t;
import com.iqoption.portfolio.component.viewholder.u;
import com.iqoption.portfolio.component.viewholder.v;
import com.iqoption.portfolio.component.viewholder.y;
import com.iqoption.portfolio.component.viewholder.z;

/* compiled from: MicroOpenViewHolderCreatorBinder */
public final class c extends n<aj, f, l> {
    public c(l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public aj b(int i, ViewGroup viewGroup) {
        switch (i) {
            case -3:
                return new s(rh.A(getLayoutInflater(), viewGroup, false), (l) aRo());
            case -2:
                return new z(rx.H(getLayoutInflater(), viewGroup, false), (l) aRo());
            case -1:
                return new y(getLayoutInflater(), viewGroup, (l) aRo());
            case 1:
                return new o(qt.u(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 2:
                return new q(qz.w(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 3:
                return new p(qx.v(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 4:
                return new r(rf.z(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 5:
                rp D = rp.D(getLayoutInflater(), viewGroup, false);
                D.cnW.cnR.setText(ae.anF());
                return new v(D, (l) aRo());
            case 6:
                rl B = rl.B(getLayoutInflater(), viewGroup, false);
                B.cnW.cnR.setText(ae.anF());
                return new t(B, (l) aRo());
            case 7:
                return new u(rn.C(getLayoutInflater(), viewGroup, false), (l) aRo());
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported viewType: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void a(int i, aj ajVar, f fVar) {
        switch (i) {
            case -3:
                ((s) ajVar).a((com.iqoption.portfolio.component.b.c) fVar);
                return;
            case -2:
                ((z) ajVar).a((e) fVar);
                return;
            case -1:
                return;
            case 1:
                ((o) ajVar).a((i) fVar);
                return;
            case 2:
                ((q) ajVar).a((i) fVar);
                return;
            case 3:
                ((p) ajVar).a((g) fVar);
                return;
            case 4:
                ((r) ajVar).a((i) fVar);
                return;
            case 5:
                ((v) ajVar).a((i) fVar);
                return;
            case 6:
                ((t) ajVar).a((h) fVar);
                return;
            case 7:
                ((u) ajVar).a((i) fVar);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported viewType: ");
                stringBuilder.append(ajVar.getItemViewType());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
