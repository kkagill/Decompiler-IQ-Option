package com.iqoption.portfolio.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class PortfolioLinearLayoutManager extends LinearLayoutManager {
    private static final String TAG = "com.iqoption.portfolio.component.PortfolioLinearLayoutManager";
    private a dMi;

    public interface a {
        void onLayoutChildren();
    }

    public void a(a aVar) {
        this.dMi = aVar;
    }

    public PortfolioLinearLayoutManager(Context context) {
        super(context);
    }

    public PortfolioLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            return;
     */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2) {
        /*
        r0 = this;
        super.onLayoutChildren(r1, r2);	 Catch:{ Exception -> 0x0014, all -> 0x000b }
        r1 = r0.dMi;
        if (r1 == 0) goto L_0x0019;
    L_0x0007:
        r1.onLayoutChildren();
        goto L_0x0019;
    L_0x000b:
        r1 = move-exception;
        r2 = r0.dMi;
        if (r2 == 0) goto L_0x0013;
    L_0x0010:
        r2.onLayoutChildren();
    L_0x0013:
        throw r1;
    L_0x0014:
        r1 = r0.dMi;
        if (r1 == 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0007;
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.component.PortfolioLinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
