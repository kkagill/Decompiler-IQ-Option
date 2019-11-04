package com.iqoption.portfolio.fragment;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.iqoption.fragment.rightpanel.e;
import com.iqoption.portfolio.component.PortfolioLinearLayoutManager;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.h;
import com.iqoption.portfolio.component.k;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingPositionsHelper */
final class n implements m {
    private ItemAnimator aNY;
    private final ViewDataBinding amm;
    private final RecyclerView apj;
    private final i dPr;
    private final View dPv;
    private final View dPw;
    private final e dPy;
    private final boolean dQa;
    private com.iqoption.util.n dQc;
    private final h dQh;

    /* compiled from: PortfolioPendingPositionsHelper */
    static final class a {
        private final ViewDataBinding amm;
        private RecyclerView apj;
        private final i dPr;
        private View dPv;
        private View dPw;
        private k dPz;
        private boolean dQa = true;
        private h dQh;

        public a(i iVar, ViewDataBinding viewDataBinding) {
            this.dPr = iVar;
            this.amm = viewDataBinding;
        }

        /* Access modifiers changed, original: 0000 */
        public a l(RecyclerView recyclerView) {
            this.apj = recyclerView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a bY(View view) {
            this.dPv = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a bZ(View view) {
            this.dPw = view;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a a(h hVar) {
            this.dQh = hVar;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a c(k kVar) {
            this.dPz = kVar;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a eY(boolean z) {
            this.dQa = z;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public n aSQ() {
            return new n(this, null);
        }
    }

    /* synthetic */ n(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    public PortfolioTab aSz() {
        return PortfolioTab.PENDING;
    }

    public CharSequence getTitle() {
        return f(this.dPr.aQK());
    }

    public ViewDataBinding getBinding() {
        return this.amm;
    }

    private n(a aVar) {
        this.dPr = aVar.dPr;
        this.amm = aVar.amm;
        this.apj = aVar.apj;
        this.dPv = aVar.dPv;
        this.dPw = aVar.dPw;
        this.dQh = aVar.dQh;
        this.dQa = aVar.dQa;
        this.dPy = new e(0, this.apj, this.dPv, this.dPw);
        this.apj.setHasFixedSize(true);
        RecyclerView recyclerView = this.apj;
        recyclerView.setLayoutManager(new PortfolioLinearLayoutManager(recyclerView.getContext()));
        this.apj.addItemDecoration(aVar.dPz);
        this.apj.setAdapter(this.dQh);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(150);
        defaultItemAnimator.setMoveDuration(150);
        this.apj.setItemAnimator(defaultItemAnimator);
    }

    /* Access modifiers changed, original: 0000 */
    public void jB(final String str) {
        this.dQc = new com.iqoption.util.n(new Runnable() {
            public void run() {
                int height = n.this.apj.getHeight();
                int childCount = n.this.apj.getChildCount();
                int i = 0;
                while (i < childCount) {
                    View childAt = n.this.apj.getChildAt(i);
                    if (n.this.apj.getChildViewHolder(childAt).getItemId() != f.dMj.de(str) || childAt.getBottom() <= height) {
                        i++;
                    } else {
                        childCount = childAt.getHeight();
                        if (childCount >= height) {
                            height = childAt.getTop();
                        } else {
                            height = childCount - (height - childAt.getTop());
                        }
                        n.this.apj.smoothScrollBy(0, height);
                        return;
                    }
                }
            }
        });
        this.dQc.bm(this.apj.getItemAnimator().getChangeDuration());
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        com.iqoption.util.n nVar = this.dQc;
        if (nVar != null) {
            nVar.cancel();
        }
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
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    public void e(com.iqoption.portfolio.f r12) {
        /*
        r11 = this;
        r12 = r12.aQG();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r12.isEmpty();
        if (r1 == 0) goto L_0x0018;
    L_0x000f:
        r1 = new com.iqoption.portfolio.component.b.b;
        r1.<init>();
        r0.add(r1);
        goto L_0x002a;
    L_0x0018:
        r1 = r11.dQa;
        if (r1 == 0) goto L_0x002a;
    L_0x001c:
        r1 = new com.iqoption.portfolio.a;
        r1.<init>();
        r2 = new com.iqoption.portfolio.component.b.e;
        r2.<init>(r1);
        r0.add(r2);
        goto L_0x002b;
    L_0x002a:
        r1 = 0;
    L_0x002b:
        r2 = r1;
        r1 = 0;
        r12 = r12.iterator();
    L_0x0031:
        r3 = r12.hasNext();
        if (r3 == 0) goto L_0x005f;
    L_0x0037:
        r3 = r12.next();
        r3 = (com.iqoption.portfolio.e) r3;
        r4 = new com.iqoption.portfolio.component.b.l;
        r4.<init>(r3);
        r0.add(r4);
        r3 = r11.dPr;
        r3 = r3.c(r4);
        if (r3 == 0) goto L_0x0054;
    L_0x004d:
        r3 = r4.aRB();
        r0.addAll(r3);
    L_0x0054:
        r5 = (double) r1;
        r3 = r4.getInvestment();
        java.lang.Double.isNaN(r5);
        r5 = r5 + r3;
        r1 = (int) r5;
        goto L_0x0031;
    L_0x005f:
        if (r2 == 0) goto L_0x006b;
    L_0x0061:
        r3 = (double) r1;
        r5 = 0;
        r7 = 0;
        r9 = 0;
        r2.a(r3, r5, r7, r9);
    L_0x006b:
        r12 = r11.dQh;
        r12.w(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.fragment.n.e(com.iqoption.portfolio.f):void");
    }

    /* Access modifiers changed, original: 0000 */
    public void aSv() {
        this.dQh.aRj();
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
        this.dQh.aC(str, str2);
        if (z) {
            jB(str);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(String str, l lVar, boolean z) {
        if (z) {
            this.dQh.jy(str);
            if (lVar.aRz()) {
                jB(str);
                return;
            }
            return;
        }
        this.dQh.jz(str);
    }

    private CharSequence f(@NonNull f fVar) {
        if (fVar.aQG().size() == 0) {
            return this.dPr.eA(R.string.pending);
        }
        return String.format(this.dPr.aRX().dMB, new Object[]{Integer.valueOf(r4)});
    }
}
