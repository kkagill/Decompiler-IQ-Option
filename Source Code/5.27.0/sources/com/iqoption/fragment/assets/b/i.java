package com.iqoption.fragment.assets.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.cv;
import com.iqoption.e.cx;
import com.iqoption.fragment.assets.a.a;
import com.iqoption.fragment.assets.model.n;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetMultiViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetsMultiItemBinding;", "Lcom/iqoption/fragment/assets/model/AssetMulti;", "Lcom/iqoption/fragment/assets/viewholder/AssetViewHolder;", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "parent", "Landroid/view/ViewGroup;", "adapterContext", "Lcom/iqoption/fragment/assets/adapter/AdapterContext;", "(Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/assets/adapter/AdapterContext;)V", "actionsBinding", "Lcom/iqoption/databinding/AssetsItemActionsBinding;", "getActionsBinding", "()Lcom/iqoption/databinding/AssetsItemActionsBinding;", "asset", "getAsset", "()Lcom/iqoption/fragment/assets/model/AssetMulti;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: AssetMultiViewHolder.kt */
public final class i extends e<cx, n> implements j<n> {
    private final a ddj;

    public i(g gVar, ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(gVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "adapterContext");
        super(R.layout.assets_multi_item, viewGroup, aVar);
        this.ddj = aVar;
        h hVar = new h(gVar, this);
    }

    /* renamed from: aBI */
    public n aBC() {
        return (n) and();
    }

    public cv aBD() {
        cv cvVar = ((cx) getBinding()).bXr;
        kotlin.jvm.internal.i.e(cvVar, "binding.actions");
        return cvVar;
    }

    public void a(cx cxVar, n nVar) {
        int aAG;
        kotlin.jvm.internal.i.f(cxVar, "$this$bind");
        kotlin.jvm.internal.i.f(nVar, "item");
        String str = "itemView";
        View view;
        if (nVar.getImage() != null) {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).load(nVar.getImage()).into(cxVar.aRh);
        } else {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).cancelRequest(cxVar.aRh);
        }
        TextView textView = cxVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(nVar.getName());
        textView = cxVar.bXt;
        kotlin.jvm.internal.i.e(textView, "quote");
        textView.setText(nVar.mp());
        textView = cxVar.bXv;
        kotlin.jvm.internal.i.e(textView, "diff");
        textView.setText(nVar.aAW());
        textView = cxVar.bXv;
        if (nVar.adn() == 0.0d) {
            aAG = this.ddj.aAG();
        } else if (nVar.aAV()) {
            aAG = this.ddj.aAE();
        } else {
            aAG = this.ddj.aAF();
        }
        textView.setTextColor(aAG);
        textView = cxVar.bXy;
        kotlin.jvm.internal.i.e(textView, "spotProfit");
        textView.setText(nVar.aBa());
        ImageView imageView = cxVar.bXr.bWR;
        kotlin.jvm.internal.i.e(imageView, "actions.btnFavorites");
        imageView.setSelected(nVar.QE());
    }
}
