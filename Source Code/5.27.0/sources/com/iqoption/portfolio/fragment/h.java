package com.iqoption.portfolio.fragment;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.rightpanel.e;
import com.iqoption.portfolio.component.PortfolioLinearLayoutManager;
import com.iqoption.portfolio.component.b;
import com.iqoption.portfolio.component.k;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;

/* compiled from: PortfolioClosedPositionsHelper */
final class h implements m {
    private final ViewDataBinding amm;
    private final RecyclerView apj;
    private final i dPr;
    private final View dPv;
    private final View dPw;
    private final b dPx;
    private final e dPy;

    /* compiled from: PortfolioClosedPositionsHelper */
    static final class a {
        private final ViewDataBinding amm;
        private RecyclerView apj;
        private final i dPr;
        private View dPv;
        private View dPw;
        private k dPz;

        public a(i iVar, ViewDataBinding viewDataBinding) {
            this.dPr = iVar;
            this.amm = viewDataBinding;
        }

        /* Access modifiers changed, original: 0000 */
        public a bR(View view) {
            this.dPv = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a bS(View view) {
            this.dPw = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a j(RecyclerView recyclerView) {
            this.apj = recyclerView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a a(k kVar) {
            this.dPz = kVar;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public h aSA() {
            return new h(this);
        }
    }

    public PortfolioTab aSz() {
        return PortfolioTab.CLOSED;
    }

    public CharSequence getTitle() {
        return this.dPr.eA(R.string.closed);
    }

    public ViewDataBinding getBinding() {
        return this.amm;
    }

    private h(a aVar) {
        this.dPr = aVar.dPr;
        this.amm = aVar.amm;
        this.dPv = aVar.dPv;
        this.dPw = aVar.dPw;
        this.apj = aVar.apj;
        this.dPy = new e(0, this.apj, this.dPv, this.dPw);
        this.apj.setHasFixedSize(true);
        RecyclerView recyclerView = this.apj;
        recyclerView.setLayoutManager(new PortfolioLinearLayoutManager(recyclerView.getContext()));
        this.apj.addItemDecoration(aVar.dPz);
        RecyclerView recyclerView2 = this.apj;
        b bVar = new b(this.dPr);
        this.dPx = bVar;
        recyclerView2.setAdapter(bVar);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(150);
        defaultItemAnimator.setMoveDuration(150);
        this.apj.setItemAnimator(defaultItemAnimator);
    }

    /* Access modifiers changed, original: 0000 */
    public void d(f fVar) {
        int dataState = fVar.getDataState();
        if (dataState == 1) {
            this.dPy.ak(this.dPw);
        } else if (dataState == 2) {
            this.dPy.ak(this.apj);
        } else if (dataState == 3) {
            this.dPy.ak(this.dPv);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(f fVar) {
        this.dPx.t(fVar.aQF());
    }
}
