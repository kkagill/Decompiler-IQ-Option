package com.iqoption.tradinghistory.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.tradinghistory.b.b;
import com.iqoption.tradinghistory.b.c;
import com.iqoption.tradinghistory.b.d;
import com.iqoption.tradinghistory.g;
import com.iqoption.tradinghistory.g.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, bng = {"Lcom/iqoption/tradinghistory/details/holder/CommonDealDetailsViewHolder;", "Lcom/iqoption/tradinghistory/details/holder/DealDetailsViewHolder;", "()V", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentDealDetailsBinding;", "tickInfo", "Landroid/widget/ImageView;", "getTickInfo", "()Landroid/widget/ImageView;", "tickInfoText", "Landroid/widget/TextView;", "getTickInfoText", "()Landroid/widget/TextView;", "toolbarBack", "getToolbarBack", "tradingHistoryTitle", "getTradingHistoryTitle", "bindData", "", "data", "Lcom/iqoption/tradinghistory/details/Data;", "bindInvestData", "investData", "Lcom/iqoption/tradinghistory/details/InvestData;", "createView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "tradinghistory_release"})
/* compiled from: CommonDealDetailsViewHolder.kt */
public final class a implements b {
    private com.iqoption.tradinghistory.a.a dXe;

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, e.fragment_deal_details, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…etails, container, false)");
        this.dXe = (com.iqoption.tradinghistory.a.a) inflate;
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = aVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public void b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "data");
        if (!(cVar instanceof b)) {
            cVar = null;
        }
        b bVar = (b) cVar;
        if (bVar != null) {
            com.iqoption.tradinghistory.a.a aVar = this.dXe;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            TextView textView = aVar.dVE;
            kotlin.jvm.internal.i.e(textView, "instruments");
            textView.setText(bVar.aVr());
            textView = aVar.cMc;
            kotlin.jvm.internal.i.e(textView, "asset");
            textView.setText(bVar.aVs());
            textView = aVar.dVH;
            kotlin.jvm.internal.i.e(textView, "openingPrice");
            textView.setText(bVar.aVt());
            textView = aVar.dVK;
            kotlin.jvm.internal.i.e(textView, "openingTime");
            textView.setText(bVar.aVu());
            textView = aVar.dVw;
            kotlin.jvm.internal.i.e(textView, "closingPrice");
            textView.setText(bVar.aVv());
            textView = aVar.dVy;
            kotlin.jvm.internal.i.e(textView, "closingTime");
            textView.setText(bVar.aVw());
            aVar.dVI.setImageResource(bVar.aVx() ? g.c.ic_call_triangle_green : g.c.ic_put_triangle_red);
            textView = aVar.bTE;
            kotlin.jvm.internal.i.e(textView, "leverage");
            textView.setText(bVar.aVy());
            textView = aVar.dVu;
            kotlin.jvm.internal.i.e(textView, "closeReason");
            textView.setText(bVar.getCloseReason());
            com.iqoption.core.ext.a.b((View[]) new TextView[]{aVar.dVG, aVar.bTE, aVar.dVN, aVar.dVM}, bVar.getInstrumentType().isOption() ^ 1);
        }
    }

    public void c(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "investData");
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = aVar.ccI;
        kotlin.jvm.internal.i.e(textView, "amount");
        textView.setText(dVar.VN());
        textView = aVar.dVM;
        kotlin.jvm.internal.i.e(textView, Position.CLOSE_REASON_OVERNIGHT);
        textView.setText(dVar.aVz());
        textView = aVar.dVA;
        kotlin.jvm.internal.i.e(textView, Position.CLOSE_REASON_CUSTODIAL);
        textView.setText(dVar.aVA());
        TextView textView2 = aVar.alW;
        kotlin.jvm.internal.i.e(textView2, "profit");
        textView2.setText(dVar.aVB());
    }

    public TextView aVJ() {
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = aVar.dVD.dWz;
        kotlin.jvm.internal.i.e(textView, "binding.dealDetailsToolbar.tradingHistoryTitle");
        return textView;
    }

    public ImageView aVK() {
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = aVar.dVD.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.dealDetailsToolbar.toolbarBack");
        return imageView;
    }

    public ImageView aVL() {
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = aVar.dVP;
        kotlin.jvm.internal.i.e(imageView, "binding.tickInfo");
        return imageView;
    }

    public TextView aVM() {
        com.iqoption.tradinghistory.a.a aVar = this.dXe;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = aVar.dVQ;
        kotlin.jvm.internal.i.e(textView, "binding.tickInfoText");
        return textView;
    }
}
