package com.iqoption.portfolio.fragment;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.iqoption.fragment.rightpanel.e;
import com.iqoption.portfolio.component.PortfolioLinearLayoutManager;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.f;
import com.iqoption.portfolio.component.k;
import com.iqoption.portfolio.d;
import com.iqoption.util.n;
import com.iqoption.x.R;
import java.util.ArrayList;

/* compiled from: PortfolioOpenPositionsHelper */
final class l implements m {
    private ItemAnimator aNY;
    private final ViewDataBinding amm;
    private final RecyclerView apj;
    private final f dPZ;
    private final i dPr;
    private final View dPv;
    private final View dPw;
    private final e dPy;
    private final boolean dQa;
    private final c dQb;
    private n dQc;
    private final View dmQ;

    /* compiled from: PortfolioOpenPositionsHelper */
    static final class a {
        private final ViewDataBinding amm;
        private RecyclerView apj;
        private f dPZ;
        private final i dPr;
        private View dPv;
        private View dPw;
        private k dPz;
        private boolean dQa = true;
        private c dQb;
        private int dQf;
        private b dQg;
        private View dmQ;

        public a(i iVar, ViewDataBinding viewDataBinding) {
            this.dPr = iVar;
            this.amm = viewDataBinding;
        }

        /* Access modifiers changed, original: 0000 */
        public a bV(View view) {
            this.dmQ = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a bW(View view) {
            this.dPv = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a bX(View view) {
            this.dPw = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a k(RecyclerView recyclerView) {
            this.apj = recyclerView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a a(f fVar) {
            this.dPZ = fVar;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a b(k kVar) {
            this.dPz = kVar;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public l aSO() {
            return new l(this, null);
        }
    }

    /* compiled from: PortfolioOpenPositionsHelper */
    public interface b {
        void ab(float f);
    }

    /* compiled from: PortfolioOpenPositionsHelper */
    public interface c {
        void aSP();

        void onError();

        void onSuccess();
    }

    /* synthetic */ l(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    public PortfolioTab aSz() {
        return PortfolioTab.OPEN;
    }

    public CharSequence getTitle() {
        return f(this.dPr.aQK());
    }

    public ViewDataBinding getBinding() {
        return this.amm;
    }

    private l(a aVar) {
        this.dPr = aVar.dPr;
        this.amm = aVar.amm;
        this.dmQ = aVar.dmQ;
        this.dPv = aVar.dPv;
        this.dPw = aVar.dPw;
        this.apj = aVar.apj;
        this.dPZ = aVar.dPZ;
        this.dQa = aVar.dQa;
        this.dQb = aVar.dQb;
        this.dPy = new e(0, this.dmQ, this.dPv, this.dPw);
        PortfolioLinearLayoutManager portfolioLinearLayoutManager = new PortfolioLinearLayoutManager(this.apj.getContext());
        this.apj.setHasFixedSize(true);
        this.apj.setLayoutManager(portfolioLinearLayoutManager);
        this.apj.addItemDecoration(aVar.dPz);
        this.apj.setAdapter(this.dPZ);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(150);
        defaultItemAnimator.setMoveDuration(150);
        this.apj.setItemAnimator(defaultItemAnimator);
        if (aVar.dQg != null) {
            final -$$Lambda$l$bdBOB8ECw8EDysS2wNbFOMMpteE -__lambda_l_bdbob8ecw8edyss2wnbfommptee = new -$$Lambda$l$bdBOB8ECw8EDysS2wNbFOMMpteE(portfolioLinearLayoutManager, this.apj.getPaddingTop(), aVar.dQg, aVar.dQf);
            -__lambda_l_bdbob8ecw8edyss2wnbfommptee.getClass();
            portfolioLinearLayoutManager.a(new -$$Lambda$u8jGxWpXBZ0o80Tkts-YLVwwAKI(-__lambda_l_bdbob8ecw8edyss2wnbfommptee));
            this.apj.addOnScrollListener(new OnScrollListener() {
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    -__lambda_l_bdbob8ecw8edyss2wnbfommptee.run();
                }
            });
        }
    }

    private static /* synthetic */ void a(PortfolioLinearLayoutManager portfolioLinearLayoutManager, int i, b bVar, int i2) {
        float f = 1.0f;
        if (portfolioLinearLayoutManager.findFirstVisibleItemPosition() == 0) {
            i -= portfolioLinearLayoutManager.findViewByPosition(0).getTop();
            if (i <= i2) {
                f = ((float) i) / ((float) i2);
            }
            bVar.ab(f);
            return;
        }
        bVar.ab(1.0f);
    }

    private void jB(String str) {
        ItemAnimator itemAnimator = this.apj.getItemAnimator();
        if (itemAnimator != null) {
            this.dQc = new n(new -$$Lambda$l$oWHFsGxYJmr6500t5XkJGGB15JU(this, str));
            this.dQc.bm(itemAnimator.getChangeDuration());
        }
    }

    private /* synthetic */ void jC(String str) {
        int height = this.apj.getHeight();
        int childCount = this.apj.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = this.apj.getChildAt(i);
            if (this.apj.getChildViewHolder(childAt).getItemId() != e.dMj.de(str) || childAt.getBottom() <= height) {
                i++;
            } else {
                int height2 = childAt.getHeight();
                if (height2 >= height) {
                    height2 = childAt.getTop();
                } else {
                    height2 -= height - childAt.getTop();
                }
                this.apj.smoothScrollBy(0, height2);
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        n nVar = this.dQc;
        if (nVar != null) {
            nVar.cancel();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void d(com.iqoption.portfolio.f fVar) {
        int dataState = fVar.getDataState();
        c cVar;
        if (dataState == 1) {
            this.dPy.ak(this.dPw);
            cVar = this.dQb;
            if (cVar != null) {
                cVar.aSP();
            }
        } else if (dataState == 2) {
            this.dPy.ak(this.dmQ);
            cVar = this.dQb;
            if (cVar != null) {
                cVar.onSuccess();
            }
        } else if (dataState == 3) {
            this.dPy.ak(this.dPv);
            cVar = this.dQb;
            if (cVar != null) {
                cVar.onError();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(com.iqoption.portfolio.f fVar) {
        ImmutableList aQE = fVar.aQE();
        ArrayList arrayList = new ArrayList();
        if (aQE.isEmpty()) {
            arrayList.add(new com.iqoption.portfolio.component.b.b());
        } else if (this.dQa) {
            arrayList.add(new com.iqoption.portfolio.component.b.e(fVar.aQI()));
        }
        aj sK = aQE.iterator();
        while (sK.hasNext()) {
            i iVar = new i((d) sK.next());
            arrayList.add(iVar);
            if (this.dPr.b(iVar)) {
                arrayList.addAll(iVar.aRA());
            }
        }
        this.dPZ.w(arrayList);
    }

    /* Access modifiers changed, original: 0000 */
    public void aSu() {
        this.dPZ.aRi();
    }

    /* Access modifiers changed, original: 0000 */
    public void aSM() {
        ItemAnimator itemAnimator = this.aNY;
        if (itemAnimator != null) {
            this.apj.setItemAnimator(itemAnimator);
            this.aNY = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aSN() {
        this.aNY = this.apj.getItemAnimator();
        this.apj.setItemAnimator(null);
    }

    /* Access modifiers changed, original: 0000 */
    public void t(String str, String str2, boolean z) {
        this.dPZ.aC(str, str2);
        if (z) {
            jB(str);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(String str, i iVar, boolean z) {
        if (z) {
            this.dPZ.jy(str);
            if (iVar.aRz()) {
                jB(str);
                return;
            }
            return;
        }
        this.dPZ.jz(str);
    }

    private CharSequence f(@NonNull com.iqoption.portfolio.f fVar) {
        if (com.google.common.collect.i.b(fVar.aQE()).b(-$$Lambda$tjEYxYy-ywzLZ4OnhVB3W62LLQM.INSTANCE).size() == 0) {
            return this.dPr.eA(R.string.opened);
        }
        return String.format(this.dPr.aRX().dMA, new Object[]{Integer.valueOf(r4)});
    }
}
