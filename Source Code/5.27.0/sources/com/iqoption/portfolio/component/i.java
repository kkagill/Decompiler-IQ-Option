package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import com.iqoption.e.vh;
import com.iqoption.e.vj;
import com.iqoption.e.vv;
import com.iqoption.e.vx;
import com.iqoption.e.wb;
import com.iqoption.e.wd;
import com.iqoption.portfolio.component.b.e;
import com.iqoption.portfolio.component.b.k;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.portfolio.component.viewholder.af;
import com.iqoption.portfolio.component.viewholder.ag;
import com.iqoption.portfolio.component.viewholder.al;
import com.iqoption.portfolio.component.viewholder.am;
import com.iqoption.portfolio.component.viewholder.an;
import com.iqoption.portfolio.component.viewholder.ao;
import com.iqoption.portfolio.component.viewholder.ap;
import com.iqoption.portfolio.component.viewholder.aq;
import com.iqoption.portfolio.fragment.f;

/* compiled from: PendingViewHolderCreatorBinder */
public final class i extends n<ap, k, f> {
    public i(f fVar) {
        super(fVar);
    }

    /* renamed from: c */
    public ap b(int i, ViewGroup viewGroup) {
        if (i == -2) {
            return new an(vx.aa(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == -1) {
            return new al(getLayoutInflater(), viewGroup, (f) aRo());
        }
        if (i == 1) {
            return new am(vv.Z(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 2) {
            return new aq(wd.ac(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 3) {
            return new ao(wb.ab(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 5) {
            return new ag(vj.V(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        if (i == 6) {
            return new af(vh.U(getLayoutInflater(), viewGroup, false), (f) aRo());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported viewType: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, ap apVar, k kVar) {
        if (i == -2) {
            ((an) apVar).a((e) kVar);
        } else if (i == -1) {
        } else {
            if (i == 1) {
                ((am) apVar).a((l) kVar);
            } else if (i == 2) {
                ((aq) apVar).a((l) kVar);
            } else if (i == 3) {
                ((ao) apVar).d((m) kVar);
            } else if (i == 5) {
                ((ag) apVar).a((l) kVar);
            } else if (i == 6) {
                ((af) apVar).d((m) kVar);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported viewType: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }
}
