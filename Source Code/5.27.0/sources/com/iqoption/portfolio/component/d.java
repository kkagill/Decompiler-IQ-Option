package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import com.iqoption.e.rr;
import com.iqoption.e.rt;
import com.iqoption.e.sh;
import com.iqoption.e.sl;
import com.iqoption.e.sn;
import com.iqoption.portfolio.component.b.k;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.component.viewholder.aa;
import com.iqoption.portfolio.component.viewholder.ab;
import com.iqoption.portfolio.component.viewholder.ac;
import com.iqoption.portfolio.component.viewholder.ad;
import com.iqoption.portfolio.component.viewholder.ae;
import com.iqoption.portfolio.component.viewholder.ap;
import com.iqoption.portfolio.component.viewholder.x;
import com.iqoption.portfolio.fragment.f;

/* compiled from: MicroPendingViewHolderCreatorBinder */
public final class d extends n<ap, k, f> {
    public d(f fVar) {
        super(fVar);
    }

    /* renamed from: c */
    public ap b(int i, ViewGroup viewGroup) {
        if (i == -1) {
            return new aa(getLayoutInflater(), viewGroup, (f) aRo());
        }
        if (i == 1) {
            return new ab(sh.J(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 2) {
            return new ae(sn.L(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 3) {
            return new ac(sl.K(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 5) {
            return new ad(rt.F(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 6) {
            return new x(rr.E(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported viewType: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, ap apVar, k kVar) {
        if (i == -1) {
            return;
        }
        if (i == 1) {
            ((ab) apVar).a((l) kVar);
        } else if (i == 2) {
            ((ae) apVar).a((l) kVar);
        } else if (i == 3) {
            ((ac) apVar).d((m) kVar);
        } else if (i == 5) {
            ((ad) apVar).a((l) kVar);
        } else if (i == 6) {
            ((x) apVar).d((m) kVar);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported viewType: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
