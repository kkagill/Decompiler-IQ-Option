package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import com.iqoption.core.util.ae;
import com.iqoption.e.ud;
import com.iqoption.e.uh;
import com.iqoption.e.uj;
import com.iqoption.e.up;
import com.iqoption.e.ur;
import com.iqoption.e.uv;
import com.iqoption.e.ux;
import com.iqoption.e.uz;
import com.iqoption.e.vn;
import com.iqoption.portfolio.component.b.c;
import com.iqoption.portfolio.component.b.f;
import com.iqoption.portfolio.component.viewholder.ah;
import com.iqoption.portfolio.component.viewholder.ai;
import com.iqoption.portfolio.component.viewholder.aj;
import com.iqoption.portfolio.component.viewholder.b;
import com.iqoption.portfolio.component.viewholder.d;
import com.iqoption.portfolio.component.viewholder.e;
import com.iqoption.portfolio.component.viewholder.h;
import com.iqoption.portfolio.component.viewholder.i;
import com.iqoption.portfolio.component.viewholder.j;
import com.iqoption.portfolio.component.viewholder.k;
import com.iqoption.portfolio.component.viewholder.l;

/* compiled from: OpenViewHolderCreatorBinder */
public final class g extends n<aj, f, l> {
    public g(l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public aj b(int i, ViewGroup viewGroup) {
        switch (i) {
            case -3:
                return new i(ur.Q(getLayoutInflater(), viewGroup, false), (l) aRo());
            case -2:
                return new ai(vn.X(getLayoutInflater(), viewGroup, false), (l) aRo());
            case -1:
                return new ah(getLayoutInflater(), viewGroup, (l) aRo());
            case 1:
                return new b(ud.M(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 2:
                return new e(uj.O(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 3:
                return new d(uh.N(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 4:
                return new h(up.P(getLayoutInflater(), viewGroup, false), (l) aRo());
            case 5:
                uz T = uz.T(getLayoutInflater(), viewGroup, false);
                T.cqa.cnR.setText(ae.anF());
                return new l(T, (l) aRo());
            case 6:
                uv R = uv.R(getLayoutInflater(), viewGroup, false);
                R.cqa.cnR.setText(ae.anF());
                return new j(R, (l) aRo());
            case 7:
                return new k(ux.S(getLayoutInflater(), viewGroup, false), (l) aRo());
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
                ((i) ajVar).a((c) fVar);
                return;
            case -2:
                ((ai) ajVar).a((com.iqoption.portfolio.component.b.e) fVar);
                return;
            case -1:
                return;
            case 1:
                ((b) ajVar).a((com.iqoption.portfolio.component.b.i) fVar);
                return;
            case 2:
                ((e) ajVar).a((com.iqoption.portfolio.component.b.i) fVar);
                return;
            case 3:
                ((d) ajVar).a((com.iqoption.portfolio.component.b.g) fVar);
                return;
            case 4:
                ((h) ajVar).a((com.iqoption.portfolio.component.b.i) fVar);
                return;
            case 5:
                ((l) ajVar).a((com.iqoption.portfolio.component.b.i) fVar);
                return;
            case 6:
                ((j) ajVar).a((com.iqoption.portfolio.component.b.h) fVar);
                return;
            case 7:
                ((k) ajVar).a((com.iqoption.portfolio.component.b.i) fVar);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported viewType: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
