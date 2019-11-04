package com.iqoption.tradinghistory.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.tradinghistory.b.c;
import com.iqoption.tradinghistory.b.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, bng = {"Lcom/iqoption/tradinghistory/details/holder/DealDetailsViewHolder;", "", "tickInfo", "Landroid/widget/ImageView;", "getTickInfo", "()Landroid/widget/ImageView;", "tickInfoText", "Landroid/widget/TextView;", "getTickInfoText", "()Landroid/widget/TextView;", "toolbarBack", "getToolbarBack", "tradingHistoryTitle", "getTradingHistoryTitle", "bindData", "", "data", "Lcom/iqoption/tradinghistory/details/Data;", "bindInvestData", "investData", "Lcom/iqoption/tradinghistory/details/InvestData;", "createView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "tradinghistory_release"})
/* compiled from: DealDetailsViewHolder.kt */
public interface b {
    TextView aVJ();

    ImageView aVK();

    ImageView aVL();

    TextView aVM();

    void b(c cVar);

    void c(d dVar);

    View f(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
