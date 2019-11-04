package com.iqoption.tradinghistory.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ext.a;
import com.iqoption.tradinghistory.a.c;
import com.iqoption.tradinghistory.a.w;
import com.iqoption.tradinghistory.b.f;
import com.iqoption.tradinghistory.g;
import com.iqoption.tradinghistory.g.b;
import com.iqoption.tradinghistory.g.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\""}, bng = {"Lcom/iqoption/tradinghistory/details/holder/MultiDealDetailsViewHolder;", "Lcom/iqoption/tradinghistory/details/holder/DealDetailsViewHolder;", "()V", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentDealDetailsMultiBinding;", "tickInfo", "Landroid/widget/ImageView;", "getTickInfo", "()Landroid/widget/ImageView;", "tickInfoText", "Landroid/widget/TextView;", "getTickInfoText", "()Landroid/widget/TextView;", "toolbarBack", "getToolbarBack", "tradingHistoryTitle", "getTradingHistoryTitle", "bindData", "", "data", "Lcom/iqoption/tradinghistory/details/Data;", "bindInvestData", "investData", "Lcom/iqoption/tradinghistory/details/InvestData;", "createItemView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "itemData", "Lcom/iqoption/tradinghistory/details/MultiItemData;", "createView", "inflater", "Landroid/view/LayoutInflater;", "container", "tradinghistory_release"})
/* compiled from: MultiDealDetailsViewHolder.kt */
public final class d implements b {
    private c dXg;

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, e.fragment_deal_details_multi, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…_multi, container, false)");
        this.dXg = (c) inflate;
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = cVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public void b(com.iqoption.tradinghistory.b.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "data");
        if (!(cVar instanceof com.iqoption.tradinghistory.b.e)) {
            cVar = null;
        }
        com.iqoption.tradinghistory.b.e eVar = (com.iqoption.tradinghistory.b.e) cVar;
        if (eVar != null) {
            c cVar2 = this.dXg;
            String str = "binding";
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout = cVar2.dVS;
            kotlin.jvm.internal.i.e(linearLayout, "binding.dealDetailsMultiItemsContainer");
            linearLayout.removeAllViews();
            int i = 0;
            for (Object next : eVar.getItems()) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                View a = a(linearLayout, (f) next);
                MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
                if (i > 0) {
                    c cVar3 = this.dXg;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    View root = cVar3.getRoot();
                    kotlin.jvm.internal.i.e(root, "binding.root");
                    Context context = root.getContext();
                    kotlin.jvm.internal.i.e(context, "binding.root.context");
                    marginLayoutParams.topMargin = context.getResources().getDimensionPixelOffset(b.dp8);
                }
                linearLayout.addView(a, marginLayoutParams);
                i = i2;
            }
            cVar2 = this.dXg;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = cVar2.dVu;
            kotlin.jvm.internal.i.e(textView, "binding.closeReason");
            textView.setText(eVar.getCloseReason());
        }
    }

    private final View a(ViewGroup viewGroup, f fVar) {
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = cVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        w wVar = (w) a.a(root, e.layout_deals_details_item, viewGroup, false, 4, null);
        TextView textView = wVar.cMc;
        kotlin.jvm.internal.i.e(textView, "asset");
        textView.setText(fVar.aVs());
        textView = wVar.dVH;
        kotlin.jvm.internal.i.e(textView, "openingPrice");
        textView.setText(fVar.aVt());
        textView = wVar.dVK;
        kotlin.jvm.internal.i.e(textView, "openingTime");
        textView.setText(fVar.aVu());
        textView = wVar.dVw;
        kotlin.jvm.internal.i.e(textView, "closingPrice");
        textView.setText(fVar.aVv());
        textView = wVar.dVy;
        kotlin.jvm.internal.i.e(textView, "closingTime");
        textView.setText(fVar.aVw());
        wVar.dVI.setImageResource(fVar.aVx() ? g.c.ic_call_triangle_green : g.c.ic_put_triangle_red);
        textView = wVar.cox;
        kotlin.jvm.internal.i.e(textView, NotificationCompat.CATEGORY_STATUS);
        textView.setText(fVar.getStatus());
        Integer aVC = fVar.aVC();
        if (aVC != null) {
            wVar.cox.setTextColor(aVC.intValue());
        }
        View root2 = wVar.getRoot();
        kotlin.jvm.internal.i.e(root2, "itemBinding.root");
        return root2;
    }

    public void c(com.iqoption.tradinghistory.b.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "investData");
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = cVar.ccI;
        kotlin.jvm.internal.i.e(textView, "amount");
        textView.setText(dVar.VN());
        TextView textView2 = cVar.alW;
        kotlin.jvm.internal.i.e(textView2, "profit");
        textView2.setText(dVar.aVB());
    }

    public TextView aVJ() {
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = cVar.dVU.dWz;
        kotlin.jvm.internal.i.e(textView, "binding.dealDetailsMulti…olbar.tradingHistoryTitle");
        return textView;
    }

    public ImageView aVK() {
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = cVar.dVU.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.dealDetailsMultiToolbar.toolbarBack");
        return imageView;
    }

    public ImageView aVL() {
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = cVar.dVP;
        kotlin.jvm.internal.i.e(imageView, "binding.tickInfo");
        return imageView;
    }

    public TextView aVM() {
        c cVar = this.dXg;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = cVar.dVQ;
        kotlin.jvm.internal.i.e(textView, "binding.tickInfoText");
        return textView;
    }
}
